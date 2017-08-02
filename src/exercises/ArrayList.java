package exercises;

public class ArrayList {
    // Private Class for user input
    public static void main(String[] args){
        int sum = 0;
        int num[] = {50,240,1200,330,204,496,100,338,499,289,100};
        for (int numbers:num){
            sum = numbers + sum;
        }
        System.out.println(sum);

    }
}
    