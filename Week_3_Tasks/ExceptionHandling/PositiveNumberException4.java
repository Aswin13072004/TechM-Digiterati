package Week_3_Tasks.ExceptionHandling;

import java.io.File;
import java.util.Scanner;

public class PositiveNumberException4 {
    public static void main(String[] args) {
        String path ="C:\\M-03\\Internship\\TechM-Digiterati\\Week_3_Tasks\\ExceptionHandling\\numbers.txt";
        try {
            readNumbers(path);
        } catch (Exception e) {
            System.out.println("Exception found : "+ e.getMessage());
        }
    }

    public static void readNumbers(String path) throws Exception{
        File file = new File(path);

        if (!file.exists()) {
            throw new Exception("the file is not found");
        }

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()){
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    if (number>0) {
                        throw new Exception("the number is positive : "+number);
                    }
                    System.out.println("the number is negative : "+number);
                }
                else
                    scanner.next();
            }
            
        } 
    }
}
