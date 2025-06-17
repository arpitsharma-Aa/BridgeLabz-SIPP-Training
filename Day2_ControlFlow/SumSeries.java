package Day2_ControlFlow;
import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("Sum: " + sum);
    }
}

