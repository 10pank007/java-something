package lesson2.demo11_generics;

public class User <T>{
    T id;
    String name;

    public User(T id, String name) {
        this.id = id;
        this.name = name;
    }
}
