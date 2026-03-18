package lab1bai4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new GoodStudent("S01", "Nguyễn Văn An", 8.5, 1.0));
        list.add(new GoodStudent("S02", "Trần Thị Bình", 9.0, 0.5));
        list.add(new WeakStudent("S03", "Lê Văn Cường", 4.0, 1.5));
        list.add(new WeakStudent("S04", "Phạm Hồng Dũng", 3.5, 1.0));
        list.add(new Student("S05", "Hoàng Gia Bảo", 7.0));

        // 1. In danh sách
        System.out.println("--- DANH SÁCH HỌC SINH ---");
        for (Student s : list) {
            System.out.println(s);
        }

        // 2. Tìm học sinh có điểm trung bình cao nhất
        Student topStudent = list.get(0);
        for (Student s : list) {
            if (s.score() > topStudent.score()) {
                topStudent = s;
            }
        }

        System.out.println("\n--- HỌC SINH CÓ ĐIỂM CAO NHẤT ---");
        System.out.println(topStudent);
    }
}