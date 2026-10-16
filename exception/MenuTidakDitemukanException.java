package prak5.joshuakenny.exception;

public class MenuTidakDitemukanException extends Exception {
    public MenuTidakDitemukanException(String message){
        super("Menu tidak ditemukan! "+message);
    }
}
