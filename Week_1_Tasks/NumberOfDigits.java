package Week_1_Tasks;

import java.util.Scanner;
import Week_1_Tasks.Utility.NumberUtils;

public class NumberOfDigits {
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter an integer to find its length: ");
        int number = scanner.nextInt();

        // Calling the static utility method directly without creating an object
        int length = NumberUtils.getIntegerLength(number);

        // Printing the result
        System.out.println("The length of the number " + number + " is: " + length);

        // Closing scanner
        scanner.close();
    }
}
