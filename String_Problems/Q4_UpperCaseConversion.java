import java.util.Scanner;

public class Q4_UpperCaseConversion {
    public static String toUpperCaseCustom(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') result += (char)(c - 32);
            else result += c;
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String customUpper = toUpperCaseCustom(input);
        String builtinUpper = input.toUpperCase();
        boolean result = compareStrings(customUpper, builtinUpper);
        System.out.println("Are equal: " + result);
    }
}
