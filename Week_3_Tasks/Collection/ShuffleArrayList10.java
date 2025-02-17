package Week_3_Tasks.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList10 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        
        Collections.shuffle(colors);
        
        System.out.println("Shuffled ArrayList: " + colors);
    }
}
