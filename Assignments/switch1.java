package demo;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter an alphabet
        System.out.println("Enter the alphabet you want to check:");
        char alph = sc.nextLine().toLowerCase().charAt(0); // Convert to lowercase for easier checking

        // Check if the input is a vowel
        switch (alph) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a vowel");
                break;
        }

        // Close the Scanner
        sc.close();
    }
}
