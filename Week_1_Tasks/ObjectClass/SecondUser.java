package Week_1_Tasks.ObjectClass;

// SecondUser class WITHOUT overriding toString, equals, and hashCode
public class SecondUser {
    private String name;
    private int age;

    // Constructor
    public SecondUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() { 
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
