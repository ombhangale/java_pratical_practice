/*Write a Java program that displays the number of characters, lines, and words in a
given text.*/


import java.util.Scanner;

public class TextCount10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text (type 'END' to finish):");

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        while (true) {
            String line = sc.nextLine();

            if (line.equals("END")) {
                break;
            }

            lineCount++;

            charCount += line.length();

            String[] words = line.trim().split("\\s+");
            if (!line.trim().isEmpty()) {
                wordCount += words.length;
            }
        }

        System.out.println("Number of characters = " + charCount);
        System.out.println("Number of words = " + wordCount);
        System.out.println("Number of lines = " + lineCount);

        sc.close();
    }
}