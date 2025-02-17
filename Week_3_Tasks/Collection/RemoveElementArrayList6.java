package Week_3_Tasks.Collection;

import java.util.ArrayList;

public class RemoveElementArrayList6 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        

        colors.remove(2);
        
        System.out.println("ArrayList after removing third element: " + colors);
    }
}
