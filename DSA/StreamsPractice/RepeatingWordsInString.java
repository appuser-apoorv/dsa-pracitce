package StreamsPractice;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample4 {

    @Test
    public void junitMethod(){
        System.out.println("Executing Junit method");
    }

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
        String ans = Arrays.stream(input3.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(3)
                .findFirst()
                .get();
        System.out.println(ans);

        System.out.println();
         int newAns = Arrays.stream(input3.split(" "))
                 .map(s->s.length())
                 .sorted(Comparator.reverseOrder())
                 .skip(1)
                 .findFirst()
                 .get();
        System.out.println(newAns);

        // Given a sentance find the occurance  of each word
        System.out.println();

        String input4 = "I am still learning java streams using java 8 am";

        Map<String , Long> result1 = Arrays.stream(input4.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(result1);

        
    }
}
