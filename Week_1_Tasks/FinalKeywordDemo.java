package Week_1_Tasks;

public class FinalKeywordDemo {

    // Declaring a 'final' variable.
    // Once assigned, the value of this variable cannot be changed.
    private final int MAX_SIZE = 100;

    public FinalKeywordDemo() {
        // Trying to modify final variable will result in a compile-time error.
        // MAX_SIZE = 200; // Uncommenting this line will cause an error
    }

    // Final method: cannot be overridden by subclasses.
    public final void printMessage() {
        System.out.println("This is a final method, it cannot be overridden.");
    }

    public static void main(String[] args) {
        // Creating an object of the FinalKeywordDemo class.
        FinalKeywordDemo demo = new FinalKeywordDemo();

        // Printing the final variable's value.
        System.out.println("The MAX_SIZE is: " + demo.MAX_SIZE);

        // Calling the final method.
        demo.printMessage();

        // Uncommenting the below code will result in a compile-time error because we
        // are trying to subclass a final class.
        // FinalClass childClass = new FinalClass(); // This will cause a compilation
        // error
    }
}

// Final class: cannot be subclassed.
final class FinalClass {
    // Some fields and methods for this class.
    private String name;

    // Constructor for FinalClass.
    public FinalClass(String name) {
        this.name = name;
    }

    // Getter method for name.
    public String getName() {
        return name;
    }
}
