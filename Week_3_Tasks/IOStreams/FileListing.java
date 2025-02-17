package Week_3_Tasks.IOStreams;

import java.io.File;

public class FileListing {
    public static void main(String[] args) {
        String directoryPath = "D:\\Tech m\\Java\\Assignments\\TechM\\Week_1_Tasks";

        File directory = new File(directoryPath);

        String [] fileList = directory.list();

        if(fileList!=null){
            for(String file:fileList){
                System.out.println(file);
            }
        }
        else
            System.out.println("no files found in this directory");
    }
}
