package com.iltermon.template;

public class SubClass1 extends TemplateClass{
    @Override
    public void primitiveOperation1() {
        System.out.println("Subclass1.primitiveOperation1()");
    }
    @Override
    public void primitiveOperation2() {
        System.out.println("Subclass1.primitiveOperation2()");
    }
    @Override
    public boolean doPrimitiveOperation3() {
        return false;
    }
}