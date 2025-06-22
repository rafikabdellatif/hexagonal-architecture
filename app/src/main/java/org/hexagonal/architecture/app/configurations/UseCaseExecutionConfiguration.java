package org.hexagonal.architecture.app.configurations;

import org.hexagonal.architecture.domain.models.executionplan.ExecutionPlan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.hexagonal.architecture.domain.models.executionplan.UseCaseName.*;

@Configuration
public class UseCaseExecutionConfiguration {

    @Bean
    public ExecutionPlan executionPlan() {
        return new ExecutionPlan.Builder()
                .addParallelBatches(ENRICH_A, ENRICH_B, ENRICH_C)
                .addSequentialBatches(CONTROL_A, CONTROL_B, CONTROL_C)
                .addParallelBatches(PROCESS_A, PROCESS_B, PROCESS_C)
                .build();
    }
}
