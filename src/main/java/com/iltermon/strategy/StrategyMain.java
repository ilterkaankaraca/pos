package com.iltermon.strategy;

public class StrategyMain {
    /*****************************************************************************
     * Name: Strategy or Policy
     * 
     * Intent: Define a family of algorithms, encapsulate each one, and make them
     * interchangeable. Strategy lets the algorithm vary independently from
     * clients(this class) that use it.
     * 
     * Real-world example: Interchangeable sorting algorithms.
     *****************************************************************************/

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new ConcreteStrategyA());
        context.strategy.algorithm();
        context.setStrategy(new ConcreteStrategyB());
        context.strategy.algorithm();
        context.setStrategy(new ConcreteStrategyC());
        context.strategy.algorithm();
    }
}
