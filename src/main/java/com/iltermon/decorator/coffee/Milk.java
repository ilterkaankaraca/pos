package com.iltermon.decorator.coffee;

public class Milk extends Decorator {
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public void price() {
        System.out.println("Milk: $0.50");
        beverage.price();
    }
}
    

