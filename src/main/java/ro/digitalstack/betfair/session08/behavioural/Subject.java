package ro.digitalstack.betfair.session08.behavioural;

import java.util.ArrayList;
import java.util.List;

public enum Subject {
    INSTANCE;
    private List<Observer> observerList = new ArrayList<>();

    public void register(Observer observer) {
        observerList.add(observer);
    }

    public void stateChanged(String state) {
        for (Observer observer : observerList) {
            observer.getNotified(state);
        }
    }
}
