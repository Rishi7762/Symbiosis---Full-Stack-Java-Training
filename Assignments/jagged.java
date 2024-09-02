package demo;

public class Jagged {

    public static void main(String[] args) {
        // Define and initialize a jagged array
        int[][] myArray = new int[3][]; // Jagged array with 3 rows
        myArray[0] = new int[]{1, 2, 3}; // First row has 3 elements
        myArray[1] = new int[]{4, 5};    // Second row has 2 elements
        myArray[2] = new int[]{6, 7, 8, 9, 10}; // Third row has 5 elements

        // Display the jagged array
        System.out.println("Two Dimensional Jagged Array:");
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.print(myArray[i][j] + " "); // Print each element
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
