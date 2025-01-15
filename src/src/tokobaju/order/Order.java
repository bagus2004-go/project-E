package tokobaju.order;

import tokobaju.keranjang.Cart;
import tokobaju.user.User;

public class Order {
    private Cart cart;
    private User user;

    public Order(Cart cart, User user) {
        this.cart = cart;
        this.user = user;
    }

    public void placeOrder() {
        System.out.println("Order placed by: " + user.getUsername());
        System.out.println("Total Price: " + cart.getTotalPrice());
    }
}
