package cz.upce.fei.zzapr.w04;

import java.util.Arrays;

public class MultiplicationMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] matrix2 = {{-1, -2, -3, -4}, {2, 4, 6, 8}, {3, 2, 1, 0}};

        int[][] result = MultiplicationMatrices.getMultiplication(matrix1, matrix2);

        if (result != null) {
            MultiplicationMatrices.printMatrix(result);
        }
        else {
            System.out.println("Unable to multiply two matrices due to unmatched size");
        }
    }

    public static int[][] getMultiplication(int[][] matrix1, int[][] matrix2) {
        if (!MultiplicationMatrices.checkValid(matrix1, matrix2)) {
            return null;
        }
        int rows = matrix1.length;
        int common = matrix1[0].length;
        int cols = matrix2[0].length;
        int [][] result = new int [rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static boolean checkValid(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length == 0 || matrix2.length == 0 || matrix1[0].length == 0 || matrix2[0].length == 0) {
            return false;
        }
        return matrix1[0].length == matrix2.length;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] i: matrix) {
            System.out.println(Arrays.toString(i));
        }
    }
}
