package prak5.joshuakenny.utils;
import java.util.Scanner;

public class InputUtil{
    private static Scanner scanner = new Scanner(System.in);
    public static int readInt(){
        return Integer.parseInt(scanner.nextLine()); // ini saya rubah, karena saat input nama device baru selalu terlewat.
    }

    public static String readLine(){
        return scanner.nextLine();
    }

    public static double readDouble(){
        return Double.parseDouble(scanner.nextLine());
    }
}