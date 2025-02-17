package Week_3_Tasks.Collection;

import java.util.LinkedList;

public class InsertMultipleLinkedList19 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        int index = 2;
        colors.add(index, "Purple");
        colors.add(index + 1, "Orange");
        
        System.out.println("LinkedList after inserting elements at index " + index + ": " + colors);
    }
}
