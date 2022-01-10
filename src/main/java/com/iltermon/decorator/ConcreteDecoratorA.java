package com.iltermon.decorator;

public class ConcreteDecoratorA extends Decorator {
    protected ConcreteDecoratorA(Component component) {
        super(component);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void operation() {
        System.out.println("ConcreteDecoratorA.operation()");
    }

}
