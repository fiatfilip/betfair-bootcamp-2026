package ro.digitalstack.betfair.session08.behavioural;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Cash is king");
    }
}
