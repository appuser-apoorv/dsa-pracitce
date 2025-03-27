// Filter Even Numbers from a List
package StreamsPractice;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,4,6,7,5,7,8,12,15,22);
        int evenNumbers = numbers.stream()
                .filter(n-> n%2==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(evenNumbers);

        int oddNumbers = numbers.stream()
                .filter(n-> n%2 !=0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(oddNumbers);

        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
        System.out.println(maxNumber.get());

        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
        System.out.println(minNumber.get());
//Count Elements Greater than a Given Value

       long count1 = numbers.stream()
               .filter(n->n >5)
               .count();
        System.out.println( count1);

        long count2 = numbers.stream()
                .filter(n->n<5)
                .count();
        System.out.println(count2);
        
        List<Integer> number2 = Arrays.asList(1,2,3,4,5);

        int product = number2.stream()
                .reduce(1,(a,b )-> a*b);

        System.out.println(product);
    }
}
