package ArrayPracticeFolder;
//Find Duplicate Number in an Array

public class FindDuplicateArray {
    public static int findDuplicate(int[] arr){
        int slow = arr[0], fast= arr[0];
        do{
            slow = arr[slow];
            fast = arr[fast];
        }
        while(slow != fast);

        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,4,5};
        System.out.println(findDuplicate(arr));
    }
}