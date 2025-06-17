package Day2_ControlFlow;
import java.util.Scanner;

public class AllArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for (int i = 1; i <= limit; i++) {
            int number = i, sum = 0, original = i;

            while (number != 0) {
                int digit = number % 10;
                sum += digit * digit * digit;
                number /= 10;
            }

            if (sum == original)
                System.out.println(original);
        }
    }
}
