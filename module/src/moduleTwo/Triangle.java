package moduleTwo;

public class Triangle extends TwoDShape {
    double side1;
    double side2;
    double side3;

    public Triangle(double width, double height){
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setHeight(heronsHeight());
    }

    private double heronsHeight(){
        if(height != 0){
            return height;
        }
        double height = (0.5 * Math.sqrt((side1 + side2 + side3) * (-side1 + side2 + side3) * (side1 - side2 + side3) * (side1 + side2 - side3))) / side1;
        this.height = height;
        return height;
    }

    public double getArea(){
        return (0.25 * Math.sqrt((side1 + side2 + side3) * (-side1 + side2 + side3) * (side1 - side2 + side3) * (side1 + side2 - side3)));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
