import java.util.Arrays;

public class Q33_DigitStats {
    public static int[] getDigits(int n) {
        int[] digits = new int[String.valueOf(n).length()];
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n /= 10;
        }
        return digits;
    }

    public static boolean isDuck(int n) {
        while (n > 0) {
            if (n % 10 == 0) return true;
            n /= 10;
        }
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] digits = getDigits(n);
        int power = digits.length;
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, power);
        return sum == n;
    }

    public static int[] findTwoLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2 && n != max1) max2 = n;
        }
        return new int[]{max1, max2};
    }

    public static int[] findTwoSmallest(int[] arr) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2 && n != min1) min2 = n;
        }
        return new int[]{min1, min2};
    }

    public static void main(String[] args) {
        int n = 153;
        int[] digits = getDigits(n);
        System.out.println("Duck: " + isDuck(n));
        System.out.println("Armstrong: " + isArmstrong(n));
        int[] max = findTwoLargest(digits);
        int[] min = findTwoSmallest(digits);
        System.out.println("Largest: " + max[0] + ", Second Largest: " + max[1]);
        System.out.println("Smallest: " + min[0] + ", Second Smallest: " + min[1]);
    }
}
