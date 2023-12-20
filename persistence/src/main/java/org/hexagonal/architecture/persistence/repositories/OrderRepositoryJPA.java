package org.hexagonal.architecture.persistence.repositories;

import org.hexagonal.architecture.persistence.entities.OrderEty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoryJPA extends JpaRepository<OrderEty, Long> {
}
