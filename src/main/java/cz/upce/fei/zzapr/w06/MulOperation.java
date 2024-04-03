package cz.upce.fei.zzapr.w06;

public class MulOperation {
    public static void main(String[] args) {

        int[][] data1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int[][] data2 = {{-1, -2, -3}, {2, 4, 6}, {3, 2, 1}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        Matrix mulMatrix = matrix1.multiply(matrix2);

        if (mulMatrix != null) {
            mulMatrix.printMatrix();
        } else {
            System.out.println("Unable to multiply two matrices due to unmatched size");
        }
    }
}
