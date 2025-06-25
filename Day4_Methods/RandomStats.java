package Day4_Methods;

import java.util.Random;

public class RandomStats {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + r.nextInt(9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }
        double avg = sum / (double) numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] nums = generate4DigitRandomArray(5);
        for (int n : nums) System.out.println(n);
        double[] res = findAverageMinMax(nums);
        System.out.println("Average: " + res[0] + ", Min: " + res[1] + ", Max: " + res[2]);
    }
}
