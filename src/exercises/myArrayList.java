package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class myArrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myIntegers = new ArrayList<>();
        int theSum;
        ArrayList<String> myWords = new ArrayList<>();
        String theWord;
        int userLength;
        String foxString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat" +
                "them in a house. I will not eat them with a mouse.";
        ArrayList<String> suessArrayList = new ArrayList<>();

        // create list of at least 10 integers
        myIntegers.add(25);
        myIntegers.add(6);
        myIntegers.add(37);
        myIntegers.add(2);
        myIntegers.add(67);
        myIntegers.add(94);
        myIntegers.add(13);
        myIntegers.add(42);
        myIntegers.add(55);
        myIntegers.add(77);

        // print the sum of the integers
        theSum = SumOfNums.calcSum(myIntegers);
        System.out.println("The sum is: " + theSum);

        // create an arraylist of words
        myWords.add("Halloween");
        myWords.add("Trick");
        myWords.add("Treat");
        myWords.add("Spooky");
        myWords.add("Ghostly");
        myWords.add("Scream");
        myWords.add("Candy");
        myWords.add("Doorbell");
        myWords.add("Costume");

        // print the five letter words
        for (String eachWord : myWords) {
            if (eachWord.length() == 5) {
                PrintFive.printWord(eachWord);
            }
        }

        // ask the user to enter the length to print
        System.out.println("Hello, enter a number between 5 and 9 for the word length to print: ");
        userLength = input.nextInt();
        for (String eachWord : myWords) {
            if (eachWord.length() == userLength) {
                PrintFive.printWord(eachWord);
            }
        }

//        suessArrayList = createArrayList.letsCreate(foxString);
        CreateArrayList.letsCreate(foxString);
    }

}
