package cz.upce.fei.zzapr.w05;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MatrixSumTest {
    @Test
    public void testSumMatrices() {
        int[][] data1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] data2 = {{-1, -2, -3}, {2, 4, 6}, {3, 2, 1}};
        int[][] expected = {{0, 0, 0}, {6, 9, 12}, {10, 10, 10}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);
        Matrix result = matrix1.add(matrix2);

        assertNotNull(result);
        assertArrayEquals(expected, result.matrix);
    }
    @Test
    public void testDifferentSize() {
        int[][] data1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] data2 = {{-1, -2, -3}, {2 , 4, 6}, {3, 2, 3}, {4, 2, 3}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);
        Matrix result = matrix1.add(matrix2);

        assertNull(result);
    }
}