package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Teacher extends Pearson implements Printable, CanEvaluate {
    private String title;
    private ArrayList<Evaluation> evaluations;

    public Teacher(String name, String surname, String title) {
        super(name, surname);
        this.title = title;
        evaluations = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + getTitle();
    }

    public void addEvaluation(Evaluation evaluation) {
        evaluations.add(evaluation);
    }

    public void resetEvaluations() {
        evaluations.clear();
    }

    public ArrayList<Evaluation> getEvaluations() {
        return evaluations;
    }
}
