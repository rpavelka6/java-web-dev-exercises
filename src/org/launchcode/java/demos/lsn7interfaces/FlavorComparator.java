package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor allergens, Flavor t1) {
        return allergens.getName().compareTo(t1.getName());
    }
}
