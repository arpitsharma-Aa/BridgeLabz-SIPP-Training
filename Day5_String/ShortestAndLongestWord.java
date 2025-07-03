package Day5_String;
import java.util.Scanner;

public class ShortestAndLongestWord {
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

    static int getLength(String s) {
        int count = 0;
        try {
            while (true) s.charAt(count++);
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

    static int[] findShortestLongest(String[][] data) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        String minStr = "", maxStr = "";
        for (int i = 0; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) {
                min = len;
                minStr = data[i][0];
            }
            if (len > max) {
                max = len;
                maxStr = data[i][0];
            }
        }
        System.out.println("Shortest: " + minStr);
        System.out.println("Longest: " + maxStr);
        return new int[] {min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] table = wordLengthTable(words);
        findShortestLongest(table);
    }
}

