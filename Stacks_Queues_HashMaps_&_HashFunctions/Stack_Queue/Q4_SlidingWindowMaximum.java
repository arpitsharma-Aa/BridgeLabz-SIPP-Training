import java.util.*;

public class Q4_SlidingWindowMaximum {
    public static List<Integer> maxInWindows(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            while (!deque.isEmpty() && deque.peek() <= i - k) deque.poll();
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) deque.pollLast();
            deque.offer(i);
            if (i >= k - 1) result.add(nums[deque.peek()]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        List<Integer> result = maxInWindows(arr, 3);
        for (int val : result) System.out.print(val + " ");
    }
}
