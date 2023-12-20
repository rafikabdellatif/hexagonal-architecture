package org.hexagonal.architecture.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hexagonal.architecture.domain.models.OrderStatus;

@Getter
@Setter
@Entity
@Table(name = "T_ORDER")
public class OrderEty {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", nullable = false)
    private OrderStatus status;
}
