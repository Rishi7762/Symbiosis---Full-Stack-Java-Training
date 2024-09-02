package demo;

// Class to hold two values for swapping by reference
class SwapValues {
    int a;
    int b;

    // Constructor to initialize values
    SwapValues(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

public class SwapExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        // Create an object to demonstrate swapping by reference
        SwapValues values = new SwapValues(5, 10);

        // Swap by value - no actual change in 'a' and 'b' outside this method
        System.out.println("Before swap by value: a = " + a + ", b = " + b);
        swapByValue(a, b);  // Doesn't change original 'a' and 'b'

        // Swap by reference - changes happen in the object passed
        System.out.println("Before swap by reference: a = " + values.a + ", b = " + values.b);
        swapByReference(values);  // This will actually swap 'a' and 'b' inside the object

        // Swap without using a third variable
        System.out.println("Before swap without temp: a = " + a + ", b = " + b);
        swapWithoutTemp(a, b);  // Again, doesn't change original 'a' and 'b'
    }

    // Swap by value - just swaps within the method
    public static void swapByValue(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swap by value: a = " + x + ", b = " + y);  // Values are swapped here
    }

    // Swap by reference - swaps the values inside the object
    public static void swapByReference(SwapValues values) {
        int temp = values.a;
        values.a = values.b;
        values.b = temp;
        System.out.println("After swap by reference: a = " + values.a + ", b = " + values.b);  // Actual object values are swapped
    }

    // Swap without a temporary variable - uses arithmetic operations
    public static void swapWithoutTemp(int x, int y) {
        x = x + y;  // x now becomes 15
        y = x - y;  // y now becomes 5 (original value of x)
        x = x - y;  // x now becomes 10 (original value of y)
        System.out.println("After swap without temp: a = " + x + ", b = " + y);  // Values are swapped here
    }
}
