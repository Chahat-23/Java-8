package MapReduceDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum1 = numbers.stream().mapToInt(i->i).sum();
        System.out.println(sum1);

        int sum2 = numbers.stream().reduce(0,(a,b)-> a+b);
        System.out.println(sum2);

        Optional<Integer> numSum = numbers.stream().reduce(Integer::sum);
        System.out.println(numSum.get());

        int multi = numbers.stream().reduce(1,(a,b)-> a*b);
        System.out.println(multi);

        int maxVal = numbers.stream().reduce(0,(a,b)-> a>b?a:b);
        System.out.println(maxVal);

        int maxVal2 = numbers.stream().reduce(Integer::max).get();
        System.out.println(maxVal2);

        List <String> words = Arrays.asList("one", "two", "three", "four", "five");
        String  largestWord = words.stream().reduce((word1, word2) -> word1.length()>word2.length()? word1 : word2).get();
        System.out.println(largestWord);
    }

}
