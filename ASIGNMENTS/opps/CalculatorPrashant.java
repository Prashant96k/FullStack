
import java.util.Scanner;

public class CalculatorPrashant {
    // Addition for int data type
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Addition for double data type
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction for int data type
    public int subtract(int num1, int num2) {public class Calculator {
    // Addition for int data type
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Addition for double data type
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction for int data type
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    // Subtraction for double data type
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication for int data type
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Multiplication for double data type
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division for int data type
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }

    // Division for double data type
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Addition
        System.out.println("Addition (int): " + calculator.add(5, 3));
        System.out.println("Addition (double): " + calculator.add(5.5, 3.3));

        // Subtraction
        System.out.println("Subtraction (int): " + calculator.subtract(5, 3));
        System.out.println("Subtraction (double): " + calculator.subtract(5.5, 3.3));

        // Multiplication
        System.out.println("Multiplication (int): " + calculator.multiply(5, 3));
        System.out.println("Multiplication (double): " + calculator.multiply(5.5, 3.3));

        // Division
        System.out.println("Division (int): " + calculator.divide(10, 2));
        System.out.println("Division (double): " + calculator.divide(10.5, 2.5));
    }
}

        return num1 - num2;
    }

    // Subtraction for double data type
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication for int data type
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Multiplication for double data type
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division for int data type
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }

    // Division for double data type
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        // Addition
        System.out.println("Addition: " + calculator.add(num1, num2));

        // Subtraction
        System.out.println("Subtraction: " + calculator.subtract(num1, num2));

        // Multiplication
        System.out.println("Multiplication: " + calculator.multiply(num1, num2));

        // Division
        try {
            System.out.println("Division: " + calculator.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
