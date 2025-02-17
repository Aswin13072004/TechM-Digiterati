package Week_3_Tasks.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperLowerCase {
    public static void main(String[] args) {
        List <String> words =  Arrays.asList("hello", "world", "java", "streams");

        List <String> upperCaseWords = words.stream().map(word->word.toUpperCase()).collect(Collectors.toList());

        List <String> lowerCaseWords = words.stream().map(word->word.toLowerCase()).collect(Collectors.toList());

        System.out.println("Uppercase words: " + upperCaseWords);
        System.out.println("Lowercase words: " + lowerCaseWords);
    }
}
