package org.hexagonal.architecture.domain.usecases;

import org.hexagonal.architecture.domain.models.Order;

import java.util.Set;

@FunctionalInterface
public interface GetAllOrdersUseCase {
    Set<Order> apply();
}
