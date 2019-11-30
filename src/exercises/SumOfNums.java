package exercises;

import java.util.ArrayList;

public class SumOfNums {

    static int xSum = 0;

    public static Integer calcSum(ArrayList<Integer> theArrayList) {
        for (int theNum : theArrayList) {
            xSum = xSum + theNum;
        }
        return xSum;
    }

}
