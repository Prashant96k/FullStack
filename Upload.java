import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculations = true;

        while (continueCalculations) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("\nMenu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result of addition: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result of subtraction: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result of multiplication: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Result of division: " + (num1 / num2));
                    }
                    break;
                case 5:
                    continueCalculations = false;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }

            if (choice >= 1 && choice <= 4) {
                System.out.print("\nDo you want to perform another calculation? (yes/no): ");
                String response = scanner.next();
                if (!response.equalsIgnoreCase("yes")) {
                    continueCalculations = false;
                    System.out.println("Exiting program...");
                }
            }
        }

        scanner.close();
    }
}
