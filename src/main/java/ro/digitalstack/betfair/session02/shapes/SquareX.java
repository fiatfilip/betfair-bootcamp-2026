package ro.digitalstack.betfair.session02.shapes;

import java.awt.*;

public class SquareX implements Shape {
    private double edge;
    private Rectangle rectangle;

    public SquareX(double edge){
        this.edge = edge;
        this.rectangle = new Rectangle(edge,edge);
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public double getArea() {
        return rectangle.getArea();
    }

    public String getArea(String prefix){
        return prefix + getArea();
    }

    //public String getArea(String prefix) {
      //  return prefix + getArea();
    //}

//    public String getArea(String prefix)
//    {
//        return prefix + getArea();
//    }
}
