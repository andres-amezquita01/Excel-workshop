package Composite;

import java.util.ArrayList;
import java.util.List;

public class EvaluationCriteriaImp implements EvaluationCriteria {
    private String name;
    private String description;
    private double percentage;
    private List<EvaluationCriteria> internalEvaluationCriteria;
    @Override
    public double calculate(double success) {
        return (success * percentage);
    }

    public void add( EvaluationCriteria evaluationCriteria){
        if(this.internalEvaluationCriteria == null){
            this.internalEvaluationCriteria = new ArrayList<>();
        }
        this.internalEvaluationCriteria.add(evaluationCriteria);
    }
}
