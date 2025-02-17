package Week_3_Tasks.IOStreams;

import java.io.File;
import java.util.Scanner;

public class FileSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the file path: ");
        String path = scanner.nextLine();
        
        File file = new File(path);
        
        if (file.exists() && file.isFile()) {
            long bytes = file.length();
            double kilobytes = bytes / 1024.0;
            double megabytes = kilobytes / 1024.0;

            System.out.println("File size:");
            System.out.println(bytes + " Bytes");
            System.out.println(String.format("%.2f", kilobytes) + " KB");
            System.out.println(String.format("%.2f", megabytes) + " MB");
        } else {
            System.out.println("The specified file does not exist or is not a file.");
        }
        
        scanner.close();
    }
}
