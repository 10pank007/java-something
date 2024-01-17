package lesson2.demo2_enums;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // ROLE role = ROLE.ADMIN;
        User user = new User("asd", ROLE.MANAGER);

        Helper helper = new Helper();
        String extractToken = helper.extractToken(user);
        System.out.println(extractToken);

        ROLE[] values = ROLE.values();
        List<ROLE> list = Arrays.asList(values);
        System.out.println(list);
        System.out.println(Arrays.toString(values));
        ROLE admin = ROLE.valueOf("ADMIN");
        System.out.println(admin);
        System.out.println(ROLE.MANAGER.ordinal());


    }
}
