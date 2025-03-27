package StreamsPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class StreamExample5 {
    public static char nonRepeatingCharacter(String input)
    {
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        for(char c :input.toCharArray())
        {
            charCount.put(c, charCount.getOrDefault(c,0)+1);
        }
        for (char c :input.toCharArray()) {
        if (charCount.get(c)==1)
        {
            return  c;
        }
        }
        return '_';
    }

    public static void main(String[] args) {
        String input = "abcde";
        System.out.println(nonRepeatingCharacter(input));
    }
}
