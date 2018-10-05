package week4.task2;

public class Shape {
    private String color  ;
    private boolean filled  ;

    public Shape(){
        color = "red";
        filled = true;
    }
    public Shape(String color,boolean filled){
        color = color;
        filled = filled;
    }


    public void setColor(String color) {color = color;}
    public String getColor(){return color;}
    public void setFilled(boolean filled){filled = filled;}
    public boolean isFilled(){return filled;}
    public String toString(){
        return "color : "+ color + " is filled : " + filled;
    }


}
