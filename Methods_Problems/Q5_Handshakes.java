import java.util.Scanner;

public class Q5_Handshakes {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int handshakes = calculateHandshakes(students);
        System.out.println("Maximum Handshakes: " + handshakes);
    }
}
