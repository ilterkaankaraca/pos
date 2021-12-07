package com.iltermon.composite;

public class Const implements ArithmeticExpr { //leaf
    private int value;

    Const(int v) {
        value = v;
    }

    int getValue() {
        return value;
    }

    public String toString() {
        return Integer.toString(value);
    }

    public Const eval(){
        return this;
    }

    @Override
    public Const eval(Environment env) {
        // TODO Auto-generated method stub
        return null;
    }
}
