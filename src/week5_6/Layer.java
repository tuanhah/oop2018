package week5_6;

import java.util.ArrayList;

/**
 *
 * @author
 */
class Layer {
    protected static String id;
    //biến lưu số hình chữ nhật trong Layer
    protected int countIdRectangle=0;
    //biến lưu số hình tròn trong Layer
    protected int countIdCircle=0;
    //biến lưu số hình vuông trong Layer
    protected int countIdSquare=0;
    //biến lưu số hình tam giác trong Layer
    protected int countIdTringle=0;
    //biến lưu số hình lục giác trong Layer
    protected int countIdHexagon=0;
    //danh sách lưu số hình trong 1 layer
    protected ArrayList<Shape> listShape = new ArrayList<Shape>();

    //danh sách lưu thông số các hình để phân biệt
    protected ArrayList<String> listDistinct = new ArrayList<String>();
    protected boolean visible= true;
    public Layer(){

    }
    //khởi tạo Layer thuộc Diagram d1
    public Layer(Diagram d1){
        id="Layer"+d1.countIdLayer;
        d1.countIdLayer++;
//        d1.listIdLayer.add(id);
        d1.listLayer.add(this);
    }

    //Xóa hình tam giác trong Layer
    public void deleteTringle(){
        for(int i=0;i<this.listDistinct.size();i++){
            Shape shape = this.listShape.get(i);
            if(this.listDistinct.get(i).contains("Tringle")==true){
                this.listShape.remove(shape);
                this.listDistinct.remove(this.listDistinct.get(i));
                i--;
            }
        }
    }

    public void deleteCircle(){
        for(int i=0;i<this.listDistinct.size();i++){
            Shape shape = this.listShape.get(i);
            if(this.listDistinct.get(i).contains("Circle")==true){
                this.listShape.remove(shape);
                this.listDistinct.remove(this.listDistinct.get(i));
                i--;
            }
        }
    }

    //Vẽ hình trong Layer
    public void drawShape(){

        for(String temp : this.listDistinct){
            System.out.println(temp);

        }
        System.out.println("\n");
    }


}