package exercises;
import java.util.Scanner;

public class Area {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        int length;
        int width;

        System.out.println ( "Enter length of rectangle: " );
        length = input.nextInt();
        System.out.println ( "Enter width of rectangle: " );
        width = input.nextInt();
        System.out.println ( "The area of your rectangle is " + length * width );
    }
}
