package com.iltermon.template;

public class TemplateDemo {
    /**********************************************************************************************************
     * Intent: Define the skeleton of an algorithm in an operation, deferring some steps to client subclasses.*
     * Template Method lets subclasses redefine certain steps of an algorithm without changing                *
     * the algorithm’s structure [GHJV95].                                                                    *
     * Real world example: ----                                                                               *
     **********************************************************************************************************/
    public static void main(String[] args) {
        TemplateClass example1 = new SubClass1();
        TemplateClass example2 = new SubClass2();
        TemplateClass example3 = new SubClass3();

        System.out.println("example1");
        example1.templateMethod();

        System.out.println();

        System.out.println("example2");
        example2.templateMethod();

        System.out.println();

        System.out.println("example3");
        example3.templateMethod();
    }

}
