package com.iltermon.composite;

public class Var implements ArithmeticExpr{ // leaf
    String name;

    Var(String n) {
        name = n;
    }

    public String toString() {
        return name;
    }

    @Override
    public Const eval() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Const eval(Environment env) {
        return env.lookup(name);
    }
    
}