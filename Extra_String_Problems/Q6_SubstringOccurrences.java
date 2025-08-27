import java.util.Scanner;

public class Q6_SubstringOccurrences {
    public static int countSubstring(String text, String sub) {
        int count = 0, index = 0;
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String sub = sc.nextLine();
        System.out.println("Occurrences: " + countSubstring(text, sub));
    }
}
