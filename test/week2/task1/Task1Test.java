package week2.task1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void testGcd() {
        assertEquals(3, Task1.gcd(6, 9));
        assertEquals(6, Task1.gcd(6, 6));
        assertEquals(3, Task1.gcd(6, 3));
        assertEquals(1, Task1.gcd(6, 7));
        assertEquals(1, Task1.gcd(6, 1));
    }

    @Test
    public void testFibonacci() {
        assertEquals(0, Task1.fibonacci(0));
        assertEquals(1, Task1.fibonacci(1));
        assertEquals(1, Task1.fibonacci(2));
        assertEquals(2, Task1.fibonacci(3));
        assertEquals(3, Task1.fibonacci(4));
        assertEquals(5, Task1.fibonacci(5));

        assertEquals(6765, Task1.fibonacci(20));
        assertEquals(832040, Task1.fibonacci(30));
    }
}
