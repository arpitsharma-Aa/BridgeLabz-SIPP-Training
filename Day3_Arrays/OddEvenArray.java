package Day3_Arrays;
import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 1) {
            System.out.println("Not a natural number");
            return;
        }
        int[] evens = new int[number / 2 + 1];
        int[] odds = new int[number / 2 + 1];
        int evenIndex = 0, oddIndex = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evens[evenIndex++] = i;
            } else {
                odds[oddIndex++] = i;
            }
        }
        System.out.println("Even Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evens[i] + " ");
        }
        System.out.println("\nOdd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odds[i] + " ");
        }
    }
}
