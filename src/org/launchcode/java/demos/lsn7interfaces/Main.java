package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case allItems = new Case();
        ArrayList<Flavor> flavors = allItems.getFlavors();
        ArrayList<Cone> cones = allItems.getCones();
        Comparator comparator = new FlavorComparator();
        Comparator comparator1 = new ConeComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        flavors.sort(comparator);

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(comparator1);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("The flavors available are:");
        for (Flavor aFlavor: flavors) {
            System.out.println(aFlavor.getName());
        }

        System.out.println("The cones available are:");
        for (Cone aCone: cones) {
            System.out.println(aCone.getName() + "\t" + aCone.getCost());
        }
    }
}
