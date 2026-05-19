//Write a Java program to find the largest number out of n natural numbers.


import java.util.Scanner;

public class LargestNumber4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int max = 0; // since natural numbers start from 1

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest number = " + max);

        sc.close();
    }
}