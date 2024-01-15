package lesson4.list_collection_part1_LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("dkfkfjkd1");
        strings.add("dkfkfjkd2");
        strings.add("dkfkfjkd3");
        strings.add("dkfkfjkd4");
        strings.add("dkfkfjkd5");
        System.out.println(strings);
        strings.set(1,"qwe");
        System.out.println(strings);
        ArrayList<Integer> integers = new ArrayList<>(100);
        integers.add(1001);
        integers.add(1002);
        integers.add(1003);
        integers.add(1004);
        integers.add(1005);
        List[] lists = new List[]{strings, integers};
    }
}
