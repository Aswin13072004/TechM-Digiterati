package Week_3_Tasks.IOStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String path = "D:/Tech m/Java/Assignments/TechM/Week_3_Tasks/IOStreams/file.txt";
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write("i am a human \n");
            bw.write("i can live nearly 100 years");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
