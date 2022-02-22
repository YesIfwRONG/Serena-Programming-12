package moduleTwo;

public class Main {
    public static void main (String[]args){
        Circle c1 = new Circle(2);
        Circle c2 = new Circle(4);
        Circle c3 = new Circle(6);
        Circle c4 = new Circle(8);
        Circle c5 = new Circle(10);
        Circle c6 = new Circle(12);
        Triangle t1 = new Triangle(3,4);
        Triangle t2 = new Triangle(3,4);
        Triangle t3 = new Triangle(3,4);
        Triangle t4 = new Triangle(5.7, 12.2, 7.1);
        Triangle t5 = new Triangle(11.9, 22.3, 33.9);
        Triangle t6 = new Triangle(4, 2, 3);

        TwoDShape[] shapes = {c1, t1, c2, t2, c3, t3, c4, t4, c5, t5, c6, t6};

        for(int i = 0; i<shapes.length;i++){
            System.out.print(shapes[i] + " ");
        }

        for(int i = 0; i<shapes.length;i++){
            System.out.print(shapes[i].getArea() + " ");
        }

    }
}
