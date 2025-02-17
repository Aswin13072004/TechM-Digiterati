package Week_3_Tasks.Task_1;

import java.util.Arrays;

public class ArrayCopyRange {
    public static void main(String[] args) {

        //an array of numbers is created
        int [] numbers = {0,1,2,3,4,5,6,7};
        System.out.println("Before using Arrays.copyOfRange method");
        System.out.println(Arrays.toString(numbers));

        //then using the Arrays.copyOfRange method we wil create a array of specified range
        System.out.println("\n After using Arrays.copyOfRange method");
        int [] rangedArray=Arrays.copyOfRange(numbers, 3, 7);
        System.out.println(Arrays.toString(rangedArray));
    }
}
