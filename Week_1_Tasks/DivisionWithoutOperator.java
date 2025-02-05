package Week_1_Tasks;

// SimpleDivision.java

import java.util.Scanner;

public class DivisionWithoutOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        scanner.close();

        // Edge case: Divisor cannot be zero
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return;
        }

        int quotient = 0;
        int remainder = dividend;

        // Division using repeated subtraction
        while (remainder >= divisor) {
            remainder -= divisor;
            quotient++;
        }

        // Printing results
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
