package ro.digitalstack.betfair.session08.structural;

public class StructuralMain {
    public static void main(String[] args) {
        CoffeeType cafeLatte = new Latte(new Coffee("Black", 2.5));

        System.out.println(cafeLatte.getPrice());
        System.out.println(cafeLatte.getType());
    }
}
