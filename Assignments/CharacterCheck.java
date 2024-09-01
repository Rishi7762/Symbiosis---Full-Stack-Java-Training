package demo;
import java.util.*;

public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept a character from the user
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit.");
        }
        else if (Character.isLetter(ch)) {
            System.out.println(ch + " is a letter.");
        }
        else {
            System.out.println(ch + " is a special symbol.");
        }
    }
}
