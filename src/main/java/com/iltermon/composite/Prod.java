public class Prod implements ArithmeticExpr{ // composite
    ArithmeticExpr left;
    ArithmeticExpr right;

    public Prod(ArithmeticExpr left, ArithmeticExpr right) {
        this.left = left;
        this.right = right;
    }
    public Const eval(){
        return new Const(left.eval().getValue() * right.eval().getValue());
    }
    @Override
    public Const eval(Environment env) {
        // TODO Auto-generated method stub
        return null;
    }
}
