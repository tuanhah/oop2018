package week2.task2;

import  java.util.*;
import  week2.task1.Task1;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private  int numerator;
    private  int denominator;
    public void setNumerator(int numerator){ numerator = numerator;}
    public void  setDenominator(int denominator) {denominator = denominator;}
    public  int getNumerator(int numerator) {return  this.numerator;}
    public  int getDenominator(int denominator){return  this.denominator;}

    public Fraction rutgon(){
        int ucln = Task1.gcd(this.numerator,this.denominator);
//        System.out.println(this.denominator);
//        System.out.println(this.numerator);
//        System.out.println(ucln);
        this.numerator = this.numerator / ucln;
        this.denominator = this.denominator /ucln;
        return this;
    }
    public Fraction(){
        numerator = 1;
        denominator = 1;
    };
    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
        this.rutgon();

    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        this.rutgon();
        other.rutgon();
        Fraction result = new Fraction();
        result.numerator = this.numerator * other.denominator + this.denominator * other.numerator;
        result.denominator = this.denominator * other.denominator;
        result.rutgon();
        return result;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        other.numerator = -other.numerator;
        return this.add(other);
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        this.rutgon();
        other.rutgon();
        this.numerator = this.numerator * other.numerator;
        this.denominator = this.denominator * other.denominator;
        this.rutgon();
        return this;
    }

    public Fraction divide(Fraction other) {
        Fraction temp = new Fraction();
        temp.denominator = other.numerator;
        temp.numerator = other.denominator;
        return this.multiply(temp);
    }
    public boolean equals(Fraction other){
        other.rutgon();
        this.rutgon();
        return  ((other.denominator == this.denominator) && (other.numerator == this.numerator));
    }
    public  static  void main(String[] args){
        Fraction f2 = new Fraction(6,5);
        Fraction f1 = new Fraction(6,5);
        System.out.println(f1.equals(f2));
        Fraction result = new Fraction();
        result = f2.subtract(f1);
        System.out.println(result.numerator+ " /" +result.denominator);

    }
}
