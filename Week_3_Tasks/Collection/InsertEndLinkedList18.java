package Week_3_Tasks.Collection;

import java.util.LinkedList;

public class InsertEndLinkedList18 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        colors.addLast("Orange");
        
        System.out.println("LinkedList after inserting element at the end: " + colors);
    }
}
