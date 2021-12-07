package com.iltermon.strategy.duck;
public class Demo {
    public static void main(String[] args) {
        Duck hisDuck = new HisDuck();

        hisDuck.display();
        hisDuck.performFly();
        hisDuck.performQuack();
        hisDuck.swim();
    }
}
