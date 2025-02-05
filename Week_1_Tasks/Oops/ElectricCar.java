package Week_1_Tasks.Oops;

public class ElectricCar extends Car {
    private int batteryRange;
    private static final String CHARGING_MESSAGE = "Battery is charging for: ";

    // Constructor
    public ElectricCar(String make, String model, int year, int batteryRange) {
        super(make, model, year);
        this.batteryRange = batteryRange;
    }

    // Getter and Setter for battery range
    public int getBatteryRange() {
        return batteryRange;
    }

    public void setBatteryRange(int batteryRange) {
        this.batteryRange = batteryRange;
    }

    // Method to charge battery
    public void chargeBattery() {
        System.out.println(CHARGING_MESSAGE + getMake() + " " + getModel());
    }

    // Overriding startEngine to customize behavior for ElectricCar
    @Override
    public void startEngine() {
        System.out.println("Electric engine started silently for: " + getMake() + " " + getModel());
    }
}
