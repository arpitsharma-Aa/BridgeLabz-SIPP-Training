import java.util.Scanner;

public class Q29_StudentMarks {
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                marks[i][j] = 60 + (int)(Math.random() * 40);
        return marks;
    }

    public static double[][] computeStats(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = total / 3.0;
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100) / 100.0;
            result[i][2] = Math.round(percent * 100) / 100.0;
        }
        return result;
    }

    public static void printReport(int[][] marks, double[][] stats) {
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ":\t" +
                    marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" +
                    stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] marks = generateMarks(n);
        double[][] stats = computeStats(marks);
        printReport(marks, stats);
    }
}
