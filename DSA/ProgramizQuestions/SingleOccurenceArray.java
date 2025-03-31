package ProgramizQuestions;

import java.sql.Array;
import java.util.Arrays;

public class SingleOccurenceArray {
    public static void main(String[] args){
        int[] arr = {2,3,4,2,3,4,6,7};
        int arrSize = arr.length;
        System.out.println("The single element in the array is : " + findSingleElement(arr, arrSize));
    }
    public static int findSingleElement(int[] arr, int arrSize){
        Arrays.sort(arr);
        for(int i=0; i<arrSize; i=i+2){
            if(arr[i] != arr[i+1])
            {
                return  arr[i];
            }
        }
        return arr[arrSize-1];
    }
}
