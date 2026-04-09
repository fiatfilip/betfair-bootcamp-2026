package ro.digitalstack.betfair.session08.structural;

public class Latte implements CoffeeType {
    private Coffee coffee;

    public Latte(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getType() {
        return this.coffee.getType() + " Latte";
    }

    @Override
    public double getPrice() {
        return this.coffee.getPrice() * 3;
    }
}
