
/*Write a Java program to multiply two given matrices. */


package Sec_Practical;

public class Matrix6 {

    public static void main(String[] args) {

        int a[][] = {
                {1, 2},
                {3, 4}
        };

        int b[][] = {
                {5, 6},
                {7, 8}
        };

        int result[][] = new int[2][2];

        // Matrix Multiplication using for loops
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 2; k++) {

                    result[i][j] = result[i][j] + a[i][k] * b[k][j];

                }
            }
        }

        // Print Result
        System.out.println("Result Matrix:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                System.out.print(result[i][j] + " ");

            }

            System.out.println();
        }
    }
} 
    

