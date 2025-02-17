package Week_3_Tasks.IOStreams;

import java.io.File;
import java.util.Scanner;

public class FilePermissionChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file or directory path: ");
        String path = scanner.nextLine();
        
        File file = new File(path);
        
        if (file.exists()) {
            
            // Check read permission
            if (file.canRead()) {
                System.out.println("The file or directory has read permission.");
            } else {
                System.out.println("The file or directory does NOT have read permission.");
            }
            
            // Check write permission
            if (file.canWrite()) {
                System.out.println("The file or directory has write permission.");
            } else {
                System.out.println("The file or directory does NOT have write permission.");
            }
        } else {
            System.out.println("The specified path does not exist.");
        }
        
        scanner.close();
    }
}
