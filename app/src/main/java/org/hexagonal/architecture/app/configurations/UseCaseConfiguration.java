package org.hexagonal.architecture.app.configurations;

import org.hexagonal.architecture.domain.annotations.UseCase;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = "org.hexagonal.architecture.domain",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = UseCase.class)
)
public class UseCaseConfiguration {
}
