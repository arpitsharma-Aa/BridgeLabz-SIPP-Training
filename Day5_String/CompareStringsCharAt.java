package Day5_String;

import java.util.Scanner;

public class CompareStringsCharAt {
    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        boolean result1 = compareStrings(s1, s2);
        boolean result2 = s1.equals(s2);
        System.out.println("Result by charAt: " + result1);
        System.out.println("Result by equals: " + result2);
    }
}
