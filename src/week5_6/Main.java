package week5_6;

public class Main {
    public static void main(String args[]){
        //khởi tạo 1 Diagram và 6 Layer
        Diagram d1=new Diagram();
        Layer l1=new Layer(d1);
        Layer l2=new Layer(d1);
        Layer l3=new Layer(d1);
        Layer l4=new Layer(d1);
        Layer l5=new Layer(d1);
        Layer l6=new Layer(d1);
        Layer l7=new Layer(d1);

//        l2.visible=false;


//        l1.visible=true;

        Coordinates center1 = new Coordinates(2,3);
        Coordinates center2 = new Coordinates(2,3);
        Coordinates center3 = new Coordinates(1,3);


        Circle c1 = new Circle(l1,center1,2.0);
        Circle c11 = new Circle(l1,center1,2.0);
        Circle c2 = new Circle(l2,center1,2.0);
        Hexagon h1 = new Hexagon(l3,center3,2.0);
        Square s1 = new Square(l4,center2,2.0);

        Tringle t1  = new Tringle(l5,center1,center2,center3);
        Hexagon h2 = new Hexagon(l6,center3,2.0);
        Rectangle r1 = new Rectangle(l6,center1,2.0,3.0);
        Rectangle rec = new Rectangle(l6,center1,2.0,3.0);

        //Phân loại hình

//        d1.Category();

        d1.deleteCircle();
//        l5.deleteTringle();

        d1.deleteSame();
        //Vẽ hình trong Diagram
//        d1.deleteCircle();

//        l4.visible = false;

        d1.drawLayer();
    }

}
