import java.util.Scanner;

public class Q15_TrimString {
    public static int[] findTrimIndexes(String s) {
        int start = 0, end = s.length() - 1;
        while (start < s.length() && s.charAt(start) == ' ') start++;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String substringByCharAt(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
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
        int[] indexes = findTrimIndexes(input);
        String trimmedCustom = substringByCharAt(input, indexes[0], indexes[1]);
        String builtinTrimmed = input.trim();
        boolean result = compareStrings(trimmedCustom, builtinTrimmed);
        System.out.println("Are equal: " + result);
    }
}
