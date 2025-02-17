package Week_3_Tasks.Task_1;

import java.util.Objects;

public class EqualsAndDeepEquals {
    public static void main(String[] args) {
        // Create an array 
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 2, 3};

        //store the arr1 into arr3
        Integer[] arr3 = arr1; 

        // Using equals() it will only check the objects value not inside
        System.out.println("\narr1.equals(arr2): " + arr1.equals(arr2)); 
        System.out.println("arr1.equals(arr3): " + arr1.equals(arr3)); 

        // Using deepEquals() it will check the inside elements .
        System.out.println("\nObjects.deepEquals(arr1, arr2): " + Objects.deepEquals(arr1, arr2)); 
        System.out.println("Objects.deepEquals(arr1, arr3): " + Objects.deepEquals(arr1, arr3)); 
    }
}
