package lab1bai1;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("P1", "Áo", 100));
        list.add(new Product("P2", "Quần", 200));
        list.add(new ImportedProduct("P3", "Giày nhập", 300, 0.1, 20));
        list.add(new ImportedProduct("P4", "Túi nhập", 400, 0.15, 30));
        list.add(new Product("P5", "Nón", 50));

        Product max = list.get(0);

        for (Product p : list) {
            System.out.println(p);
            if (p.finalPrice() > max.finalPrice()) {
                max = p;
            }
        }

        System.out.println("Sản phẩm giá cao nhất: " + max);
    }
}