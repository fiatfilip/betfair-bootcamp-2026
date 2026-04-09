package ro.digitalstack.betfair.session02.shapes;

import java.awt.*;

public class Rectangle implements Shape {
    private double height, length;

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return height*length;
    }
}
