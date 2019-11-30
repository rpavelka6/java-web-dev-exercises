package exercises;

import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {

        // create and initialize an array of integers
        int[] myNumbers = {1, 1, 2, 3, 5, 8};

        // loop through array and print each number to screen
        for (int theNumber : myNumbers) {
            System.out.println(theNumber);
        }

        // loop through array and only print odd numbers
        System.out.println("Only Odd Numbers");
        for (int theNumber : myNumbers) {
            if (theNumber % 2 != 0) {
                System.out.println(theNumber);
            }
        }

        // divide string at each space and store individual words in an array
        String foxString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat" +
                "them in a house. I will not eat them with a mouse.";
        String[] theWords = foxString.split(" ");

        // the dot is a special character and requires an escape to use it as a delimiter
        String[] theSentences = foxString.split("\\.");

//        for (String eachWord : theWords) {
//            System.out.println(eachWord);
//        }
//
//        for (String aSentence : theSentences) {
//            System.out.println(aSentence);
//        }
        System.out.println(Arrays.toString(theWords));
        System.out.println(Arrays.toString(theSentences));
    }

}
