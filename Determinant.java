package processor;

import java.util.Scanner;

/*
 *  Calculate determinant of square matrix.
 */
public class Determinant {

    protected static void calculateDeterminant() {
        
        double[][] matrix = Matrix.readMatrix();
        int row = matrix.length;
        int column = matrix[0].length;

        if (row == column) {
            double determinant = getDeterminant(matrix, row);
            System.out.println("The result is:");
            System.out.println(determinant);

        } else {
            System.out.println("The operation cannot be performed.");
        }
        System.out.println();
    }


    protected static double getDeterminant(double[][] matrix, int size) {
        double determinant = 0.0;

        if (size == 1) {
            determinant = matrix[0][0];
        } if (size == 2) {
           determinant = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            int r = 0;
            for (int c = 0; c < size; c++) {

                double[][] tempMatrix = getSubMatrix(matrix, r, c);
                double minor = getDeterminant(tempMatrix, tempMatrix.length);
                double cofactor = Math.pow(-1, r + c) * minor;
                determinant += matrix[r][c] * cofactor;
            }
        }

        return determinant;
    }

    protected static double[][] getSubMatrix(double[][] matrix, int skipRow, int skipCol) {
        int size = matrix.length;
        double[][] subMatrix = new double[size - 1][size - 1];

        int subR = 0;
        int subC = 0;
        
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                
                if (r != skipRow && c != skipCol) {
                    subMatrix[subR][subC] = matrix[r][c];

                    if (subC == size - 2) {
                        subR++;
                        subC = 0;
                    } else {
                        subC++;
                    }

                }
            }
        }
        return subMatrix;
    }

}
