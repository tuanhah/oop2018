package week4.task2;

public class Rectangle extends Shape {
    private double width;
    private double length;
    //Constructor
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    //Constructor
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    //Constructor
    public Rectangle(double width , double length, String color,boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    //getter + setter
    public void  setWidth(double width){ this.width = width;}

    public void setLength(double length){this.length = length;}

    public double getWidth(){return  width;}

    public double getLength(){return  length;}


    // find S
    public double getArea(){return  width * length;}
    // find P
    public double getPerimeter(){return 2*(width+length);}
    //print detail
    public String toString(){
        return "width : " + width + " length : "+ length + " color : " + getColor() +  " filled : " +isFilled();
    }
    
}
