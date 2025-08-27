import java.util.Scanner;

public class Q12_SplitWordsAndLength {
    public static String[] splitWords(String text) {
        text += " ";
        String word = "";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') word += text.charAt(i);
            else if (!word.equals("")) {
                count++;
                word = "";
            }
        }

        String[] words = new String[count];
        word = "";
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') word += text.charAt(i);
            else if (!word.equals("")) {
                words[index++] = word;
                word = "";
            }
        }
        return words;
    }

    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[][] wordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = splitWords(input);
        String[][] result = wordLengths(words);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " - " + result[i][1]);
        }
    }
}
