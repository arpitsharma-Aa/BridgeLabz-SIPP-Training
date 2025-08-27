import java.util.Arrays;

public class Q32_DigitAnalysis {
    public static int[] getDigits(int n) {
        int[] digits = new int[String.valueOf(n).length()];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x;
        return s;
    }

    public static int squareSum(int[] arr) {
        int s = 0;
        for (int x : arr) s += x * x;
        return s;
    }

    public static boolean isHarshad(int n) {
        int[] digits = getDigits(n);
        return n % sum(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        int size = 0;
        for (int f : freq) if (f > 0) size++;
        int[][] res = new int[size][2];
        int k = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                res[k][0] = i;
                res[k][1] = freq[i];
                k++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 1729;
        int[] digits = getDigits(n);
        System.out.println("Sum: " + sum(digits));
        System.out.println("Square Sum: " + squareSum(digits));
        System.out.println("Harshad: " + isHarshad(n));
        int[][] freq = digitFrequency(digits);
        for (int[] row : freq) System.out.println("Digit " + row[0] + ": " + row[1]);
    }
}
