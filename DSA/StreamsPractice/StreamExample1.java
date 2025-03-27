// Convert List of Strings to Uppercase using Stream
package StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<String>  name = Arrays.asList("john", "wick", "harry", "potter");
        List<String> upperCase = name.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(upperCase);

    }
}
