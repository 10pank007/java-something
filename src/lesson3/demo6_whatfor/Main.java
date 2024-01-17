package lesson3.demo6_whatfor;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(11);
        integers.add(22);
        integers.add(-22);
        integers.add(0);
        integers.add(100500);
        integers.sort(Comparator.comparingInt(o -> o));
        System.out.println(integers);
    }
}
