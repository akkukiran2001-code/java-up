// Calculator class
class Calculator {

    // Add two integers
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    // Add three integers
    void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    // Add two double values
    void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }
}

// Main class
public class Calculator_new {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.add(10, 20);          // Calls add(int, int)
        c.add(10, 20, 30);      // Calls add(int, int, int)
        c.add(10.5, 20.5);      // Calls add(double, double)
    }
}