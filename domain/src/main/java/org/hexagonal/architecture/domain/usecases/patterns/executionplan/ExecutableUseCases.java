package org.hexagonal.architecture.domain.usecases.patterns.executionplan;

import org.hexagonal.architecture.domain.models.Order;

@FunctionalInterface
public interface ExecutableUseCases {
    void apply(Order order);
}
