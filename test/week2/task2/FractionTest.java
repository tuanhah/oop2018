package week2.task2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionTest {

    private Fraction fraction1;
    private Fraction fraction2;

    @Before
    public void init() {
        fraction1 = new Fraction(2, 3);
        fraction2 = new Fraction(4, 5);
    }

    @Test
    public void testEquals() {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(2, 3);
        Fraction fraction3 = new Fraction(4, 6);

        assertEquals(fraction1, fraction2);
        assertEquals(fraction1, fraction3);
    }

    @Test
    public void testAdd() {
        Fraction result = fraction1.add(fraction2);
        assertEquals(result, new Fraction(22, 15));
    }

    @Test
    public void testSubtract() {
        Fraction result = fraction1.subtract(fraction2);
        assertEquals(result, new Fraction(-2, 15));
    }

    @Test
    public void testMultiply() {
        Fraction result = fraction1.multiply(fraction2);
        assertEquals(result, new Fraction(8, 15));
    }

    @Test
    public void testDivide() {
        Fraction result = fraction1.divide(fraction2);
        assertEquals(result, new Fraction(5, 6));
    }
}
