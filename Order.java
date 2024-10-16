import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private User user;
    private List<Product> products;
    private Date orderDate;
    private double totalAmount;

    public Order(String orderId, User user, List<Product> products) {
        this.orderId = orderId;
        this.user = user;
        this.products = products;
        this.orderDate = new Date();
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public String getOrderId() { return orderId; }
    public void setOrderId(String orderId) { this.orderId = orderId; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> products) { this.products = products; }

    public Date getOrderDate() { return orderDate; }
    public void setOrderDate(Date orderDate) { this.orderDate = orderDate; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
}
