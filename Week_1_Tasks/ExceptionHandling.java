package Week_1_Tasks;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        processInput();
    }

    public static void processInput() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for input
            System.out.print("Enter a number: ");
            double number = Double.parseDouble(scanner.nextLine()); // Read input and convert to double

            // Check for division by zero
            if (number == 0) {
                throw new ArithmeticException("Cannot calculate the reciprocal of zero.");
            }

            // Calculate and display the reciprocal
            double reciprocal = 1 / number;
            System.out.println("Reciprocal: " + reciprocal);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input! Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); // Ensure scanner is closed to prevent resource leak
        }
    }
}
