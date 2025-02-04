package ParallelStreamDemo;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {

        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        IntStream.range(0, 10).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Time by plain stream = " + (end - start));

        System.out.println("\n");
        start= System.currentTimeMillis();
        IntStream.range(0, 10).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parallel Stream time = " + (end-start));

    }
}
