package week7.task1;

public class Addition extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    public Addition(int left, int right) {
        this.left = new Numeral(left);
        this.right = new Numeral(right);
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        return "Addition{" + "left=" + left + ", right=" + right + '}';
    }

    @Override
    public int evaluate() {
        return left.evaluate()+right.evaluate();
    }
}

