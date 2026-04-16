package ro.digitalstack.betfair.session09;

public record Square(double edge) implements Shape{
    public double getArea() {
        return Math.pow(edge, 2);
    }

}
