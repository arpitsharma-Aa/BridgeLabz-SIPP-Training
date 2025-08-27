import java.util.Scanner;

public class Q3_PalindromeString {
    public static boolean isPalindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) rev += s.charAt(i);
        return s.equalsIgnoreCase(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (isPalindrome(input)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
