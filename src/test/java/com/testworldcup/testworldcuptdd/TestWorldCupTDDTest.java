package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class TestWorldCupTDDTest {

    // TC215 - TestWorldCupTDD can be instantiated.
    @Test
    void TC215_shouldCreateApplicationObject() {
        assertDoesNotThrow(TestWorldCupTDD::new);
    }

    // TC216 - TestWorldCupTDD main method can execute.
    @Test
    void TC216_shouldRunMainMethod() {
        assertDoesNotThrow(() -> TestWorldCupTDD.main(new String[0]));
    }
}