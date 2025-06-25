package Day4_Methods;

import java.util.Scanner;

public class ArrayCheck {
    public static boolean isPositive(int n) {
        return n >= 0;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a < b) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();

        for (int num : arr) {
            if (isPositive(num)) {
                if (isEven(num)) System.out.println(num + " is Positive and Even");
                else System.out.println(num + " is Positive and Odd");
            } else {
                System.out.println(num + " is Negative");
            }
        }

        int result = compare(arr[0], arr[4]);
        if (result == 0) System.out.println("First and Last are Equal");
        else if (result == 1) System.out.println("First is Greater than Last");
        else System.out.println("First is Less than Last");
    }
}
