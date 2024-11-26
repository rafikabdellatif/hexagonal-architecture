package org.hexagonal.architecture.domain.usecases.patterns.executionplan.Enrichments;

import lombok.extern.slf4j.Slf4j;
import org.hexagonal.architecture.domain.annotations.UseCase;
import org.hexagonal.architecture.domain.models.Order;
import org.hexagonal.architecture.domain.models.executionplan.UseCaseName;

@Slf4j
@UseCase(name = UseCaseName.ENRICH_C)
public class EnrichC implements EnrichmentsUseCases {

    @Override
    public void apply(final Order order) {
        log.info("Enrichment C");
    }

}
