package Week_3_Tasks.Collection;

import java.util.ArrayList;

public class RetriveElementArrayList4 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        
        int index = 2;
        String color = colors.get(index);
        System.out.println("Element at index " + index + ": " + color);
    }
}
