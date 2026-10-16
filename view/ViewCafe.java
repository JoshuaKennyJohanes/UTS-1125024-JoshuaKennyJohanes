package prak5.joshuakenny.view;

import java.util.ArrayList;
import java.util.*;
import prak5.joshuakenny.utils.InputUtil;
import prak5.joshuakenny.models.MenuItem;
import prak5.joshuakenny.models.Kopi;
import prak5.joshuakenny.models.Roti;
import prak5.joshuakenny.models.Teh;

public class ViewCafe {

    
        // Menampilkan menu pilihan (mau beli atau tambah menu)
        public int renderMenu() {
            System.out.println("\n--- Buat Menu ---");
            System.out.println("1. Buat Menu");
            System.out.println("2. Beli Menu");
            return InputUtil.readInt();
        }



        //ini semua untuk tambah menu dulu ke memori

        public int renderAddMenuOption() {
            System.out.println("\n--- Pilih Tipe Menu ---");
            System.out.println("1. Buat Kopi");
            System.out.println("2. Buat Teh");
            System.out.println("3. Buat Roti");
            System.out.print("Pilih tipe: ");
            return InputUtil.readInt();
        }


        public String renderBuyMenuOption(){
            System.out.println("\n--- Beli Menu ---");
            System.out.print("Pilih tipe: ");
            return InputUtil.readLine();
        

        }

         public Kopi inputNewKopi() {
            System.out.print("Nama Kopi: ");
            String nama = InputUtil.readLine();
            System.out.print("ID Kopi: ");
            String id = InputUtil.readLine();
            System.out.print("Stok Menu: ");
            int stok = InputUtil.readInt();
            System.out.print("HargaBase: ");
            double hargaBase = InputUtil.readDouble();
            Kopi newKopi = new Kopi(id, nama, hargaBase, stok);
            return newKopi;
        }

        public Roti inputNewRoti() {
            System.out.print("Nama Kopi: ");
            String nama = InputUtil.readLine();
            System.out.print("ID Kopi: ");
            String id = InputUtil.readLine();
            System.out.print("Stok Menu: ");
            int stok = InputUtil.readInt();
            System.out.print("HargaBase: ");
            double hargaBase = InputUtil.readDouble();
            Roti newRoti = new Roti(id, nama, hargaBase, stok);
            return newRoti;
        }
        
        public Teh inputNewTeh() {
            System.out.print("Nama Teh: ");
            String nama = InputUtil.readLine();
            System.out.print("ID Teh: ");
            String id = InputUtil.readLine();
            System.out.print("Stok Menu: ");
            int stok = InputUtil.readInt();
            System.out.print("HargaBase: ");
            double hargaBase = InputUtil.readDouble();
            Teh newTeh = new Teh(id, nama, hargaBase, stok);
            return newTeh;
        }




        //ini menu untu beli2

        public int[] beliNewKopi(){
            //index 0 --> jumlah 
            //index 1 --> rum
            //index 2 --> gula
            //index 3 --> es
            //index 4 --> karamel
            int [] pesanan = new int[5];
            System.out.println("Jumlah: ");
            int jumlah = InputUtil.readInt();
            System.out.println("Level Rum [0-1]: ");
            int levelRum = InputUtil.readInt();
            System.out.println("Jumlah Es [0-5]: ");
            int levelEs = InputUtil.readInt();
            System.out.println("Jumlah Gula [0-5]: ");
            int levelGula = InputUtil.readInt();
            System.out.println("Jumlah Karamel[0-5]: ");
            int levelKaramel = InputUtil.readInt();
            
            //masukan kustomisasi pesanan ke array
            pesanan[0] = jumlah;
            pesanan[1] = levelRum;
            pesanan[2] = levelGula;
            pesanan[3] = levelEs;
            pesanan[4] = levelKaramel;     
            return pesanan;
        }



        public int[] beliNewTeh(){
            //index 0 --> jumlah 
            //index 1 --> rum
            //index 2 --> gula
            //index 3 --> es
            //index 4 --> karamel
            int [] pesanan = new int[5];
            System.out.println("Jumlah: ");
            int jumlah = InputUtil.readInt();
            System.out.println("Level Boba [0-1]: ");
            int levelBoba = InputUtil.readInt();
            System.out.println("Jumlah Es [0-5]: ");
            int levelEs = InputUtil.readInt();
            System.out.println("Jumlah Gula [0-5]: ");
            int levelGula = InputUtil.readInt();
            System.out.println("Jumlah Karamel[0-5]: ");
            int levelKaramel = InputUtil.readInt();
            
            //masukan kustomisasi pesanan ke array
            pesanan[0] = jumlah;
            pesanan[1] = levelBoba;
            pesanan[2] = levelGula;
            pesanan[3] = levelEs;
            pesanan[4] = levelKaramel;     
            return pesanan;
        }


        public int[] beliNewRoti(){
            //index 0 --> jumlah 
            //index 1 --> rum
            //index 2 --> gula
            //index 3 --> es
            //index 4 --> karamel
            int [] pesanan = new int[4];
            System.out.println("Jumlah: ");
            int jumlah = InputUtil.readInt();
            System.out.println("Jumlah Meses [0-5]: ");
            int levelMeses = InputUtil.readInt();
            System.out.println("Jumlah Gula [0-5]: ");
            int levelGula = InputUtil.readInt();
            System.out.println("Jumlah Karamel[0-5]: ");
            int levelKaramel = InputUtil.readInt();
            
            //masukan kustomisasi pesanan ke array
            pesanan[0] = jumlah;
            pesanan[1] = levelMeses;
            pesanan[2] = levelGula;
            pesanan[3] = levelKaramel;     
            return pesanan;
        }

        //index 1 untuk jumlahnya, sisanya untuk kustomisasi
 
  
        // Menampilkan daftar device 
        public void printMenu(ArrayList<MenuItem> menuCafe) {
            System.out.println("\n=== MENU ===");
            if (menuCafe.isEmpty()) {
                System.out.println("Belum ada menu yang terdaftar.");
                return;
            }
            for (MenuItem menu : menuCafe ) {
                System.out.println(menu.printMenu());
            }
        }
}
