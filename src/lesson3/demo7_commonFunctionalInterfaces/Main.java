package lesson3.demo7_commonFunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
//        Function<Integer, String> integerStringFunction = new Function<>() {
//            @Override
//            public String apply(Integer integer) {
//                return integer + "";
//            }
//        };
//        String apply = integerStringFunction.apply(100);
//        System.out.println(apply);
//
        BiFunction<User,Customer, Admin> biFunction = (user, customer) -> new Admin(user.getName(), customer.getLogin(), customer.getPassword());

        Admin apply = biFunction.apply(new User("vasia"), new Customer("kjdksjks", "fjkdjfkdj"));
        System.out.println(apply);

    }
}

