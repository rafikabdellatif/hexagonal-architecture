package org.hexagonal.architecture.domain.usecases;

import lombok.RequiredArgsConstructor;
import org.hexagonal.architecture.domain.annotations.UseCase;
import org.hexagonal.architecture.domain.models.Order;
import org.hexagonal.architecture.domain.ports.OrderPort;

@UseCase
@RequiredArgsConstructor
public class GetOrderUseCaseImpl implements GetOrderUseCase {

    private final OrderPort port;

    @Override
    public Order apply(final Long orderId) {
        return port.get(orderId).orElseThrow(RuntimeException::new);
    }
}
