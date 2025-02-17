package Week_3_Tasks.Task_1;

import java.util.Scanner;

public class AlternativeCapitalize {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        String name = scanner.nextLine();

        String result = capitalize(name);

        System.out.println(result);

        scanner.close();
    }

    public static String capitalize(String name){

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<name.length();i++){
            if(i%2==0){
                sb.append(Character.toUpperCase(name.charAt(i)));
            }
            else{
                sb.append(Character.toLowerCase(name.charAt(i)));
            }
        }
        return sb.toString();
    }
}

