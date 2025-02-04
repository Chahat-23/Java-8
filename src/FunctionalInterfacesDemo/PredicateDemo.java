package FunctionalInterfacesDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        //predicate with lambda expression
//        Predicate<Integer> predicate = t -> t % 2 == 0;
//        System.out.println(predicate.test(5));
//        System.out.println(predicate.test(4));

        //Stream API for filter
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.stream().filter(t->t%2==0).forEach(t -> System.out.println(t));
    }
}
