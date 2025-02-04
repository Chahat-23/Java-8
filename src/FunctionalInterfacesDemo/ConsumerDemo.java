package FunctionalInterfacesDemo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
//
//    @Override
//    public void (Integer t)
//    {
//        System.out.println(t);
//    }

    public static void main(String[] args) {
        Consumer<Integer> consumer = (t) -> System.out.println(t);
        consumer.accept(10);

        List<Integer> l1 = Arrays.asList(1,2,3,4,5);
        l1.stream().forEach(consumer);
    }
}
