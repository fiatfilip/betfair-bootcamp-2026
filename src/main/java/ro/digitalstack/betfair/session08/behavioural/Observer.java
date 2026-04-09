package ro.digitalstack.betfair.session08.behavioural;

public class Observer {
    public void getNotified(String notification) {
        System.out.println(this + " " + notification);
    }
}
