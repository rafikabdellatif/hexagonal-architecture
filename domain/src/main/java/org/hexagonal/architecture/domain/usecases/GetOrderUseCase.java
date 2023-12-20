package org.hexagonal.architecture.domain.usecases;

import org.hexagonal.architecture.domain.models.Order;

@FunctionalInterface
public interface GetOrderUseCase {
    Order apply(Long orderId);
}
