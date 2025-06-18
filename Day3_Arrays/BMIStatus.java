package Day3_Arrays;
import java.util.Scanner;

public class BMIStatus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        double[][] personData = new double[persons][3];
        String[] weightStatus = new String[persons];

        for (int i = 0; i < persons; i++) {
            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                i--;
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) weightStatus[i] = "Underweight";
            else if (bmi <= 24.9) weightStatus[i] = "Normal";
            else if (bmi <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        for (int i = 0; i < persons; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Weight: " + personData[i][0]);
            System.out.println("Height: " + personData[i][1]);
            System.out.println("BMI: " + personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }
    }
}
