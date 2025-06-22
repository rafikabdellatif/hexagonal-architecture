package org.hexagonal.architecture.domain.usecases.patterns.executionplan.processes;

import org.hexagonal.architecture.domain.models.Order;
import org.hexagonal.architecture.domain.usecases.patterns.executionplan.ExecutableUseCases;

@FunctionalInterface
public interface ProcessesUseCases extends ExecutableUseCases {
    void apply(Order order);
}
