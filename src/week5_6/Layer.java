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
    protected ArrayList<String> listShape = new ArrayList<String>();

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
        for(int i=0;i<this.listShape.size();i++){
            if(this.listShape.get(i).contains("Tringle")==true){
                this.listShape.remove(i);
                i--;
            }
        }
    }

    public void deleteCircle(){
        for(int i=0;i<this.listShape.size();i++){
            if(this.listShape.get(i).contains("Circle")==true){
                this.listShape.remove(i);
                i--;
            }
        }
    }

    //Vẽ hình trong Layer
    public void drawShape(){

        for(String temp : this.listShape){
            System.out.println(temp);

        }
        System.out.println("\n");
    }


}