package Week_3_Tasks.Task_1.StudentsMarks_task;

public class Student {
    private String name;
    private double maths;
    private double english;
    private double physics;
    private double avg;




    @Override
    public String toString() {
        return "Student [name=" + name +  ", avg="+ avg + "]";
    }
    
    public Student(String name, double maths, double english, double physics) {
        this.name = name;
        this.maths = maths;
        this.english = english;
        this.physics = physics;
        this.avg=(maths+english+physics)/3;
    }
    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMaths() {
        return maths;
    }
    public void setMaths(double maths) {
        this.maths = maths;
    }
    public double getEnglish() {
        return english;
    }
    public void setEnglish(double english) {
        this.english = english;
    }
    public double getPhysics() {
        return physics;
    }
    public void setPhysics(double physics) {
        this.physics = physics;
    }
    
}
