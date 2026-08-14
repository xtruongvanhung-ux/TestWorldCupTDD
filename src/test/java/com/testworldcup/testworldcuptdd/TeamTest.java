package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeamTest {

    // TC-T001 - Team has a valid country name.
    @Test
    void TC_T001_shouldAcceptCountryName() {
        Team team = new Team();

        team.setCountryName("Vietnam");

        assertEquals("Vietnam", team.getCountryName());
    }

    // TC-T002 - Team has one head coach.
    @Test
    void TC_T002_shouldAcceptOneHeadCoach() {
        Team team = new Team();

        team.setHeadCoach("Coach 1");

        assertEquals("Coach 1", team.getHeadCoach());
    }

    // TC-T003 - Team has 3 assistant coaches.
    @Test
    void TC_T003_shouldAcceptThreeAssistantCoaches() {
        Team team = new Team();

        for (int i = 1; i <= 3; i++) {
            team.addAssistantCoach("Assistant " + i);
        }

        assertTrue(team.isAssistantCoachCountValid());
    }

    // TC-T004 - Team has 4 assistant coaches.
    @Test
    void TC_T004_shouldRejectFourAssistantCoaches() {
        Team team = new Team();

        for (int i = 1; i <= 4; i++) {
            team.addAssistantCoach("Assistant " + i);
        }

        assertFalse(team.isAssistantCoachCountValid());
    }

    // TC-T005 - Team has 2 assistant coaches.
    @Test
    void TC_T005_shouldAcceptTwoAssistantCoaches() {
        Team team = new Team();

        for (int i = 1; i <= 2; i++) {
            team.addAssistantCoach("Assistant " + i);
        }

        assertTrue(team.isAssistantCoachCountValid());
    }

    // TC-T006 - Team has 22 players.
    @Test
    void TC_T006_shouldAccept22Players() {
        Team team = new Team();

        for (int i = 1; i <= 22; i++) {
            team.addPlayer(new Player("Player " + i));
        }

        assertTrue(team.isPlayerCountValid());
    }

    // TC-T007 - Team has 23 players.
    @Test
    void TC_T007_shouldReject23Players() {
        Team team = new Team();

        for (int i = 1; i <= 23; i++) {
            team.addPlayer(new Player("Player " + i));
        }

        assertFalse(team.isPlayerCountValid());
    }

    // TC-T008 - Team has 21 players.
    @Test
    void TC_T008_shouldAccept21Players() {
        Team team = new Team();

        for (int i = 1; i <= 21; i++) {
            team.addPlayer(new Player("Player " + i));
        }

        assertTrue(team.isPlayerCountValid());
    }

    // TC-T009 - Official lineup has 7 players.
    @Test
    void TC_T009_shouldAcceptSevenStartingPlayers() {
        Team team = new Team();

        for (int i = 1; i <= 7; i++) {
            team.addStartingPlayer(new Player("Player " + i));
        }

        assertTrue(team.isStartingPlayerCountValid());
    }

    // TC-T010 - Official lineup has 11 players.
    @Test
    void TC_T010_shouldAcceptElevenStartingPlayers() {
        Team team = new Team();

        for (int i = 1; i <= 11; i++) {
            team.addStartingPlayer(new Player("Player " + i));
        }

        assertTrue(team.isStartingPlayerCountValid());
    }

    // TC-T011 - Official lineup has 6 players.
    @Test
    void TC_T011_shouldRejectSixStartingPlayers() {
        Team team = new Team();

        for (int i = 1; i <= 6; i++) {
            team.addStartingPlayer(new Player("Player " + i));
        }

        assertFalse(team.isStartingPlayerCountValid());
    }

    // TC-T012 - Official lineup has 12 players.
    @Test
    void TC_T012_shouldRejectTwelveStartingPlayers() {
        Team team = new Team();

        for (int i = 1; i <= 12; i++) {
            team.addStartingPlayer(new Player("Player " + i));
        }

        assertFalse(team.isStartingPlayerCountValid());
    }

    // TC-T013 - Team has 5 substitutes.
    @Test
    void TC_T013_shouldAcceptFiveSubstitutes() {
        Team team = new Team();

        for (int i = 1; i <= 5; i++) {
            team.addSubstitute(new Player("Substitute " + i));
        }

        assertTrue(team.isSubstituteCountValid());
    }

    // TC-T014 - Team has 6 substitutes.
    @Test
    void TC_T014_shouldRejectSixSubstitutes() {
        Team team = new Team();

        for (int i = 1; i <= 6; i++) {
            team.addSubstitute(new Player("Substitute " + i));
        }

        assertFalse(team.isSubstituteCountValid());
    }

    // TC-T015 - Team has 4 substitutes.
    @Test
    void TC_T015_shouldAcceptFourSubstitutes() {
        Team team = new Team();

        for (int i = 1; i <= 4; i++) {
            team.addSubstitute(new Player("Substitute " + i));
        }

        assertTrue(team.isSubstituteCountValid());
    }
    
    // TC-T016 - Get assistant coaches from team.
    @Test
    void TC_T016_shouldReturnAssistantCoaches() {
        Team team = new Team();

        team.addAssistantCoach("Assistant 1");

        assertEquals(1, team.getAssistantCoaches().size());
    }

    // TC-T017 - Get players from team.
    @Test
    void TC_T017_shouldReturnPlayers() {
        Team team = new Team();

        team.addPlayer(new Player("Player 1"));

        assertEquals(1, team.getPlayers().size());
    }

    // TC-T018 - Get starting players from team.
    @Test
    void TC_T018_shouldReturnStartingPlayers() {
        Team team = new Team();

        team.addStartingPlayer(new Player("Player 1"));

        assertEquals(1, team.getStartingPlayers().size());
    }

    // TC-T019 - Get substitutes from team.
    @Test
    void TC_T019_shouldReturnSubstitutes() {
        Team team = new Team();

        team.addSubstitute(new Player("Substitute 1"));

        assertEquals(1, team.getSubstitutes().size());
    }
    
    // TC-T020 - Team has 1 staff/caretaker.
    @Test
    void TC_T020_shouldAcceptOneStaffMember() {
        Team team = new Team();

        team.setStaffMember("Staff 1");

        assertEquals("Staff 1", team.getStaffMember());
    }
}