package lab1bai2;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new FullTimeEmployee("E1", "An", 500, 100, 50));
        list.add(new FullTimeEmployee("E2", "Bình", 600, 150, 30));
        
        
        try {
            list.add(new FullTimeEmployee("", "Cường", 500, 100, 50)); // lỗi ID
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        try {
            list.add(new FullTimeEmployee("E3", "Dũng", -100, 50, 10)); // lỗi lương
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        Employee max = list.get(0);

        for (Employee e : list) {
            System.out.println(e);
            if (e.income() > max.income()) {
                max = e;
            }
        }

        System.out.println("Nhân viên thu nhập cao nhất: " + max);
    }
}