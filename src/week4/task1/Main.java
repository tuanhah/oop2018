package week4.task1;

public class Main {
    public static void main(String[] args){
        HoaQua qua1 = new HoaQua();
        QuaCam quaCam = new QuaCam();
        QuaTao quaTao = new QuaTao();
        CamThanhPhong camThanhPhong = new CamThanhPhong();
        CamSanh camSanh = new CamSanh();
        qua1.print();
        qua1.setXuatxu("Ha noi");
        qua1.printXuatxu();

        quaCam.print();
        quaCam.setPrice("12");
        quaCam.printGia();

        quaTao.print();
        quaTao.setPrice("123");
        quaTao.printGia();

        camThanhPhong.print();
        camThanhPhong.setHuongvi("tot");
        camThanhPhong.printHuongvi();

        camSanh.print();
        camSanh.setHuongvi("kha");
        camSanh.printHuongvi();
    }
}
