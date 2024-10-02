import java.util.Scanner;

public class DecimalConverter.java  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        while (true) {
            System.out.print("Enter a decimal number (or type 'STOP' to exit): ");
            userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("STOP")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            try {
                // Convert user input to a decimal number
                double decimalNumber = Double.parseDouble(userInput);

                // Convert to different numeral systems
                String binaryNumber = Integer.toBinaryString((int) decimalNumber);
                String octalNumber = Integer.toOctalString((int) decimalNumber);
                String hexNumber = Integer.toHexString((int) decimalNumber);

                // Display conversions
                System.out.println("Binary: " + binaryNumber);
                System.out.println("Octal: " + octalNumber);
                System.out.println("Hexadecimal: " + hexNumber);

                // Perform arithmetic operations
                System.out.print("Enter another decimal number for calculations: ");
                double secondNumber = Double.parseDouble(scanner.nextLine());

                System.out.println("Addition: " + (decimalNumber + secondNumber));
                System.out.println("Subtraction: " + (decimalNumber - secondNumber));
                System.out.println("Multiplication: " + (decimalNumber * secondNumber));
                System.out.println("Division: " + (decimalNumber / secondNumber));

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid decimal number.");
            }
            System.out.println();  // Print a new line for better readability
        }

        scanner.close();
    }
}
