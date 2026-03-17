package ro.digitalstack.betfair.session03.auto;

public class Car {

    static class Engine{

        private String engineType;

        public Engine(String engineType) {
            this.engineType = engineType;
            //System.out.println("Color: " + color);
        }
    }

    private Engine carEngine;
    private String color = "black";

    public Car(Engine carEngine, String color) {
        this.carEngine = carEngine;
        this.color = color;
    }

    public Car(String engineType){
        this.carEngine = new Engine(engineType);
    }

    public void start(){

        System.out.println("Starting car with engine: " + carEngine.engineType);

    }

    public static void main(String[] args) {

        Car car1 = new Car("Diesel");
        car1.start();
        Engine engine = new Engine("Gasoline");
        Car car2 = new Car(engine, "Red");
        car2.start();

    }

}
