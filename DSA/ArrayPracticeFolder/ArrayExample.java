// Program to create a 1D array using Scanner class & printing the element of the array using loops
package ArrayPracticeFolder;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");

        // taking input from the user to add elements in the array
        for(int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
        }

        System.out.println("The length of the array is : " + arr.length);
        System.out.println("The elements of the array are : " + Arrays.toString(arr));

        // printing the elements of the array
        System.out.println("The elemnts of the array printed using enhanced for loop are : ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        sc.close();
    }
}
