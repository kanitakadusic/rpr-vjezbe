package ba.unsa.etf.rpr;

public class Evaluation {
    private final Pearson pearson;
    private int grade;

    public Evaluation(Pearson pearson, int grade) throws IllegalArgumentException {
        this.pearson = pearson;
        setGrade(grade);
    }

    public Pearson getPearson() {
        return pearson;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) throws IllegalArgumentException {
        if (grade < 1 || grade > 10) throw new IllegalArgumentException("Illegal grade value");
        this.grade = grade;
    }
}
