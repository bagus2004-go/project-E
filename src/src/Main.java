import tokobaju.user.*;
import tokobaju.order.*;
import tokobaju.produk.*;
import tokobaju.keranjang.*;
import tokobaju.stock.*;

public class Main {
    public static void main(String[] args) {
        try {
            User admin = new Admin("admin", "admin123");
            User customer = new Customer("customer", "cust123");

            Product produk1 = new Product(1, "Kaos Polos", 100000, 50);
            Product produk2 = new Product(2, "Kemeja", 200000, 30);

            StockBarang stockManager = new StockBarang();
            stockManager.addProduct(produk1);
            stockManager.addProduct(produk2);

            Cart cart = new Cart();
            cart.addItem(produk1, 2);
            cart.addItem(produk2, 1);

            Order order = new Order(cart, customer);
            order.placeOrder();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}