package MapAndFlatMapDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customers = EkartDataBase.getAll();
        List<String> emailsList = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emailsList);

        List<String> phones = customers.stream().flatMap(customer -> customer.getPhoneNum().stream()).collect(Collectors.toList());
        System.out.println(phones);
    }
}
