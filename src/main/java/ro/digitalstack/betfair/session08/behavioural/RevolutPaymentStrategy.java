package ro.digitalstack.betfair.session08.behavioural;

public class RevolutPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Revolut payment");
    }
}
