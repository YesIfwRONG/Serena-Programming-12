package moduleFour;

public class Circle extends TwoDShape {
    // set the value of PI and initialize a variable radius;
    public final double PI = Math.PI;
    private double radius;

    // construct through taking radius and colour of the circle;
    Circle(double radius, Colour colour){
        this.radius = radius;
        this.colour = colour;
    }

    // calculate the area of the circle;
    public double getArea(){
        return PI * Math.pow(radius,2);
    }

    // print specific strings through sout objectName;
    @Override
    public String toString() {
        return "Circle{" +
                getArea() + " ," + getColour() +
                '}';
    }
}
