package org.hexagonal.architecture.domain.models;

import lombok.Builder;
import lombok.Data;

@Builder
public record Order(Long id, OrderStatus status) {
}
