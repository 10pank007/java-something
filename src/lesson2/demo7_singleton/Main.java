package lesson2.demo7_singleton;

public class Main {
    public static void main(String[] args) {
        User vasil = User.getInstance("vasil");
        User petro = User.getInstance("petro");
        System.out.println(petro);
    }
}
