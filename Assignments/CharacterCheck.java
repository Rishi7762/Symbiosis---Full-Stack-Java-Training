package demo;
import java.util.*;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for a character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // Reads the character

        // Check if it's a digit
        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        }
        // Check if it's a letter
        else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a letter.");
        }
        // Otherwise, it's a special symbol
        else {
            System.out.println(ch + " is a special symbol.");
        }
    }
}
