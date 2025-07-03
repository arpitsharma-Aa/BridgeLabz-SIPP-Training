package Day5_String;
import java.util.Scanner;

public class SubstringUsingCharAt {
    static String substringCharAt(String s, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) sub += s.charAt(i);
        return sub;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt(), end = sc.nextInt();
        String s1 = substringCharAt(s, start, end);
        String s2 = s.substring(start, end);
        System.out.println("Are equal: " + compareStrings(s1, s2));
    }
}

