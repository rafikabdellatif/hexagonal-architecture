package org.hexagonal.architecture.app.configurations;

import org.hexagonal.architecture.domain.models.executionplan.ExecutionPlan;
import org.hexagonal.architecture.domain.models.executionplan.UseCaseName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.hexagonal.architecture.domain.models.executionplan.UseCaseName.*;

@Configuration
public class UseCaseExecutionConfiguration {

    @Bean
    public ExecutionPlan executionPlan() {
        return new ExecutionPlan.Builder()
                .addParallelBatch(ENRICH_A, ENRICH_B, ENRICH_C)
                .addSequentialBatch(CONTROL_A, CONTROL_B, CONTROL_C)
                .addParallelBatch(PROCESS_A, PROCESS_B, PROCESS_C)
                .build();
    }
}
