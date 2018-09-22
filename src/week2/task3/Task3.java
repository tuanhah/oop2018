package week2.task3;

import  java.util.*;
public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
// lop meo
class cat{
    //thuoc tinh cua meo
    private String name;
    private String color;
    private String age;
    // getter
    public String getName(){return this.name;}
    public String getColor(){return  this.color;}
    public String getAge(){return this.age;}
    //setter
    public void setName(String name){name = name;}
    public void setColor(String color){color = color;}
    public void  setAge(String age){age = age;}
    //phuong thuc keu
    public void say(){
        System.out.println("Meow meow");
    }
    //phuong thuc an
    public void eat(){
        System.out.println("Meo dang an");
    }
    //phuong thuc ngu
    public void sleep(){
        System.out.println("Meo di ngu");
    }
}
//lop lap trinh vien
class coder{
    // thuoc tinh cua lap trinh vien
    private String name;
    private String age;
    private String sex;
    //getter
    public String getName(){return  name;}
    public String getAge(){return  age;}
    public String getSex(){return  sex;}
    // setter
    public void setName(String name){name =name;}
    public void setAge(String age){age =age;}
    public void setSex(String sex){sex =sex;}
    //phuong thuc an
    public void eat(){
        System.out.println("Lap trinh vien dang an");
    }
    //phuong thuc ngu
    public void sleep(){
        System.out.println("Lap trinh vien di ngu");
    }
    //phuong thuc code
    public void code(){
        System.out.println("Lap trinh vien dang code");
    }
}
//lop giao vien
class teacher{
    // thuoc tinh cua giao vien
    private String name;
    private String age;
    private String sex;
    //getter
    public String getName(){return  name;}
    public String getAge(){return  age;}
    public String getSex(){return  sex;}
    // setter
    public void setName(String name){name =name;}
    public void setAge(String age){age =age;}
    public void setSex(String sex){sex =sex;}
    //phuong thuc day hoc
    public void teach(){
        System.out.println("Giao vien dang day hoc");
    }
    //phuong thuc di ngu
    public void sleep(){
        System.out.println("Giao vien di ngu");
    }
    //phuong thuc an
    public void eat(){
        System.out.println("Giao vien di an");
    }
}