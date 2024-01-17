package lesson2.demo3_extends.base;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SuperUser superUser = new SuperUser();
        superUser.greeting();
        superUser.foo();

        User user = new SuperUser();
        SuperUser superUser2 = (SuperUser) user;
        superUser2.foo();
        SuperUser superUser1 = (SuperUser) new User();

        ArrayList<User> users = new ArrayList<>();
        users.add(superUser);
        users.add(user);

        SuperUser superUser3 = (SuperUser) users.get(0);
        //userSu.foo()
        superUser3.foo();
    }
}
