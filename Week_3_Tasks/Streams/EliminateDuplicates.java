package Week_3_Tasks.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EliminateDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 10, 10);

        List <Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueNumbers);

    }
}
