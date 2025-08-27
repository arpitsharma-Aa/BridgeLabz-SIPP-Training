import java.util.Scanner;

public class Q2_LowerCaseConversion {
    public static String toLowerCaseCustom(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') result += (char)(c + 32);
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
        String customLower = toLowerCaseCustom(input);
        String builtinLower = input.toLowerCase();
        boolean result = compareStrings(customLower, builtinLower);
        System.out.println("Are equal: " + result);
    }
}
