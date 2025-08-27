import java.util.Scanner;

public class Q8_SubstringCompare {
    public static String substringByCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
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
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String customSub = substringByCharAt(text, start, end);
        String builtinSub = text.substring(start, end);
        boolean result = compareStrings(customSub, builtinSub);
        System.out.println("Are equal: " + result);
    }
}
