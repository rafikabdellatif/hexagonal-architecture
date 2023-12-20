package org.hexagonal.architecture.app.configurations;

import org.hexagonal.architecture.domain.ports.OrderPort;
import org.hexagonal.architecture.domain.usecases.AddOrderUseCase;
import org.hexagonal.architecture.domain.usecases.GetAllOrdersUseCase;
import org.hexagonal.architecture.domain.usecases.GetOrderUseCase;
import org.hexagonal.architecture.domain.usecases.impl.GetAllOrdersUseCaseImpl;
import org.hexagonal.architecture.domain.usecases.impl.GetOrderUseCaseImpl;
import org.hexagonal.architecture.domain.usecases.impl.AddOrderUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class UseCaseConfiguration {

    @Bean
    AddOrderUseCase addOrderUseCase(final OrderPort orderPort) {
        return new AddOrderUseCaseImpl(orderPort);
    }

    @Bean
    GetOrderUseCase getOrderUseCase(final OrderPort orderPort) {
        return new GetOrderUseCaseImpl(orderPort);
    }

    @Bean
    GetAllOrdersUseCase getAllOrdersUseCase(final OrderPort orderPort) {
        return new GetAllOrdersUseCaseImpl(orderPort);
    }

}
