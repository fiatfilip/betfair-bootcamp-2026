package ro.digitalstack.betfair.session08.creational;

import static ro.digitalstack.betfair.session08.creational.Factory.AnimalType.DOG;
import static ro.digitalstack.betfair.session08.creational.Factory.AnimalType.FISH;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Animal animal = factory.create(FISH);

        animal.doSomething();
    }
}
