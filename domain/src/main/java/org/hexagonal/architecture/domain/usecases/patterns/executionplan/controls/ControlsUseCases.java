package org.hexagonal.architecture.domain.usecases.patterns.executionplan.controls;

import org.hexagonal.architecture.domain.models.Order;
import org.hexagonal.architecture.domain.usecases.patterns.executionplan.ExecutableUseCases;

@FunctionalInterface
public interface ControlsUseCases extends ExecutableUseCases {
    void apply(Order order);
}
