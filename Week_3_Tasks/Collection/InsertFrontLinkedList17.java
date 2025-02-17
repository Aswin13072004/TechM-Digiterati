package Week_3_Tasks.Collection;

import java.util.LinkedList;

public class InsertFrontLinkedList17 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        colors.addFirst("Orange");
        
        System.out.println("LinkedList after inserting element at the front: " + colors);
    }
}
