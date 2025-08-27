public class Q13_StudentGradeCalculator {
    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 41) + 60;
            }
        }
        return marks;
    }

    public static double[][] calculateStats(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100) / 100.0;
            result[i][2] = Math.round(percent * 100) / 100.0;
        }
        return result;
    }

    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percent = stats[i][2];
            if (percent >= 90) grades[i] = "A";
            else if (percent >= 80) grades[i] = "B";
            else if (percent >= 70) grades[i] = "C";
            else if (percent >= 60) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void main(String[] args) {
        int[][] marks = generateMarks(5);
        double[][] stats = calculateStats(marks);
        String[] grades = calculateGrades(stats);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                "P:" + marks[i][0] + " C:" + marks[i][1] + " M:" + marks[i][2] +
                " Total:" + stats[i][0] + " Avg:" + stats[i][1] + " %:" + stats[i][2] +
                " Grade:" + grades[i]
            );
        }
    }
}
