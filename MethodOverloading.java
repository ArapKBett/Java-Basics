class Calculator {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method to add three numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of two numbers: " + calc.add(5, 10));
        System.out.println("Sum of three numbers: " + calc.add(5, 10, 15));
    }
}
