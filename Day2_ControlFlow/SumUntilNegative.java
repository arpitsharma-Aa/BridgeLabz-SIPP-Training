package Day2_ControlFlow;
import java.util.Scanner;

public class SumUntilNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int number = sc.nextInt();
            if (number <= 0) {
                break;
            }
            sum = sum + number;
        }

        System.out.println("Sum is " + sum);
    }
}

