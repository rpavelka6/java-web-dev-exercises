package exercises.interfaces;

public abstract class Shape implements Geometry, Comparable {
//implements Geometry - means use the definition in Geometry for area

    private double width;
    private double length;

    //only the abstract class can access this.area
    @Override
    public int compareTo(Object o) {
        Double areaDiff = this.area() - ((Shape) o).area();
        //above uses -1, 0, 1 to sort the areas of the shapes
        //Shape will be Circle, Rectangle, Square, Triangle
        //((Shape) o).area() is an example of casting

        //Convert double to integer
        return areaDiff.intValue();
    }

    @Override
    public String toString() {
        //Can only use this.getClass() in abstract class
        return this.getClass().getSimpleName() + ": " + String.format("%.2f", this.area());
    }
}
