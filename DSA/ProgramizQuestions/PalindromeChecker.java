package ProgramizQuestions;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check if it is palindrome or not :");
        String str = sc.nextLine();
        str = str.toLowerCase();
        if(isPalindrome(str)){
            System.out.println(str + " is palindrome");
        }
        else
        {
            System.out.println(str + " is not palindrome");
        }
    }
    public  static boolean isPalindrome(String str)
    {
        int left = 0;
        int right = str.length() -1 ;

        while(left<right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            else
            {
                left++;
                right--;

            }
        }
        return  true;
    }
}
