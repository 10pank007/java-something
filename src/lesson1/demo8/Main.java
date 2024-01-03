package lesson1.demo8;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        User [] users = new User[2];
//        users [0] = new User(1, "vasia");
//        users [1] = new User(2, "petia");
//        System.out.println(users);
//        System.out.println(Arrays.toString(users));
//        ArrayList<User> users = new ArrayList<>();
//        users.add(new User(1, "asd"));
//        users.add(new User(2, "qwe"));
//        System.out.println(users);
//        System.out.println(users.get(0));
//        System.out.println(users.size());
        User vasia = new User(1, "vasia");
        ArrayList<String> skills = vasia.getSkills();
        skills.add("java");
        skills.add("java 2");
        skills.add("java 8");
        skills.add("java 12");
        skills.add("java 17");
        skills.add("java 21");
        System.out.println(vasia);
        skills.remove(0);
        System.out.println(vasia);
    }
}
