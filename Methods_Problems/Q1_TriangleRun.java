import java.util.Scanner;

public class Q1_TriangleRun {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int)Math.ceil(5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        int rounds = calculateRounds(a, b, c);
        System.out.println("Rounds needed: " + rounds);
    }
}
