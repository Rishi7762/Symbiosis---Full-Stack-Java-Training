package demo;
import java.util.Scanner;

public class displayarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int colu = sc.nextInt();

        int[][] matrix1 = new int[row][colu];
        int[][] matrix2 = new int[row][colu];

        System.out.println("Enter the values in matrix1:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < colu; j++) {
                matrix1[i][j] = sc.nextInt(); // Assign to specific element
            }
        }

        System.out.println("Enter the values in matrix2:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < colu; j++) {
                matrix2[i][j] = sc.nextInt(); // Assign to specific element
            }
        }

        int[][] result = addMatrix(matrix1, matrix2);

        System.out.println("Resultant matrix after addition:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < colu; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close(); // Close the scanner to avoid resource leak
    }

    // Method to add two matrices
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int colu = matrix1[0].length;
        int[][] result = new int[row][colu];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < colu; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}
