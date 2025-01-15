package tokobaju.user;

public abstract class User {
    private String username;
    private String password;

    public User(String username,String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean authentikasi(String password) {
        return this.password.equals(password);
    }

    public abstract void display();
}
