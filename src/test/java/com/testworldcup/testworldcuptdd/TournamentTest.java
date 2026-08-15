package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TournamentTest {

    // TC-T176 - Tournament initializes with exactly 32 teams.
    @Test
    void TC_T176_shouldAccept32Teams() {
        Tournament tournament = new Tournament();

        assertTrue(tournament.initializeTeams(32));
    }

    // TC-T177 - 31 teams are invalid.
    @Test
    void TC_T177_shouldReject31Teams() {
        Tournament tournament = new Tournament();

        assertFalse(tournament.initializeTeams(31));
    }

    // TC-T178 - 32 teams are valid at the boundary.
    @Test
    void TC_T178_shouldAccept32TeamsAtBoundary() {
        Tournament tournament = new Tournament();

        assertTrue(tournament.initializeTeams(32));
    }

    // TC-T179 - 33 teams are invalid.
    @Test
    void TC_T179_shouldReject33Teams() {
        Tournament tournament = new Tournament();

        assertFalse(tournament.initializeTeams(33));
    }

    // TC-T180 - Tournament has 8 groups.
    @Test
    void TC_T180_shouldCreateEightGroups() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);

        assertTrue(tournament.createGroups());
        assertEquals(8, tournament.getGroupCount());
    }

    // TC-T181 - A group with 3 teams is invalid.
    @Test
    void TC_T181_shouldRejectGroupWithThreeTeams() {
        Tournament tournament = new Tournament();

        assertFalse(tournament.isGroupSizeValid(3));
    }

    // TC-T182 - A group with 4 teams is valid.
    @Test
    void TC_T182_shouldAcceptGroupWithFourTeams() {
        Tournament tournament = new Tournament();

        assertTrue(tournament.isGroupSizeValid(4));
    }

    // TC-T183 - A group with 5 teams is invalid.
    @Test
    void TC_T183_shouldRejectGroupWithFiveTeams() {
        Tournament tournament = new Tournament();

        assertFalse(tournament.isGroupSizeValid(5));
    }

    // TC-T184 - Tournament automatically runs the group stage.
    @Test
    void TC_T184_shouldRunGroupStageAutomatically() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();

        assertTrue(tournament.runGroupStage());
    }

    // TC-T185 - Group-stage results are recorded.
    @Test
    void TC_T185_shouldRecordGroupStageResults() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();
        tournament.runGroupStage();

        assertTrue(tournament.hasGroupStageResults());
    }

    // TC-T186 - Qualified teams enter the round of 16.
    @Test
    void TC_T186_shouldMoveQualifiedTeamsToRoundOf16() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();
        tournament.runGroupStage();

        assertTrue(tournament.prepareRoundOf16());
        assertEquals(16, tournament.getRoundOf16TeamCount());
    }

    // TC-T187 - Non-qualified teams do not enter the round of 16.
    @Test
    void TC_T187_shouldKeepNonQualifiedTeamsOutOfRoundOf16() {
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

    // TC-T188 - Tournament runs from round of 16 to the final.
    @Test
    void TC_T188_shouldRunKnockoutStageAutomatically() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();
        tournament.runGroupStage();
        tournament.prepareRoundOf16();

        assertTrue(tournament.runKnockoutStage());
    }

    // TC-T189 - Tournament identifies the champion.
    @Test
    void TC_T189_shouldIdentifyChampion() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();
        tournament.runGroupStage();
        tournament.prepareRoundOf16();
        tournament.runKnockoutStage();

        assertNotNull(tournament.getChampion());
    }

    // TC-T190 - Match results are updated in the database.
    @Test
    void TC_T190_shouldUpdateResultsInDatabase() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();
        tournament.runGroupStage();

        assertTrue(tournament.areResultsStoredInDatabase());
    }

    // TC-T191 - Results are exported for the tournament.
    @Test
    void TC_T191_shouldExportTournamentResults() {
        Tournament tournament = new Tournament();

        tournament.initializeTeams(32);
        tournament.createGroups();
        tournament.runGroupStage();
        tournament.prepareRoundOf16();
        tournament.runKnockoutStage();

        assertTrue(tournament.areResultsExported());
    }
}