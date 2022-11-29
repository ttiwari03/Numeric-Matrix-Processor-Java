package processor;

import java.util.Scanner;

/*
 *  Calculate four type of transpose of matrix.
 *  1. Main Diagonal
 *  2. Side Diagonal
 *  3. Horizontal Line
 *  4. Vertical Line
 */
public class Transpose {


    protected static void transpose(String mode) {
        double[][] matrix = Matrix.readMatrix();
        double[][] transposeMatrix = new double[matrix.length][matrix[0].length];

        switch(mode) {
            case "main" -> transposeMatrix = mainDiagonalTranspose(matrix);
            case "side" -> transposeMatrix = sideDiagonalTranspose(matrix);
            case "horizontal" -> transposeMatrix = horizontalLineTranspose(matrix);
            case "vertical" -> transposeMatrix = verticalLineTranspose(matrix);
        }

        System.out.println("The result is: ");
        for (double[] doubles : transposeMatrix) {
            for (int c = 0; c < transposeMatrix[0].length; c++) {

                System.out.print(doubles[c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static double[][] mainDiagonalTranspose(double[][] matrix) {

        int row = matrix[0].length;
        int col = matrix.length;

        double[][] resultMatrix = new double[row][col];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                resultMatrix[r][c] = matrix[c][r];
            }
        }

        return resultMatrix;
    }

    public static double[][] sideDiagonalTranspose(double[][] matrix) {

        int resultRow = matrix[0].length;
        int resultCol = matrix.length;

        double[][] resultMatrix = new double[resultRow][resultCol];

        int matrixRow = matrix.length;
        int matrixCol = matrix[0].length;

        for (int r = 0; r < matrixRow; r++) {
            for (int c = 0; c < matrixCol; c++) {
                resultMatrix[r][c] = matrix[matrixCol - c - 1][matrixRow - r - 1];

            }
        }
        return resultMatrix;

    }

    public static double[][] verticalLineTranspose(double[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        double[][] resultMatrix = new double[row][col];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                resultMatrix[r][c] = matrix[r][col - c - 1];
            }


        }
        return resultMatrix;
    }

    public static double[][] horizontalLineTranspose(double[][] matrix) {


        int row = matrix.length;
        int col = matrix[0].length;

        double[][] resultMatrix = new double[row][col];

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                resultMatrix[r][c] = matrix[row - r - 1][c];

            }

        }

        return resultMatrix;
    }

}
