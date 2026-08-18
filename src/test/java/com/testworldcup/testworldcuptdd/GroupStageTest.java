package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupStageTest {

    // TC21 - The final tournament has 32 teams.
    @Test
    void TC21_shouldAccept32Teams() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.isFinalTournamentTeamCountValid(32));
    }

    // TC22 - The final tournament cannot have a team count different from 32.
    @Test
    void TC22_shouldRejectNon32TeamCount() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isFinalTournamentTeamCountValid(31));
    }

    // TC23 - A group has 4 teams.
    @Test
    void TC23_shouldAcceptFourTeamsInGroup() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.isGroupTeamCountValid(4));
    }

    // TC24 - A group cannot have a team count different from 4.
    @Test
    void TC24_shouldRejectNonFourTeamGroup() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isGroupTeamCountValid(5));
    }

    // TC25 - Each team plays against 3 opponents.
    @Test
    void TC25_shouldAcceptThreeOpponents() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.isRoundRobinOpponentsValid(3));
    }

    // TC26 - A team cannot have an invalid number of opponents.
    @Test
    void TC26_shouldRejectInvalidOpponentCount() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isRoundRobinOpponentsValid(2));
    }

    // TC27 - A win gives 3 points.
    @Test
    void TC27_shouldGiveThreePointsForWin() {
        GroupStage groupStage = new GroupStage();

        assertEquals(3, groupStage.calculateWinPoints());
    }

    // TC28 - A draw gives 1 point.
    @Test
    void TC28_shouldGiveOnePointForDraw() {
        GroupStage groupStage = new GroupStage();

        assertEquals(1, groupStage.calculateDrawPoints());
    }

    // TC29 - A loss gives 0 points.
    @Test
    void TC29_shouldGiveZeroPointsForLoss() {
        GroupStage groupStage = new GroupStage();

        assertEquals(0, groupStage.calculateLossPoints());
    }

    // TC30 - Ranking first compares points.
    @Test
    void TC30_shouldComparePointsFirst() {
        GroupStage groupStage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(6, 2, 1, 0, 0, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 5, 0, 0, 0, 2);

        assertTrue(groupStage.compareByPoints(team1, team2) > 0);
    }

    // TC31 - Ranking can compare goal difference.
    @Test
    void TC31_shouldCompareGoalDifference() {
        GroupStage groupStage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(3, 4, 1, 0, 0, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 2, 1, 0, 0, 2);

        assertTrue(groupStage.compareByGoalDifference(team1, team2) > 0);
    }

    // TC32 - Ranking can compare number of cards.
    @Test
    void TC32_shouldCompareCards() {
        GroupStage groupStage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(3, 2, 1, 0, 0, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 2, 3, 0, 0, 2);

        assertTrue(groupStage.compareByCards(team1, team2) < 0);
    }

    // TC33 - Ranking can compare head-to-head result.
    @Test
    void TC33_shouldCompareHeadToHead() {
        GroupStage groupStage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(3, 2, 1, 0, 2, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 2, 1, 0, 1, 2);

        assertTrue(groupStage.compareByHeadToHead(team1, team2) > 0);
    }

    // TC34 - Ranking can use draw lot as the final criterion.
    @Test
    void TC34_shouldCompareDrawLot() {
        GroupStage groupStage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(3, 2, 1, 0, 1, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 2, 1, 0, 1, 2);

        assertTrue(groupStage.compareByDrawLot(team1, team2) < 0);
    }

    // TC35 - One red card equals two yellow cards.
    @Test
    void TC35_shouldCountOneRedCardAsTwoYellowCards() {
        GroupStage groupStage = new GroupStage();

        assertEquals(4, groupStage.calculateCardWeight(2, 1));
    }

    // TC36 - Different current criterion means no next criterion is needed.
    @Test
    void TC36_shouldNotCompareNextCriterionWhenCurrentDiffers() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.shouldCompareNextCriterion(false));
    }

    // TC37 - Equal current criterion requires the next criterion.
    @Test
    void TC37_shouldCompareNextCriterionWhenCurrentIsEqual() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.shouldCompareNextCriterion(true));
    }

    // TC38 - First place qualifies for round of 16.
    @Test
    void TC38_shouldQualifyFirstPlace() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.qualifiesForRoundOf16(1));
    }

    // TC39 - Second place qualifies for round of 16.
    @Test
    void TC39_shouldQualifySecondPlace() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.qualifiesForRoundOf16(2));
    }

    // TC40 - 31 teams are below the required tournament count.
    @Test
    void TC40_shouldReject31Teams() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isFinalTournamentTeamCountValid(31));
    }

    // TC41 - 32 teams are at the required tournament count.
    @Test
    void TC41_shouldAccept32TeamsAtBoundary() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.isFinalTournamentTeamCountValid(32));
    }

    // TC42 - 33 teams exceed the required tournament count.
    @Test
    void TC42_shouldReject33Teams() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isFinalTournamentTeamCountValid(33));
    }

    // TC43 - 3 teams are below the group boundary.
    @Test
    void TC43_shouldRejectThreeTeamsInGroup() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isGroupTeamCountValid(3));
    }

    // TC44 - 4 teams meet the group boundary.
    @Test
    void TC44_shouldAcceptFourTeamsAtBoundary() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.isGroupTeamCountValid(4));
    }

    // TC45 - 5 teams exceed the group boundary.
    @Test
    void TC45_shouldRejectFiveTeamsInGroup() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isGroupTeamCountValid(5));
    }

    // TC46 - 2 opponents are below the round-robin boundary.
    @Test
    void TC46_shouldRejectTwoOpponents() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isRoundRobinOpponentsValid(2));
    }

    // TC47 - 3 opponents meet the round-robin boundary.
    @Test
    void TC47_shouldAcceptThreeOpponentsAtBoundary() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.isRoundRobinOpponentsValid(3));
    }

    // TC48 - 4 opponents exceed the round-robin boundary.
    @Test
    void TC48_shouldRejectFourOpponents() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isRoundRobinOpponentsValid(4));
    }

    // TC49 - First place qualifies.
    @Test
    void TC49_shouldAcceptFirstPlace() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.qualifiesForRoundOf16(1));
    }

    // TC50 - Second place qualifies.
    @Test
    void TC50_shouldAcceptSecondPlace() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.qualifiesForRoundOf16(2));
    }

    // TC51 - Third place does not qualify.
    @Test
    void TC51_shouldRejectThirdPlace() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.qualifiesForRoundOf16(3));
    }

    // TC52 - TeamStanding returns the number of red cards.
    @Test
    void TC52_shouldReturnRedCards() {
        GroupStage.TeamStanding standing =
                new GroupStage.TeamStanding(3, 2, 1, 2, 0, 1);

        assertEquals(2, standing.getRedCards());
    }

    // TC53 - Two teams with equal points are equal by points.
    @Test
    void TC53_shouldReturnEqualWhenPointsAreEqual() {
        GroupStage stage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(6, 3, 2, 0, 1, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(6, 1, 1, 0, 2, 2);

        assertEquals(
                0,
                stage.compareByPoints(team1, team2)
        );
    }

    // TC54 - Two teams with equal goal difference are equal by goal difference.
    @Test
    void TC54_shouldReturnEqualWhenGoalDifferenceIsEqual() {
        GroupStage stage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(6, 3, 2, 0, 1, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 3, 1, 0, 2, 2);

        assertEquals(
                0,
                stage.compareByGoalDifference(team1, team2)
        );
    }

    // TC55 - Two teams with equal yellow cards are equal by cards.
    @Test
    void TC55_shouldReturnEqualWhenCardsAreEqual() {
        GroupStage stage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(6, 3, 2, 0, 1, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 1, 2, 0, 2, 2);

        assertEquals(
                0,
                stage.compareByCards(team1, team2)
        );
    }

    // TC56 - Two teams with equal head-to-head result are equal.
    @Test
    void TC56_shouldReturnEqualWhenHeadToHeadIsEqual() {
        GroupStage stage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(6, 3, 2, 0, 1, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 1, 1, 0, 1, 2);

        assertEquals(
                0,
                stage.compareByHeadToHead(team1, team2)
        );
    }

    // TC57 - Two teams with equal draw-lot rank are equal.
    @Test
    void TC57_shouldReturnEqualWhenDrawLotRankIsEqual() {
        GroupStage stage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(6, 3, 2, 0, 1, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 1, 1, 0, 2, 1);

        assertEquals(
                0,
                stage.compareByDrawLot(team1, team2)
        );
    }

    // TC58 - Position 0 does not qualify for the round of 16.
    @Test
    void TC58_shouldRejectPositionZero() {
        GroupStage stage = new GroupStage();

        assertFalse(
                stage.qualifiesForRoundOf16(0)
        );
    }
}