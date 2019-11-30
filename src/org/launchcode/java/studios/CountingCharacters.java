package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {

        HashMap<String, Integer> letterCounts = new HashMap<>();
//        String someString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to" +
//                " start with. So if you move all the terms over to one side, you can put the quadratics into a form that can " +
//                "be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward" +
//                " from there.";
        Scanner input = new Scanner(System.in);

//        Load alphabet into Hash Map
        for (char eachLetter = 'a'; eachLetter <= 'z'; ++eachLetter)
            letterCounts.put(String.valueOf(eachLetter), 0);
        letterCounts.put("'", 0);
        letterCounts.put(".", 0);
        letterCounts.put(",", 0);
        letterCounts.put("?", 0);

//        get the string from the command line
        System.out.print("Enter your string: ");
        String someString = input.nextLine();
//        turn string into array of characters
        char[] charactersInString = someString.toCharArray();

//        begin summing letters
        for (char someChar : charactersInString) {
            for (Map.Entry<String, Integer> letter : letterCounts.entrySet()) {
                String theLetter = letter.getKey();
                if (String.valueOf(someChar).equals(theLetter)) {
                    letterCounts.put(theLetter, letterCounts.get(theLetter) + 1);
                }
            }
        }

        for (Map.Entry<String, Integer> letter : letterCounts.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }


}
