package Day4_Methods;

import java.util.Random;
import java.util.Scanner;

public class StudentScoreAnalyzer {
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = rand.nextInt(41) + 60;
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = total / 3.0;
            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s\n", "Student", "Physics", "Chem", "Math", "Total", "Avg", "Perc");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Student%-3d %-10d%-10d%-10d%-10.2f%-10.2f%-10.2f\n", 
                i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}
