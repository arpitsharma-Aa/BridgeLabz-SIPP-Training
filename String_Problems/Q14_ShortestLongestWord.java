import java.util.Scanner;

public class Q14_ShortestLongestWord {
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
        } catch (Exception e) {}
        return count;
    }

    public static int[] findMinMaxIndex(String[][] wordData) {
        int min = 0, max = 0;
        for (int i = 1; i < wordData.length; i++) {
            int len = Integer.parseInt(wordData[i][1]);
            if (len < Integer.parseInt(wordData[min][1])) min = i;
            if (len > Integer.parseInt(wordData[max][1])) max = i;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitWords(text);
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(getLength(words[i]));
        }
        int[] result = findMinMaxIndex(data);
        System.out.println("Shortest: " + data[result[0]][0]);
        System.out.println("Longest: " + data[result[1]][0]);
    }
}
