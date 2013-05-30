package _06_smart_cast;

public class JavaEvaluate {
    public static int evaluate(Expr expr) {
        if (expr instanceof Num) {
            Num num = (Num) expr;
            return num.getValue();
        }

        if (expr instanceof Sum) {
            Sum sum = (Sum) expr;
            return evaluate(sum.getLeft()) + evaluate(sum.getRight());
        }

        throw new IllegalStateException("Invalid type of parameter");
    }
}
