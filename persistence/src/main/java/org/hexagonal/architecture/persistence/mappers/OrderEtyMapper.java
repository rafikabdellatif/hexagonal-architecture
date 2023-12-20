package org.hexagonal.architecture.persistence.mappers;

import org.hexagonal.architecture.domain.models.Order;
import org.hexagonal.architecture.persistence.entities.OrderEty;
import org.mapstruct.Mapper;

@Mapper
public interface OrderEtyMapper {
    OrderEty toEty(Order order);

    Order toModel(OrderEty orderEty);
}
