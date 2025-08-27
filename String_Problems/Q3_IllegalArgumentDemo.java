import java.util.Scanner;

public class Q3_IllegalArgumentDemo {
    public static void generateException(String s) {
        String sub = s.substring(5, 2);
    }

    public static void handleException(String s) {
        try {
            String sub = s.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
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
