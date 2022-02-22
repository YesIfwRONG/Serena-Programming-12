package moduleOne;

public class TwoDShape {
    double width = 0;
    double height = 0;

    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    public TwoDShape(){

    }

    public double getArea(){
        return width * height;
    }

    public void setHeight(double height){
        this.height = height;
    }
}
