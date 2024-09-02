package demo;
import java.util.*;

public class Employee {
    int personId, age;
    String personName;

    // Constructor to initialize employee details
    Employee(int personId, int age, String personName) {
        this.personId = personId;
        this.age = age;
        this.personName = personName;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Person Id is: " + personId);
        System.out.println("Person age is: " + age);
        System.out.println("Person Name is: " + personName);
    }

    public static void main(String[] args) {
        // Array to hold multiple Employee objects
        Employee emp[] = new Employee[4];
        int id, age;
        String name;
        Scanner sc = new Scanner(System.in);

        // Get input for each person
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter person id: ");
            id = sc.nextInt();
            System.out.println("Enter person age: ");
            age = sc.nextInt();
            System.out.println("Enter person name: ");
            name = sc.next();
            // Create a new Employee object with provided details
            emp[i] = new Employee(id, age, name);
        }

        // Display all employees' details
        for (Employee i : emp) {
            i.display();
        }
    }
}
