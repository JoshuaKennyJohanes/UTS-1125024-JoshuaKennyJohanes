package prak5.joshuakenny.models;

public abstract class MenuItem implements Customizeable {
    private String id;
    private String nama;
    private double hargaBase;
    private int stok;

    public MenuItem(String id, String nama, double hargaBase, int stok){
        this.id = id;
        this.nama = nama;
        this.hargaBase = hargaBase;
        this.stok = stok;
    }
    

    public String getId(){
        return this.id;
    }

    public String getNama(){
            return this.nama;
    }

    public int getStok(){
        return this.stok;
    }  

    public void setStok(int newStok){
        this.stok = newStok;
    } 

    public double getHargaBase(){
        return this.hargaBase;
    }

    public String printMenu(){
        String hasil = getId() + ":  " + getNama() + " (Stok: " + getStok() + "), ";
        return hasil;
    }


    abstract double hitungHargaTotal();


    abstract String getOrderDetail();

    abstract String getTipeMenu();

}
