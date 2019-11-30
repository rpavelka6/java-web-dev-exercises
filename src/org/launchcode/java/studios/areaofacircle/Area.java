package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main ( String[] args ) {
        Scanner input = new Scanner ( System.in );
        double theRadius;
        double pi = 3.14;

        System.out.println( "Enter the radius: ");
        theRadius = input.nextDouble();
        System.out.println( "The area of a circle of radius " + theRadius + " is: " + Circle.getArea( theRadius ) );
    }
}
