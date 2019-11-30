package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CreateArrayList {

    //    public static ArrayList<String> letsCreate(String someString){
    public static void letsCreate(String someString) {

        String str[] = someString.split(" ");
        List<String> myArrayList = new ArrayList<String>();
//        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList = Arrays.asList(str);
//        for(String s: str) {
//            myArraylist.add(s);
        System.out.println(myArrayList);
//        }
//        return myArrayList;
    }

}
