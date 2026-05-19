/*  Write a Java program to find the largest number out of n natural numbers. */



package Sec_Practical;

 import java.util.Scanner;

class largestnumber4 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
         sc.close();


        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int max = 0;

        System.out.println("Enter numbers:");

        for(int i = 1; i <= n; i++) {

            int num = sc.nextInt();

            if(num > max) {
                max = num;
            }
        }

        System.out.println("Largest number is: " + max);
    }
} 