package lab1bai4;

class WeakStudent extends Student {
    private double penalty;

    public WeakStudent(String id, String name, double score, double penalty) {
        super(id, name, score);
        if (penalty < 0) throw new IllegalArgumentException("Penalty phải >= 0");
        this.penalty = penalty;
    }

    @Override
    public double score() {
        return score - penalty;
    }
}