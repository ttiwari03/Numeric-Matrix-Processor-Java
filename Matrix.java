package processor;

import java.util.Scanner;

public class Matrix {
  protected static final Scanner readIp = new Scanner(System.in);
  
  protected static double[][] readMatrix() {
    //  Reading matrix.
    System.out.println("Enter size of matrix: ");
    String[] dimension = readIp.nextLine().split(" ");
    int row = Integer.parseInt(dimension[0]);
    int column = Integer.parseInt(dimension[1]);
    double[][] matrix = new double[row][column];
  
    System.out.println("Enter matrix: ");
    for (int i = 0; i < row; i++) {
      String[] input = readIp.nextLine().split(" ");
      for (int j = 0; j < input.length; j++) {
        matrix[i][j] = Double.parseDouble(input[j]);
      }
    }
    
    return matrix;
  }
}
