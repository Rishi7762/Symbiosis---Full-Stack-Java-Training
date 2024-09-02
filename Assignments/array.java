package demo;
import java.util.*;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create a 2x2 array to store state and city names
        String city[][] = new String[2][2];

        // Fill the array with state and city names
        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[i].length; j++) {
                if (j == 0) {
                    // Input state name
                    System.out.println("Enter name of state: ");
                    city[i][j] = sc.next();
                } else {
                    // Input city name
                    System.out.println("Enter city name: ");
                    city[i][j] = sc.next();
                }
            }
        }

        // Display state names and their cities
        System.out.println("Now displaying state names and their cities:");
        for (int i = 0; i < city.length; i++) {
            for (int j = 0; j < city[i].length; j++) {
                if (j == 1) {
                    // Add a colon between state and city
                    System.out.print(": ");
                }
                System.out.print(city[i][j] + " ");
            }
            System.out.println();
        }
    }
}
