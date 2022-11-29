package processor;

import java.util.Scanner;

/*
 *  Multiply two matrices when column of first matrix equals row of second matrix.
 */
public class MatrixMultiplication {
    
    protected static void matrixMultiplication() {
        double[][] matrix1 = Matrix.readMatrix();

      
        double[][] matrix2 = Matrix.readMatrix();
        
        int row1 = matrix1.length;
        int column1 = matrix1[0].length;
        int row2 = matrix2.length;
        int column2 = matrix2[0].length;


        if (column1 == row2) {
            System.out.println("The result is: ");
            double[][] multipliedMatrix = new double[row1][column2];
            for (int r = 0; r < row1; r++) {
                for (int c = 0; c < column2; c++) {
                    multipliedMatrix[r][c] = multiplyMatricesCell(matrix1, matrix2, r, c);
                    System.out.print(multipliedMatrix[r][c] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("The operation cannot be performed.");
        }
        System.out.println();
    }

    private static double multiplyMatricesCell(double[][] matrix1, double[][] secondMatrix, int row, int col) {
        double cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += matrix1[row][i] * secondMatrix[i][col];
        }
        return cell;
    }

}
