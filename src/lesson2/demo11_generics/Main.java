package lesson2.demo11_generics;

public class Main {
    public static void main(String[] args) {
//        User user = new User(1, "ajar");
//        User user1 = new User("dads as", "vasil");
//        User [] users = {user, user1};
//        for (User u : users) {
//            if (u.id instanceof String) {
//                String id = (String) u.id;
//                System.out.println(id.contains("123"));
//            }
//
//
//        }
        User<String> stringUser = new User<>("jkdjklsj", "jkdjslsl");
        User<Integer> integerUser = new User<>(2, "assassin");
        User[] users = {stringUser, integerUser};
        for (User user : users) {
            if (user.id instanceof String) {
                System.out.println(((String) user.id).contains("array"));
            }
        }
    }
}
