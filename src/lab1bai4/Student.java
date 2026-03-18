package lab1bai4;

public class Student {
    protected String id;
    protected String name;
    protected double score;

    public Student(String id, String name, double score) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID không được để trống!");
        }
        if (score < 0) {
            throw new IllegalArgumentException("Điểm phải >= 0!");
        }
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public double score() {
        return score;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - Điểm: " + score();
    }
}