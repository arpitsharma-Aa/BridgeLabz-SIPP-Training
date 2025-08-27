import java.util.Scanner;

public class Q18_StringLength {
    public static int getLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int len1 = getLength(text);
        int len2 = text.length();
        System.out.println("Custom: " + len1);
        System.out.println("Built-in: " + len2);
    }
}
