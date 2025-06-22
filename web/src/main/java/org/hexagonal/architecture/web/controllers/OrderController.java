package org.hexagonal.architecture.web.controllers;

import lombok.RequiredArgsConstructor;
import org.hexagonal.architecture.domain.usecases.AddOrderUseCase;
import org.hexagonal.architecture.domain.usecases.GetAllOrdersUseCase;
import org.hexagonal.architecture.domain.usecases.GetOrderUseCase;


import org.hexagonal.architecture.domain.usecases.patterns.executionplan.PlanExecutorUseCase;
import org.hexagonal.architecture.rest.api.controllers.OrderApi;
import org.hexagonal.architecture.rest.api.dtos.OrderDto;
import org.hexagonal.architecture.web.mappers.OrderMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class OrderController implements OrderApi {

    private final PlanExecutorUseCase planExecutorUseCase;
    private final AddOrderUseCase addOrderUseCase;
    private final GetOrderUseCase getOrderUseCase;
    private final GetAllOrdersUseCase getAllOrdersUseCase;
    private final OrderMapper mapper;

    @Override
    public ResponseEntity<OrderDto> addOrder(final OrderDto orderDto) {
        return ResponseEntity.ok(mapper.toDto(addOrderUseCase.apply(mapper.toModel(orderDto))));
    }

    @Override
    public ResponseEntity<Void> checkOrder(OrderDto orderDto) {
        planExecutorUseCase.execute(mapper.toModel(orderDto));
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<OrderDto> getOrder(final Long orderId) {
        return ResponseEntity.ok(mapper.toDto(getOrderUseCase.apply(orderId)));
    }

    @Override
    public ResponseEntity<List<OrderDto>> listOfOrders() {
        return getAllOrdersUseCase.apply().stream()
                .map(mapper::toDto)
                .collect(Collectors.collectingAndThen(Collectors.toList(), ResponseEntity::ok));
    }
}
