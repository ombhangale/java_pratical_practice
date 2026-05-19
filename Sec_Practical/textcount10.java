/*Write a Java program that displays the number of characters, lines, and words in a
given text. */



package Sec_Practical;

import java.util.Scanner;

public class textcount10{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input text
        System.out.println("Enter text:");
        String text = sc.nextLine();

        // Count characters
        int characters = text.length();

        // Count words
        String words[] = text.split(" ");
        int wordCount = words.length;

        // Count lines
        int lines = 1;

        // Display result
        System.out.println("Number of Characters: " + characters);
        System.out.println("Number of Words: " + wordCount);
        System.out.println("Number of Lines: " + lines);

        sc.close();
    }
} 
    

