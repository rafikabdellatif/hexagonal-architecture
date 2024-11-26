package org.hexagonal.architecture.domain.models.executionplan;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ExecutionBatch {
    private List<UseCaseName> useCases;
    private boolean parallel;
}
