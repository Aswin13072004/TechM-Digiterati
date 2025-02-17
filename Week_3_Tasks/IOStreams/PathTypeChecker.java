package Week_3_Tasks.IOStreams;

import java.io.File;
import java.util.Scanner;

public class PathTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file or directory path: ");
        String path = scanner.nextLine();
        
        File file = new File(path);
        
        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("The specified path is a file.");
            } else if (file.isDirectory()) {
                System.out.println("The specified path is a directory.");
            }
        } else {
            System.out.println("The specified path does not exist.");
        }
        
        scanner.close();
    }
}
