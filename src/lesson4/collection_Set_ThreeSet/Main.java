package lesson4.collection_Set_ThreeSet;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        Set<String> strings = new TreeSet<>();
//        strings.add("a");
//        strings.add("c");
//        strings.add("c");
//        strings.add("b");
//        System.out.println(strings);
        Set<User> users = new TreeSet<>();
        users.add(new User(3,"asdjfkdsj"));
        users.add(new User(2, "qwe"));
        users.add(new User(3, "cxc"));
        users.add(new User(1, "cxc"));
        System.out.println(users);

    }
}
