package lesson2.demo1;

public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport("asdwe", "1837432c");
        User user = new User(1, "vasia", passport );
        User user2 = new User(1, "vasia", "quewquew" , "198377498d");
        Passport user2passport = user2.getPassport();



        Customer customer = new Customer("asd", "qwe", passport);

    }
}
