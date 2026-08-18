package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TournamentTest {

    // TC236 - Tournament initializes with exactly 32 teams.
    @Test
    void TC236_shouldAccept32Teams() {
        Tournament tournament = new Tournament();

        assertTrue(tournament.initializeTeams(32));
    }

    // TC237 - 31 teams are invalid.
    @Test
    void TC237_shouldReject31Teams() {
        Tournament tournament = new Tournament();

        assertFalse(tournament.initializeTeams(31));
    }

    // TC238 - 32 teams are valid at the boundary.
    @Test
    void TC238_shouldAccept32TeamsAtBoundary() {
        Tournament tournament = new Tournament();

        assertTrue(tournament.initializeTeams(32));
    }

    // TC239 - 33 teams are invalid.
    @Test
    void TC239_shouldReject33Teams() {
        Tournament tournament = new Tournament();

        assertFalse(tournament.initializeTeams(33));
    }

    // TC240 - Tournament has 8 groups.
    @Test
    void TC240_shouldCreateEightGroups() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);

        assertTrue(tournament.createGroups());
        assertEquals(8, tournament.getGroupCount());
    }

    // TC241 - A group with 3 teams is invalid.
    @Test
    void TC241_shouldRejectGroupWithThreeTeams() {
        Tournament tournament = new Tournament();

        assertFalse(tournament.isGroupSizeValid(3));
    }

    // TC242 - A group with 4 teams is valid.
    @Test
    void TC242_shouldAcceptGroupWithFourTeams() {
        Tournament tournament = new Tournament();

        assertTrue(tournament.isGroupSizeValid(4));
    }

    // TC243 - A group with 5 teams is invalid.
    @Test
    void TC243_shouldRejectGroupWithFiveTeams() {
        Tournament tournament = new Tournament();

        assertFalse(tournament.isGroupSizeValid(5));
    }

    // TC244 - Tournament automatically runs the group stage.
    @Test
    void TC244_shouldRunGroupStageAutomatically() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();

        assertTrue(tournament.runGroupStage());
    }

    // TC245 - Group-stage results are recorded.
    @Test
    void TC245_shouldRecordGroupStageResults() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();
        tournament.runGroupStage();

        assertTrue(tournament.hasGroupStageResults());
    }

    // TC246 - Qualified teams enter the round of 16.
    @Test
    void TC246_shouldMoveQualifiedTeamsToRoundOf16() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();
        tournament.runGroupStage();

        assertTrue(tournament.prepareRoundOf16());
        assertEquals(16, tournament.getRoundOf16TeamCount());
    }

    // TC247 - Non-qualified teams do not enter the round of 16.
    @Test
    void TC247_shouldKeepNonQualifiedTeamsOutOfRoundOf16() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();
        tournament.runGroupStage();
        tournament.prepareRoundOf16();

        assertEquals(
                16,
                tournament.getRoundOf16TeamCount()
        );
    }

    // TC248 - Tournament runs from round of 16 to the final.
    @Test
    void TC248_shouldRunKnockoutStageAutomatically() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();
        tournament.runGroupStage();
        tournament.prepareRoundOf16();

        assertTrue(tournament.runKnockoutStage());
    }

    // TC249 - Tournament identifies the champion.
    @Test
    void TC249_shouldIdentifyChampion() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();
        tournament.runGroupStage();
        tournament.prepareRoundOf16();
        tournament.runKnockoutStage();

        assertNotNull(tournament.getChampion());
    }

    // TC250 - Match results are updated in the database.
    @Test
    void TC250_shouldUpdateResultsInDatabase() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();
        tournament.runGroupStage();

        assertTrue(tournament.areResultsStoredInDatabase());
    }

    // TC251 - Results are exported for the tournament.
    @Test
    void TC251_shouldExportTournamentResults() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();
        tournament.runGroupStage();
        tournament.prepareRoundOf16();
        tournament.runKnockoutStage();

        assertTrue(tournament.areResultsExported());
    }
}