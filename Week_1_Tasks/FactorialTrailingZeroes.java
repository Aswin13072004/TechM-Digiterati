package Week_1_Tasks;

import java.util.Scanner;

public class FactorialTrailingZeroes {

    // Method to count trailing zeroes in factorial of n
    public static int countTrailingZeroes(int n) {
        int count = 0;

        // Counting multiples of 5, 25, 125, etc.
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculating and displaying trailing zeroes
        int result = countTrailingZeroes(number);
        System.out.println("Number of trailing zeroes in " + number + "! is: " + result);

        // Closing scanner
        scanner.close();
    }
}
