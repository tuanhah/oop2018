package week2.task1;
import  java.util.*;
public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
	//a a a a
        if (b == 0 ) return  a;
        else return gcd(b , a % b);
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if (n == 0 || n == 1) return  n;
        else  return  fibonacci(n-1) + fibonacci(n-2);
    }
    public  static  void  main(String[] args){
        System.out.println(gcd(15,15));
        System.out.println(fibonacci(3));
    }
}
