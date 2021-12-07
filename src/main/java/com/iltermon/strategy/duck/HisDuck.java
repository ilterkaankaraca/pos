package com.iltermon.strategy.duck;
public class HisDuck extends Duck {
    public HisDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyTheHisWay();
    }
    public void display() {
        System.out.println("I'm a HIS duck");
    }
}
