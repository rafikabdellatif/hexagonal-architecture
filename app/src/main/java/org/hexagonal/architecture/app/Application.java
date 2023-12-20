package org.hexagonal.architecture.app;

import org.hexagonal.architecture.persistence.PersistenceAdapter;
import org.hexagonal.architecture.web.WebAdapter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({WebAdapter.class, PersistenceAdapter.class})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
