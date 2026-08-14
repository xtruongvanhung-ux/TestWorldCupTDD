package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class TestWorldCupTDDTest {

    // TC-T023 - TestWorldCupTDD can be instantiated.
    @Test
    void TC_T023_shouldCreateApplicationObject() {
        assertDoesNotThrow(TestWorldCupTDD::new);
    }

    // TC-T024 - TestWorldCupTDD main method can execute.
    @Test
    void TC_T024_shouldRunMainMethod() {
        assertDoesNotThrow(() -> TestWorldCupTDD.main(new String[0]));
    }
}