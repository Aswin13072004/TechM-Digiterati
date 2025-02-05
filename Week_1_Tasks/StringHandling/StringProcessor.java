package Week_1_Tasks.StringHandling;

public class StringProcessor {

    // Method to reverse a given string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Method to count occurrences of a substring in a given text
    public static int countOccurrences(String text, String sub) {
        if (sub.isEmpty() || text.isEmpty()) {
            return 0;
        }

        int count = 0, index = 0;

        // Using indexOf to find occurrences of 'sub' in 'text'
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // Move past the last found occurrence
        }

        return count;
    }

    // Method to split a string and capitalize each word
    public static String splitAndCapitalize(String str) {
        if (str == null || str.trim().isEmpty()) {
            return "";
        }

        String[] words = str.split("\\s+"); // Splitting by spaces
        StringBuilder capitalizedString = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                capitalizedString.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return capitalizedString.toString().trim(); // Removing trailing space
    }
}
