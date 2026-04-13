package ro.digitalstack.betfair.session08.creational;

public class Factory {
    enum AnimalType {
        FISH,
        DOG,
        HORSE
    }
    public Animal create(AnimalType animalType) {
        switch (animalType) {
            case DOG:
                return new Dog();
            case HORSE:
                return new Horse();
            case FISH:
                return new Fish();
            default:
                return null;
        }
    }
}
