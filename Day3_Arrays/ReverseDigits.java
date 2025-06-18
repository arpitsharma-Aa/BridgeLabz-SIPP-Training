package Day3_Arrays;
import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] digits = new int[10];
        int index = 0;
        while (num != 0 && index < 10) {
            digits[index++] = num % 10;
            num /= 10;
        }
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
    }
}
