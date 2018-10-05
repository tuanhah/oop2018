package week4.task2;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;
    public Circle(){
        radius = 1.0;
    }
    public Circle(double radius){
        radius = radius;
    }
    public Circle(double radius,String color,boolean filled ){
        super(color,filled);
        radius = radius;
    }

    public void setRadius(double radius){radius = radius;}

    public double getRadius(){return radius;}

    public double getArea(){
        return PI * radius * radius;
    }
    public double getPerimeter(){
        return PI * radius *2;
    }
}
