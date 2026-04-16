package ro.digitalstack.betfair.session09;

public record Circle(double radius) implements Shape {

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

}
