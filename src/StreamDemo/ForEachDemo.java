package StreamDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Mango");
        list1.add("Orange");
        list1.add("Guava");
        list1.add("Banana");

        list1.stream().forEach(t -> System.out.println(t));
        list1.stream().filter(t -> t.startsWith("M")).forEach(t -> System.out.println(t));

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "a");
        map1.put(2, "b");
        map1.put(3, "c");
        map1.put(4, "d");
        map1.put(5, "e");

        map1.forEach((k, v) -> System.out.println(k + " : " + v));
        map1.entrySet().stream().forEach(t -> System.out.println(t.getKey() + " : " + t.getValue()));
        map1.entrySet().stream().filter(k->k.getKey()%2==0).forEach(t -> System.out.println(t));
    }

}
