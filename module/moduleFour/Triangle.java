package moduleFour;

public class Triangle extends TwoDShape implements Rotate {
    // initiate side 1, 2, and 3;
    double side1;
    double side2;
    double side3;

    // construct by taking width, height, and colour of the triangle by using the super class's (TwoDShape's) constructor;
    public Triangle(double width, double height, Colour colour){
        super(width, height,colour);
    }

    // construct by taking three sides of the triangle and the color of the triangle then set the height through heronsHeight function;
    public Triangle(double side1, double side2, double side3,Colour color){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.colour = color;
        setHeight(heronsHeight());
    }

    // using the concept of heronsHeight in Math to set the height of the triangle;
    private double heronsHeight(){
        if(height != 0){
            return height;
        }
        double height = (0.5 * Math.sqrt((side1 + side2 + side3) * (-side1 + side2 + side3) * (side1 - side2 + side3) * (side1 + side2 - side3))) / side1;
        this.height = height;
        return height;
    }

    // if user set the sides then calculate the area through height of side1 and height; if user set the width and the height already then calculate the area directly;
    public double getArea(){
        if (side1 != 0) {
            return (side1 * height / 2);
        }else{
            return (height * width / 2);
        }
    }

    // print specific strings through sout objectName;
    @Override
    public String toString() {
        return "Triangle{" + getArea() + ", " + getColour() + "}";
    }

    // The three rotate functions below implementing the interface "Rotate";
    public void rotate90(){
        System.out.println("Rotated 90 degrees.");
    };

    public void rotate180(){
        System.out.println("Rotated 180 degrees.");
    };

    public void rotate(double degree){
        System.out.println("Rotated " + degree + " degrees.");
    };
}
