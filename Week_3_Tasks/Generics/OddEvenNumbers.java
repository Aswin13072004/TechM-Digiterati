package Week_3_Tasks.Generics;

import java.util.List;

public class OddEvenNumbers {
    public static void main(String[] args) {
        List <Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        sumEvenOdd(numbers);

    }

    public static <T extends Number> void sumEvenOdd(List <T> numbers){
        int evenSum=0;
        int oddSum=0;

        for(T number:numbers){
            if(number.intValue()%2==0){
                evenSum+=number.intValue();
            }
            else{
                oddSum+=number.intValue();
            }
        }

        System.out.println("the Odd Sum is "+oddSum);
        System.out.println("The Even Sum is "+evenSum);
    }
}
