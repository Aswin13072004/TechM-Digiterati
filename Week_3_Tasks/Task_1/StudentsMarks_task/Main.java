package Week_3_Tasks.Task_1.StudentsMarks_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List <Student> students = Arrays.asList(new Student("Kiruthika",90,90,90),
        new Student("Abinesh", 80, 80, 80),
        new Student("Ajay", 100, 100, 100));


        List<Student> sortedStudents= (ArrayList<Student>)students.stream().sorted((student1,student2)->Double.compare(student2.getAvg(), student1.getAvg())).collect(Collectors.toList());
        System.out.println(sortedStudents);
    }
}
