package ro.digitalstack.betfair.session03.listener;

public class Main {
    public static void main(String[] args) {

        Listener myListener = new WindowListener();
        myListener.actionPerform();
        Listener mouseListener = new Listener() {
            @Override
            public void actionPerform() {
                System.out.println("Mouse was moved.");
            }
        };

        mouseListener.actionPerform();

    }
}
