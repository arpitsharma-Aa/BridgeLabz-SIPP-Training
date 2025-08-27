import java.util.Scanner;
import java.util.Arrays;

public class Q11_AnagramChecker {
    public static boolean isAnagram(String a, String b) {
        a = a.replaceAll("\\s+", "").toLowerCase();
        b = b.replaceAll("\\s+", "").toLowerCase();
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if (isAnagram(str1, str2)) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
}
