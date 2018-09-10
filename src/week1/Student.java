package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String n;
    private String sid;
    private String em; 

    // TODO: khai báo các phương thức getter, setter cho Student
    public getN(){
        return this.n;
    }
    public getSid(){
        return this.sid;
    }
    
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    String getInfo() {
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
}
