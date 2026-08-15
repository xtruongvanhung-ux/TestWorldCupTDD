package com.testworldcup.testworldcuptdd;

public class KnockoutStage {

    // BR-K001 - 16 teams participate in the round of 16.
    public boolean isRoundOf16TeamCountValid(int teamCount) {
        return teamCount == 16;
    }

    // BR-K002 - Match 1: First Group A vs Second Group B. (nhất A gặp nhì B)
    public boolean isMatch1PairingValid(String homeTeam, String awayTeam) {
        return "First A".equals(homeTeam)
            && "Second B".equals(awayTeam);
    }

    // BR-K003 - Match 2: First Group B vs Second Group A. (Nhất B gặp Nhì A)
    public boolean isMatch2PairingValid(String homeTeam, String awayTeam) {
        return "First B".equals(homeTeam)
            && "Second A".equals(awayTeam);
    }

    // BR-K004 - Match 3: First Group C vs Second Group D.
    public boolean isMatch3PairingValid(String homeTeam, String awayTeam) {
        return "First C".equals(homeTeam)
                && "Second D".equals(awayTeam);
    }

    // BR-K004 - Match 4: First Group D vs Second Group C.
    public boolean isMatch4PairingValid(String homeTeam, String awayTeam) {
        return "First D".equals(homeTeam)
                && "Second C".equals(awayTeam);
    }

    // BR-K004 - Match 5: First Group E vs Second Group F.
    public boolean isMatch5PairingValid(String homeTeam, String awayTeam) {
        return "First E".equals(homeTeam)
                && "Second F".equals(awayTeam);
    }

    // BR-K004 - Match 6: First Group F vs Second Group E.
    public boolean isMatch6PairingValid(String homeTeam, String awayTeam) {
        return "First F".equals(homeTeam)
                && "Second E".equals(awayTeam);
    }

    // BR-K004 - Match 7: First Group G vs Second Group H.
    public boolean isMatch7PairingValid(String homeTeam, String awayTeam) {
        return "First G".equals(homeTeam)
                && "Second H".equals(awayTeam);
    }

    // BR-K004 - Match 8: First Group H vs Second Group G.
    public boolean isMatch8PairingValid(String homeTeam, String awayTeam) {
        return "First H".equals(homeTeam)
                && "Second G".equals(awayTeam);
    }

    // BR-K005 - 8 winners of the round of 16 advance to the quarterfinals.
    public boolean isQuarterfinalWinnerCountValid(int winnerCount) {
        return winnerCount == 8;
    }

    // BR-K006 - Quarterfinals have 4 matches.
    public boolean isQuarterfinalMatchCountValid(int matchCount) {
        return matchCount == 4;
    }

    // BR-K007 - 4 winners of the quarterfinals advance to the semifinals.
    public boolean isSemifinalistCountValid(int winnerCount) {
        return winnerCount == 4;
    }

    // BR-K008 - The semifinals contain 2 matches.
    public boolean isSemifinalMatchCountValid(int matchCount) {
        return matchCount == 2;
    }

    // BR-K009 - 2 winners of the semifinals advance to the final.
    public boolean isFinalistCountValid(int winnerCount) {
        return winnerCount == 2;
    }

    // BR-K010 - The final winner becomes champion and receives the gold medal.
    public boolean winnerReceivesGoldMedal(boolean winner) {
        return winner;
    }

    // BR-K010 - The final loser receives the silver medal.
    public boolean loserReceivesSilverMedal(boolean loser) {
        return loser;
    }

    // BR-K010 - Both semifinal losers share third place and receive bronze medals.
    public boolean semifinalLosersReceiveBronzeMedals(int loserCount) {
        return loserCount == 2;
    }
}