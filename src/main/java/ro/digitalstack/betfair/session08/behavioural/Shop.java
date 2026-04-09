package ro.digitalstack.betfair.session08.behavioural;

public class Shop {
    private PaymentStrategy paymentStrategy = new CashPaymentStrategy();

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay() {
        paymentStrategy.pay();
    }
}
