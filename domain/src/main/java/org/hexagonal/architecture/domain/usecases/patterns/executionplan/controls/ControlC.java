package org.hexagonal.architecture.domain.usecases.patterns.executionplan.controls;

import lombok.extern.slf4j.Slf4j;
import org.hexagonal.architecture.domain.annotations.UseCase;
import org.hexagonal.architecture.domain.models.Order;
import org.hexagonal.architecture.domain.models.executionplan.UseCaseName;

@Slf4j
@UseCase(name = UseCaseName.CONTROL_C)
public class ControlC implements ControlsUseCases {

    @Override
    public void apply(final Order order) {
        log.info("Executing order {}", order);
    }

}
