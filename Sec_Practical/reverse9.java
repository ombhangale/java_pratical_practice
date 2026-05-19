/*  Write a Java program to read n number of values in an array and display them in
reverse order. */


package Sec_Practical;

import java.util.Scanner;

public class reverse9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display in reverse order
        System.out.println("Array in Reverse Order:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
} 
    

