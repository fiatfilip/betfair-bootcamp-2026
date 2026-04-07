package ro.digitalstack.betfair.session3.auto;

public class Car {
    static class Engine{
        private String engineType;

        public Engine(String engineType){
            this.engineType = engineType;
        }
    }

    private Engine carEngine;
    private String color = "Black";

    public Car(Engine carEngine, String color){
        this.carEngine = carEngine;
        this.color = color;
    }

    public Car(String engineType){
        this.carEngine = new Engine(engineType);
    }

    public void start()
    {
        System.out.println("Starting care with engine: " + carEngine.engineType);
    }

//    public static void main(String[] args) {
//        Car car1 = new Car("Diesel");
//        car1.start();
//
//        Car car2 = new Car(new Engine("Gasoline",color));
//        car2.start();
//    }
}
