package week1;

import java.util.*;



public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    Student[] students  = new Student[100];
    public int cout = 0;

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return (s1.get_Gr().equals(s2.get_Gr()));
    }

    void studentsByGroup() {
        // TODO:
        Map<String,List<Student>> student_by_group = new HashMap<String,List<Student>>();
        for (int i = 0 ; i < cout; i++) {
            Student student = students[i];
                String key = student.get_Gr();
                if (student_by_group.containsKey(key)) {
                    List<Student> students_has_same_key = student_by_group.get(key);
                    students_has_same_key.add(student);
                } else {
                    List<Student> students_has_same_key = new ArrayList<Student>();
                    students_has_same_key.add(student);
                    student_by_group.put(key, students_has_same_key);
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
        boolean check = false;
        List<Student> result= new ArrayList<Student>();
        for (int i = 0 ; i < cout; i ++ ){
            if (!students[i].get_Sid().equals(id)) {
                result.add(students[i]);

            }
        }
        if (result.size() != cout ) check = true;
        students = result.toArray(students);
        if (check == true) cout--;
        else
            System.out.println("Khong ton tai sinh vien ay");

    }

    public static void main(String[] args) {
        // TODO:
        Student s1 = new Student("Hoang Anh Tuan","16021210","tuan.a.hoang.1998@gmail.com");
        Student s2 = new Student("Hoang Em Tuan","123","tuan.a.hoang.1999@gmail.com");
        Student s3 = new Student("Tobiichi Origami","12345678","tobiichi@gmail.com");
        Student s4 = new Student("Pham Thi TA","12345","ta@gmail.com");
        Student s5 = new Student("nguyen van a","1234679","a@gmail.com");
        s3.set_Gr("K61C-CLC");
        s4.set_Gr("k62CC");
        Student s6 = new Student();
        StudentManagement sm = new StudentManagement();
        sm.students[0] = s1;
        sm.cout ++;
        sm.students[1] = s2;
        sm.cout ++;
        sm.students[2] = s3;
        sm.cout ++;
        sm.students[3] =s4;
        sm.cout ++;
        sm.students[4]=s5;
        sm.cout ++;
        sm.students[5] = s6;
        sm.cout++;
        System.out.println("Test sameGroup :");
        System.out.println(sm.sameGroup(s1,s2));
        System.out.println(sm.sameGroup(s2,s3));
        System.out.println(sm.sameGroup(s3,s1));

        System.out.println("Test student by group :");
        sm.studentsByGroup();
        System.out.println("Test remove: ");
        sm.removeStudent("16021210");

        System.out.println("Danh sach hien tai la :");
        for (int i = 0 ; i < sm.cout; i ++){
            System.out.println(sm.students[i].getInfo());

        }

    }
}
