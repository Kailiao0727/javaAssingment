package cz.upce.fei.zzapr.w05;

import cz.upce.fei.zzapr.w04.MultiplicationMatrices;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixMulTest {
    @Test
    public void testMatrixMultiplication() {
        int[][] data1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] data2 = {{7, 8}, {9, 10}, {11, 12}};
        int[][] expected = {{58, 64}, {139, 154}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);
        Matrix result = matrix1.multiply(matrix2);

        assertNotNull(result);
        assertArrayEquals(expected, result.matrix);
    }

    @Test
    public void testInvalidDimensions_2x3_2x3() {
        int[][] data1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] data2 = {{7, 8, 9}, {9, 10, 11}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);
        Matrix result = matrix1.multiply(matrix2);

        assertNull(result);
    }

    @Test
    public void testValidMultiplication_2x3_3x2() {
        int[][] data1 = {{1, 2, 3}, {3, 4, 5}};
        int[][] data2 = {{5, 6}, {7, 8}, {9, 10}};
        int[][] expected = {{46, 52}, {88, 100}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);
        Matrix result = matrix1.multiply(matrix2);

        assertNotNull(result);
        assertArrayEquals(expected, result.matrix);
    }
}