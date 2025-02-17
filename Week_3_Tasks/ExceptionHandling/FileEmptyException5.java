package Week_3_Tasks.ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileEmptyException5 {
    public static void main(String[] args) {
        String path = "C:\\M-03\\Internship\\TechM-Digiterati\\Week_3_Tasks\\ExceptionHandling\\empty.txt";
        try {
            fileRead(path);
        } catch (Exception e) {
            System.out.println("exception found : " + e.getMessage() );
        }
    }

    public static void fileRead(String path) throws Exception{
        File file = new File(path);

        if (!file.exists()) {
            throw new Exception("file not found");
        }

        if (file.length()==0) {
            throw new Exception("file is empty");
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while((line=reader.readLine())!= null){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("error in reading the file " + e.getMessage());
        }
    }
}
