package exercises;
import java.util.Scanner;

public class Alice {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        String aliceString = "Alice was beginning to get very tired of sitting by her sister on the bank, and of " +
                "having nothing to do: once or twice she had peeped into the book her sister was reading, but it " +
                "had no pictures or conversations in it, 'and what is the use of a book,' though Alice 'without " +
                "pictures or conversation?";
        String searchTerm;

        System.out.println( "Enter search term: " );
        searchTerm = input.nextLine();

        if ( aliceString.toLowerCase().contains ( searchTerm ) ) {
            System.out.println( "Congrats - your string was found!" );
        } else {
            System.out.println ( "Your string was not found!");
        }

    }
}
