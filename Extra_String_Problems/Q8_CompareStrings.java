import java.util.Scanner;

public class Q8_CompareStrings {
    public static int compare(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) != b.charAt(i)) return a.charAt(i) - b.charAt(i);
        }
        return a.length() - b.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int result = compare(str1, str2);
        if (result < 0) System.out.println(str1 + " comes before " + str2);
        else if (result > 0) System.out.println(str1 + " comes after " + str2);
        else System.out.println("Both strings are equal");
    }
}
