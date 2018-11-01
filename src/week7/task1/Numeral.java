package week7.task1;

public class Numeral extends Expression {
    private int value;

    public Numeral() {
    }

    public Numeral(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        return this.value;
    }

    @Override
    public String toString() {
        return "Numeral{" + "value=" + value + '}';
    }

}
