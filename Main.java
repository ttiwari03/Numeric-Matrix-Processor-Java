package processor;

import java.util.Scanner;
/*
 *  This program support various matrix operations.
 */
public class Main {

    public static final Scanner readIp = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    1. Add matrices
                    2. Multiply matrix by a constant
                    3. Multiply matrices
                    4. Transpose matrix
                    5. Calculate a determinant
                    6. Inverse matrix
                    0. Exit
                    Your choice:""");
            int choice = Integer.parseInt(readIp.nextLine());

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1 -> Addition.matrixAddition();
                case 2 -> ScalarMultiplication.matrixScalarMultiplication();
                case 3 -> MatrixMultiplication.matrixMultiplication();
                case 4 -> {
                    System.out.println();
                    System.out.println("""
                            1. Main diagonal
                            2. Side diagonal
                            3. Vertical line
                            4. Horizontal line
                            Your choice:""");

                    int transposeChoice = Integer.parseInt(readIp.nextLine());
                    switch (transposeChoice) {
                        case 1 -> Transpose.transpose("main");
                        case 2 -> Transpose.transpose("side");
                        case 3 -> Transpose.transpose("vertical");
                        case 4 -> Transpose.transpose("horizontal");
                    }
                }
                case 5 -> Determinant.calculateDeterminant();
                case 6 -> Inverse.calculateInverse();
            }
        }
    }
}
