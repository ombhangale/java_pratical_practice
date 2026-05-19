/*Write a Java program for sorting a given list of names in ascending order. */


package Sec_Practical;

 import java.util.Arrays;

public class  Sorting7{

    public static void main(String[] args) {

        String names[] = {"Om", "Rahul", "Amit", "Sneha", "Priya"};

        // Sorting names
        Arrays.sort(names);

        // Display sorted names
        System.out.println("Names in Ascending Order:");

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}  

