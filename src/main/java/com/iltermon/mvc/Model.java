package com.iltermon.mvc;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private String state;
    private List<Observer> observerArrayList = new ArrayList<Observer>();


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers(state);
    }

    public void attach(Observer observer) {
        observerArrayList.add(observer);
    }

    public void detach(Observer observer) {
        observerArrayList.remove(observer);
    }

    public void notifyObservers(String state) {
        for (Observer o : observerArrayList) {
            o.update(state);
        }
    }

}
