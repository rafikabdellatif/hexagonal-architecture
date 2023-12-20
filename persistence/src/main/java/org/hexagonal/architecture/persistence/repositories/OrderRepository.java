package org.hexagonal.architecture.persistence.repositories;

import lombok.RequiredArgsConstructor;
import org.hexagonal.architecture.domain.models.Order;
import org.hexagonal.architecture.domain.ports.OrderPort;
import org.hexagonal.architecture.persistence.mappers.OrderEtyMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class OrderRepository implements OrderPort {

    private final OrderEtyMapper mapper;
    private final OrderRepositoryJPA repositoryJPA;

    @Override
    public Set<Order> getAll() {
        return repositoryJPA.findAll().stream().map(mapper::toModel).collect(Collectors.toSet());
    }

    @Override
    public Optional<Order> get(final Long orderId) {
        return repositoryJPA.findById(orderId).map(mapper::toModel);
    }

    @Override
    public Order save(final Order order) {
        return mapper.toModel(repositoryJPA.save(mapper.toEty(order)));
    }
}
