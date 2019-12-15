package org.launchcode.java.demos.lsn6inheritance;

public class Main {

    public static void main (String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println("garfield is Tired:  " + garfield.isTired());

        HouseCat myCat = new HouseCat(27);
        System.out.println("myCat weight is: " + myCat.getWeight());

        HouseCat anotherCat = new HouseCat("SillyCat", 13);
        anotherCat.setHungry(true);
        System.out.println("SillyCat is hungry: " + anotherCat.isHungry());

//        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
//        System.out.println("plainCat says: " + plainCat.noise());
        System.out.println("cheshireCat says: " + cheshireCat.noise());
    }
}
