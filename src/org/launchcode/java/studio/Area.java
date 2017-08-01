package org.launchcode.java.studio;
import java.util.Scanner;
import java.lang.Math;

public class Area {
    // Shared scanner for keyboard input
    private static Scanner scanner = new Scanner(System.in);
    // Method that performs the calculation
    public static double calArea(double radius){
        return (Math.PI * radius * radius);
    }
    public static void main(String[] args){
        Double radius = 0.0;
        while(radius <= 0) {
            System.out.print("Enter a radius: ");
            // Assign the input
            radius = scanner.nextDouble();
            // Checks to see if the number is entered is a negative number
            if (radius <= 0) {
                System.out.println("Please enter a positive number.");
            }
            // If it's not negative calculate
            else if (radius > 0) {
                // Does the math for the Area of the circle
                Double area = calArea(radius);
                // print the area of a Circle;
                System.out.printf("The area of a circle with a %f is %f", radius, area);
            }
        }
    }
}
