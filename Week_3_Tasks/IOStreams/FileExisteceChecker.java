package Week_3_Tasks.IOStreams;

import java.io.File;
import java.util.Scanner;

public class FileExisteceChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter the file or directory path
        System.out.print("Enter the file or directory path: ");
        String path = scanner.nextLine();
        
        File file = new File(path);
        
        // Check if the file or directory exists
        if (file.exists()) {
            System.out.println("the specified file or directory exists");
        } else {
            System.out.println("The specified file or directory does not exist.");
        }
        
        scanner.close();
    }
}
