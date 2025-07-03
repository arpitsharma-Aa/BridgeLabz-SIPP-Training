package Day5_String;
import java.util.Scanner;

public class StringLengthWithoutBuiltIn {
    static int getLength(String s) {
        int count = 0;
        try {
            while (true) s.charAt(count++);
        } catch (Exception e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int manual = getLength(s);
        int builtin = s.length();
        System.out.println("Manual: " + manual);
        System.out.println("Built-in: " + builtin);
    }
}

