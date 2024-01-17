package lesson3.demo2_anonclass;

import lesson3.demo1_interfaces.Singer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Singer> singers = new ArrayList<>();
//        singers.add(new Student());
//        singers.add(new User());
//
//        Singer singer = singers.get(1);
//        singer.sing();
        Singer singer1 = new Singer() {
            @Override
            public void sing() {
                System.out.println("ajkjskdjkjk");
            }
        };
        Singer singer2 = new Singer() {
            @Override
            public void sing() {
                System.out.println("foo bar");
            }
        };



    }
}
