package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Subject implements Printable {
    private String name, description;
    private ArrayList<Evaluation> evaluations;

    public Subject(String name) {
        this.name = name;
        evaluations = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getInfo() {
        return getName() + " " + getDescription();
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
