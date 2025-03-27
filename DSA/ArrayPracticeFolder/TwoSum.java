package ArrayPracticeFolder;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target){
         for(int i=0; i<arr.length; i++){
             for (int j=i; j<arr.length;j++)
             {
                 if(arr[i]+arr[j] == target)
                     return new int[]{i,j};
             }
         }
         return new int[] {-1,-1};
    }

    public static int[] twoSumOptimized(int[] arr, int target)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< arr.length; i++)
        {
            int complement = target - arr[i];
            if(map.containsKey(complement))
            {
                return new int[] {map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] arr = {2,5,8,15};
        int target = 20;
        int[] result = twoSum(arr,target);
        for(int i: result)
            System.out.println(i);

        System.out.println("Optimized Solution");
        int[] resultOptimized = twoSumOptimized(arr, target);
        for(int i : resultOptimized)
            System.out.println(i);
    }
}
