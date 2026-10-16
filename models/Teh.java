package prak5.joshuakenny.models;

import java.util.ArrayList;
import java.util.List;

public class Teh extends MenuItem{
       private int[] kustomisasi = new int[5]; // ada 4

    public Teh(String id, String nama, double hargaBase, int stok) {
        super(id, nama, hargaBase, stok);
    }

    @Override
    String getOrderDetail() {
        return "Jumlah Pesanan: " + kustomisasi[0] + "\n Nama Kopi: " + getNama() + " \n Level Rum: " + kustomisasi[1]
                + "\n Level Gula: " + kustomisasi[2] + "\n Leve Es: " + kustomisasi[3] + " \n Level Karamel: "
                + kustomisasi[4] + "\n Total Bayar: " + hitungHargaTotal(kustomisasi[0]);
    }

    @Override
    public void customize(int[] customizations) {

        List<Integer> newListInt = new ArrayList<>();
        for (int i = 0; i < customizations.length; i++) {
            newListInt.add(customizations[i]);
            //masukin ke attribut kustom punya kopi
            kustomisasi[i] = customizations[i];
        }


        
        customize(newListInt);
    }

    @Override
    public void customize(List<Integer> customizations) {

    }

    @Override
    double hitungHargaTotal() {
        return 0;
    }

    // method2 overloading

    double hitungHargaTotal(int jumlah) {
        double tambahan = 0;
        if (kustomisasi[1] > 0) {
            tambahan = tambahan + 3000; // rum
        } else if (kustomisasi[2] > 0) {
            // tidak terjadi apa;
        } else if (kustomisasi[3] > 0) {
            // tidak terjadi apa2

        } else if (kustomisasi[4] > 0) {
            tambahan = tambahan + 3000;
        }

        return (getHargaBase() + tambahan) * jumlah;
    }

    double hitungHargaTotal(int jumlah, String kodePromo) {
        double awal = hitungHargaTotal(jumlah);
        return awal - (0.1 * awal);
    }

    double hitungHargaTotal(int jumlah, EnumUkuran ukuran) {
        EnumUkuran medium = EnumUkuran.MEDIUM;
        EnumUkuran large = EnumUkuran.LARGE;
        EnumUkuran small = EnumUkuran.SMALL;
        int harga = 15000;

        if (ukuran == medium) {
            harga = 20000;
        } else if (ukuran == large) {
            harga = 25000;
        } else {
            harga = 10000;
        }
        double bayar = harga * jumlah;
        return bayar;
    }


    @Override
    public String getTipeMenu(){
        return "Teh";
    }
}
