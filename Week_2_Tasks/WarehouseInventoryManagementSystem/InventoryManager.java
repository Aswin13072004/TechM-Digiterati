package Week_2_Tasks.WarehouseInventoryManagementSystem;

import java.util.concurrent.ConcurrentHashMap;
import java.util.PriorityQueue;
import java.util.Comparator;

public class InventoryManager {
    private ConcurrentHashMap<String, Product> products;
    private PriorityQueue<Order> orderQueue;

    public InventoryManager() {
        products = new ConcurrentHashMap<>();

        // Orders with EXPEDITED priority will be processed first
        orderQueue = new PriorityQueue<>(Comparator.comparing(Order::getPriority));
    }

    public void addProduct(Product product) {
        products.put(product.getProductID(), product);
    }

    public void addOrder(Order order) {
        orderQueue.add(order);
    }

    public void processOrders() {
        while (!orderQueue.isEmpty()) {
            Order order = orderQueue.poll();
            processOrder(order);
        }
    }

    private void processOrder(Order order) {
        try {
            for (String productID : order.getProductIDs()) {
                if (!products.containsKey(productID)) {
                    throw new OutOfStockException("Product not found: " + productID);
                }

                Product product = products.get(productID);
                if (product.getQuantity() <= 0) {
                    throw new OutOfStockException("Out of stock: " + product.getName());
                }

                product.setQuantity(product.getQuantity() - 1);
                System.out.println("Order " + order.getOrderID() + " processed: " + product.getName());
            }
        } catch (OutOfStockException e) {
            System.err.println(e.getMessage());
        }
    }

    public void printInventory() {
        System.out.println("\nFinal Inventory:");
        for (Product product : products.values()) {
            System.out.println(product);
        }
    }
}
