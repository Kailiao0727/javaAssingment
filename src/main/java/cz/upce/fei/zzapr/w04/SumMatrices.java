package cz.upce.fei.zzapr.w04;

import java.util.Arrays;

public class SumMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{-1, -2, -3}, {2 , 4, 6}, {3, 2, 1}};

        if (SumMatrices.checkSameSize(matrix1, matrix2)) {
            System.out.println("The sum matrix: ");
            SumMatrices.printMatrix(SumMatrices.getSum(matrix1, matrix2));
        } else {
            System.out.println("Error: Matrices must be of the same size");
        }
    }

    public static boolean checkSameSize(int[][] matrix1, int [][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false;
        } else {
            for (int i = 0; i < matrix1.length; i++) {
                if (matrix1[i].length != matrix2[i].length) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int[][] getSum(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int [][] sum = new int [rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    public static void printMatrix(int[][] matrix) {
        System.out.print("[");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(Arrays.toString(matrix[i]));
            if (i != matrix.length - 1) {
                System.out.print(", ");
            } else{
                System.out.print("]");
            }
        }
    }
}
