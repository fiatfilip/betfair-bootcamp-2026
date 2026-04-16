package ro.digitalstack.betfair.session09;

public sealed interface Shape permits Circle, Square, Rectangle{
    public double getArea();

}
