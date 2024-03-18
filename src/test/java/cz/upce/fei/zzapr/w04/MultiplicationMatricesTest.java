package cz.upce.fei.zzapr.w04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplicationMatricesTest {
    @Test
    public void testMatrixMultiplication() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8}, {9, 10}, {11, 12}};
        int[][] expected = {{58, 64}, {139, 154}};
        assertArrayEquals(expected, MultiplicationMatrices.getMultiplication(matrix1, matrix2));
    }

    @Test
    public void testInvalidDimensions() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8}, {9, 10}};
        assertNull(MultiplicationMatrices.getMultiplication(matrix1, matrix2));
    }

    @Test
    public void testValidMultiplication() {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};
        assertNotNull(MultiplicationMatrices.getMultiplication(matrix1, matrix2));
    }

    @Test
    public void testEmptyMatrix() {
        int[][] matrix1 = {};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        int[][] result = MultiplicationMatrices.getMultiplication(matrix1, matrix2);
        assertNull(result);
    }
}