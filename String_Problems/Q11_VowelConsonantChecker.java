import java.util.Scanner;

public class Q11_VowelConsonantChecker {
    public static String getType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] analyze(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            result[i][0] = Character.toString(text.charAt(i));
            result[i][1] = getType(text.charAt(i));
        }
        return result;
    }

    public static void printResult(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " - " + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[][] result = analyze(input);
        printResult(result);
    }
}
