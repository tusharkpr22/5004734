public class Main {
    public static void main(String[] args) {
        // Create an array of orders
        Order[] orders = {
                new Order("O001", "Alice", 300.50),
                new Order("O002", "Bob", 150.75),
                new Order("O003", "Charlie", 500.00),
                new Order("O004", "David", 200.00),
                new Order("O005", "Eve", 450.25)
        };

        // Bubble Sort example
        SortAlgorithms.bubbleSort(orders);
        System.out.println("Orders sorted by totalPrice using Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Reset orders array
        orders = new Order[]{
                new Order("O001", "Alice", 300.50),
                new Order("O002", "Bob", 150.75),
                new Order("O003", "Charlie", 500.00),
                new Order("O004", "David", 200.00),
                new Order("O005", "Eve", 450.25)
        };

        // Quick Sort example
        SortAlgorithms.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders sorted by totalPrice using Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

class Order {
    private String orderId;
    private String customerName;
    private double totalPrice;

    public Order(String orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Customer Name: " + customerName + ", Total Price: $" + totalPrice;
    }
}

class SortAlgorithms {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    // Swap orders[j] and orders[j + 1]
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return (i + 1);
    }
}
