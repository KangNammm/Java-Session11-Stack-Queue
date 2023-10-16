package BT;

import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Comparator<Student> comparator = new DemoComparator();

        // Thêm sinh viên vào danh sách
        studentList.add(new Student(4, "Dương", 20, true));
        studentList.add(new Student(3, "Xuân", 19, true));
        studentList.add(new Student(2, "Anh", 21, false));
        studentList.add(new Student(1, "Tú", 22, true));

        // Sắp xếp danh sách theo tên
        Collections.sort(studentList, comparator);

        // Hiển thị danh sách sinh viên
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}

