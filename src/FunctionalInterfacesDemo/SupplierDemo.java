package FunctionalInterfacesDemo;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        List<String> list = Arrays.asList("a", "b", "c");
        System.out.println(list.stream().findAny().orElseGet(supplier));


        List<String> list2 = Arrays.asList();
        System.out.println(list2.stream().findAny().orElseGet(supplier));


        List<String> list3 = Arrays.asList("a", "b", "c");
        System.out.println(list3.stream().findAny().orElseGet(()-> "Hi there!"));
    }
}
