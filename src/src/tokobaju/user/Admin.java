package tokobaju.user;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username,password);
    }

    @Override
    public void display() {
        System.out.println("Role: Admin");
    }
}
