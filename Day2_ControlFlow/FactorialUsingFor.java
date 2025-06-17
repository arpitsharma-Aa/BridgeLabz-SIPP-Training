package Day2_ControlFlow;
import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial is " + factorial);
        }
    }
}
