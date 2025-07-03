package Day5_String;
import java.util.Scanner;

public class TrimSpacesUsingCharAt {
    static int[] trimRange(String s) {
        int start = 0, end = 0;
        while (start < s.length() && s.charAt(start) == ' ') start++;
        end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        return new int[] {start, end + 1};
    }

    static String substringCharAt(String s, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) res += s.charAt(i);
        return res;
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
        int[] range = trimRange(s);
        String trimmed = substringCharAt(s, range[0], range[1]);
        String builtin = s.trim();
        System.out.println("Are equal: " + compare(trimmed, builtin));
    }
}

