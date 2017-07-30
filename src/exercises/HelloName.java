package exercises;
import java.util.Scanner;

// Prints out Hello + user_name input
public class HelloName {
    public static void main(String[] args){
        Scanner user_input; // Declaring variable for users name

        user_input = new Scanner(System.in); // User input

        System.out.println("Please enter your name"); // Prompt the user

        String user_name = user_input.nextLine(); // Reads the previous line and adds it the assign to a variable

        System.out.println("Hello " + user_name); // Prints out Hello and user input

    }
}
