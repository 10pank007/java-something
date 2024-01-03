package lesson1.demo9;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        User ivan = user.setId(100).setName("ivan");
        System.out.println(ivan);

    }
}
