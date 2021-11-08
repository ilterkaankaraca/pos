public class Demo {
    public static void main(String[] args) {
        ArithmeticExpr const1 = new Const(10);
        ArithmeticExpr const2 = new Const(20);
        ArithmeticExpr sum = new Sum(const1, const2);
        ArithmeticExpr prod = new Prod(const1, const2);
        Environment env = new Environment();
        System.out.println("Sum :" + sum.eval().toString());
        System.out.println("Prod :" + prod.eval().toString());

        ArithmeticExpr x = new Var("x");
        ArithmeticExpr n1 = new Const(4);
        ArithmeticExpr n2 = new Const(7);
        env.put("x", new Const(-34));
        System.out.println(new Sum(x.eval(env),new Neg(new Prod(n1,n2).eval()).eval()).eval().toString());

    }
}
