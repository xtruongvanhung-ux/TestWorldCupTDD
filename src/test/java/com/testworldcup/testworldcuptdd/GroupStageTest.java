package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroupStageTest {

    // TC-T072 - The final tournament has 32 teams.
    @Test
    void TC_T072_shouldAccept32Teams() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.isFinalTournamentTeamCountValid(32));
    }

    // TC-T073 - The final tournament cannot have a team count different from 32.
    @Test
    void TC_T073_shouldRejectNon32TeamCount() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isFinalTournamentTeamCountValid(31));
    }

    // TC-T074 - A group has 4 teams.
    @Test
    void TC_T074_shouldAcceptFourTeamsInGroup() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.isGroupTeamCountValid(4));
    }

    // TC-T075 - A group cannot have a team count different from 4.
    @Test
    void TC_T075_shouldRejectNonFourTeamGroup() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isGroupTeamCountValid(5));
    }

    // TC-T076 - Each team plays against 3 opponents.
    @Test
    void TC_T076_shouldAcceptThreeOpponents() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.isRoundRobinOpponentsValid(3));
    }

    // TC-T077 - A team cannot have an invalid number of opponents.
    @Test
    void TC_T077_shouldRejectInvalidOpponentCount() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isRoundRobinOpponentsValid(2));
    }

    // TC-T078 - A win gives 3 points.
    @Test
    void TC_T078_shouldGiveThreePointsForWin() {
        GroupStage groupStage = new GroupStage();

        assertEquals(3, groupStage.calculateWinPoints());
    }

    // TC-T079 - A draw gives 1 point.
    @Test
    void TC_T079_shouldGiveOnePointForDraw() {
        GroupStage groupStage = new GroupStage();

        assertEquals(1, groupStage.calculateDrawPoints());
    }

    // TC-T080 - A loss gives 0 points.
    @Test
    void TC_T080_shouldGiveZeroPointsForLoss() {
        GroupStage groupStage = new GroupStage();

        assertEquals(0, groupStage.calculateLossPoints());
    }

    // TC-T081 - Ranking first compares points.
    @Test
    void TC_T081_shouldComparePointsFirst() {
        GroupStage groupStage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(6, 2, 1, 0, 0, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 5, 0, 0, 0, 2);

        assertTrue(groupStage.compareByPoints(team1, team2) > 0);
    }

    // TC-T082 - Ranking can compare goal difference.
    @Test
    void TC_T082_shouldCompareGoalDifference() {
        GroupStage groupStage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(3, 4, 1, 0, 0, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 2, 1, 0, 0, 2);

        assertTrue(groupStage.compareByGoalDifference(team1, team2) > 0);
    }

    // TC-T083 - Ranking can compare number of cards.
    @Test
    void TC_T083_shouldCompareCards() {
        GroupStage groupStage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(3, 2, 1, 0, 0, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 2, 3, 0, 0, 2);

        assertTrue(groupStage.compareByCards(team1, team2) < 0);
    }

    // TC-T084 - Ranking can compare head-to-head result.
    @Test
    void TC_T084_shouldCompareHeadToHead() {
        GroupStage groupStage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(3, 2, 1, 0, 2, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 2, 1, 0, 1, 2);

        assertTrue(groupStage.compareByHeadToHead(team1, team2) > 0);
    }

    // TC-T085 - Ranking can use draw lot as the final criterion.
    @Test
    void TC_T085_shouldCompareDrawLot() {
        GroupStage groupStage = new GroupStage();

        GroupStage.TeamStanding team1 =
                new GroupStage.TeamStanding(3, 2, 1, 0, 1, 1);

        GroupStage.TeamStanding team2 =
                new GroupStage.TeamStanding(3, 2, 1, 0, 1, 2);

        assertTrue(groupStage.compareByDrawLot(team1, team2) < 0);
    }

    // TC-T086 - One red card equals two yellow cards.
    @Test
    void TC_T086_shouldCountOneRedCardAsTwoYellowCards() {
        GroupStage groupStage = new GroupStage();

        assertEquals(4, groupStage.calculateCardWeight(2, 1));
    }

    // TC-T087 - Different current criterion means no next criterion is needed.
    @Test
    void TC_T087_shouldNotCompareNextCriterionWhenCurrentDiffers() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.shouldCompareNextCriterion(false));
    }

    // TC-T088 - Equal current criterion requires the next criterion.
    @Test
    void TC_T088_shouldCompareNextCriterionWhenCurrentIsEqual() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.shouldCompareNextCriterion(true));
    }

    // TC-T089 - First place qualifies for round of 16.
    @Test
    void TC_T089_shouldQualifyFirstPlace() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.qualifiesForRoundOf16(1));
    }

    // TC-T090 - Second place qualifies for round of 16.
    @Test
    void TC_T090_shouldQualifySecondPlace() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.qualifiesForRoundOf16(2));
    }

    // TC-T091 - 31 teams are below the required tournament count.
    @Test
    void TC_T091_shouldReject31Teams() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isFinalTournamentTeamCountValid(31));
    }

    // TC-T092 - 32 teams are at the required tournament count.
    @Test
    void TC_T092_shouldAccept32TeamsAtBoundary() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.isFinalTournamentTeamCountValid(32));
    }

    // TC-T093 - 33 teams exceed the required tournament count.
    @Test
    void TC_T093_shouldReject33Teams() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isFinalTournamentTeamCountValid(33));
    }

    // TC-T094 - 3 teams are below the group boundary.
    @Test
    void TC_T094_shouldRejectThreeTeamsInGroup() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isGroupTeamCountValid(3));
    }

    // TC-T095 - 4 teams meet the group boundary.
    @Test
    void TC_T095_shouldAcceptFourTeamsAtBoundary() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.isGroupTeamCountValid(4));
    }

    // TC-T096 - 5 teams exceed the group boundary.
    @Test
    void TC_T096_shouldRejectFiveTeamsInGroup() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isGroupTeamCountValid(5));
    }

    // TC-T097 - 2 opponents are below the round-robin boundary.
    @Test
    void TC_T097_shouldRejectTwoOpponents() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isRoundRobinOpponentsValid(2));
    }

    // TC-T098 - 3 opponents meet the round-robin boundary.
    @Test
    void TC_T098_shouldAcceptThreeOpponentsAtBoundary() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.isRoundRobinOpponentsValid(3));
    }

    // TC-T099 - 4 opponents exceed the round-robin boundary.
    @Test
    void TC_T099_shouldRejectFourOpponents() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.isRoundRobinOpponentsValid(4));
    }

    // TC-T100 - First place qualifies.
    @Test
    void TC_T100_shouldAcceptFirstPlace() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.qualifiesForRoundOf16(1));
    }

    // TC-T101 - Second place qualifies.
    @Test
    void TC_T101_shouldAcceptSecondPlace() {
        GroupStage groupStage = new GroupStage();

        assertTrue(groupStage.qualifiesForRoundOf16(2));
    }

    // TC-T102 - Third place does not qualify.
    @Test
    void TC_T102_shouldRejectThirdPlace() {
        GroupStage groupStage = new GroupStage();

        assertFalse(groupStage.qualifiesForRoundOf16(3));
    }
    
    // TC-T103 - TeamStanding returns the number of red cards.
    @Test
    void TC_T103_shouldReturnRedCards() {
        GroupStage.TeamStanding standing =
                new GroupStage.TeamStanding(3, 2, 1, 2, 0, 1);

        assertEquals(2, standing.getRedCards());
    }
    
    // TC-T196 - Two teams with equal points are equal by points.
    @Test
    void TC_T196_shouldReturnEqualWhenPointsAreEqual() {
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

    // TC-T197 - Two teams with equal goal difference are equal by goal difference.
    @Test
    void TC_T197_shouldReturnEqualWhenGoalDifferenceIsEqual() {
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

    // TC-T198 - Two teams with equal yellow cards are equal by cards.
    @Test
    void TC_T198_shouldReturnEqualWhenCardsAreEqual() {
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

    // TC-T199 - Two teams with equal head-to-head result are equal.
    @Test
    void TC_T199_shouldReturnEqualWhenHeadToHeadIsEqual() {
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

    // TC-T200 - Two teams with equal draw-lot rank are equal.
    @Test
    void TC_T200_shouldReturnEqualWhenDrawLotRankIsEqual() {
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

    // TC-T201 - Position 0 does not qualify for the round of 16.
    @Test
    void TC_T201_shouldRejectPositionZero() {
        GroupStage stage = new GroupStage();

        assertFalse(
                stage.qualifiesForRoundOf16(0)
        );
    }
}