package Week_3_Tasks.Collection;

import java.util.LinkedList;

public class IterateLinkedListFromIndex13 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        
        int startIndex = 2;
        
        System.out.println("Iterating from index " + startIndex + ":");
        for (int i = startIndex; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
