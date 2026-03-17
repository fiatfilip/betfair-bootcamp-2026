package ro.digitalstack.betfair.session02.shapes;

public class AbstractShape extends Circle{
    public AbstractShape(double radius) {
        super(radius);
    }

    @Override
    public double getArea(){
        return 20;
    }

}
