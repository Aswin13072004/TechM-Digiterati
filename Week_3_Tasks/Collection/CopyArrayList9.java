package Week_3_Tasks.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList9 {
    public static void main(String[] args) {
        ArrayList<String> colors1 = new ArrayList<>();
        
        // Add colors to the first list
        colors1.add("Red");
        colors1.add("Blue");
        colors1.add("Green");
        colors1.add("Yellow");
        colors1.add("Purple");
        
        // Create another list of the same size
        ArrayList<String> colors2 = new ArrayList<>(colors1.size());
        
        // Add null values to ensure the destination list has the required size
        for (int i = 0; i < colors1.size(); i++) {
            colors2.add(null);
        }
        
        // Copy contents from colors1 to colors2
        Collections.copy(colors2, colors1);
        
        // Print both lists
        System.out.println("Original ArrayList: " + colors1);
        System.out.println("Copied ArrayList: " + colors2);
    }
}
