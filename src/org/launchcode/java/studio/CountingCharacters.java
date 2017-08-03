package org.launchcode.java.studio;


import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args){
        // Dictionary to hold the keys and values
        HashMap<Character, Integer> amountKeeper = new HashMap<>();
        // Variable to hold the string to be read
        String readMe = "Help Me";
        // puts each character into an array
        char[] letters = readMe.toCharArray();
        // Loop though each character

        for (char letter:letters){
            System.out.println(letter);
        }
    }
}
