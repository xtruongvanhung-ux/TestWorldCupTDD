package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    // TC191 - Player stores and returns the player name.
    @Test
    void TC191_shouldReturnPlayerName() {
        Player player = new Player("Player 1");

        assertEquals("Player 1", player.getName());
    }
}