import java.util.Scanner;

public class Q6_ArrayIndexOutOfBounds {
    public static void generateException(String[] names) {
        String value = names[names.length];
    }

    public static void handleException(String[] names) {
        try {
            String value = names[names.length];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Caught Exception");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];
        for (int i = 0; i < 3; i++) {
            names[i] = sc.next();
        }
        // generateException(names);
        handleException(names);
    }
}
