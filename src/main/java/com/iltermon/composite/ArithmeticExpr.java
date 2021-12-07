package com.iltermon.composite;

public interface ArithmeticExpr { //component
    Const eval();
    Const eval(Environment env);
}
