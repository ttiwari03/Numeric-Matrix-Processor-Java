package processor;

import java.util.Scanner;

/*
 *  Multiply matrix by given constant.
 */
public class ScalarMultiplication {
    

    protected static void matrixScalarMultiplication() {
        double[][] matrix = Matrix.readMatrix();

        int row = matrix.length;
        int column = matrix[0].length;

        System.out.println("Enter constant: ");
        double scalar = Double.parseDouble(Matrix.readIp.nextLine());

        double[][] resultMatrix = new double[row][column];

        System.out.println("The result is: ");
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                resultMatrix[r][c] = matrix[r][c] * scalar;
                System.out.print(resultMatrix[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
