package week4.task2;

public class Shape {
    //color
    protected String color  ;
    //is filled
    protected boolean filled  ;

    //Constructor
    public Shape(){
        color = "red";
        filled = true;
    }
    //Constructor
    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

    //getter + setter
    public void setColor(String color) {this.color = color;}
    public String getColor(){return color;}
    public void setFilled(boolean filled){this.filled = filled;}
    public boolean isFilled(){return filled;}
    public String toString(){
        return "color : "+ color + " is filled : " + filled;
    }


}
