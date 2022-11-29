package processor;

import java.util.Scanner;

/*
 *  Support addition of two matrices whose rows and columns are equals.
 */
public class Addition {
    
    protected static void matrixAddition() {
       
        double[][] matrix1 = Matrix.readMatrix();

        double[][] matrix2 = Matrix.readMatrix();

        int row1 = matrix1.length;
        int column1 = matrix1[0].length;
        int row2 = matrix2.length;
        int column2 = matrix2[0].length;

        if (row1 == row2 && column1 == column2) {
            System.out.println("The result is: ");
            double[][] sumMatrix = new double[row1][column1];

            for (int r = 0; r < row1; r++) {
                for (int c= 0; c < column1; c++) {
                    sumMatrix[r][c] = matrix1[r][c] + matrix2[r][c];
                    System.out.print(sumMatrix[r][c] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("The operation cannot be performed.");
        }

        System.out.println();
    }
}
