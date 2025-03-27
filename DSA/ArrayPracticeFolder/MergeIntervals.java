package ArrayPracticeFolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,6},{1,8},{9,10}};
        mergeIntervals(arr);

        System.out.println(Arrays.deepToString(mergeIntervals(arr)));
    }

    private static int[][] mergeIntervals(int[][] arr) {
        if(arr.length ==0) return new int[0][];

        //Arrays.sort(arr, (a,b)-> Integer.compare(a[0],b[0]));

        List<int[]> merged = new ArrayList<>();

        int[] currentInterval = arr[0];
        merged.add(currentInterval);

        for (int[] interval : arr){
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if(nextStart <= currentEnd){
                currentInterval[1]= Math.max(currentEnd,nextEnd);
            }
            else {
                currentInterval=interval;
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
