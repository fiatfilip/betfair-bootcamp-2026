package ro.digitalstack.betfair.session08.behavioural;

public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Payment by card");
    }
}
