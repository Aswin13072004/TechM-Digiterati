package Week_3_Tasks.Collection;

import java.util.ArrayList;

public class SearchElementArrayList7 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        
        String searchColor = "Green";
        
        if (colors.contains(searchColor)) {
            System.out.println(searchColor + " is present in the ArrayList.");
        } else {
            System.out.println(searchColor + " is not present in the ArrayList.");
        }
    }
}
