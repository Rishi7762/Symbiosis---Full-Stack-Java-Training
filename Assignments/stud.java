package demo;

import java.util.Scanner;

public class Stud {

    public static void main(String[] args) {
        // Display the purpose of the program
        System.out.println("Arithmetic Calculations");

        // Declare variables for input numbers
        int num1, num2;

        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter the first number:");
        num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        num2 = sc.nextInt();

        // Perform arithmetic operations and display results
        int sum = num1 + num2;
        System.out.println("Addition is: " + sum);

        int sub = num1 - num2;
        System.out.println("Subtraction is: " + sub);

        // Check for division by zero
        if (num2 != 0) {
            int div = num1 / num2;
            System.out.println("Division is: " + div);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        int mul = num1 * num2;
        System.out.println("Multiplication is: " + mul);

        // Check for modulo by zero
        if (num2 != 0) {
            int mod = num1 % num2;
            System.out.println("Remainder is: " + mod);
        } else {
            System.out.println("Error: Modulo by zero is not allowed.");
        }

        // Close the Scanner
        sc.close();
    }
}
