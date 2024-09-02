package demo;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean continueRunning = true; // Keep the menu running until user chooses to exit

        while (continueRunning) {
            // Show the menu options
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            // Process the user's choice
            switch (choice) {
                case 1:
                    // Handle addition
                    System.out.println("Addition");
                    System.out.print("Enter the 1st number: ");
                    int num1 = sc.nextInt();
                    System.out.print("Enter the 2nd number: ");
                    int num2 = sc.nextInt();
                    int sum = num1 + num2;
                    System.out.println("Result: " + sum);
                    break;

                case 2:
                    // Handle subtraction
                    System.out.println("Subtraction");
                    System.out.print("Enter the 1st number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter the 2nd number: ");
                    int b = sc.nextInt();
                    int sub = a - b;
                    System.out.println("Result: " + sub);
                    break;

                case 3:
                    // Handle multiplication
                    System.out.println("Multiplication");
                    System.out.print("Enter the 1st number: ");
                    int x = sc.nextInt();
                    System.out.print("Enter the 2nd number: ");
                    int y = sc.nextInt();
                    int mul = x * y;
                    System.out.println("Result: " + mul);
                    break;

                case 4:
                    // Handle division
                    System.out.println("Division");
                    System.out.print("Enter the 1st number: ");
                    int p = sc.nextInt();
                    System.out.print("Enter the 2nd number: ");
                    int q = sc.nextInt();
                    // Check for division by zero
                    if (q != 0) {
                        int div = p / q;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting. Thank you!");
                    continueRunning = false;
                    break;

                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        sc.close(); // Close the scanner to avoid resource leaks
    }
}
