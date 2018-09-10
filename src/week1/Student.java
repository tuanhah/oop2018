package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String n;
    private String sid;
    private String em; 

    // TODO: khai báo các phương thức getter, setter cho Student
    public get_N(){
        return this.n;
    }
    public get_Sid(){
        return this.sid;
    }
    public get_Em(){
        return this.em;
    }
    public set_N(String n){
        this.n = n;
    }
    public set_Sid(String sid){
        this.sid = sid;
    }
    public set_Em(String em){
        this.em = em;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        this.n  = null;
        this.sid= null;
        this.em = null;
    }   

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        this.n  = n;
        this.sid= sid;
        this.em = em;
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        this.n  = s.n;
        this.sid= s.sid;
        this.em = s.em;
    }

    String getInfo() {
        // TODO:
        System.out.println("n : " + n);
        System.out.println("sid : " + sid);
        System.out.println("em : " + em);

    }
}
