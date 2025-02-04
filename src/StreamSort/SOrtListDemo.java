package StreamSort;

import java.util.*;

public class SOrtListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(21);
        list.add(13);
        list.add(4);

        list.stream().sorted().forEach(System.out::println);
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        map.put(2, 12);
        map.put(3, 31);
        map.put(4, 14);
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
