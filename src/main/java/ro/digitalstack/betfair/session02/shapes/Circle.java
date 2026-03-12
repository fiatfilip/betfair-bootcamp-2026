package ro.digitalstack.betfair.session02.shapes;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = Math.abs(radius);
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

}
