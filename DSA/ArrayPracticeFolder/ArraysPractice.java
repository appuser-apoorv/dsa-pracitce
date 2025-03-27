package ArrayPracticeFolder;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysPractice {

    public static void main(String[] args) {
        int[] arr; // Declaration of an array
        arr = new int[10]; // Initialization of an Array
        arr[0] = 1; // Assigning values to the array
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 4;
        arr[5] = 5;
        arr[6] = 6;
        arr[7] = 7;
        arr[8] = 8;

        // printing the length and the elements in the array
        System.out.println("The length of the array is : " + arr.length);
        System.out.println("The first & last element of the array is : " +arr[0] + " & " + arr[8-1]);

        // Declaring and initializing an array in a single line
        int[] arr2 = {1,2,2,3,4,6,5,8,9,10,12,11};
        System.out.println("The length of the second array is : " + arr2.length);

        // sorting the array using streams
        Arrays.stream(arr2)
                .forEach(System.out::println);

        // sorting & removing duplicates from an array
        Arrays.stream(arr2)
                .sorted()
                .distinct()
                .forEach(System.out::print);
        System.out.println(" ");

        // converting an array to a string
        String arrString = Arrays.stream(arr2)
                .sorted()
                .mapToObj(String::valueOf)
                .distinct()
                .collect(Collectors.joining(","));
        System.out.println(arrString);
    }
}
