package MapAndFlatMapDemo;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "Joy", null, Arrays.asList("5476475", "65767455"));
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

//        Optional<String> emaiilOptional = Optional.of(customer.getEmail());
//        System.out.println(emaiilOptional);

        Optional<String> emaiilOptional2 = Optional.ofNullable(customer.getEmail());
        if (emaiilOptional2.isPresent()) {
            System.out.println(emaiilOptional2.get());
        }
        System.out.println(emaiilOptional2.orElse("default"));
        System.out.println(emaiilOptional2.map(String::toUpperCase).orElseGet(() ->"default value"));
    }
}
