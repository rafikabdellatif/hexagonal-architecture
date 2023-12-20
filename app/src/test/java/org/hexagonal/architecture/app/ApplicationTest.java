package org.hexagonal.architecture.app;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RequiredArgsConstructor
@ActiveProfiles({"localhost"})
class ApplicationTest {

    private final ApplicationContext applicationContext;

    @Test
    void testContext() {
        // Test if app can boot
        assertNotNull(applicationContext);
    }
}