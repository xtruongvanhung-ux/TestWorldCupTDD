package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProjectSetupTest {

    @Test
    void junitShouldRun() {
        assertTrue(true);
    }
    
    // TC-T021 - JUnit test environment is available.
    @Test
    void TC_T021_shouldRunJUnitTestEnvironment() {
        assertTrue(true);
    }
    
    // TC-T022 - Project setup test class can be instantiated.
    @Test
    void TC_T022_shouldCreateProjectSetupTestObject() {
        ProjectSetupTest test = new ProjectSetupTest();

        assertNotNull(test);
    }
}