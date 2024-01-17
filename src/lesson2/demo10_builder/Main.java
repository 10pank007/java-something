package lesson2.demo10_builder;

public class Main {
    public static void main(String[] args) {
//        User bohdan = User.getBuilder().setId(1).setName("Bohdan").build();
//        System.out.println(bohdan);
        User bohdan = User.builder().id(1).name("Bohdan").build();
        System.out.println(bohdan);
    }
}
