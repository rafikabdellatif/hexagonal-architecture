package org.hexagonal.architecture.domain.usecases;

import org.hexagonal.architecture.domain.models.Order;

@FunctionalInterface
public interface AddOrderUseCase {
    Order apply(Order order);
}
