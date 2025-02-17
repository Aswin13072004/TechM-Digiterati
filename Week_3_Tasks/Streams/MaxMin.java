package Week_3_Tasks.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 3, 9, 27, 6, 12, 21);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        
        System.out.println("Maximum value: " + max.orElse(null));
        System.out.println("Minimum value: " + min.orElse(null));
    }
}
