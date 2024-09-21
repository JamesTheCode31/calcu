import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter a decimal number to convert to binary (or type 'STOP' to quit): ");
            input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("STOP")) {
                System.out.println("Program terminated.");
                break;
            }

            try {
                int decimalNumber = Integer.parseInt(input);
                String binaryString = Integer.toBinaryString(decimalNumber);
                System.out.println("Binary of " + decimalNumber + " is: " + binaryString);
                System.out.println(); // New line added here
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid decimal number.");
            }
        }

        scanner.close();
    }
}