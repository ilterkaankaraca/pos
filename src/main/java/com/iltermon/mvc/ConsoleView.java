package com.iltermon.mvc;

public class ConsoleView implements Observer {
    int id;

    public ConsoleView(int id) {
        this.id = id;
    }

    @Override
    public void update(String state) {
        System.out.println("id: " + id + ", state: " + state);
    }

}
