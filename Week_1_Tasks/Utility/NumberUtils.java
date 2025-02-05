package Week_1_Tasks.Utility;

public class NumberUtils {

    public static int getIntegerLength(int number) {
        // Handling negative numbers by converting them to positive
        number = Math.abs(number);

        // Converting the number to a string and returning its length
        return String.valueOf(number).length();
    }
}
