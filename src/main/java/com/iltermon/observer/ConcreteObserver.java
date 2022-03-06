package com.iltermon.observer;

public class ConcreteObserver implements Observer {
    @Override
    public void notify(String state) {
        System.out.println("New state: " + state);
    }
}
