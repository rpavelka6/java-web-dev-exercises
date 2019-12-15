package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone cone, Cone t1) {

        double diff = cone.getCost() - t1.getCost();

        if ( diff == 0 ) {
            return 0;
        } else if ( diff < 0 ) {
            return -1;
        } else {
            return 1;
        }
    }
}
