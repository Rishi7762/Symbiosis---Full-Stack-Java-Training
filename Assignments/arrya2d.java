package demo;

public class Array2D {

    public static void main(String[] args) {
        int sum = 0;
        // Create a 3x5 2D array
        int num[][] = new int[3][5];

        // Fill the array with multiplication values (i+1)*(j+1)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                num[i][j] = (i + 1) * (j + 1);
            }
        }

        // Print the 2D array
        System.out.println("Print 2D array:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        // Print a separator
        System.out.println("---------------");

        // Calculate and print each value in the array and its sum
        for (int x[] : num) {
            for (int y : x) {
                System.out.println("Value is: " + y);
                sum += y;
            }
        }

        // Print the total sum of all values
        System.out.println("Sum: " + sum);
    }
}
