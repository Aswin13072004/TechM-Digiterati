package Week_3_Tasks.Collection;

import java.util.ArrayList;

public class IterateArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        
        System.out.println("Iterating through the colors:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
