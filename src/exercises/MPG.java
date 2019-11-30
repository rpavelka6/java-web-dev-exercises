package exercises;
import java.util.Scanner;

public class MPG {
    public static void main ( String[] args) {
        Scanner input = new Scanner ( System.in );
        double milesDriven;
        double gasUsed;

        System.out.println ( "Enter number of miles driven: ");
        milesDriven = input.nextDouble();
        System.out.println ( "Enter gallons of gas used: ");
        gasUsed = input.nextDouble();
        System.out.println ( "Your MPG is: " + milesDriven / gasUsed );
    }
}
