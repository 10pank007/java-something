package lesson3.demo3_anonclassexample;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1234);
        integers.add(23434324);
        integers.add(1343243243);
        integers.add(-1343243243);
        integers.add(-1343);
        System.out.println(integers);
//        ComparatorImpl comparator = new ComparatorImpl();
//        integers.sort(comparator);
        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        System.out.println(integers);
        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(integers);
    }
}
