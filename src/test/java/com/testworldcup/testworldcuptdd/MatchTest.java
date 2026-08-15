package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    // TC-T025 - A group-stage match lasts 90 minutes.
    @Test
    void TC_T025_shouldAccept90MinuteMatch() {
        Match match = new Match();
        assertTrue(match.isMatchDurationValid(90));
    }

    // TC-T026 - A group-stage match cannot have a different duration.
    @Test
    void TC_T026_shouldRejectNon90MinuteMatch() {
        Match match = new Match();
        assertFalse(match.isMatchDurationValid(91));
    }

    // TC-T027 - A half lasts 45 minutes.
    @Test
    void TC_T027_shouldAccept45MinuteHalf() {
        Match match = new Match();
        assertTrue(match.isHalfDurationValid(45));
    }

    // TC-T028 - A half cannot have a different duration.
    @Test
    void TC_T028_shouldRejectNon45MinuteHalf() {
        Match match = new Match();
        assertFalse(match.isHalfDurationValid(46));
    }

    // TC-T029 - Half-time break can be 15 minutes.
    @Test
    void TC_T029_shouldAccept15MinuteBreak() {
        Match match = new Match();
        assertTrue(match.isBreakDurationValid(15));
    }

    // TC-T030 - Half-time break cannot exceed 15 minutes.
    @Test
    void TC_T030_shouldRejectBreakOver15Minutes() {
        Match match = new Match();
        assertFalse(match.isBreakDurationValid(16));
    }

    // TC-T031 - A knockout match may finish after 90 minutes without extra time.
    @Test
    void TC_T031_shouldAcceptZeroExtraTimeHalves() {
        Match match = new Match();
        assertTrue(match.isExtraTimeCountValid(0));
    }

    // TC-T032 - A knockout match may have 1 or 2 extra-time halves.
    @Test
    void TC_T032_shouldAcceptUpToTwoExtraTimeHalves() {
        Match match = new Match();
        assertTrue(match.isExtraTimeCountValid(2));
    }

    // TC-T033 - A knockout match cannot have more than 2 extra-time halves.
    @Test
    void TC_T033_shouldRejectMoreThanTwoExtraTimeHalves() {
        Match match = new Match();
        assertFalse(match.isExtraTimeCountValid(3));
    }

    // TC-T034 - An extra-time half lasts 30 minutes.
    @Test
    void TC_T034_shouldAccept30MinuteExtraHalf() {
        Match match = new Match();
        assertTrue(match.isExtraHalfDurationValid(30));
    }

    // TC-T035 - An extra-time half cannot have a different duration.
    @Test
    void TC_T035_shouldRejectNon30MinuteExtraHalf() {
        Match match = new Match();
        assertFalse(match.isExtraHalfDurationValid(31));
    }

    // TC-T036 - Silver goal ends the match when one team leads.
    @Test
    void TC_T036_shouldEndMatchAfterSilverGoal() {
        Match match = new Match();
        assertTrue(match.silverGoalEndsMatch(1, 0));
    }

    // TC-T037 - Silver goal does not end the match when scores are equal.
    @Test
    void TC_T037_shouldContinueWhenScoresAreEqual() {
        Match match = new Match();
        assertFalse(match.silverGoalEndsMatch(1, 1));
    }

    // TC-T038 - A winner can be determined after five penalty kicks.
    @Test
    void TC_T038_shouldFindWinnerAfterFivePenalties() {
        Match match = new Match();
        assertTrue(match.hasWinnerAfterFivePenalties(3, 2));
    }

    // TC-T039 - Equal scores after five penalties require sudden death.
    @Test
    void TC_T039_shouldRequireSuddenDeathAfterFivePenalties() {
        Match match = new Match();
        assertTrue(match.requiresSuddenDeathAfterFivePenalties(5, 5));
    }

    // TC-T040 - One yellow card does not remove a player.
    @Test
    void TC_T040_shouldKeepPlayerAfterFirstYellowCard() {
        Match match = new Match();
        assertFalse(match.shouldLeaveAfterYellowCards(1));
    }

    // TC-T041 - Two yellow cards remove a player.
    @Test
    void TC_T041_shouldRemovePlayerAfterSecondYellowCard() {
        Match match = new Match();
        assertTrue(match.shouldLeaveAfterYellowCards(2));
    }

    // TC-T042 - A red card removes a player.
    @Test
    void TC_T042_shouldRemovePlayerAfterRedCard() {
        Match match = new Match();
        assertTrue(match.shouldLeaveAfterRedCard(true));
    }

    // TC-T043 - A team with at least 7 players can continue.
    @Test
    void TC_T043_shouldAcceptSevenPlayersOnField() {
        Match match = new Match();
        assertTrue(match.isMinimumPlayersValid(7));
    }

    // TC-T044 - A team below 7 players cannot continue.
    @Test
    void TC_T044_shouldRejectSixPlayersOnField() {
        Match match = new Match();
        assertFalse(match.isMinimumPlayersValid(6));
    }

    // TC-T045 - A team can make 3 substitutions.
    @Test
    void TC_T045_shouldAcceptThreeSubstitutions() {
        Match match = new Match();
        assertTrue(match.isTotalSubstitutionValid(3));
    }

    // TC-T046 - A team cannot make more than 3 substitutions.
    @Test
    void TC_T046_shouldRejectMoreThanThreeSubstitutions() {
        Match match = new Match();
        assertFalse(match.isTotalSubstitutionValid(4));
    }

    // TC-T047 - Each substitution event can replace 1 player.
    @Test
    void TC_T047_shouldAcceptOnePlayerPerSubstitution() {
        Match match = new Match();
        assertTrue(match.isSubstitutionBatchValid(1));
    }

    // TC-T048 - Each substitution event cannot replace more than 3 players.
    @Test
    void TC_T048_shouldRejectInvalidSubstitutionBatch() {
        Match match = new Match();
        assertFalse(match.isSubstitutionBatchValid(4));
    }

    // TC-T049 - Player position does not restrict substitution.
    @Test
    void TC_T049_shouldAllowAnyPlayerPositionForSubstitution() {
        Match match = new Match();
        assertTrue(match.isSubstitutionPositionIndependent());
    }

    // TC-T050 - A 14-minute break is valid.
    @Test
    void TC_T050_shouldAccept14MinuteBreak() {
        Match match = new Match();
        assertTrue(match.isBreakDurationValid(14));
    }

    // TC-T051 - A 15-minute break is at the maximum boundary.
    @Test
    void TC_T051_shouldAccept15MinuteBreakAtBoundary() {
        Match match = new Match();
        assertTrue(match.isBreakDurationValid(15));
    }

    // TC-T052 - A 16-minute break is above the maximum boundary.
    @Test
    void TC_T052_shouldReject16MinuteBreak() {
        Match match = new Match();
        assertFalse(match.isBreakDurationValid(16));
    }

    // TC-T053 - One extra-time half is valid.
    @Test
    void TC_T053_shouldAcceptOneExtraTimeHalf() {
        Match match = new Match();
        assertTrue(match.isExtraTimeCountValid(1));
    }

    // TC-T054 - Two extra-time halves are valid at the boundary.
    @Test
    void TC_T054_shouldAcceptTwoExtraTimeHalvesAtBoundary() {
        Match match = new Match();
        assertTrue(match.isExtraTimeCountValid(2));
    }

    // TC-T055 - Three extra-time halves exceed the boundary.
    @Test
    void TC_T055_shouldRejectThreeExtraTimeHalves() {
        Match match = new Match();
        assertFalse(match.isExtraTimeCountValid(3));
    }

    // TC-T056 - A 29-minute extra half is below the boundary.
    @Test
    void TC_T056_shouldReject29MinuteExtraHalf() {
        Match match = new Match();
        assertFalse(match.isExtraHalfDurationValid(29));
    }

    // TC-T057 - A 30-minute extra half is at the boundary.
    @Test
    void TC_T057_shouldAccept30MinuteExtraHalfAtBoundary() {
        Match match = new Match();
        assertTrue(match.isExtraHalfDurationValid(30));
    }

    // TC-T058 - A 31-minute extra half exceeds the boundary.
    @Test
    void TC_T058_shouldReject31MinuteExtraHalf() {
        Match match = new Match();
        assertFalse(match.isExtraHalfDurationValid(31));
    }

    // TC-T059 - Six players are below the minimum boundary.
    @Test
    void TC_T059_shouldRejectSixPlayersAtBoundary() {
        Match match = new Match();
        assertFalse(match.isMinimumPlayersValid(6));
    }

    // TC-T060 - Seven players meet the minimum boundary.
    @Test
    void TC_T060_shouldAcceptSevenPlayersAtBoundary() {
        Match match = new Match();
        assertTrue(match.isMinimumPlayersValid(7));
    }

    // TC-T061 - Two substitutions are valid.
    @Test
    void TC_T061_shouldAcceptTwoSubstitutions() {
        Match match = new Match();
        assertTrue(match.isTotalSubstitutionValid(2));
    }

    // TC-T062 - Three substitutions meet the maximum boundary.
    @Test
    void TC_T062_shouldAcceptThreeSubstitutionsAtBoundary() {
        Match match = new Match();
        assertTrue(match.isTotalSubstitutionValid(3));
    }

    // TC-T063 - Four substitutions exceed the maximum boundary.
    @Test
    void TC_T063_shouldRejectFourSubstitutions() {
        Match match = new Match();
        assertFalse(match.isTotalSubstitutionValid(4));
    }

    // TC-T064 - Zero players per substitution is invalid.
    @Test
    void TC_T064_shouldRejectZeroPlayersPerSubstitution() {
        Match match = new Match();
        assertFalse(match.isSubstitutionBatchValid(0));
    }

    // TC-T065 - One player per substitution is valid.
    @Test
    void TC_T065_shouldAcceptOnePlayerPerSubstitution() {
        Match match = new Match();
        assertTrue(match.isSubstitutionBatchValid(1));
    }

    // TC-T066 - Three players per substitution are valid.
    @Test
    void TC_T066_shouldAcceptThreePlayersPerSubstitution() {
        Match match = new Match();
        assertTrue(match.isSubstitutionBatchValid(3));
    }

    // TC-T067 - Four players per substitution exceed the maximum.
    @Test
    void TC_T067_shouldRejectFourPlayersPerSubstitution() {
        Match match = new Match();
        assertFalse(match.isSubstitutionBatchValid(4));
    }
    
    // TC-T068 - Equal penalty scores mean there is no winner after five penalties.
    @Test
    void TC_T068_shouldNotFindWinnerWhenPenaltyScoresAreEqual() {
        Match match = new Match();

        assertFalse(match.hasWinnerAfterFivePenalties(3, 3));
    }

    // TC-T069 - Different penalty scores mean sudden death is not required.
    @Test
    void TC_T069_shouldNotRequireSuddenDeathWhenPenaltyScoresDiffer() {
        Match match = new Match();

        assertFalse(match.requiresSuddenDeathAfterFivePenalties(3, 2));
    }

    // TC-T070 - Negative extra-time half count is invalid.
    @Test
    void TC_T070_shouldRejectNegativeExtraTimeHalves() {
        Match match = new Match();

        assertFalse(match.isExtraTimeCountValid(-1));
    }

    // TC-T071 - Negative substitution count is invalid.
    @Test
    void TC_T071_shouldRejectNegativeSubstitutions() {
        Match match = new Match();

        assertFalse(match.isTotalSubstitutionValid(-1));
    }
    
    // TC-T192 - A match duration below 90 minutes is invalid.
    @Test
    void TC_T192_shouldReject89MinuteMatch() {
        Match match = new Match();

        assertFalse(match.isMatchDurationValid(89));
    }

    // TC-T193 - A half duration below 45 minutes is invalid.
    @Test
    void TC_T193_shouldReject44MinuteHalf() {
        Match match = new Match();

        assertFalse(match.isHalfDurationValid(44));
    }

    // TC-T194 - A player without a red card does not have to leave.
    @Test
    void TC_T194_shouldNotLeavePlayerWithoutRedCard() {
        Match match = new Match();

        assertFalse(match.shouldLeaveAfterRedCard(false));
    }

    // TC-T195 - Zero substitutions are valid.
    @Test
    void TC_T195_shouldAcceptZeroSubstitutions() {
        Match match = new Match();

        assertTrue(match.isTotalSubstitutionValid(0));
    }
    
    // TC-T202 - A 91-minute match is invalid.
    @Test
    void TC_T202_shouldReject91MinuteMatch() {
        Match match = new Match();

        assertFalse(match.isMatchDurationValid(91));
    }

    // TC-T203 - A 46-minute half is invalid.
    @Test
    void TC_T203_shouldReject46MinuteHalf() {
        Match match = new Match();

        assertFalse(match.isHalfDurationValid(46));
    }

    // TC-T204 - Four extra-time halves are invalid.
    @Test
    void TC_T204_shouldRejectFourExtraTimeHalves() {
        Match match = new Match();

        assertFalse(match.isExtraTimeCountValid(4));
    }

    // TC-T205 - A 32-minute extra-time half is invalid.
    @Test
    void TC_T205_shouldReject32MinuteExtraHalf() {
        Match match = new Match();

        assertFalse(match.isExtraHalfDurationValid(32));
    }

    // TC-T206 - A team with more successful penalties wins after five kicks.
    @Test
    void TC_T206_shouldFindWinnerWithFourToThreePenalties() {
        Match match = new Match();

        assertTrue(match.hasWinnerAfterFivePenalties(4, 3));
    }

    // TC-T207 - Different penalty scores do not require sudden death.
    @Test
    void TC_T207_shouldNotRequireSuddenDeathWithFourToThreePenalties() {
        Match match = new Match();

        assertFalse(match.requiresSuddenDeathAfterFivePenalties(4, 3));
    }

    // TC-T208 - Equal penalty scores mean there is no winner after five kicks.
    @Test
    void TC_T208_shouldNotFindWinnerWithThreeToThreePenalties() {
        Match match = new Match();

        assertFalse(match.hasWinnerAfterFivePenalties(3, 3));
    }

    // TC-T209 - Equal penalty scores require sudden death.
    @Test
    void TC_T209_shouldRequireSuddenDeathWithThreeToThreePenalties() {
        Match match = new Match();

        assertTrue(match.requiresSuddenDeathAfterFivePenalties(3, 3));
    }

    // TC-T210 - Zero yellow cards do not remove a player.
    @Test
    void TC_T210_shouldKeepPlayerWithZeroYellowCards() {
        Match match = new Match();

        assertFalse(match.shouldLeaveAfterYellowCards(0));
    }

    // TC-T211 - Three yellow cards require the player to leave.
    @Test
    void TC_T211_shouldRemovePlayerAfterThreeYellowCards() {
        Match match = new Match();

        assertTrue(match.shouldLeaveAfterYellowCards(3));
    }

    // TC-T212 - Eight players on the field are valid.
    @Test
    void TC_T212_shouldAcceptEightPlayersOnField() {
        Match match = new Match();

        assertTrue(match.isMinimumPlayersValid(8));
    }

    // TC-T213 - Ten players on the field are valid.
    @Test
    void TC_T213_shouldAcceptTenPlayersOnField() {
        Match match = new Match();

        assertTrue(match.isMinimumPlayersValid(10));
    }

    // TC-T214 - A substitution batch of two players is valid.
    @Test
    void TC_T214_shouldAcceptTwoPlayersPerSubstitution() {
        Match match = new Match();

        assertTrue(match.isSubstitutionBatchValid(2));
    }

    // TC-T215 - A 28-minute extra-time half is invalid.
    @Test
    void TC_T215_shouldReject28MinuteExtraHalf() {
        Match match = new Match();

        assertFalse(match.isExtraHalfDurationValid(28));
    }

    // TC-T216 - A one-minute half-time break is within the allowed maximum.
    @Test
    void TC_T216_shouldAcceptOneMinuteBreak() {
        Match match = new Match();

        assertTrue(match.isBreakDurationValid(1));
    }
    
    // TC-T249 - Zero extra-time halves are valid.
    @Test
    void TC_T249_shouldAcceptZeroExtraTimeHalvesAtBoundary() {
        Match match = new Match();

        assertTrue(match.isExtraTimeCountValid(0));
    }
}