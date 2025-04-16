package ProblemSolvingBasics;

import java.util.Scanner;

public class FibonacciSeries {

    public static void showFibonacci(int n)
    {
        int n1,n2=0,n3=1;

        for(int i=1;i<=n;i++)
        {
            System.out.println(n3);
            n1=n2;
            n2=n3;
            n3=n1+n2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if(n>0)
        {
            showFibonacci(n);
        }
        else
        {
            System.out.println("Enter a positive number ");
        }
    }
}
