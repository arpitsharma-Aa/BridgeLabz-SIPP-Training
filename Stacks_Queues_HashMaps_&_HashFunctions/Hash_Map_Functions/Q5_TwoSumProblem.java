import java.util.*;

public class Q5_TwoSumProblem {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if (map.containsKey(remain)) return new int[]{map.get(remain), i};
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target sum: ");
        int target = sc.nextInt();
        int[] res = twoSum(arr, target);
        if (res[0] != -1)
            System.out.println("Pair indices: " + res[0] + " " + res[1]);
        else
            System.out.println("No valid pair found.");
    }
}
