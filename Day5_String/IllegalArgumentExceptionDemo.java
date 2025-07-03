package Day5_String;
import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    static void generateException(String text) {
        String s = text.substring(5, 2);
    }

    static void handleException(String text) {
        try {
            String s = text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        generateException(s);
        handleException(s);
    }
}
