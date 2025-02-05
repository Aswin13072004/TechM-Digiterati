package Week_1_Tasks.StringHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for reversing a string
        System.out.print("Enter a string to reverse: ");
        String inputStr = scanner.nextLine();
        System.out.println("Reversed String: " + StringProcessor.reverseString(inputStr));

        // User input for counting occurrences
        System.out.print("\nEnter the main text: ");
        String mainText = scanner.nextLine();
        System.out.print("Enter the substring to search for: ");
        String subString = scanner.nextLine();
        System.out.println("Occurrences of '" + subString + "': " +
                StringProcessor.countOccurrences(mainText, subString));

        // User input for splitting and capitalizing
        System.out.print("\nEnter a sentence to capitalize: ");
        String sentence = scanner.nextLine();
        System.out.println("Capitalized Sentence: " + StringProcessor.splitAndCapitalize(sentence));

        scanner.close();
    }
}
