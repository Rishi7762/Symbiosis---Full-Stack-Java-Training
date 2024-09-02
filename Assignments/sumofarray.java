package demo;

import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {
        // Initialize sum variable
        int sum = 0;

        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt user for the size of the array
        System.out.println("Enter the size of the array:");
        int num = sc.nextInt();

        // Initialize the array
        int[] arr = new int[num];

        // Prompt user for array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt(); // Read each element
            sum += arr[i];         // Add element to sum
        }

        // Display the sum of array elements
        System.out.println("The sum of the array elements is: " + sum);

        // Close the Scanner
        sc.close();
    }
}
