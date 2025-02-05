package Week_1_Tasks.AbstractionInterface;

// Dog class extending the abstract Animal class
public class Dog extends Animal {

    // Overriding the makeSound method to provide a specific implementation
    @Override
    public void makeSound() {
        System.out.println("The dog is barking!");
    }
}
