
package ProblemSolvingBasics;

import java.util.Scanner;

/**
 * A program to check whether a given number is a prime number or not.
 */
public class PrimeNumber {

    /**
     * The main method serves as the entry point of the program.
     * It takes user input, checks if the number is prime, and prints the result.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        System.out.println("Enter a number : "); // Prompt the user to enter a number
        int num = sc.nextInt(); // Read an integer input from the user

        // Check if the number is prime and print the result
        if (isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number ");
        }
    }

    /**
     * Checks whether a given number is a prime number.
     *
     * @param num The number to check.
     * @return true if the number is prime, false otherwise.
     */
    private static boolean isPrime(int num) {
        if (num <= 1) // Numbers less than or equal to 1 are not prime
            return false;
        if (num == 2) // 2 is the only even prime number
            return true;
        if (num % 2 == 0) // Even numbers greater than 2 are not prime
            return false;

        // Check divisors from 3 to the square root of the number, skipping even numbers
        for (int i = 3; i <= Math.sqrt(num); i = i + 2) {
            if (num % i == 0) // If divisible by any number, it's not prime
                return false;
        }
        return true; // If no divisors are found, the number is prime
    }
}