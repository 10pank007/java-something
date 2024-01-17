package lesson4.list_collection_part1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(100);
        integers.add(1001);
        integers.add(1002);
        integers.add(1003);
        integers.add(1004);
        integers.add(1005);
        System.out.println(integers);
        System.out.println(integers.get(4));
        integers.sort((o1, o2) -> o1 - o2);
      //  integers.forEach(integer -> System.out.println(integer));
//        for (Integer integer : integers) {
//            if (integer %2 ==0) {
//                integers.remove(integer);
//            }
//        }
//        integers.removeIf(integer -> integer %2==0);
//        System.out.println(integers);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 ==0) {
                iterator.remove();
            }
        }
    }
}
