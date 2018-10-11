package week4.task1;

public class QuaTao extends HoaQua {
    // khai bao thuoc tinh gia va mau sac
    private String price;
    private String color;

    // getter + setter cho tung thuoc tinh

    public String getPrice(){return price;}

    public String getColor(){return  color;}

    public void setPrice(String price) {
        this.price = price;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void print(){
        System.out.println("day la qua tao");
    }
    public void printGia(){
        System.out.println(" gia tien la : " + price);
    }


}
