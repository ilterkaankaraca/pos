package com.iltermon.composite;

public class Neg implements ArithmeticExpr { //composite
    ArithmeticExpr expr; 
    public Neg(ArithmeticExpr expr) {
       this.expr=expr;
    }
    @Override
    public Const eval() {
        return new Const(this.expr.eval().getValue()*-1);
    }
    @Override
    public Const eval(Environment env) {
        // TODO Auto-generated method stub
        return null;
    }
}
