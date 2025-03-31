package StreamsPractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingWordsInString {

    public static void main(String[] args) {
        String input = "programming";

        Map<Character, Long> duplicateMap = input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        duplicateMap.forEach((k,v)-> System.out.println(k + " : " +v));

        // Remove the Duplicate from the give String
        String input2  = "ababcdefg";
        Arrays.stream(input2.split(""))
                .distinct()
                .forEach(System.out::print);

        System.out.println();
        input2.chars().distinct().mapToObj(x->(char)x).forEach(System.out::print);

        // Given a sentence , find the word that has the 2nd(Nth) highest length
        System.out.println();
        String input3 = "I am learning streams in java programming ";
        var ans = Arrays.stream(input3.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(3)
                .findFirst()
                .get();
        System.out.println(ans);

        System.out.println();
         int newAns = Arrays.stream(input3.split(" "))
                 .map(String::length)
                 .sorted(Comparator.reverseOrder())
                 .skip(1)
                 .findFirst()
                 .get();
        System.out.println(newAns);

        // Given a sentence find the occurrence  of each word
        System.out.println();

        String input4 = "I am still learning java streams using java 8 am";

        Map<String , Long> result1 = Arrays.stream(input4.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(result1);

        System.out.println(" ======= ");

        List<String> words = Arrays.asList("apple", "banana", "mango", "banana", "grapes", "banana", "mango");

        Map.Entry<String,Long> mostFrequentWord = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElse(null);

        System.out.println(mostFrequentWord);

        String input5 = "Hello World";
        System.out.println(input5);
        List<String> list = Arrays.asList(input5.split(" "));
        Collections.reverse(list);
        String result2 = list.stream().collect(Collectors.joining(" "));
        System.out.println(result2);

        System.out.println("====");
        String result3 = String.join(" ", list);
        System.out.println(result3);

        System.out.println("------");
        List<String> input6 = Arrays.asList("Hello", "World");
        List<String> characters = input6.stream()
                .map(s->s.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(characters);

    }
}
