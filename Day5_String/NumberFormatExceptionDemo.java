package Day5_String;
import java.util.Scanner;

public class NumberFormatExceptionDemo {
    static void generateException(String text) {
        int num = Integer.parseInt(text);
    }

    static void handleException(String text) {
        try {
            int num = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
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
