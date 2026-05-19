/*Write a program to send the name and surname of a student through command line
arguments and print a welcome message for the student. */


package Sec_Practical;

    class surname3 {
    public static void main(String args[]) {

        System.out.println("Name: " + args[0]);
        System.out.println("Surname: " + args[1]);

        System.out.println("Welcome " + args[0] + " " + args[1]);
    }
}

