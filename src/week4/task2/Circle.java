package week4.task2;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;
    //Constructor
    public Circle(){
        radius = 1.0;
    }
    //Constructor
    public Circle(double radius){
        this.radius = radius;
    }
    //Constructor
    public Circle(double radius,String color,boolean filled ){
        super(color,filled);
        this.radius = radius;
    }


    //getter + setter
    public void setRadius(double radius){this.radius = radius;}

    public double getRadius(){return radius;}


    // find S
    public double getArea(){
        return PI * radius * radius;
    }

    //find P
    public double getPerimeter(){
        return PI * radius *2;
    }
    // print detail
    public String toString(){
        return "radius : "+ radius  + " color : " + getColor() +  " filled : " +isFilled();
    }
}
