package Day5_String;
import java.util.Scanner;

public class SplitCompareWithBuiltIn {
    static int getLength(String s) {
        int count = 0;
        try {
            while (true) s.charAt(count++);
        } catch (Exception e) {}
        return count;
    }

    static String[] splitWords(String text) {
        String[] words = new String[100];
        int index = 0;
        String word = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += ch;
            }
        }
        words[index++] = word;
        String[] result = new String[index];
        for (int i = 0; i < index; i++) result[i] = words[i];
        return result;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] custom = splitWords(text);
        String[] builtin = text.split(" ");
        boolean result = compareArrays(custom, builtin);
        System.out.println("Arrays equal: " + result);
    }
}

