package lesson1.demo4;

public class Main {
    public static void main(String[] args) {
//        User user1 = new User();
//        user1.id = 1;
//        user1.name = "Vasil";
//        user1.status = true;
//        user1.weight = 87.8;
//        System.out.println(user1);

        User user2 = new User(2, "kooks", false, 55.5);
        System.out.println(user2);
        user2.setName("ananas");

        System.out.println(user2.getName());
    }

}
