package moduleFour;

public class Main {
    public static void main (String[]args){
        Circle c1 = new Circle(2, Colour.BLUE);
        Circle c2 = new Circle(4, Colour.RED);
        Circle c3 = new Circle(6, Colour.GREEN);
        Circle c4 = new Circle(8, Colour.NONE);
        Circle c5 = new Circle(10, Colour.NONE);
        Circle c6 = new Circle(12, Colour.BLUE);
        Triangle t1 = new Triangle(3,4, Colour.RED);
        Triangle t2 = new Triangle(3,4, Colour.BLUE);
        Triangle t3 = new Triangle(3,4, Colour.NONE);
        Triangle t4 = new Triangle(5.7, 12.2, 7.1, Colour.GREEN);
        Triangle t5 = new Triangle(11.9, 22.3, 33.9, Colour.RED);
        Triangle t6 = new Triangle(4, 2, 3, Colour.NONE);

        TwoDShape[] shapes = {c1, t1, c2, t2, c3, t3, c4, t4, c5, t5, c6, t6};

        for(int i = 0; i<shapes.length;i++){
            System.out.print(shapes[i] + ";    ");
        }

        System.out.println();

        for(int i = 0; i<shapes.length;i++){
            System.out.print("Area: " + shapes[i].getArea() + ";    ");
        }

        System.out.println();

        for (int i = 0; i < shapes.length; i++) {
            System.out.print(shapes[i].getColour() + ";    ");
        }
    }
}
