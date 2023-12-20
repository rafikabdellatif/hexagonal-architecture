package org.hexagonal.architecture.domain.ports;

import org.hexagonal.architecture.domain.models.Order;

import java.util.Optional;
import java.util.Set;

public interface OrderPort {
    Set<Order> getAll();

    Optional<Order> get(Long orderId);

    Order save(Order order);
}
