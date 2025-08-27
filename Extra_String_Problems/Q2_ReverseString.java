import java.util.Scanner;

public class Q2_ReverseString {
    public static String reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i);
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Reversed: " + reverse(input));
    }
}
