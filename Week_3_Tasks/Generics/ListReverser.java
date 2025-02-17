package Week_3_Tasks.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReverser {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date");
        System.out.println("Reversed list: " + reverseList(words));
        
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Reversed list: " + reverseList(numbers));
    }

    public static <T> List<T> reverseList(List <T> list){
        if (list==null) {
            return null;
        }

        List <T> reversedList = new ArrayList<>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }
}
