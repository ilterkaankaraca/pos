package com.iltermon.template;

public class SubClass3 extends TemplateClass {
    @Override
    public void primitiveOperation1() {
        System.out.println("SubClass3.primitiveOperation1()");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("SubClass3.primitiveOperation2()");
    }

    @Override
    public void primitiveOperation3() {

        System.out.println("SubClass3.primitiveOperation3()");
        super.primitiveOperation3();
    }
}