public class Q28_EmployeeBonus {
    public static double[][] generateData() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = 10000 + (int)(Math.random() * 90000);
            data[i][1] = (int)(Math.random() * 10);
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[10][2];
        for (int i = 0; i < 10; i++) {
            double bonus = data[i][1] > 5 ? 0.05 * data[i][0] : 0.02 * data[i][0];
            result[i][0] = data[i][0] + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void printReport(double[][] data, double[][] result) {
        double oldSum = 0, newSum = 0, bonusSum = 0;
        for (int i = 0; i < 10; i++) {
            oldSum += data[i][0];
            newSum += result[i][0];
            bonusSum += result[i][1];
            System.out.println("Emp" + (i + 1) + ": Old=" + data[i][0] + " YOS=" + data[i][1] +
                               " Bonus=" + result[i][1] + " New=" + result[i][0]);
        }
        System.out.println("Total Old: " + oldSum + ", Total New: " + newSum + ", Total Bonus: " + bonusSum);
    }

    public static void main(String[] args) {
        double[][] data = generateData();
        double[][] result = calculateBonus(data);
        printReport(data, result);
    }
}
