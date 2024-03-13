package cz.upce.fei.zzapr.w04;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumMatricesTest {
    @Test
    public void testSumMatrices() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{-1, -2, -3}, {2 , 4, 6}, {3, 2, 1}};
        int[][] expected = {{0, 0, 0}, {6, 9, 12}, {10, 10, 10}};

        int[][] result = SumMatrices.getSum(matrix1, matrix2);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testSameSize() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{-1, -2, -3}, {2 , 4, 6}, {3, 2, 1}};
        assertTrue(SumMatrices.checkSameSize(matrix1, matrix2));
    }

    @Test
    public void testDifferentSize() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{-1, -2, -3}, {2 , 4, 6}, {3, 2}};
        assertFalse(SumMatrices.checkSameSize(matrix1, matrix2));
    }

    @Test
    public void testDifferentSize2() {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{-1, -2}, {2 , 4, 6}, {3, 2, 1}};
        assertFalse(SumMatrices.checkSameSize(matrix1, matrix2));
    }

}