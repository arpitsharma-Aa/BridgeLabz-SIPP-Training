import java.util.Scanner;

public class Q7_NumberFormatDemo {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
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
