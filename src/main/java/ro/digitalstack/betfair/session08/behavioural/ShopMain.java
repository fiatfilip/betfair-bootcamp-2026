package ro.digitalstack.betfair.session08.behavioural;

public class ShopMain {
    public static void main(String[] args) {
        Shop shop = new Shop();

        shop.pay();

        System.out.println("IRS is coming");

        shop.setPaymentStrategy(new CardPaymentStrategy());
        shop.pay();

        shop.setPaymentStrategy(new RevolutPaymentStrategy());
        shop.pay();
    }
}
