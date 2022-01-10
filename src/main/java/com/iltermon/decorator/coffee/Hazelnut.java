package com.iltermon.decorator.coffee;

public class Hazelnut extends Decorator {
    public Hazelnut(Beverage beverage) {
        this.beverage = beverage;
    }

    public void price() {
        System.out.println("Hazelnut: $0.50");
        beverage.price();
    }
}
