package Week_3_Tasks.IOStreams;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LastModifiedDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file path: ");
        String path = scanner.nextLine();
        
        File file = new File(path);
        
        if (file.exists()) {
            long lastModified = file.lastModified();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String formattedDate = sdf.format(new Date(lastModified));
            
            System.out.println("The last modified date of the file is: " + formattedDate);
        } else {
            System.out.println("The specified file does not exist.");
        }
        
        scanner.close();
    }
}
