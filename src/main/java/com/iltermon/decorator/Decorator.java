package com.iltermon.decorator;

public abstract class Decorator implements Component {
    protected Component component;

    //to prevent instantiation of abstract decorator
    protected Decorator(Component component) {
        this.component = component;
    }
    public void operation() {
        System.out.println("Decorator.operation()");
    }
}
