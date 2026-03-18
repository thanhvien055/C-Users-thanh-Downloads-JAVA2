package lab1bai2;

public class Employee {
    private String id;
    private String name;
    private double basicSalary;

    public Employee(String id, String name, double basicSalary) {
        setId(id);
        this.name = name;
        setBasicSalary(basicSalary);
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID không rỗng");
        }
        this.id = id;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary < 0) {
            throw new IllegalArgumentException("Lương >= 0");
        }
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double income() {
        return basicSalary; // FIX lỗi thiếu return
    }

    @Override
    public String toString() {
        return id + " - " + name + " - Thu nhập: " + income(); // FIX lỗi thiếu return
    }
}