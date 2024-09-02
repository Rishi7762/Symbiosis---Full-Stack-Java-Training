import java.util.*;

class Remainder {
    public static void main(String[] args) {
        int dividend, divisor;
        Scanner sc = new Scanner(System.in);

        // Ask for the dividend
        System.out.println("Enter dividend: ");
        dividend = sc.nextInt();

        // Ask for the divisor
        System.out.println("Enter divisor: ");
        divisor = sc.nextInt();

        // Check for invalid divisor (zero or negative)
        if (divisor <= 0) {
            System.out.println("Cannot divide by zero");
            return;  // Exit the program if the divisor is invalid
        }

        // Subtract divisor from dividend until dividend is less than divisor
        while (dividend >= divisor) {
            dividend -= divisor;  // Keep reducing the dividend
        }

        // What's left is the remainder
        int remainder = dividend;
        System.out.println("The Remainder is: " + remainder);
    }
}
