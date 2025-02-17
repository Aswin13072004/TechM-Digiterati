package Week_3_Tasks.Generics;

import java.util.List;

public class ElementSearch {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date", "banana");
        System.out.println("Index of 'banana': " + findFirstIndex(words, "banana")); 
        System.out.println("Index of 'grape': " + findFirstIndex(words, "grape"));  
        
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        System.out.println("Index of 30: " + findFirstIndex(numbers, 30)); 
        System.out.println("Index of 60: " + findFirstIndex(numbers, 60)); 
    }

    public static <T> int findFirstIndex(List <T> list,T target){

        if (list == null || target == null) {
            return -1; 
        }

        for(int i =0;i<list.size();i++){
            if (list.get(i).equals(target)) {
                return i;
            }
        }

        return -1;
    }
}
