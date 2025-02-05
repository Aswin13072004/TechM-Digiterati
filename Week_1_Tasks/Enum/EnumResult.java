package Week_1_Tasks.Enum;

import java.util.Scanner;

public class EnumResult {
    // Method to check if the given day is a holiday
    public static void checkHoliday(DaysOfWeek day) {
        // Assuming Saturday and Sunday are holidays
        if (day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY) {
            System.out.println(day + " is a Holiday!");
        } else {
            System.out.println(day + " is Not a Holiday.");
        }
    }

    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompting user for input
        System.out.println("Enter a day of the week");
        String userInput = scanner.next().toUpperCase();

        try {
            // Convert user input to enum type and check if it's a holiday
            DaysOfWeek selectedDay = DaysOfWeek.valueOf(userInput);
            checkHoliday(selectedDay);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered! Please enter a valid day of the week.");
        }

        // Closing scanner
        scanner.close();
    }
}
