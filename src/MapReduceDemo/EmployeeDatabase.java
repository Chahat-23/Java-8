package MapReduceDemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

    public static List<Employee> getEmployees() {
        return Stream.of(new Employee(101, "John", 50000, "A"),
                new Employee(102, "Max", 55000, "B"),
                new Employee(103, "Stella", 60000, "C"),
                new Employee(104, "Evy", 55000, "B")).collect(Collectors.toList());
    }
}
