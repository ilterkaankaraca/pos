package com.iltermon.observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update(String state) {
        System.out.println("New state: " + state);
    }
}
