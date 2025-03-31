package ProgramizQuestions;

import java.util.Scanner;

public class RemoveVowelsPrg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to remove vowels from it : ");
        String str = sc.nextLine();
        String result = removeVowels(str);
        System.out.println("String after removing vowels : " + result);

        System.out.println();
        String result2 = removeVowelsApproach2(str);
        System.out.println("String after removing vowels using approach 2 : " + result2);
    }

    private static String removeVowelsApproach2(String str) {
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if ("aeiouAEIOU".indexOf(ch)== -1)
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private static String removeVowels(String str2) {
        return  str2.replaceAll("[aeiouAEIOU]" , "");
    }
}
