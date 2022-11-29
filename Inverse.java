package processor;

import java.util.Scanner;

/*
 *  Calculate inverse of matrix.
 */
public class Inverse {

    public static void calculateInverse() {
        double[][] matrix = Matrix.readMatrix();

        int row = matrix.length;
        int column = matrix[0].length;

        if (row == column) {
            double determinant = Determinant.getDeterminant(matrix, row);
            if (determinant != 0) {

                //  Calculate cofactor matrix
                double[][] cofactorMatrix = getCofactorMatrix(matrix, row);
                double[][] cofactorMatrixTranspose = Transpose.mainDiagonalTranspose(cofactorMatrix);

                double[][] inverseMatrix = new double[row][column];

                System.out.println("The result is:");
                for (int r = 0; r < row; r++) {
                    for (int c = 0; c < column; c++) {
                        inverseMatrix[r][c] = cofactorMatrixTranspose[r][c] / determinant;
                        System.out.printf("%.2f ", inverseMatrix[r][c]);
                    }
                    System.out.println();
                }

            } else {
                System.out.println("This matrix doesn't have an inverse.");
            }
        } else {
            System.out.println("The operation cannot be performed.");
        }
        System.out.println();
    }

    private static double[][] getCofactorMatrix(double[][] matrix, int size) {
        double[][] cofactorMatrix = new double[size][size];

        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                double[][] subMatrix = Determinant.getSubMatrix(matrix, r, c);
                double minor = Determinant.getDeterminant(subMatrix, subMatrix.length);
                double cofactor = Math.pow(-1, r + c) * minor;
                cofactorMatrix[r][c] = cofactor;
            }
        }
        return cofactorMatrix;
    }
}
