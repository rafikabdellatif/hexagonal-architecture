package org.hexagonal.architecture.domain.usecases;

import lombok.RequiredArgsConstructor;
import org.hexagonal.architecture.domain.annotations.UseCase;
import org.hexagonal.architecture.domain.models.Order;
import org.hexagonal.architecture.domain.ports.OrderPort;

@UseCase
@RequiredArgsConstructor
public class AddOrderUseCaseImpl implements AddOrderUseCase {

    private final OrderPort port;

    @Override
    public Order apply(Order order) {
        return port.save(order);
    }
}
