package Day2_ControlFlow;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number.");
        } else {
            int sum = 0;
            int i = 1;

            while (i <= n) {
                sum = sum + i;
                i++;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);

            if (sum == formulaSum) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("There is a mismatch in results.");
            }
        }
    }
}
