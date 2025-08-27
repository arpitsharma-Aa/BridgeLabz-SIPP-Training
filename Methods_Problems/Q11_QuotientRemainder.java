import java.util.Scanner;

public class Q11_QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int q = number / divisor;
        int r = number % divisor;
        return new int[]{q, r};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = sc.nextInt();
        int[] result = findRemainderAndQuotient(num, div);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}
