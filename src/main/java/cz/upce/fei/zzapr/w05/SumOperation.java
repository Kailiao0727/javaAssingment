package cz.upce.fei.zzapr.w05;

public class SumOperation {
    public static void main(String[] args) {
        int[][] data1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] data2 = {{-1, -2, -3}, {2, 4, 6}, {3, 2, 1}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        Matrix sumMatrix = matrix1.add(matrix2);
        if (sumMatrix != null) {
            sumMatrix.printMatrix();
        } else {
            System.out.println("Unable to sum two matrices due to unmatched size");
        }
    }
}
