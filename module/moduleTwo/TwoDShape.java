package moduleTwo;

public abstract class TwoDShape {
    double width = 0;
    double height = 0;

    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    public TwoDShape(){

    }


    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public abstract double getArea();

    public String toString(){
        return "TwoDShape";
    }

}
