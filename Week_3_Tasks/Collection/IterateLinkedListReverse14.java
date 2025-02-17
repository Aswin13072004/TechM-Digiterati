package Week_3_Tasks.Collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedListReverse14 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        
        System.out.println("Iterating through the LinkedList in reverse order:");

        for(int i=colors.size()-1;i>=0;i--){
            System.out.println(colors.get(i));
        }

        // ListIterator<String> iterator = colors.listIterator(colors.size());
        // while (iterator.hasPrevious()) {
        //     System.out.println(iterator.previous());
        // }
    }
}
