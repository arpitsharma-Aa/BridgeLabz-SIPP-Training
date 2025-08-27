import java.util.Scanner;

public class Q7_ToggleCase {
    public static String toggle(String str) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) result += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch)) result += Character.toUpperCase(ch);
            else result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Toggled: " + toggle(input));
    }
}
