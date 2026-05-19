
    //Write a program to send the name and surname of a student through 
    // command line arguments and print a welcome message for the student.


    public class WelcomeStudent3{
        public static void main(String[] args) {

            // Check if both name and surname are provided
            if (args.length < 2) {
                System.out.println("Please provide name and surname");
                return;
            }

            String name = args[0];
            String surname = args[1];

            System.out.println("Welcome " + name + " " + surname + "!");
        }
    }