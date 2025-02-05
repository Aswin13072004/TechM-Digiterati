package Week_1_Tasks.Oops;
// Main.java

public class Main {
    public static void main(String[] args) {
        // Creating an array of Car objects
        Car[] cars = new Car[3];

        // Populating the array with Car and ElectricCar objects
        cars[0] = new Car("Toyota", "Camry", 2022);
        cars[1] = new ElectricCar("Tesla", "Model S", 2023, 400);
        cars[2] = new Car("Honda", "Civic", 2021);

        // Demonstrating polymorphism
        for (Car car : cars) {
            car.startEngine();
        }
    }
}
