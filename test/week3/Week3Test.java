package week3;

import org.junit.Test;
import org.junit.runner.*;
import org.junit.runner.notification.*;
import static org.junit.Assert.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax(){
        assertEquals(6,Week3.max(5,6));
        assertEquals(0,Week3.max(-5,0));
        assertEquals(-9,Week3.max(-9,-100));
        assertEquals(100,Week3.max(100,3));
        assertEquals(32,Week3.max(32,5));
    }

    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray(){
        int[] arr = {0,1,2,3,4,5};
        assertEquals(0,Week3.minOfArray(arr));
        arr[1] = -6;
        assertEquals(-6,Week3.minOfArray(arr));
        arr[4] = -5;
        assertEquals(-6,Week3.minOfArray(arr));
        arr[4] = -6;
        assertEquals(-6,Week3.minOfArray(arr));
        arr[4] = -9;
        assertEquals(-9,Week3.minOfArray(arr));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCaculateBMI(){
        assertEquals("Thiếu cân",Week3.calculateBMI(10,2));
        assertEquals("Thừa cân",Week3.calculateBMI(55,1.5));
        assertEquals("Bình thường",Week3.calculateBMI(50,1.5));
        assertEquals("Béo phì",Week3.calculateBMI(100,1.4));
        assertEquals("Béo phì",Week3.calculateBMI(90,1.3));

    }

}
