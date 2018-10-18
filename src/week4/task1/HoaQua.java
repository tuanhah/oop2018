package week4.task1;

public class HoaQua{
    //xuat xu
    protected String xuatxu;
    //name
    protected String name;
    //set name
    public void setName(String name){ this.name = name;}
    //set xuatxu
    public void setXuatxu(String xuatxu){this.xuatxu = xuatxu;}
    //get name
    public String getName(){return name;}
    //get xuatxu
    public String getXuatxu(){return xuatxu;}

    public void print(){
        System.out.println("day la hoa qua");
    }
    public void printXuatxu(){
        System.out.println(" xuat xu la : " + xuatxu);
    }

}