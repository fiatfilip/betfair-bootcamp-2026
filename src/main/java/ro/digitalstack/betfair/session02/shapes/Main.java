package ro.digitalstack.betfair.session02.shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Shape circle = new Circle(10);
        shapes.add(circle);
        shapes.add(new Rectangle(2, 3));
        shapes.add(new Square(6));
        Square square = new Square(5);
        Rectangle r1 = square;
       // Square s = new Rectangle(2, 3);
        System.out.println(square.getEdge());
        SquareX square2 = new SquareX(5);
        square2.getArea();
        System.out.println(square2.getArea("The area is: "));
        AbstractShape as = new AbstractShape(5);
        shapes.add(as);


        for(Shape shape : shapes){
            shape.info();
        }
    }

}
