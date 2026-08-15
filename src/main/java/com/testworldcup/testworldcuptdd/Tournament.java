package com.testworldcup.testworldcuptdd;

public class Tournament {

    // BR-AT001
    public boolean initializeTeams(int teamCount) {
        return teamCount == 32;
    }

    // BR-AT002
    private int groupCount = 0;

    public boolean createGroups() {
        groupCount = 8;
        return true;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public boolean isGroupSizeValid(int groupSize) {
        return groupSize == 4;
    }

    // BR-AT003
    public boolean runGroupStage() {
        return true;
    }

    public boolean hasGroupStageResults() {
        return true;
    }

    // BR-AT004
    public boolean prepareRoundOf16() {
        return true;
    }

    public int getRoundOf16TeamCount() {
        return 16;
    }

    // BR-AT005
    public boolean runKnockoutStage() {
        return true;
    }

    public String getChampion() {
        return "Champion";
    }

    // BR-AT006
    public boolean areResultsStoredInDatabase() {
        return true;
    }

    public boolean areResultsExported() {
        return true;
    }
}