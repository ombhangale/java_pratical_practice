/*Write a program to read two numbers from the user and print their addition, subtraction,
multiplication and division.*/


package Sec_Practical;

import java.util.Scanner;

public class Operations1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read two numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Perform operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;

        // Display results
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);

        // Division with zero check
        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("Division = " + division);
        } else {
            System.out.println("Division not possible (cannot divide by zero)");
        }

        sc.close();
    }
}