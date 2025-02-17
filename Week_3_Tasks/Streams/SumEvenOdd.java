package Week_3_Tasks.Streams;

import java.util.Arrays;
import java.util.List;

public class SumEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer sumEven = numbers.stream().filter(number->number%2==0).reduce(0, (f,s)->f+s);
        Integer sumOdd = numbers.stream().filter(number->number%2!=0).reduce(0, (f,s)->f+s);

        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
