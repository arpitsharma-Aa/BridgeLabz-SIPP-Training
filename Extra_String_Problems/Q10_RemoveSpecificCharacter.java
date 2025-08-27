import java.util.Scanner;

public class Q10_RemoveSpecificCharacter {
    public static String removeChar(String str, char ch) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        System.out.println("Modified String: " + removeChar(str, ch));
    }
}
