// Two Dimensional Array example and practice
package ArrayPracticeFolder;

import java.util.Arrays;

public class ArrayTwoDimension {
    public static void main(String[] args) {

        int[][] arr = new int [2][2]; // declaration of the 2d array

        int[][] arr2 ={
                {1,2},
                {2,4},
                {3,6},
                {9,10}
        };

        System.out.println("The length of the 2D array is : " + arr2.length);
        System.out.println("The 2nd Element in the 2D array : " + arr2[1][1]);
        System.out.println("The elements in the array are : " );

        for (int i=0 ; i<arr2.length; i++)
        {
            for(int j=0; j< arr2[i].length;j++)
            {
                System.out.print(arr2[i][j]  + " ");
            }
            System.out.println();
        }
    }
}
