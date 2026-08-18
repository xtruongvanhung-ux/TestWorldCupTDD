package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProjectSetupTest {

    // TC192 - JUnit test environment is available.
    @Test
    void junitShouldRun() {
        assertTrue(true);
    }
    
    // TC193 - JUnit test environment is available.
    @Test
    void TC193_shouldRunJUnitTestEnvironment() {
        assertTrue(true);
    }
    
    // TC194 - Project setup test class can be instantiated.
    @Test
    void TC194_shouldCreateProjectSetupTestObject() {
        ProjectSetupTest test = new ProjectSetupTest();

        assertNotNull(test);
    }
}