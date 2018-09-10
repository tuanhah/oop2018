package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String n;
    private String sid;
    private String em;
    private String gr;


    // TODO: khai báo các phương thức getter, setter cho Student
    public String get_Name(){
        return this.n;
    }
    public String get_Sid(){
        return this.sid;
    }
    public String get_Em(){
        return this.em;
    }
    public String get_Gr(){return this.gr;}
    public void set_Name(String n){
        this.n = n;
    }
    public void set_Sid(String sid){
        this.sid = sid;
    }
    public void set_Em(String em){
        this.em = em;
    }
    public  void  set_Gr(String gr) {this.gr = gr; }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        this.n  = null;
        this.sid= null;
        this.em = null;
        this.gr = null;
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
        this.gr = s.gr;
    }

    String getInfo() {
        // TODO:
        String result =this.n + " " +this.sid +" " +this.gr + " " + this.em;
        return  result;
    }
}
