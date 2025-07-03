package Day5_String;
import java.util.*;

public class StudentGradeCalculator {

    static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = 40 + (int)(Math.random() * 60); // Physics
            scores[i][1] = 40 + (int)(Math.random() * 60); // Chemistry
            scores[i][2] = 40 + (int)(Math.random() * 60); // Math
        }
        return scores;
    }

    static double[][] calculateScoreStats(int[][] scores) {
        double[][] stats = new double[scores.length][3]; // total, average, percentage
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percent = stats[i][2];
            if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else if (percent >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-12s %-8s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percent", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10s %-10d %-10d %-10d %-10.0f %-12.2f %-12.2f %-8s\n",
                    "Student" + (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generatePCMScores(n);
        double[][] stats = calculateScoreStats(scores);
        String[] grades = calculateGrades(stats);

        displayScorecard(scores, stats, grades);
    }
}

