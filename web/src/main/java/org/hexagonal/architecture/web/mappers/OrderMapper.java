package org.hexagonal.architecture.web.mappers;

import org.hexagonal.architecture.domain.models.Order;
import org.hexagonal.architecture.rest.api.dtos.OrderDto;
import org.mapstruct.Mapper;

@Mapper
public interface OrderMapper {
    OrderDto toDto(Order order);

    Order toModel(OrderDto orderDto);
}
