package Week_3_Tasks.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "blueberry", "apricot");

        List <String> ascendingOrder = words.stream().sorted().collect(Collectors.toList());
        List <String> descendingOrder = words.stream().sorted((f,s)->s.compareTo(f)).collect(Collectors.toList());

        System.out.println("Sorted in ascending order: " + ascendingOrder);
        System.out.println("Sorted in descending order: " + descendingOrder);
    }
}
