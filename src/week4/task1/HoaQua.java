package week4.task1;

public class HoaQua{
    //name
    private String xuatxu;
    //price
    private String name;
    //set name
    public void setName(String name){ name = name;}
    //set price
    public void setXuatxu(String xuatxu){this.xuatxu = xuatxu;}
    //get name
    public String getName(){return name;}
    //get price
    public String getPrice(){return xuatxu;}

    public void print(){
        System.out.println("day la hoa qua");
    }
    public void printXuatxu(){
        System.out.println(" xuat xu la : " + xuatxu);
    }

}