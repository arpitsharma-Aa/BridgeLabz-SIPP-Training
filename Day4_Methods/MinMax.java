package Day4_Methods;

import java.util.Scanner;

public class MinMax {
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int min = Math.min(n1, Math.min(n2, n3));
        int max = Math.max(n1, Math.max(n2, n3));
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);
    }
}
