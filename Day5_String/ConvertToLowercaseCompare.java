package Day5_String;
import java.util.Scanner;

public class ConvertToLowercaseCompare {
    static String toLower(String text) {
        String lower = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') ch += 32;
            lower += ch;
        }
        return lower;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = toLower(s);
        String s2 = s.toLowerCase();
        System.out.println("Are equal: " + compare(s1, s2));
    }
}

