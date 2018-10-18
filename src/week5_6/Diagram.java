package week5_6;


import java.util.ArrayList;

/**
 *
 * @author
 */
public class Diagram{
    private double width;
    private double length;

    //danh sách lưu ID các layer hiện có trong Diagram
//    protected ArrayList<String> listIdLayer= new ArrayList<String>();
    //danh sách lưu các layer có trong Diagram
    protected ArrayList<Layer> listLayer= new ArrayList<Layer>();
    //layer chứa Circle

    protected int countIdLayer=0;
    public Diagram(){


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
    //phương thức xóa đường tròn

    public void deleteCircle(){
        for (Layer temp : this.listLayer) {
            temp.deleteCircle();
        }
    }



    public void drawLayer(){
        for(int i=0;i<this.listLayer.size();i++){
            if(this.listLayer.get(i).visible==true && this.listLayer.get(i).listShape.size() >0){
                System.out.println("Layer "+ i);
                this.listLayer.get(i).drawShape();
            }
        }

    }

    public void deleteSame(){
        for(int i=0;i<this.listLayer.size();i++){
            Layer temp = this.listLayer.get(i);
            for (int j=1;j<temp.listDistinct.size();j++){
                for(int t=0;t<j;t++){
                    if(temp.listDistinct.get(j).equals(temp.listDistinct.get(t) ) ){
                        temp.listShape.remove(j);
                        temp.listDistinct.remove(j);
                        j--;

                    }
                }
            }
        }
    }

    public void Category( ){
        //tạo thêm Layer nếu cần
        int count =  this.listLayer.size() ;
        if(count < 5){
            for(int t = count;t<5;t++){

                Layer t1= new Layer();
                this.listLayer.add(t1);
            }
        }

        //Chia hình vào các layer mới tương ứng
        for(int i=0;i<this.listLayer.size();i++){
            Layer temp = this.listLayer.get(i);
            for(int j=0;j<temp.listShape.size();j++){
                String str = temp.listShape.get(j);
                if(str.contains("Circle")&&i!=0){
                    this.listLayer.get(0).listShape.add(str);
                    temp.listShape.remove(j);
                    j--;
                }

                if(str.contains("Square")&&i!=1){
                    this.listLayer.get(1).listShape.add(str);
                    temp.listShape.remove(j);
                    j--;
                }

                if(str.contains("Rectangle")&&i!=2){
                    this.listLayer.get(2).listShape.add(str);
                    temp.listShape.remove(j);
                    j--;
                }

                if(str.contains("Tringle")&&i!=3){
                    this.listLayer.get(3).listShape.add(str);
                    temp.listShape.remove(j);
                    j--;
                }

                if(str.contains("Hexagon")&&i!=4){
                    this.listLayer.get(4).listShape.add(str);
                    temp.listShape.remove(j);
                    j--;
                }
            }
        }
    }

}

