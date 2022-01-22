package com.iltermon.observer;

public class ObserverMain {
    /***************************************************************************
     * Intent: Define a one-to-many dependency between objects so that when one*
     * object changes state, all its dependents are notified and updated       *
     * automatically                                                           *
     * Real world example: notifications on social network websites.           *
     **************************************************************************/
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attach(new ConcreteObserver());
        subject.attach(new ConcreteObserver());
        subject.setState("state1");
        subject.setState("state2");

        subject.notifyObservers(subject.getState());
    }
}
