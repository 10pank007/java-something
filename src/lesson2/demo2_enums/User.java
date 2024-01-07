package lesson2.demo2_enums;

public class User {
    private String name;
    private ROLE role;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ROLE getRole() {
        return role;
    }

    public void setRole(ROLE role) {
        this.role = role;
    }

    public User(String name, ROLE role) {
        this.name = name;
        this.role = role;
    }
}
