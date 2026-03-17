package ro.digitalstack.betfair.session02.shapes;

public interface Shape {
    double getArea();

    default void info(){
        System.out.println(this.getClass().getSimpleName() + ":" + getArea()); }
}
