package ArrayPracticeFolder;

import java.util.Arrays;

public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {20,25,19,30,40};
        System.out.println("The largest element in the array : " + findLargestElement(arr));
        System.out.println("The second largest element in the array :" + secondLargestElement(arr));
    }

    public static String findLargestElement(int[] arr) {
        int largest = arr[0];
        for(int i=1; i<arr.length; i++){
            if (arr[i] > largest){
                largest= arr[i];
            }
        }
        return String.valueOf(largest);
    }

    public static int secondLargestElement(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
}
