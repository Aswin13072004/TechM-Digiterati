package Week_3_Tasks.Collection;

import java.util.LinkedList;

public class InsertElementLinkedList15 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        int index = 2;
        String newColor = "Purple";
        
        colors.add(index, newColor);
        
        System.out.println("LinkedList after inserting 'Purple' at index " + index + ": " + colors);
    }
}
