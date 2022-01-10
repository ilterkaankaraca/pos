package com.iltermon.decorator;

public class ConcreteDecoratorB extends Decorator {
    protected ConcreteDecoratorB(Component component) {
        super(component);
        //TODO Auto-generated constructor stub
    }
    @Override
    public void operation() {
        System.out.println("ConcreteComponentB.operation()");
        addedBehavior();
    }
    public void addedBehavior() {
        System.out.println("ConcreteComponentB.addedBehavior()");
    }
}
