package Composite;

import java.time.LocalDate;

public record Qualification(LocalDate creationDate, EvaluationCriteria evaluationCriteria,
                            EvaluationItem evaluationItem, Document document) {
}
