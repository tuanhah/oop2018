package week4.task1;

public class CamThanhPhong extends QuaCam{
    //huong vi
    private String huongvi;
    //chat luong cua qua cam
    private String chatluong;
    //getter+setter

    //get chatluong
    public String getChatluong() {
        return chatluong;
    }
    // get huong vi
    public String getHuongvi() {
        return huongvi;
    }
    //set chat luong
    public void setChatluong(String chatluong) {
        this.chatluong = chatluong;
    }
    //set huong vi
    public void setHuongvi(String huongvi) {
        this.huongvi = huongvi;
    }
    //2 phuong thuc
    public void print(){
        System.out.println("day la qua cam thanh phong");
    }
    public void printHuongvi(){
        System.out.println(" huong vi la : " + huongvi);
    }
}
