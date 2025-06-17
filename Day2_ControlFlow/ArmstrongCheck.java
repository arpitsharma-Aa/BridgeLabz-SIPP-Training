package Day2_ControlFlow;
import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }

        if (original == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not an Armstrong");
        }
    }
}

