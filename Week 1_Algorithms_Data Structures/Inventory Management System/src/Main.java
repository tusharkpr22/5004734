public class Main {
    public static void main(String[] args) {
        // Create an instance of the InventoryManagementSystem
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem();

        // Create some products
        Product product1 = new Product("P1", "DellGamingLaptop", 10, 200000);
        Product product2 = new Product("P2", "Smartphone", 20, 99999);
        Product product3 = new Product("P3", "Tablet", 15, 89999);

        // Add products to the inventory
        inventorySystem.addProduct(product1);
        inventorySystem.addProduct(product2);
        inventorySystem.addProduct(product3);

        // Display the inventory after adding products
        System.out.println("Inventory after adding products:");
        displayInventory(inventorySystem);

        // Update a product in the inventory
        Product updatedProduct = new Product("P2", "Smartphone", 25, 99999);
        inventorySystem.updateProduct("P2", updatedProduct);

        // Display the inventory after updating a product
        System.out.println("\nInventory after updating product P002:");
        displayInventory(inventorySystem);

        // Delete a product from the inventory
        inventorySystem.deleteProduct("P1");

        // Display the inventory after deleting a product
        System.out.println("\nInventory after deleting product P1:");
        displayInventory(inventorySystem);
    }

    // Method to display the inventory
    public static void displayInventory(InventoryManagementSystem inventorySystem) {
        for (Product product : inventorySystem.getInventory().values()) {
            System.out.println("Product ID: " + product.getProductId() +
                    ", Name: " + product.getProductName() +
                    ", Quantity: " + product.getQuantity() +
                    ", Price: ₹" + product.getPrice());
        }
    }
}

