package org.hexagonal.architecture.domain.usecases.patterns.executionplan.processes;

import lombok.extern.slf4j.Slf4j;
import org.hexagonal.architecture.domain.annotations.UseCase;
import org.hexagonal.architecture.domain.models.Order;
import org.hexagonal.architecture.domain.models.executionplan.UseCaseName;

@Slf4j
@UseCase(name = UseCaseName.PROCESS_C)
public class ProcessC implements ProcessesUseCases {

    @Override
    public void apply(Order order) {
        log.info("Processing ProcessC");
    }

}
