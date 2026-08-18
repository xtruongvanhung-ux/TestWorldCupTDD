package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    // TC195 - Team has a valid country name.
    @Test
    void TC195_shouldAcceptCountryName() {
        Team team = new Team();

        team.setCountryName("Vietnam");

        assertEquals("Vietnam", team.getCountryName());
    }

    // TC196 - Team has one head coach.
    @Test
    void TC196_shouldAcceptOneHeadCoach() {
        Team team = new Team();

        team.setHeadCoach("Coach 1");

        assertEquals("Coach 1", team.getHeadCoach());
    }

    // TC197 - Team has 3 assistant coaches.
    @Test
    void TC197_shouldAcceptThreeAssistantCoaches() {
        Team team = new Team();

        for (int i = 1; i <= 3; i++) {
            team.addAssistantCoach("Assistant " + i);
        }

        assertTrue(team.isAssistantCoachCountValid());
    }

    // TC198 - Team has 4 assistant coaches.
    @Test
    void TC198_shouldRejectFourAssistantCoaches() {
        Team team = new Team();

        for (int i = 1; i <= 4; i++) {
            team.addAssistantCoach("Assistant " + i);
        }

        assertFalse(team.isAssistantCoachCountValid());
    }

    // TC199 - Team has 2 assistant coaches.
    @Test
    void TC199_shouldAcceptTwoAssistantCoaches() {
        Team team = new Team();

        for (int i = 1; i <= 2; i++) {
            team.addAssistantCoach("Assistant " + i);
        }

        assertTrue(team.isAssistantCoachCountValid());
    }

    // TC200 - Team has 22 players.
    @Test
    void TC200_shouldAccept22Players() {
        Team team = new Team();

        for (int i = 1; i <= 22; i++) {
            team.addPlayer(new Player("Player " + i));
        }

        assertTrue(team.isPlayerCountValid());
    }

    // TC201 - Team has 23 players.
    @Test
    void TC201_shouldReject23Players() {
        Team team = new Team();

        for (int i = 1; i <= 23; i++) {
            team.addPlayer(new Player("Player " + i));
        }

        assertFalse(team.isPlayerCountValid());
    }

    // TC202 - Team has 21 players.
    @Test
    void TC202_shouldAccept21Players() {
        Team team = new Team();

        for (int i = 1; i <= 21; i++) {
            team.addPlayer(new Player("Player " + i));
        }

        assertTrue(team.isPlayerCountValid());
    }

    // TC203 - Official lineup has 7 players.
    @Test
    void TC203_shouldAcceptSevenStartingPlayers() {
        Team team = new Team();

        for (int i = 1; i <= 7; i++) {
            team.addStartingPlayer(new Player("Player " + i));
        }

        assertTrue(team.isStartingPlayerCountValid());
    }

    // TC204 - Official lineup has 11 players.
    @Test
    void TC204_shouldAcceptElevenStartingPlayers() {
        Team team = new Team();

        for (int i = 1; i <= 11; i++) {
            team.addStartingPlayer(new Player("Player " + i));
        }

        assertTrue(team.isStartingPlayerCountValid());
    }

    // TC205 - Official lineup has 6 players.
    @Test
    void TC205_shouldRejectSixStartingPlayers() {
        Team team = new Team();

        for (int i = 1; i <= 6; i++) {
            team.addStartingPlayer(new Player("Player " + i));
        }

        assertFalse(team.isStartingPlayerCountValid());
    }

    // TC206 - Official lineup has 12 players.
    @Test
    void TC206_shouldRejectTwelveStartingPlayers() {
        Team team = new Team();

        for (int i = 1; i <= 12; i++) {
            team.addStartingPlayer(new Player("Player " + i));
        }

        assertFalse(team.isStartingPlayerCountValid());
    }

    // TC207 - Team has 5 substitutes.
    @Test
    void TC207_shouldAcceptFiveSubstitutes() {
        Team team = new Team();

        for (int i = 1; i <= 5; i++) {
            team.addSubstitute(new Player("Substitute " + i));
        }

        assertTrue(team.isSubstituteCountValid());
    }

    // TC208 - Team has 6 substitutes.
    @Test
    void TC208_shouldRejectSixSubstitutes() {
        Team team = new Team();

        for (int i = 1; i <= 6; i++) {
            team.addSubstitute(new Player("Substitute " + i));
        }

        assertFalse(team.isSubstituteCountValid());
    }

    // TC209 - Team has 4 substitutes.
    @Test
    void TC209_shouldAcceptFourSubstitutes() {
        Team team = new Team();

        for (int i = 1; i <= 4; i++) {
            team.addSubstitute(new Player("Substitute " + i));
        }

        assertTrue(team.isSubstituteCountValid());
    }
    
    // TC210 - Get assistant coaches from team.
    @Test
    void TC210_shouldReturnAssistantCoaches() {
        Team team = new Team();

        team.addAssistantCoach("Assistant 1");

        assertEquals(1, team.getAssistantCoaches().size());
    }

    // TC211 - Get players from team.
    @Test
    void TC211_shouldReturnPlayers() {
        Team team = new Team();

        team.addPlayer(new Player("Player 1"));

        assertEquals(1, team.getPlayers().size());
    }

    // TC212 - Get starting players from team.
    @Test
    void TC212_shouldReturnStartingPlayers() {
        Team team = new Team();

        team.addStartingPlayer(new Player("Player 1"));

        assertEquals(1, team.getStartingPlayers().size());
    }

    // TC213 - Get substitutes from team.
    @Test
    void TC213_shouldReturnSubstitutes() {
        Team team = new Team();

        team.addSubstitute(new Player("Substitute 1"));

        assertEquals(1, team.getSubstitutes().size());
    }
    
    // TC214 - Team has 1 staff/caretaker.
    @Test
    void TC214_shouldAcceptOneStaffMember() {
        Team team = new Team();

        team.setStaffMember("Staff 1");

        assertEquals("Staff 1", team.getStaffMember());
    }
}