package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if (m >n) return m ;
        return n;
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        if (array.length == 0 || array.length > 100)  return 0;
        int min = array[0];
        if (array.length > 1 ) {
            for (int i = 1; i <array.length;i++)
                if (min >array[i])  min = array[i];
        }
        return  min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        if (height <= 0 ) return null;
        double bmi = weight /(height *height);
        if (bmi < 18.5) return "Thiếu cân";
        if (18.5 <= bmi  && bmi<=22.99) return "Bình thường";
        if (23<=bmi  && bmi<= 24.99) return "Thừa cân";
        if (bmi > 25) return "Béo phì";
        return null;
    }
    public static void main(String[] args){

    }

}
