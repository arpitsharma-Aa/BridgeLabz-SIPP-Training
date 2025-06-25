package Day4_Methods;

import java.util.Random;

public class MatrixCalculator {
    public static int[][] generateMatrix(int rows, int cols) {
        int[][] m = new int[rows][cols];
        Random r = new Random();
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                m[i][j] = r.nextInt(10);
        return m;
    }

    public static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }

    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int[][] result = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, sumLen = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < sumLen; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }
}
