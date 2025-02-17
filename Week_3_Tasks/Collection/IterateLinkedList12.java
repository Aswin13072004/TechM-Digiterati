package Week_3_Tasks.Collection;

import java.util.LinkedList;

public class IterateLinkedList12 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        
        System.out.println("Iterating through the LinkedList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
