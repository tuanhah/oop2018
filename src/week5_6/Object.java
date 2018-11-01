package week5_6;

public class Object {
    protected String id ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
//Class định nghĩa tọa độ
class Coordinates{
    private double x;
    private double y;

    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    //Phương thức cài tọa độ
    public Coordinates setXY(double x_,double y_){
        Coordinates temp = new Coordinates(x,y);
        return temp;
    }

}

//Class Shape đại diện cho các hình
class Shape extends Object{
    private String color = "red";
    private boolean filled = true;
    private boolean motion;
    protected static String distinct;
    public Shape() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isMotion() {
        return motion;
    }

    public void setMotion(boolean motion) {
        this.motion = motion;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + ", filled=" + filled + '}';
    }
}

//Class hình tròn
class Circle extends Shape{
    private double radius = 1.0;
    private Coordinates center;

    public Circle(){
    }

    //Khởi tạo hình tròn với các tham số là layer cha, tâm,bán kính
    public Circle(Layer l1, Coordinates center_,double radius_){
        this.center=center_;
        this.radius=radius_;
        this.id="Circle"+l1.countIdCircle;
        this.distinct ="Circle" + this.center.getX() + "," + this.center.getY() + "," + this.getRadius();
        l1.listShape.add(this);
        //super.lCircle.listShape.add(this.id);
        l1.listDistinct.add(this.distinct);
        l1.countIdCircle++;

    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius_){
        this.radius=radius_;
    }

    public Coordinates getCenter() {
        return center;
    }

    public void setCenter(double x, double y) {
        this.center.setXY(x, y);
    }


}

//hình chu nhat
class Rectangle extends Shape{
    private double width=1.0;
    private double length =1.0;
    private Coordinates top;

    public Rectangle(){

    }

    //
    public Rectangle(Layer l1, Coordinates top_,double width_,double length_){
        this.id="Rectangle"+l1.countIdRectangle;
        this.top=top_;
        this.width=width_;
        this.length=length_;

        this.distinct="Rectangle"+this.top.getX()+","+this.top.getY()+","+this.width+","+this.length;
        l1.countIdRectangle++;
        l1.listShape.add(this);
        l1.listDistinct.add(this.distinct);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Coordinates getTop() {
        return top;
    }

    public void setTop(double x, double y) {
        this.top.setXY(x, y);
    }


}
//hình vuông
class Square extends Shape{
    private double Side;
    private Coordinates topLeft;

    public Square(){

    }

    public Square(Layer l1, Coordinates topLeft_,double side_){
        this.topLeft=topLeft_;
        this.Side=side_;
        this.id="Square"+l1.countIdSquare;
        this.distinct="Square"+this.topLeft.getX()+","+this.topLeft.getY()+","+this.Side;
        l1.countIdSquare++;
        l1.listShape.add(this);
        //super.lSquare.listShape.add(this.id);
        l1.listDistinct.add(this.distinct);
    }

    public double getSide() {
        return Side;
    }

    public void setSide(double Side) {
        this.Side = Side;
    }

    public Coordinates getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(double x, double y) {
        this.topLeft.setXY(x, y);
    }

}
//Hình tam giác
class Tringle extends Shape{
    private Coordinates A;
    private Coordinates B;
    private Coordinates C;

    public Tringle(){

    }
    //Khởi tạo tam giác
    public Tringle(Layer l1, Coordinates A_, Coordinates B_, Coordinates C_){
        this.A=A_;
        this.B=B_;
        this.C=C_;
        Coordinates center = new Coordinates((A.getX()+ B.getX()+C.getX())/3,(A.getY()+ B.getY()+C.getY())/3);
        this.id="Tringle"+l1.countIdTringle;
        this.distinct="Tringle"+ center.getX()+","+center.getY()+A.getX()+A.getY();
        l1.countIdTringle++;
        l1.listShape.add(this);
        l1.listDistinct.add(this.distinct);
        //super.lTringle.listShape.add(this.id);
    }

    public Coordinates getA() {
        return A;
    }

    public void setA(double x, double y) {
        this.A.setXY(x, y);
    }

    public Coordinates getB() {
        return B;
    }

    public void setB(double x, double y) {
        this.B.setXY(x, y);
    }

    public Coordinates getC() {
        return C;
    }

    public void setC(double x, double y) {
        this.C.setXY(x, y);
    }
}

class Hexagon extends Shape{
    private double Side;
    private Coordinates topLeft;

    public Hexagon(){

    }

    public Hexagon(Layer l1, Coordinates topLeft_,double side_){
        this.topLeft=topLeft_;
        this.Side=side_;
        this.id="Hexagon"+l1.countIdHexagon;
        this.distinct="Hexagon"+this.topLeft.getX()+","+this.topLeft.getY()+","+this.Side;
        l1.countIdHexagon++;
        l1.listShape.add(this);
        //super.lSquare.listShape.add(this.id);
        l1.listDistinct.add(this.distinct);
    }

    public double getSide() {
        return Side;
    }

    public void setSide(double Side) {
        this.Side = Side;
    }

    public Coordinates getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(double x, double y) {
        this.topLeft.setXY(x, y);
    }

}