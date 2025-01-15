package tokobaju.user;

public class Customer extends User {
    public Customer(String username, String password) {
        super(username, password);
    }

    @Override
    public void display() {
        System.out.println("Role: Customer");
    }
}
