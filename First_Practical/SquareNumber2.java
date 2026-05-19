//Write a program to print the square of a number
//  passed through command line arguments.


class SquareNumber2 {
    public static void main(String[] args) {
        // Check if argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a number");
            return;
        }

        int num = Integer.parseInt(args[0]); // convert string to int
        int square = num * num;

        System.out.println("Square = " + square);
    }
}
