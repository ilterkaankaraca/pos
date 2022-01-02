package com.iltermon.strategy;

public class Context {
    Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return this.strategy;
    }

    public void display() {
        System.out.println("Context.display()");
    }

    public void executeStrategy() {
        strategy.algorithm();
    }
}
