package demo;

import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        // Display the purpose of the program
        System.out.println("Calculate the Simple Interest");

        // Declare necessary variables
        int principal, time, rate;
        Scanner sc = new Scanner(System.in);

        // Get the principal amount from the user
        System.out.println("Enter the principal amount:");
        principal = sc.nextInt();

        // Get the interest rate from the user
        System.out.println("Enter the rate of interest:");
        rate = sc.nextInt();

        // Get the time period from the user
        System.out.println("Enter the time period in years:");
        time = sc.nextInt();

        // Calculate simple interest
        float interest = (principal * rate * time) / 100.0f;

        // Display the calculated simple interest
        System.out.println("Simple Interest: " + interest);
        
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
