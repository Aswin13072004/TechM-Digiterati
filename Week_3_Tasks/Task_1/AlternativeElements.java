package Week_3_Tasks.Task_1;

import java.util.Arrays;
import java.util.List;

public class AlternativeElements {
    public static void main(String[] args) {
        List <Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        for(int i =1;i<numbers.size();i++){
            System.out.println(numbers.get(i));
            i++;
        }

        Boolean flag =true;

        for(Integer number : numbers){
            if(flag==false){
                System.out.println(number);
            }
            flag= !flag;
        }

    }
}
