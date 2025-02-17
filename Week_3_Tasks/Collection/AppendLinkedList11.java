package Week_3_Tasks.Collection;

import java.util.LinkedList;

public class AppendLinkedList11 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        // Add initial colors to the list
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        
        // Append an element to the end of the list
        colors.add("Purple");
        
        // Print the updated list
        System.out.println("LinkedList after appending 'Purple': " + colors);
    }
}
