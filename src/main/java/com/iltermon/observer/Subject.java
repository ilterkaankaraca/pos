package com.iltermon.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers(state);
    }

    private String state;
    private List<Observer> observerArrayList = new ArrayList<>();

    public void attach(Observer observer) {
        observerArrayList.add(observer);
    }

    public void detach(Observer observer) {
        observerArrayList.remove(observer);
    }

    public void notifyObservers(String state) {
        for (Observer o : observerArrayList) {
            o.notify(state);
        }
    }
}
