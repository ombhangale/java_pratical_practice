

/*Write a Java program to find the Fibonacci series and factorial of a number using:
Recursive functions */



package Sec_Practical;

import java.util.Scanner;

public class Fibonacci5{

    // Recursive function for Fibonacci
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Recursive function for Factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Fibonacci Series
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Factorial
        System.out.println("\nFactorial of " + n + " is: " + factorial(n));

        sc.close();
    }
} 
    

