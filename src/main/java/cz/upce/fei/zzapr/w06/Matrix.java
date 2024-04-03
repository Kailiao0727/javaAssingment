package cz.upce.fei.zzapr.w06;

public class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;


    public Matrix(int[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.cols = matrix[0].length;
    }

    public Matrix add(Matrix otherMatrix) {
        if (!this.checkSameSize(otherMatrix)) {
            return null;
        }
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = this.matrix[i][j] + otherMatrix.matrix[i][j];
            }
        }
        return new Matrix(sum);
    }

    public boolean checkSameSize(Matrix otherMatrix) {
        if (this.matrix.length != otherMatrix.matrix.length) {
            return false;
        } else {
            for (int i = 0; i < this.matrix.length; i++) {
                if (this.matrix[i].length != otherMatrix.matrix[i].length) {
                    return false;
                }
            }
            return true;
        }
    }

    public Matrix multiply(Matrix otherMatrix) {
        if (!this.checkValid(otherMatrix)) {
            return null;
        }
        int rows = this.matrix.length;
        int common = this.matrix[0].length;
        int cols = otherMatrix.matrix[0].length;
        int [][] result = new int [rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    result[i][j] += this.matrix[i][k] * otherMatrix.matrix[k][j];
                }
            }
        }
        return new Matrix(result);
    }

    public boolean checkValid(Matrix otherMatrix) {
        if (this.matrix.length == 0 || otherMatrix.matrix.length == 0 || this.matrix[0].length == 0 || otherMatrix.matrix[0].length == 0) {
            return false;
        }
        return this.matrix[0].length == otherMatrix.matrix.length;
    }

    public void printMatrix() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[0].length; j++) {
                System.out.printf("%6d", this.matrix[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] getMatrix() {
        int[][] copy = new int[this.rows][this.cols];

        for (int i = 0; i < rows; i++) {
            System.arraycopy(this.matrix[i], 0, copy[i], 0, cols);
        }

        return copy;
    }

}
