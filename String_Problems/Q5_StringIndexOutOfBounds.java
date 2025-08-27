import java.util.Scanner;

public class Q5_StringIndexOutOfBounds {
    public static void generateException(String s) {
        char c = s.charAt(s.length());
    }

    public static void handleException(String s) {
        try {
            char c = s.charAt(s.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // generateException(input);
        handleException(input);
    }
}
