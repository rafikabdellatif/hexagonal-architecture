package org.hexagonal.architecture.app;

import lombok.extern.slf4j.Slf4j;
import org.hexagonal.architecture.persistence.PersistenceAdapter;
import org.hexagonal.architecture.web.WebAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Slf4j
@SpringBootApplication
@Import({WebAdapter.class, PersistenceAdapter.class})
public class Application {
    public static void main(String[] args) {
        log.info("Application started");
        SpringApplication.run(Application.class, args);
    }
}
