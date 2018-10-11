package week4.task2;

public class Main {
    public static void  main(String[] args){
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        Shape s2 = new Shape("blue",true);
        System.out.println(s2.toString());
        Circle c1 = new Circle();
        System.out.println(c1.toString());
        c1.setRadius(5);
        c1.getArea();
        c1.getPerimeter();
        Circle c2 = new Circle(5,"green",true);
        c2.getPerimeter();
        c2.getArea();
        System.out.println(c2.toString());
        Rectangle r1 = new Rectangle(2,1,"green",true );
        System.out.println(r1.toString());
        Square sq1 = new Square(5,"green",true);
        System.out.println(sq1.toString());
        sq1.setLength(2.4);
        System.out.println(sq1.getLength());
    }
}
