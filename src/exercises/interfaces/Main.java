package exercises.interfaces;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Define array of shapes
        Shape[] shapes = {
                new Circle(4.0),
                new Triangle(2.0, 3.0),
                new Square(4.0),
                new Rectangle(3.0, 4.0)
        };

        //Sort the array
        Arrays.sort(shapes);

        //Print the shapes after sorting by area
        for (Shape shape: shapes) {
            System.out.println(shape);
        }
    }
}
