import java.util.Scanner;

public class Q20_SplitWords {
    public static String[] customSplit(String s) {
        s += " ";
        String[] temp = new String[s.length()];
        String word = "";
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') word += c;
            else if (!word.equals("")) {
                temp[k++] = word;
                word = "";
            }
        }

        String[] result = new String[k];
        for (int i = 0; i < k; i++) result[i] = temp[i];
        return result;
    }

    public static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] a = customSplit(text);
        String[] b = text.split(" ");
        System.out.println("Are equal: " + compare(a, b));
    }
}
