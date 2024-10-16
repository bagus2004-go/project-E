import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("P001", "Laptop", 15000000, "Laptop Gaming", 10);
        Product product2 = new Product("P002", "Mouse", 150000, "Mouse Wireless", 50);

        User user = new User("U001", "John Doe", "john@example.com", "password123");

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1, 1);
        cart.addProduct(product2, 2);

        System.out.println("Total Harga: " + cart.calculateTotal());

        List<Product> productList = new ArrayList<>(cart.getItems().keySet());
        Order order = new Order("O001", user, productList);

        System.out.println("Total Harga Pesanan: " + order.getTotalAmount());
    }
}

