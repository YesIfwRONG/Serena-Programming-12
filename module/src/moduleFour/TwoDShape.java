package moduleFour;

public abstract class TwoDShape {
    double width = 0;
    double height = 0;
    Colour colour;

    public TwoDShape(double width, double height, Colour colour){
        this.width = width;
        this.height = height;
        this.colour = colour;
    }

    public TwoDShape(){

    }



    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Colour getColour() {
        return colour;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public double getArea(){
        return width * height;
    }

    public String toString(){
        return "TwoDShape";
    }

}
