package Week_3_Tasks.Generics;

public class ArrayCompare {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {1, 2, 3, 4, 5};
        Integer[] array3 = {1, 2, 3, 4, 6};
        
        String[] strArray1 = {"Hello", "World"};
        String[] strArray2 = {"Hello", "World"};
        String[] strArray3 = {"Hello", "Java"};
        
        System.out.println("array1 and array2 are equal: " + areArraysEqual(array1, array2)); 
        System.out.println("array1 and array3 are equal: " + areArraysEqual(array1, array3));
        System.out.println("strArray1 and strArray2 are equal: " + areArraysEqual(strArray1, strArray2)); 
        System.out.println("strArray1 and strArray3 are equal: " + areArraysEqual(strArray1, strArray3)); 
    }

    public static <T> Boolean areArraysEqual(T [] array1,T [] array2){
        if (array1 == null || array2 == null) {
            return array1 == array2; // Both should be null to be considered equal
        }
        
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        
        return true;
    }
}
