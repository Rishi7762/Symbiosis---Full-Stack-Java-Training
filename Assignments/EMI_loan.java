package demo;
import java.util.Scanner;
public class EMI_loan {

    public static void main(String[] args) {
        // Start of the EMI calculator program
        System.out.println("Calculate the EMI loan");

        // Declare variables to store price, time, and rate
        int price, time, rate, n = 100;
        Scanner sc = new Scanner(System.in);

        // Get the loan amount from the user
        System.out.println("Enter the price:");
        price = sc.nextInt();

        // Get the rate of interest
        System.out.println("Enter the rate:");
        rate = sc.nextInt();

        // Get the loan period (in years)
        System.out.println("Enter the time:");
        time = sc.nextInt();

        // Convert years to months
        time = time * 12;

        // Calculate the EMI using a formula
        int loan = (price * rate * (1 + rate) ^ time) / ((1 + rate) ^ time - 1);

        // Show the calculated EMI
        System.out.println("EMI loan: " + loan);
    }
}
