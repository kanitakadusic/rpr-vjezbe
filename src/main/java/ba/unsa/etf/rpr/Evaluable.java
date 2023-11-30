package ba.unsa.etf.rpr;

import java.util.ArrayList;

public interface Evaluable {
    void addEvaluation(Evaluation evaluation);
    void resetEvaluations();
    ArrayList<Evaluation> getEvaluations();
}
