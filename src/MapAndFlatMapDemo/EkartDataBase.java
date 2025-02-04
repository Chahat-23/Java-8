package MapAndFlatMapDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {
    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "John", "john@gmail.com", Arrays.asList("12375776762", "232232323")),
                new Customer(154, "Shell", "shell@gmail.com", Arrays.asList("658797875", "657645647"))
        ).collect(Collectors.toList());
    }
}
