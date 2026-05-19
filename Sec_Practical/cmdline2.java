/*  Write a program to print the square of a number passed through command line
arguments. */



package Sec_Practical;
public class cmdline2{
    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        // Convert argument to integer
        int num = Integer.parseInt(args[0]);

        // Calculate square
        int square = num * num;

        // Print result
        System.out.println("Square of " + num + " is: " + square);
    }
}