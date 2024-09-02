package demo;

import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {
        // Print a heading for the compound interest calculation
        System.out.println("Calculate the Compound Interest");
        
        // Initialize variables
        int price, time, rate, n = 100;
        Scanner sc = new Scanner(System.in);

        // Get user input for principal amount
        System.out.println("Enter the principal amount:");
        price = sc.nextInt();

        // Get user input for annual interest rate
        System.out.println("Enter the annual interest rate (as a percentage):");
        rate = sc.nextInt();

        // Get user input for time period in years
        System.out.println("Enter the time period (in years):");
        time = sc.nextInt();

        // Convert annual interest rate to decimal form
        float rateDecimal = rate / 100.0f;

        // Calculate compound interest
        // Compound interest formula: A = P * (1 + r/n)^(n*t)
        // where P is the principal, r is the annual interest rate, n is the number of times interest is compounded per year, and t is the time in years
        float compound = price * (float) Math.pow(1 + rateDecimal / n, n * time);

        // Display the result
        System.out.println("Compound Interest: " + compound);
    }
}
