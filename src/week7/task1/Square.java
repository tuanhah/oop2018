package week7.task1;

public class Square extends Expression{
    private Expression expression;

    public Square(Expression expression) {
        this.expression = expression;
    }
    public Square(int a) {
        this.expression = new Numeral(a);
    }


    @Override
    public int evaluate() {
        return expression.evaluate()*expression.evaluate();
    }

    @Override
    public String toString() {
        return "Square{" + "expression=" + expression + '}';
    }
}
