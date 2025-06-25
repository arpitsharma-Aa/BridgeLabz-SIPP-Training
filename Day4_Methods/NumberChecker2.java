package Day4_Methods;

import java.util.Scanner;

public class NumberChecker2 {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String str = String.valueOf(Math.abs(number));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++)
            digits[i] = str.charAt(i) - '0';
        return digits;
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number) {
        int[] digits = getDigitsArray(number);
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] digits = getDigitsArray(number);

        System.out.println("Total Digits: " + countDigits(number));
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number));

        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int[] pair : freq) {
            if (pair[1] > 0)
                System.out.println("Digit " + pair[0] + " => " + pair[1] + " times");
        }
    }
}
