package ro.digitalstack.betfair.session08.behavioural;

public class ObserverMain {
    public static void main(String[] args) {
        Observer observer1 = new Observer();
        Observer observer2 = new Observer();
        Observer observer3 = new Observer();
        Observer observer4 = new Observer();

        Subject.INSTANCE.register(observer1);
        Subject.INSTANCE.register(observer2);
        Subject.INSTANCE.register(observer3);
        Subject.INSTANCE.register(observer4);

        Subject.INSTANCE.stateChanged("BOOM");
    }
}