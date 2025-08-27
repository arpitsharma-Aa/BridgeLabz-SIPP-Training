public class Q36_PlayerHeights {
    public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + (int)(Math.random() * 101); // 150–250 cm
        }
        return heights;
    }

    public static int sum(int[] arr) {
        int total = 0;
        for (int h : arr) total += h;
        return total;
    }

    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        int total = sum(heights);
        double mean = total / 11.0;
        System.out.println("Shortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Mean: " + mean);
    }
}
