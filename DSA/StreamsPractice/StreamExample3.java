package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample3 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "mango", "banana", "grapes", "banana", "mango");

        Map.Entry<String,Long> mostFrequentWord = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        System.out.println(mostFrequentWord);
    }
}
