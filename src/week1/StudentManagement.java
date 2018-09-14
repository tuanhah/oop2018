package week1;

import java.util.*;


public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    List<Student> students  = new ArrayList<Student>();

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return (s1.get_Gr() == s2.get_Gr());
    }

    void studentsByGroup() {
        // TODO:
        Map<String,List<Student>> student_by_group = new HashMap<String,List<Student>>();
        for (Student student : students){
            String key = student.get_Gr();
            if (student_by_group.containsKey(key)){
                List<Student> students_has_same_key = student_by_group.get(key);
                students_has_same_key.add(student);
            }
            else{
                List<Student> students_has_same_key = new ArrayList<Student>();
                students_has_same_key.add(student);
                student_by_group.put(key,students_has_same_key);
            }
        }
        Set<String> list_key = new HashSet<String>();
        list_key = student_by_group.keySet();
        for (String _key : list_key) {
            System.out.println(_key + ":");
            List<Student> list_student = new ArrayList<Student>();
            list_student = student_by_group.get(_key);
            for (Student st : list_student) {
                System.out.println(st.getInfo());

            }
        }


    }

    void removeStudent(String id) {
        // TODO:
        if (students.isEmpty()) return;
        for (Student st : students){
            if (st.get_Sid() == id) {
                students.remove(st);
                break;
            }
        }

    }

    public static void main(String[] args) {
        // TODO:
        Student s1 = new Student("Hoang Anh Tuan","16021210","tuan.a.hoang.1998@gmail.com");
        Student s2 = new Student("Hoang Em Tuan","123","tuan.a.hoang.1999@gmail.com");
        Student s3 = new Student("Tobiichi Origami","12345678","tobiichi@gmail.com");
        Student s4 = new Student("Pham Thi TA","12345","ta@gmail.com");
        Student s5 = new Student();
//        s1.set_Gr("K61C-CLC");
//        s2.set_Gr("K62C-CLC");
//        s3.set_Gr("K61C-CLC");
        s3.set_Gr(null);
        StudentManagement sm = new StudentManagement();
        System.out.println("Test sameGroup :");
        System.out.println(sm.sameGroup(s1,s2));
        System.out.println(sm.sameGroup(s2,s3));
        System.out.println(sm.sameGroup(s3,s1));
        sm.students.add(s1);
        sm.students.add(s2);
        sm.students.add(s3);
        sm.students.add(s4);
        sm.students.add(s5);
        System.out.println("Test student by group :");
        sm.studentsByGroup();
        System.out.println("Test remove: ");
        sm.removeStudent("16021210");
        for (Student st : sm.students){
            System.out.println(st.getInfo());
        }
    }
}
