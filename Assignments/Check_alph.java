package demo;
import java.util.*;

public class Check_alph {

    public static void main(String[] args) {
        char alph;
        Scanner sc = new Scanner(System.in);

        // Get an alphabet from the user
        System.out.println("Enter the Alphabet you want to check");
        alph = sc.nextLine().charAt(0);  // Reads the first character entered

        // Check if it's a vowel (lowercase or uppercase)
        if (alph == 'a' || alph == 'e' || alph == 'i' || alph == 'o' || alph == 'u' || 
            alph == 'A' || alph == 'E' || alph == 'I' || alph == 'O' || alph == 'U') {
            System.out.println("Vowel: " + alph);
        } 
        // If not a vowel, it must be a consonant
        else {
            System.out.println("Consonant: " + alph);
        }
    }
}
