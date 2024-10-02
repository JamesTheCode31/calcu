import java.util.Scanner;

public class Calculator {

    // Method to convert and display the different number systems
    public static void convertAndDisplay(int decimalNumber) {
        String binary = Integer.toBinaryString(decimalNumber);
        String octal = Integer.toOctalString(decimalNumber);
        String hexadecimal = Integer.toHexString(decimalNumber).toUpperCase();

        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
    }

    // Method to perform basic arithmetic operations
    public static void performArithmeticOperations(double num1, double num2) {
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.print("Enter a decimal number (or type 'STOP' to exit): ");
            userInput = scanner.nextLine();

            // Exit condition
            if (userInput.equalsIgnoreCase("STOP")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            try {
                // Parse the input into a decimal number
                double decimalNumber = Double.parseDouble(userInput);
                int intPart = (int) decimalNumber;

                // Show conversions
                convertAndDisplay(intPart);

                // Ask for another number for arithmetic operations
                System.out.print("\nEnter another decimal number for arithmetic operations: ");
                double secondNumber = Double.parseDouble(scanner.nextLine());

                // Perform arithmetic operations
                performArithmeticOperations(decimalNumber, secondNumber);

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid decimal number.");
            }
        }

        scanner.close();
    }
}
