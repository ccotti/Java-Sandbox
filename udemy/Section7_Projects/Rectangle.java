package Section7_Projects;

public class Rectangle {
    private double lenght;
    private double width; 

    private static int numRectangles;

    public Rectangle() {
        this(1.0, 1.0);
    }// end Rectangle no-arg ctor

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
        numRectangles++;
    }// end Rectangle ctor w/ parameters

    public double getLength() {
        return lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double lenght) {
        this.lenght = lenght;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area() {
        return lenght * width;
    }

    public double perimeter() {
        return 2 * lenght + 2 * width;
    }

    public static int getNumRectangles() {
        return numRectangles;
    }
}//end class
