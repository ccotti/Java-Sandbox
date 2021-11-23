package Section7_Projects;

public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    } // end no arg ctor  

    public Circle(double radius){
        this.radius = radius;
    }// end ctor

    public double getRadius() {
        return radius;
    }//end getRadius

    public void setRadius(double radius) {
        this.radius = radius;
    }// end set radius

    public double circumference() {
        return 2 * Math.PI * radius;
    }//end circumference

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }//end area

}//end Circle Class
