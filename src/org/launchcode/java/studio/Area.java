package org.launchcode.java.studio;
import java.util.Scanner;
import java.lang.Math;

public class Area {
        // Shared scanner for keyboard input
    private static Scanner scanner = new Scanner(System.in);
        // Program Starts here to find the area of a circle
    public static void main(String[] args){
        System.out.print("Enter a radius: ");
            // Assign the input as a string for the user
        String user_input = scanner.nextLine();
            // Converts the user input into an double
        Double radius = Double.parseDouble(user_input);
            // Checks to see if the number is entered is a negative number
        if ( radius <= 0){
            System.out.print("Please enter a positive number.");
        }
        else if (radius > 0){
            // Does the math for the Area of the circle
            Double area = Math.PI * radius * radius;
            // print the area of a Circle;
            System.out.print(area);
        }
    }
}
