package Week_3_Tasks.Collection;

import java.util.LinkedList;

public class FirstLastOccurence20 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Purple");
        
        int firstIndex = colors.indexOf("Blue");
        int lastIndex = colors.lastIndexOf("Blue");
        
        System.out.println("First occurrence of 'Blue' is at index: " + firstIndex);
        System.out.println("Last occurrence of 'Blue' is at index: " + lastIndex);
    }
}
