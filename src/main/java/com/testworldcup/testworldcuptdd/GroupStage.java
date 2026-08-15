package com.testworldcup.testworldcuptdd;

import java.util.List;

public class GroupStage {

    // BR-G001 - World Cup has 32 teams divided into 8 groups.
    public boolean isFinalTournamentTeamCountValid(int teamCount) {
        return teamCount == 32;
    }

    // BR-G002 - Each group has 4 teams.
    public boolean isGroupTeamCountValid(int teamCount) {
        return teamCount == 4;
    }

    // BR-G003 - Each team plays against the other 3 teams in its group.
    public boolean isRoundRobinOpponentsValid(int opponentCount) {
        return opponentCount == 3;
    }

    // BR-G004 - A win gives 3 points.
    public int calculateWinPoints() {
        return 3;
    }

    // BR-G004 - A draw gives 1 point.
    public int calculateDrawPoints() {
        return 1;
    }

    // BR-G004 - A loss gives 0 points.
    public int calculateLossPoints() {
        return 0;
    }

    // BR-G005 - Ranking first compares points.
    public int compareByPoints(TeamStanding team1, TeamStanding team2) {
    return Integer.compare(team1.getPoints(), team2.getPoints());
    }

    // BR-G005 - Ranking compares goal difference after points.
    public int compareByGoalDifference(TeamStanding team1, TeamStanding team2) {
        return Integer.compare(
                team1.getGoalDifference(),
                team2.getGoalDifference()
        );
    }

    // BR-G005 - Ranking compares cards after goal difference.
    public int compareByCards(TeamStanding team1, TeamStanding team2) {
        return Integer.compare(
                team1.getYellowCards(),
                team2.getYellowCards()
        );
    }

    // BR-G005 - Ranking compares head-to-head result after cards.
    public int compareByHeadToHead(TeamStanding team1, TeamStanding team2) {
        return Integer.compare(
                team1.getHeadToHeadResult(),
                team2.getHeadToHeadResult()
        );
    }

    // BR-G005 - Ranking uses draw lot as the final criterion.
    public int compareByDrawLot(TeamStanding team1, TeamStanding team2) {
        return Integer.compare(
                team1.getDrawLotRank(),
                team2.getDrawLotRank()
        );
    }

    // BR-G006 - One red card equals two yellow cards.
    public int calculateCardWeight(int yellowCards, int redCards) {
        return yellowCards + (redCards * 2);
    }

    // BR-G007 - Continue to the next criterion only when the current criterion is equal.
    public boolean shouldCompareNextCriterion(boolean currentCriterionEqual) {
        return currentCriterionEqual;
    }

    // BR-G008 - First and second placed teams qualify for round of 16.
    public boolean qualifiesForRoundOf16(int position) {
        return position == 1 || position == 2;
    }

    // Data object used for ranking tests.
    public static class TeamStanding {

        private final int points;
        private final int goalDifference;
        private final int yellowCards;
        private final int redCards;
        private final int headToHeadResult;
        private final int drawLotRank;

        public TeamStanding(
                int points,
                int goalDifference,
                int yellowCards,
                int redCards,
                int headToHeadResult,
                int drawLotRank) {

            this.points = points;
            this.goalDifference = goalDifference;
            this.yellowCards = yellowCards;
            this.redCards = redCards;
            this.headToHeadResult = headToHeadResult;
            this.drawLotRank = drawLotRank;
        }

        public int getPoints() {
            return points;
        }

        public int getGoalDifference() {
            return goalDifference;
        }

        public int getYellowCards() {
            return yellowCards;
        }

        public int getRedCards() {
            return redCards;
        }

        public int getHeadToHeadResult() {
            return headToHeadResult;
        }

        public int getDrawLotRank() {
            return drawLotRank;
        }
    }
}