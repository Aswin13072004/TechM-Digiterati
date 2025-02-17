package Week_3_Tasks.Collection;

import java.util.ArrayList;

public class InsertElementArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        
        colors.add(0, "Red");
        
        System.out.println("ArrayList after inserting 'Red' at the first position: " + colors);
    }
}
