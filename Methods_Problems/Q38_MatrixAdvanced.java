public class Q38_MatrixAdvanced {
    public static int[][] generateMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = (int)(Math.random() * 10);
        return m;
    }

    public static int[][] transpose(int[][] m) {
        int[][] t = new int[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];
        return t;
    }

    public static int determinant2x2(int[][] m) {
        return m[0][0]*m[1][1] - m[0][1]*m[1][0];
    }

    public static int determinant3x3(int[][] m) {
        return m[0][0]*(m[1][1]*m[2][2] - m[1][2]*m[2][1])
             - m[0][1]*(m[1][0]*m[2][2] - m[1][2]*m[2][0])
             + m[0][2]*(m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0) return null;
        double[][] inv = new double[2][2];
        inv[0][0] =  m[1][1] / (double)det;
        inv[0][1] = -m[0][1] / (double)det;
        inv[1][0] = -m[1][0] / (double)det;
        inv[1][1] =  m[0][0] / (double)det;
        return inv;
    }

    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void printMatrix(double[][] m) {
        for (double[] row : m) {
            for (double val : row) System.out.printf("%.2f ", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] m2 = generateMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        printMatrix(m2);
        System.out.println("Determinant: " + determinant2x2(m2));
        double[][] inv2 = inverse2x2(m2);
        if (inv2 != null) {
            System.out.println("Inverse:");
            printMatrix(inv2);
        } else {
            System.out.println("Matrix not invertible.");
        }

        int[][] m3 = generateMatrix(3, 3);
        System.out.println("\n3x3 Matrix:");
        printMatrix(m3);
        System.out.println("Determinant: " + determinant3x3(m3));
        System.out.println("Transpose:");
        printMatrix(transpose(m3));
    }
}
