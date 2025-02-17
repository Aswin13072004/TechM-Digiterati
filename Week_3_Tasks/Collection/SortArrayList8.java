package Week_3_Tasks.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList8 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        
        Collections.sort(colors);
        
        System.out.println("Sorted ArrayList: " + colors);
    }
}
