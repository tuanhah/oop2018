package week3;

import org.junit.Test;
import org.junit.runner.*;
import org.junit.runner.notification.*;
import static org.junit.Assert.*;
public class Week3Test {

    // TODO: Viết 5 testcase cho phương thức max()
    @Test
    public void testMax1(){
        assertEquals(6,Week3.max(5,6));

    }
    @Test
    public void testMax2(){

        assertEquals(0,Week3.max(-5,0));
    }
    @Test
    public void testMax3(){
        assertEquals(-9,Week3.max(-9,-100));

    }
    @Test
    public void testMax4() {
        assertEquals(100, Week3.max(100, 3));
    }
    @Test
    public void testMax5(){
        assertEquals(32,Week3.max(32,5));
    }


    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void testMinOfArray1(){
        int[] arr = {0,1,0,1,4,5};
        assertEquals(0,Week3.minOfArray(arr));
    }
    @Test
    public void testMinOfArray2(){
        int[] arr = {32,1,2,3,4,5};
        assertEquals(1,Week3.minOfArray(arr));
    }
    @Test
    public void testMinOfArray3(){
        int[] arr = {0,1847743,2,3,4,5};
        assertEquals(0,Week3.minOfArray(arr));
    }
    @Test
    public void testMinOfArray4(){
        int[] arr = {0,-17,2,3,-4,5};
        assertEquals(-17,Week3.minOfArray(arr));
    }
    @Test
    public void testMinOfArray5(){
        int[] arr = {0,1,2,3,-9,5};

        assertEquals(-9,Week3.minOfArray(arr));
    }
    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void testCaculateBMI1(){
        assertEquals("Thiếu cân",Week3.calculateBMI(10,2));

    }
    @Test
    public void testCaculateBMI2(){
        assertEquals("Thừa cân",Week3.calculateBMI(55,1.5));

    }
    @Test
    public void testCaculateBMI3(){
        assertEquals("Bình thường",Week3.calculateBMI(50,1.5));

    }
    @Test
    public void testCaculateBMI4(){
        assertEquals("Béo phì",Week3.calculateBMI(100,1.4));


    }
    @Test
    public void testCaculateBMI5(){
        assertEquals("Béo phì",Week3.calculateBMI(90,1.3));

    }

}
