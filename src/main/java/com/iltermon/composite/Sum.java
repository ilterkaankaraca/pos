package com.iltermon.composite;

public class Sum implements ArithmeticExpr{ // composite
    ArithmeticExpr left;
    ArithmeticExpr right;

    public Sum(ArithmeticExpr left, ArithmeticExpr right) {
        this.left = left;
        this.right = right;
    }
    public Const eval(){
        return new Const(left.eval().getValue() + right.eval().getValue());
    }
    @Override
    public Const eval(Environment env) {
        // TODO Auto-generated method stub
        return null;
    }
}
