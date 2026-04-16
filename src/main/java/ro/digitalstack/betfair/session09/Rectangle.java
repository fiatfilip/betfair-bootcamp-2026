package ro.digitalstack.betfair.session09;

public record Rectangle(double length, double width) implements Shape{
    public double getArea(){
        return length * width;
    }

}
