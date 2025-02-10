package Week_2_Tasks.WarehouseInventoryManagementSystem;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();

        // Initialize inventory
        inventoryManager.addProduct(new Product("P1", "Laptop", 10, new Location(1, 1, 1)));
        inventoryManager.addProduct(new Product("P2", "Phone", 5, new Location(1, 2, 2)));
        inventoryManager.addProduct(new Product("P3", "Tablet", 8, new Location(2, 1, 3)));

        // Create orders
        Order order1 = new Order("O1", Arrays.asList("P1", "P3"), Order.Priority.EXPEDITED);
        Order order2 = new Order("O2", Arrays.asList("P2"), Order.Priority.STANDARD);
        Order order3 = new Order("O3", Arrays.asList("P3", "P1", "P2"), Order.Priority.EXPEDITED);

        // Add orders
        inventoryManager.addOrder(order1);
        inventoryManager.addOrder(order2);
        inventoryManager.addOrder(order3);

        // Process orders
        inventoryManager.processOrders();

        // Print final inventory
        inventoryManager.printInventory();
    }
}
