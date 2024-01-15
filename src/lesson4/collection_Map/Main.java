package lesson4.collection_Map;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("one", 1);
        treeMap.put("two", 2);
        treeMap.put("three", 3);
        treeMap.put("four", 4);
        System.out.println(treeMap);
        Integer one = treeMap.get("one");
        Set<Map.Entry<String, Integer>> entries = treeMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> next = iterator.next();
            if (next.equals("one")) {
                iterator.remove();
            }
        }
        treeMap.replace("one", 1000);
        treeMap.put("one", 222);
        System.out.println(treeMap);


    }
}
