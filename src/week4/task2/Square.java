package week4.task2;

public class Square extends Rectangle {
//    private double side;
    //Constructor
    public Square(){
        super(1.0,1.0);
    }

    //Constructor
    public Square(double side){
        super(side,side);
//        super(side,side);
    }

    //Constructor
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
//        this.side = side;

    }

    //setter+getter
//    public void setSide(double side){this.side = side;}
//    public double getSide(){return side;}

    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){

        super.setLength(side);
    }

    // print detail
//    public String toString(){
//        return "side : " + side  + " color : " + getColor() +  " filled : " +isFilled();
//    }

}
