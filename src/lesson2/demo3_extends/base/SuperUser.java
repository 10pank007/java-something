package lesson2.demo3_extends.base;

public class SuperUser extends User {
    private String role;

    public SuperUser() {
        super();
    }

    public SuperUser(int id, String name, String role) {
        super(id, name);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "SuperUser{" +
                "role='" + role + '\'' +
                "} " + super.toString();
    }

    @Override
    public void greeting() {
        System.out.println("hohoho");
    }
    public void foo(){
        System.out.println("foo");
    }

}
