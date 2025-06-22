package org.hexagonal.architecture.domain.usecases.patterns.executionplan;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hexagonal.architecture.domain.annotations.UseCase;
import org.hexagonal.architecture.domain.models.Order;
import org.hexagonal.architecture.domain.models.executionplan.ExecutionBatch;
import org.hexagonal.architecture.domain.models.executionplan.ExecutionPlan;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@UseCase
@RequiredArgsConstructor
public class PlanExecutorUseCase {

    private final List<ExecutableUseCases> useCases;
    private final ExecutionPlan executionPlan;

    public void execute(final Order order) {
        for (var batch : executionPlan.getBatches()) {
            if (batch.isParallel()) {
                executeParallel(order, batch);
            } else {
                executeSequential(order, batch);
            }
        }
    }

    private void executeParallel(final Order order, final ExecutionBatch batch) {
        useCases.stream()
                .filter(control -> batch.getUseCases().contains(control.getClass().getAnnotation(UseCase.class).name()))
                .parallel()
                .forEach(e -> e.apply(order));
    }

    private void executeSequential(final Order order, final ExecutionBatch batch) {
        useCases.stream()
                .filter(control -> batch.getUseCases().contains(control.getClass().getAnnotation(UseCase.class).name()))
                .forEach(e -> e.apply(order));
    }

}
