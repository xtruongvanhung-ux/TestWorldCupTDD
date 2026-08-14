package com.testworldcup.testworldcuptdd;

public class Match {

    // BR-M001 - A group-stage match lasts 90 minutes.
    public boolean isMatchDurationValid(int minutes) {
    return minutes == 90;
    }

    // BR-M002 - A match has 2 halves of 45 minutes.
    public boolean isHalfDurationValid(int minutes) {
    return minutes == 45;
    }

    // BR-M003 - Half-time break is no more than 15 minutes.
    public boolean isBreakDurationValid(int minutes) {
        return minutes <= 15;
    }

    // BR-M004 - A knockout match has at most 2 extra-time halves.
    public boolean isExtraTimeCountValid(int halfCount) {
        return halfCount >= 0 && halfCount <= 2;
    }

    // BR-M005 - Each extra-time half lasts 30 minutes.
    public boolean isExtraHalfDurationValid(int minutes) {
        return minutes == 30;
    }

    // BR-M006 - Silver-goal rule is applied after the first extra-time half.
    public boolean silverGoalEndsMatch(int homeScore, int awayScore) {
        return homeScore != awayScore;
    }

    // BR-M007 - A winner is determined after five penalty kicks if scores differ.
    public boolean hasWinnerAfterFivePenalties(
        int homeScore,
        int awayScore) {
    return homeScore != awayScore;
    }

    // BR-M007 - Equal scores after five penalty kicks require sudden death.
    public boolean requiresSuddenDeathAfterFivePenalties(
        int homeScore,
        int awayScore) {
    return homeScore == awayScore;
    }

    // BR-M008 - Second yellow card or red card requires the player to leave.
    public boolean shouldLeaveAfterYellowCards(int yellowCards) {
        return yellowCards >= 2;
    }

    public boolean shouldLeaveAfterRedCard(boolean redCard) {
        return redCard;
    }

    // BR-M009 - A team below 7 players without replacement ability loses 0-3.
    public boolean isMinimumPlayersValid(int playersOnField) {
        return playersOnField >= 7;
    }

    // BR-M010 - A team can replace at most 3 players in a match.
    public boolean isTotalSubstitutionValid(int substitutionCount) {
        return substitutionCount >= 0 && substitutionCount <= 3;
    }

    // BR-M011 - Each substitution event replaces 1 to 3 players.
    public boolean isSubstitutionBatchValid(int playersReplaced) {
        return playersReplaced >= 1 && playersReplaced <= 3;
    }

    public boolean isSubstitutionPositionIndependent() {
        return true;
    }
}