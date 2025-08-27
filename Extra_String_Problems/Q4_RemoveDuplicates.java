import java.util.Scanner;

public class Q4_RemoveDuplicates {
    public static String removeDuplicates(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (result.indexOf(ch) == -1) result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Without Duplicates: " + removeDuplicates(input));
    }
}
