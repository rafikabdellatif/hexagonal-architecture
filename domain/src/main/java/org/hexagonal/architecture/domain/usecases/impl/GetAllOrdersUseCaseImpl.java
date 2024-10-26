package org.hexagonal.architecture.domain.usecases.impl;

import jdk.jfr.Registered;
import lombok.RequiredArgsConstructor;
import org.hexagonal.architecture.domain.annotations.UseCase;
import org.hexagonal.architecture.domain.models.Order;
import org.hexagonal.architecture.domain.ports.OrderPort;
import org.hexagonal.architecture.domain.usecases.GetAllOrdersUseCase;

import java.util.Set;

@UseCase
@RequiredArgsConstructor
public class GetAllOrdersUseCaseImpl implements GetAllOrdersUseCase {

    private final OrderPort port;

    @Override
    public Set<Order> apply() {
        return port.getAll();
    }
}
