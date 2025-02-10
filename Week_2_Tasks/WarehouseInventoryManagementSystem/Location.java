package Week_2_Tasks.WarehouseInventoryManagementSystem;

public class Location {
    private int aisle;
    private int shelf;
    private int bin;

    public Location(int aisle, int shelf, int bin) {
        this.aisle = aisle;
        this.shelf = shelf;
        this.bin = bin;
    }

    public int getAisle() {
        return aisle;
    }

    public int getShelf() {
        return shelf;
    }

    public int getBin() {
        return bin;
    }

    public String toString() {
        return "Aisle " + aisle + ", Shelf " + shelf + ", Bin " + bin;
    }
}
