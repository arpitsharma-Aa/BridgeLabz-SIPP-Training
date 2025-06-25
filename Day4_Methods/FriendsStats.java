package Day4_Methods;

import java.util.Scanner;

public class FriendsStats {
    public static int findYoungest(int[] ages) {
        int min = 0;
        for (int i = 1; i < ages.length; i++) if (ages[i] < ages[min]) min = i;
        return min;
    }

    public static int findTallest(double[] heights) {
        int max = 0;
        for (int i = 1; i < heights.length; i++) if (heights[i] > heights[max]) max = i;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) age[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) height[i] = sc.nextDouble();
        String[] names = {"Amar", "Akbar", "Anthony"};
        System.out.println("Youngest: " + names[findYoungest(age)]);
        System.out.println("Tallest: " + names[findTallest(height)]);
    }
}
