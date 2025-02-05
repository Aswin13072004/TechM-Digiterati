package Week_1_Tasks.Oops;

// Car.java

public class Car {
    private String make;
    private String model;
    private int year;

    private static final String ENGINE_START_MESSAGE = "Engine has started for: ";

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter and Setter methods
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to start the engine
    public void startEngine() {
        System.out.println(ENGINE_START_MESSAGE + make + " " + model);
    }
}
