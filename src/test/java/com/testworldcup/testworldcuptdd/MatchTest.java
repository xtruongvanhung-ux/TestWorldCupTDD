package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchTest {

    // TC124 - A group-stage match lasts 90 minutes.
    @Test
    void TC124_shouldAccept90MinuteMatch() {
        Match match = new Match();
        assertTrue(match.isMatchDurationValid(90));
    }

    // TC125 - A group-stage match cannot have a different duration.
    @Test
    void TC125_shouldRejectNon90MinuteMatch() {
        Match match = new Match();
        assertFalse(match.isMatchDurationValid(91));
    }

    // TC126 - A half lasts 45 minutes.
    @Test
    void TC126_shouldAccept45MinuteHalf() {
        Match match = new Match();
        assertTrue(match.isHalfDurationValid(45));
    }

    // TC127 - A half cannot have a different duration.
    @Test
    void TC127_shouldRejectNon45MinuteHalf() {
        Match match = new Match();
        assertFalse(match.isHalfDurationValid(46));
    }

    // TC128 - Half-time break can be 15 minutes.
    @Test
    void TC128_shouldAccept15MinuteBreak() {
        Match match = new Match();
        assertTrue(match.isBreakDurationValid(15));
    }

    // TC129 - Half-time break cannot exceed 15 minutes.
    @Test
    void TC129_shouldRejectBreakOver15Minutes() {
        Match match = new Match();
        assertFalse(match.isBreakDurationValid(16));
    }

    // TC130 - A knockout match may finish after 90 minutes without extra time.
    @Test
    void TC130_shouldAcceptZeroExtraTimeHalves() {
        Match match = new Match();
        assertTrue(match.isExtraTimeCountValid(0));
    }

    // TC131 - A knockout match may have 1 or 2 extra-time halves.
    @Test
    void TC131_shouldAcceptUpToTwoExtraTimeHalves() {
        Match match = new Match();
        assertTrue(match.isExtraTimeCountValid(2));
    }

    // TC132 - A knockout match cannot have more than 2 extra-time halves.
    @Test
    void TC132_shouldRejectMoreThanTwoExtraTimeHalves() {
        Match match = new Match();
        assertFalse(match.isExtraTimeCountValid(3));
    }

    // TC133 - An extra-time half lasts 30 minutes.
    @Test
    void TC133_shouldAccept30MinuteExtraHalf() {
        Match match = new Match();
        assertTrue(match.isExtraHalfDurationValid(30));
    }

    // TC134 - An extra-time half cannot have a different duration.
    @Test
    void TC134_shouldRejectNon30MinuteExtraHalf() {
        Match match = new Match();
        assertFalse(match.isExtraHalfDurationValid(31));
    }

    // TC135 - Silver goal ends the match when one team leads.
    @Test
    void TC135_shouldEndMatchAfterSilverGoal() {
        Match match = new Match();
        assertTrue(match.silverGoalEndsMatch(1, 0));
    }

    // TC136 - Silver goal does not end the match when scores are equal.
    @Test
    void TC136_shouldContinueWhenScoresAreEqual() {
        Match match = new Match();
        assertFalse(match.silverGoalEndsMatch(1, 1));
    }

    // TC137 - A winner can be determined after five penalty kicks.
    @Test
    void TC137_shouldFindWinnerAfterFivePenalties() {
        Match match = new Match();
        assertTrue(match.hasWinnerAfterFivePenalties(3, 2));
    }

    // TC138 - Equal scores after five penalties require sudden death.
    @Test
    void TC138_shouldRequireSuddenDeathAfterFivePenalties() {
        Match match = new Match();
        assertTrue(match.requiresSuddenDeathAfterFivePenalties(5, 5));
    }

    // TC139 - One yellow card does not remove a player.
    @Test
    void TC139_shouldKeepPlayerAfterFirstYellowCard() {
        Match match = new Match();
        assertFalse(match.shouldLeaveAfterYellowCards(1));
    }

    // TC140 - Two yellow cards remove a player.
    @Test
    void TC140_shouldRemovePlayerAfterSecondYellowCard() {
        Match match = new Match();
        assertTrue(match.shouldLeaveAfterYellowCards(2));
    }

    // TC141 - A red card removes a player.
    @Test
    void TC141_shouldRemovePlayerAfterRedCard() {
        Match match = new Match();
        assertTrue(match.shouldLeaveAfterRedCard(true));
    }

    // TC142 - A team with at least 7 players can continue.
    @Test
    void TC142_shouldAcceptSevenPlayersOnField() {
        Match match = new Match();
        assertTrue(match.isMinimumPlayersValid(7));
    }

    // TC143 - A team below 7 players cannot continue.
    @Test
    void TC143_shouldRejectSixPlayersOnField() {
        Match match = new Match();
        assertFalse(match.isMinimumPlayersValid(6));
    }

    // TC144 - A team can make 3 substitutions.
    @Test
    void TC144_shouldAcceptThreeSubstitutions() {
        Match match = new Match();
        assertTrue(match.isTotalSubstitutionValid(3));
    }

    // TC145 - A team cannot make more than 3 substitutions.
    @Test
    void TC145_shouldRejectMoreThanThreeSubstitutions() {
        Match match = new Match();
        assertFalse(match.isTotalSubstitutionValid(4));
    }

    // TC146 - Each substitution event can replace 1 player.
    @Test
    void TC146_shouldAcceptOnePlayerPerSubstitution() {
        Match match = new Match();
        assertTrue(match.isSubstitutionBatchValid(1));
    }

    // TC147 - Each substitution event cannot replace more than 3 players.
    @Test
    void TC147_shouldRejectInvalidSubstitutionBatch() {
        Match match = new Match();
        assertFalse(match.isSubstitutionBatchValid(4));
    }

    // TC148 - Player position does not restrict substitution.
    @Test
    void TC148_shouldAllowAnyPlayerPositionForSubstitution() {
        Match match = new Match();
        assertTrue(match.isSubstitutionPositionIndependent());
    }

    // TC149 - A 14-minute break is valid.
    @Test
    void TC149_shouldAccept14MinuteBreak() {
        Match match = new Match();
        assertTrue(match.isBreakDurationValid(14));
    }

    // TC150 - A 15-minute break is at the maximum boundary.
    @Test
    void TC150_shouldAccept15MinuteBreakAtBoundary() {
        Match match = new Match();
        assertTrue(match.isBreakDurationValid(15));
    }

    // TC151 - A 16-minute break is above the maximum boundary.
    @Test
    void TC151_shouldReject16MinuteBreak() {
        Match match = new Match();
        assertFalse(match.isBreakDurationValid(16));
    }

    // TC152 - One extra-time half is valid.
    @Test
    void TC152_shouldAcceptOneExtraTimeHalf() {
        Match match = new Match();
        assertTrue(match.isExtraTimeCountValid(1));
    }

    // TC153 - Two extra-time halves are valid at the boundary.
    @Test
    void TC153_shouldAcceptTwoExtraTimeHalvesAtBoundary() {
        Match match = new Match();
        assertTrue(match.isExtraTimeCountValid(2));
    }

    // TC154 - Three extra-time halves exceed the boundary.
    @Test
    void TC154_shouldRejectThreeExtraTimeHalves() {
        Match match = new Match();
        assertFalse(match.isExtraTimeCountValid(3));
    }

    // TC155 - A 29-minute extra half is below the boundary.
    @Test
    void TC155_shouldReject29MinuteExtraHalf() {
        Match match = new Match();
        assertFalse(match.isExtraHalfDurationValid(29));
    }

    // TC156 - A 30-minute extra half is at the boundary.
    @Test
    void TC156_shouldAccept30MinuteExtraHalfAtBoundary() {
        Match match = new Match();
        assertTrue(match.isExtraHalfDurationValid(30));
    }

    // TC157 - A 31-minute extra half exceeds the boundary.
    @Test
    void TC157_shouldReject31MinuteExtraHalf() {
        Match match = new Match();
        assertFalse(match.isExtraHalfDurationValid(31));
    }

    // TC158 - Six players are below the minimum boundary.
    @Test
    void TC158_shouldRejectSixPlayersAtBoundary() {
        Match match = new Match();
        assertFalse(match.isMinimumPlayersValid(6));
    }

    // TC159 - Seven players meet the minimum boundary.
    @Test
    void TC159_shouldAcceptSevenPlayersAtBoundary() {
        Match match = new Match();
        assertTrue(match.isMinimumPlayersValid(7));
    }

    // TC160 - Two substitutions are valid.
    @Test
    void TC160_shouldAcceptTwoSubstitutions() {
        Match match = new Match();
        assertTrue(match.isTotalSubstitutionValid(2));
    }

    // TC161 - Three substitutions meet the maximum boundary.
    @Test
    void TC161_shouldAcceptThreeSubstitutionsAtBoundary() {
        Match match = new Match();
        assertTrue(match.isTotalSubstitutionValid(3));
    }

    // TC162 - Four substitutions exceed the maximum boundary.
    @Test
    void TC162_shouldRejectFourSubstitutions() {
        Match match = new Match();
        assertFalse(match.isTotalSubstitutionValid(4));
    }

    // TC163 - Zero players per substitution is invalid.
    @Test
    void TC163_shouldRejectZeroPlayersPerSubstitution() {
        Match match = new Match();
        assertFalse(match.isSubstitutionBatchValid(0));
    }

    // TC164 - One player per substitution is valid.
    @Test
    void TC164_shouldAcceptOnePlayerPerSubstitution() {
        Match match = new Match();
        assertTrue(match.isSubstitutionBatchValid(1));
    }

    // TC165 - Three players per substitution are valid.
    @Test
    void TC165_shouldAcceptThreePlayersPerSubstitution() {
        Match match = new Match();
        assertTrue(match.isSubstitutionBatchValid(3));
    }

    // TC166 - Four players per substitution exceed the maximum.
    @Test
    void TC166_shouldRejectFourPlayersPerSubstitution() {
        Match match = new Match();
        assertFalse(match.isSubstitutionBatchValid(4));
    }
    
    // TC167 - Equal penalty scores mean there is no winner after five penalties.
    @Test
    void TC167_shouldNotFindWinnerWhenPenaltyScoresAreEqual() {
        Match match = new Match();

        assertFalse(match.hasWinnerAfterFivePenalties(3, 3));
    }

    // TC168 - Different penalty scores mean sudden death is not required.
    @Test
    void TC168_shouldNotRequireSuddenDeathWhenPenaltyScoresDiffer() {
        Match match = new Match();

        assertFalse(match.requiresSuddenDeathAfterFivePenalties(3, 2));
    }

    // TC169 - Negative extra-time half count is invalid.
    @Test
    void TC169_shouldRejectNegativeExtraTimeHalves() {
        Match match = new Match();

        assertFalse(match.isExtraTimeCountValid(-1));
    }

    // TC170 - Negative substitution count is invalid.
    @Test
    void TC170_shouldRejectNegativeSubstitutions() {
        Match match = new Match();

        assertFalse(match.isTotalSubstitutionValid(-1));
    }
    
    // TC171 - A match duration below 90 minutes is invalid.
    @Test
    void TC171_shouldReject89MinuteMatch() {
        Match match = new Match();

        assertFalse(match.isMatchDurationValid(89));
    }

    // TC172 - A half duration below 45 minutes is invalid.
    @Test
    void TC172_shouldReject44MinuteHalf() {
        Match match = new Match();

        assertFalse(match.isHalfDurationValid(44));
    }

    // TC173 - A player without a red card does not have to leave.
    @Test
    void TC173_shouldNotLeavePlayerWithoutRedCard() {
        Match match = new Match();

        assertFalse(match.shouldLeaveAfterRedCard(false));
    }

    // TC174 - Zero substitutions are valid.
    @Test
    void TC174_shouldAcceptZeroSubstitutions() {
        Match match = new Match();

        assertTrue(match.isTotalSubstitutionValid(0));
    }
    
    // TC175 - A 91-minute match is invalid.
    @Test
    void TC175_shouldReject91MinuteMatch() {
        Match match = new Match();

        assertFalse(match.isMatchDurationValid(91));
    }

    // TC176 - A 46-minute half is invalid.
    @Test
    void TC176_shouldReject46MinuteHalf() {
        Match match = new Match();

        assertFalse(match.isHalfDurationValid(46));
    }

    // TC177 - Four extra-time halves are invalid.
    @Test
    void TC177_shouldRejectFourExtraTimeHalves() {
        Match match = new Match();

        assertFalse(match.isExtraTimeCountValid(4));
    }

    // TC178 - A 32-minute extra-time half is invalid.
    @Test
    void TC178_shouldReject32MinuteExtraHalf() {
        Match match = new Match();

        assertFalse(match.isExtraHalfDurationValid(32));
    }

    // TC179 - A team with more successful penalties wins after five kicks.
    @Test
    void TC179_shouldFindWinnerWithFourToThreePenalties() {
        Match match = new Match();

        assertTrue(match.hasWinnerAfterFivePenalties(4, 3));
    }

    // TC180 - Different penalty scores do not require sudden death.
    @Test
    void TC180_shouldNotRequireSuddenDeathWithFourToThreePenalties() {
        Match match = new Match();

        assertFalse(match.requiresSuddenDeathAfterFivePenalties(4, 3));
    }

    // TC181 - Equal penalty scores mean there is no winner after five kicks.
    @Test
    void TC181_shouldNotFindWinnerWithThreeToThreePenalties() {
        Match match = new Match();

        assertFalse(match.hasWinnerAfterFivePenalties(3, 3));
    }

    // TC182 - Equal penalty scores require sudden death.
    @Test
    void TC182_shouldRequireSuddenDeathWithThreeToThreePenalties() {
        Match match = new Match();

        assertTrue(match.requiresSuddenDeathAfterFivePenalties(3, 3));
    }

    // TC183 - Zero yellow cards do not remove a player.
    @Test
    void TC183_shouldKeepPlayerWithZeroYellowCards() {
        Match match = new Match();

        assertFalse(match.shouldLeaveAfterYellowCards(0));
    }

    // TC184 - Three yellow cards require the player to leave.
    @Test
    void TC184_shouldRemovePlayerAfterThreeYellowCards() {
        Match match = new Match();

        assertTrue(match.shouldLeaveAfterYellowCards(3));
    }

    // TC185 - Eight players on the field are valid.
    @Test
    void TC185_shouldAcceptEightPlayersOnField() {
        Match match = new Match();

        assertTrue(match.isMinimumPlayersValid(8));
    }

    // TC186 - Ten players on the field are valid.
    @Test
    void TC186_shouldAcceptTenPlayersOnField() {
        Match match = new Match();

        assertTrue(match.isMinimumPlayersValid(10));
    }

    // TC187 - A substitution batch of two players is valid.
    @Test
    void TC187_shouldAcceptTwoPlayersPerSubstitution() {
        Match match = new Match();

        assertTrue(match.isSubstitutionBatchValid(2));
    }

    // TC188 - A 28-minute extra-time half is invalid.
    @Test
    void TC188_shouldReject28MinuteExtraHalf() {
        Match match = new Match();

        assertFalse(match.isExtraHalfDurationValid(28));
    }

    // TC189 - A one-minute half-time break is within the allowed maximum.
    @Test
    void TC189_shouldAcceptOneMinuteBreak() {
        Match match = new Match();

        assertTrue(match.isBreakDurationValid(1));
    }
    
    // TC190 - Zero extra-time halves are valid.
    @Test
    void TC190_shouldAcceptZeroExtraTimeHalvesAtBoundary() {
        Match match = new Match();

        assertTrue(match.isExtraTimeCountValid(0));
    }
}