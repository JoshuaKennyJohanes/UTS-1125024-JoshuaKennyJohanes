package prak5.joshuakenny.exception;

public class StokTidakCukupException extends Exception {
    
    public StokTidakCukupException(String message){
        super("Stok Tidak Cukup: "+message);
    }

}
