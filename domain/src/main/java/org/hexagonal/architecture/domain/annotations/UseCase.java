package org.hexagonal.architecture.domain.annotations;

import org.hexagonal.architecture.domain.models.executionplan.UseCaseName;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static org.hexagonal.architecture.domain.models.executionplan.UseCaseName.SPRING_BEAN;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    UseCaseName name() default SPRING_BEAN;
}