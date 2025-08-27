import java.util.Scanner;

public class Q20_SumNatural {
    public static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) System.out.println("Not a natural number");
        else {
            System.out.println("Recursive: " + recursiveSum(n));
            System.out.println("Formula: " + formulaSum(n));
        }
    }
}
