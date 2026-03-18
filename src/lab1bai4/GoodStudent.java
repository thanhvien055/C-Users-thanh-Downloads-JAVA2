package lab1bai4;

class GoodStudent extends Student {
    private double bonus;

    public GoodStudent(String id, String name, double score, double bonus) {
        super(id, name, score);
        if (bonus < 0) throw new IllegalArgumentException("Bonus phải >= 0");
        this.bonus = bonus;
    }

    @Override
    public double score() {
        return score + bonus;
    }
}