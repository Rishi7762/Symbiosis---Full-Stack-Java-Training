package demo;

public class StaticDemo {
    private int section;  // Non-static or instance variable
    private static int secNo;  // Static or class variable - shared across all instances

    // Static block - runs once when the class is loaded
    static {
        System.out.println("----------Within Static Block-----------");
        secNo = 100;  // Initialize static variable
    }

    // Static method - can be called using the class name
    static void display() {
        // Instance variable 'section' can't be used here as it's not static
        System.out.println("Section (Static): " + secNo);
    }

    // Default constructor
    StaticDemo() {
        System.out.println("-----Within Default Constructor-----");
        secNo++;  // Increment static variable
        section++;  // Increment instance variable
    }

    @Override
    public String toString() {
        return "MyClass [Serial No " + secNo + ", Section= " + section + "]";  // Custom string representation
    }

    public static void main(String args[]) {
        // Create first object and see what happens
        StaticDemo obj1 = new StaticDemo();
        System.out.println(obj1);
        
        // Call static method with class name
        StaticDemo.display();

        // Create second object
        StaticDemo obj2 = new StaticDemo();
        System.out.println(obj2);
        StaticDemo.display();

        // Create third object
        StaticDemo obj3 = new StaticDemo();
        System.out.println(obj3);
        StaticDemo.display();
    }
}
