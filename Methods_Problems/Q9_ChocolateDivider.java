import java.util.Scanner;

public class Q9_ChocolateDivider {
    public static int[] findRemainderAndQuotient(int total, int children) {
        int q = total / children;
        int r = total % children;
        return new int[]{q, r};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }
}
