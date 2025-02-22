package org.hexagonal.architecture.domain.models.executionplan;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ExecutionPlan {

    private List<ExecutionBatch> batches;

    public ExecutionPlan(List<ExecutionBatch> batches) {
        this.batches = batches;
    }

    public static class Builder {
        private final List<ExecutionBatch> batches = new ArrayList<>();

        public Builder addSequentialBatches(UseCaseName... useCases) {
            batches.add(new ExecutionBatch(List.of(useCases), false));
            return this;
        }

        public Builder addParallelBatches(UseCaseName... useCases) {
            batches.add(new ExecutionBatch(List.of(useCases), true));
            return this;
        }

        public ExecutionPlan build() {
            return new ExecutionPlan(batches);
        }
    }

}
