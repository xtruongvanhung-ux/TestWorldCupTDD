package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    // TC-P001 - Player stores and returns the player name.
    @Test
    void TC_P001_shouldReturnPlayerName() {
        Player player = new Player("Player 1");

        assertEquals("Player 1", player.getName());
    }
}