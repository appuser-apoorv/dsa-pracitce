package ArrayPracticeFolder;
//Find Missing Number in an Array
//🔹 Input: [1,2,4,5,7], n=7

public class MissingNumberInArray {
    public  static int missingNumber(int[] arr, int n)
    {
        int total= n * (n+1) / 2;
        for (int num: arr)
            total -= num;
        return total;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        System.out.println(missingNumber(arr, 7));
    }
}
