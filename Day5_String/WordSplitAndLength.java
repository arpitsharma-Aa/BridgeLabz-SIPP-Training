package Day5_String;
import java.util.Scanner;

public class WordSplitAndLength {
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

    static int getLength(String word) {
        int count = 0;
        try {
            while (true) word.charAt(count++);
        } catch (Exception e) {}
        return count;
    }

    static String[][] wordLengthTable(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(getLength(words[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] result = wordLengthTable(words);
        for (String[] row : result) System.out.println(row[0] + " " + Integer.parseInt(row[1]));
    }
}
