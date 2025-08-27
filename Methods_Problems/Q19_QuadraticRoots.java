import java.util.Scanner;

public class Q19_QuadraticRoots {
    public static double[] findRoots(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            return new double[]{r1, r2};
        } else if (d == 0) {
            double r = -b / (2 * a);
            return new double[]{r};
        } else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) System.out.println("No real roots");
        else for (double r : roots) System.out.println("Root: " + r);
    }
}
