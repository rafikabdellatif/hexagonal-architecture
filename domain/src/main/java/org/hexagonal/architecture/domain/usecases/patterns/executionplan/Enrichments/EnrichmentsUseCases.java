package org.hexagonal.architecture.domain.usecases.patterns.executionplan.Enrichments;

import org.hexagonal.architecture.domain.models.Order;
import org.hexagonal.architecture.domain.usecases.patterns.executionplan.ExecutableUseCases;

@FunctionalInterface
public interface EnrichmentsUseCases extends ExecutableUseCases {
    void apply(Order order);
}
