package exercises;
import java.util.Scanner;

// calculate the area of rectangle
public class AreaRectangle {
    public static void main(String[] args){
        Integer width;
        Integer height;
        Scanner user_width;
        Scanner user_height;

        user_width = new Scanner(System.in); // Takes in user input
        System.out.println("What is the width of rectangle?"); // Prompts user for Width
        width = user_width.nextInt(); // Converts user input into integer

        user_height = new Scanner(System.in); // Takes in user input
        System.out.println("What is the height of the rectangle?"); // Prompts user for height
        height = user_height.nextInt();

        int area = width * height; // Math for area of rectangle

        System.out.println(area);

    }
}
