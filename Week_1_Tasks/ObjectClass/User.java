package Week_1_Tasks.ObjectClass;

// User class with overridden toString, equals, and hashCode methods
public class User {
    private String name;
    private int age;

    // Constructor
    public User(String name, int age) {
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

    // Overriding toString method for better object representation
    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }

    // Overriding equals method to compare objects based on values
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // Same reference check
        if (obj == null || getClass() != obj.getClass())
            return false; // Type check

        User user = (User) obj;
        return age == user.age && name.equals(user.name);
    }

    // Overriding hashCode method to ensure consistency with equals()
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
