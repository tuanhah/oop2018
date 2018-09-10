package week1;

import java.util.*;


public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] students = new Student[100]; 

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return (s1.sid == s2.sid);
    }

    void studentsByGroup() {
        // TODO:
        Map<String,List<Student>> student_by_group = new Map<String,List<Student>>();
        for (Student student : students){
            String key = student.sid;
            if (student_by_group.containsKey(key)){
                List<Student> students_has_same_key = student_by_group.get(key);
                students_has_same_key.add(student);
            }
            else{
                List<Student> students_has_same_key = new List<Studen>();
                students_has_same_key.add(student);
                student_by_group.put(key,students_has_same_key);
            }
        }
    }

    void removeStudent(String id) {
        // TODO:

    }

    public static void main(String[] args) {
        // TODO:
        Student s1 = new Student("Hoang Anh Tuan","K61C-CLC","tuan.a.hoang.1998@gmail.com");
        Student s2 = new Student("Hoang Em Tuan","K61C-CLC","tuan.a.hoang.1999@gmail.com");
        System.out.println(sameGroup(s1,s2));
    }
}
