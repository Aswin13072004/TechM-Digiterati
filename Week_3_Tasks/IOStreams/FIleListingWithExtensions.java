package Week_3_Tasks.IOStreams;

import java.io.File;
import java.io.FilenameFilter;

public class FIleListingWithExtensions {
    public static void main(String[] args) {
        String directoryPath = "D:\\Tech m\\Java\\Assignments\\TechM\\Week_1_Tasks";

        String extension = ".java";

        File directory = new File(directoryPath);

        FilenameFilter filter = (dir,name)->name.endsWith(extension);

        String files [] = directory.list(filter);

        if(files !=null){
            for(String file:files){
                System.out.println(file);
            }
        }

        else
            System.out.println("no files are found");
    }
}
