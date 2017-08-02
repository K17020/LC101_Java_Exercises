package exercises;
import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args){
        // Creates a list to hold string values
        String words[] = {"hello","bye","sunshine","launch","spaceship","blue"};
        for (String word:words){
            if(word.length()>=5)
            System.out.println(word);
        }
    }
}
