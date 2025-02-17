package Week_3_Tasks.Generics;

import java.util.ArrayList;
import java.util.List;

public class ListMerger {
    public static void main(String[] args) {
        List<String> list1 = List.of("apple", "banana", "cherry");
        List<String> list2 = List.of("date", "elderberry", "fig", "grape");
        System.out.println("Merged list: " + mergeAlternating(list1, list2));
        
        List<Integer> numbers1 = List.of(1, 3, 5);
        List<Integer> numbers2 = List.of(2, 4, 6, 8);
        System.out.println("Merged list: " + mergeAlternating(numbers1, numbers2));
    }

    public static <T> List<T> mergeAlternating(List <T> list1,List <T> list2){
        List<T> mergedList = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);
        
        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                mergedList.add(list1.get(i));
            }
            if (i < size2) {
                mergedList.add(list2.get(i));
            }
        }
        
        return mergedList;
    }
}
