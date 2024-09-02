package demo;

import java.util.Scanner;

public class DisplayArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get matrix dimensions from the user
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();

        // Initialize matrices
        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];

        // Fill in the first matrix
        System.out.println("Enter the values for matrix1:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix1[i][j] = sc.nextInt(); // Get value for matrix1
            }
        }

        // Fill in the second matrix
        System.out.println("Enter the values for matrix2:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix2[i][j] = sc.nextInt(); // Get value for matrix2
            }
        }

        // Add the two matrices
        int[][] result = addMatrix(matrix1, matrix2);

        // Print the result matrix
        System.out.println("Resultant matrix after addition:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(result[i][j] + " "); // Print each element
            }
            System.out.println(); // Move to the next line after each row
        }
        
        sc.close(); // Close the scanner to avoid resource leaks
    }

    // Method to add two matrices
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] result = new int[row][col];

        // Perform matrix addition
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
