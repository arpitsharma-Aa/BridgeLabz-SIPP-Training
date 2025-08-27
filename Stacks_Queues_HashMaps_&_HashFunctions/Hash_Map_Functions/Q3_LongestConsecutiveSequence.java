import java.util.*;

public class Q3_LongestConsecutiveSequence {
    public static int longestSequence(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int maxLen = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int current = num, count = 1;
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }
                maxLen = Math.max(maxLen, count);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("Longest consecutive sequence length: " + longestSequence(arr));
    }
}
