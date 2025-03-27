package ArrayPracticeFolder;

public class SortedArray {

    public static void main(String[] args) {
        //int[] arr = {25,5,75,10,30,15,30,20};
        int[] arr = {5,10,15,20,25,30};
        System.out.println("The given array is  " + isSorted(arr));
    }

    private static String isSorted(int[] arr) {
        for(int i=0; i<arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) {
                return "Not Sorted";
            }

        }
        return "Sorted";
    }
}
