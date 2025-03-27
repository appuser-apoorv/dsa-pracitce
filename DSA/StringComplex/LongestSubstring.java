package StringComplex;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    private static int longestSubstring(String input) {
        Set<Character> set = new HashSet<>();
        int left=0, maxLength =0;
        for( int right =0; right<input.length(); right++){
            while(set.contains(input.charAt(right))){
                set.remove((input.charAt(left)));
                left++;
            }
            set.add(input.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String input = "abcdabcbabc ";
        System.out.println(longestSubstring(input));
    }


}
