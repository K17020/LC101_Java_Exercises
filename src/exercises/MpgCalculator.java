package exercises;
import java.util.Scanner;
// Calculate the MPG
public class MpgCalculator {
    public static void main(String[] args){
        // MPG = Miles/Gallons
        Scanner user_input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        int miles = user_input.nextInt();
        System.out.println("How much gas did you use?");
        int gas = user_input.nextInt();
        System.out.printf("Your car has an MPG of " + miles/gas);

    }
}
