package com.iltermon.decorator;

public class DecoratorMain {
    /*****************************************************************************
     * Name: Decorator
     * 
     * Intent: Attach additional responsibilities to an object dynamically.
     * Decorators provide a flexible alternative to subclassing for extending
     * functionality [GHJV95].
     * 
     * Real-world example: Java's InputStream classes are using decorators to add
     * different functionality to the stream. Like the BufferedInputStream, the
     * FilterInputStream.
     *****************************************************************************/
    public static void main(String[] args) {
        Component concrComponent = new ConcreteComponent();
        concrComponent.operation();
        concrComponent = new ConcreteDecoratorA(concrComponent);
        concrComponent.operation();
        concrComponent = new ConcreteDecoratorB(concrComponent);
        concrComponent.operation();

    }
}
