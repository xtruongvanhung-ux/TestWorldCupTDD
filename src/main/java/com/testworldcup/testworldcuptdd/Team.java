package com.testworldcup.testworldcuptdd;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String countryName;
    private String headCoach;
    private String staffMember;

    private final List<String> assistantCoaches = new ArrayList<>();
    private final List<Player> players = new ArrayList<>();
    private final List<Player> startingPlayers = new ArrayList<>();
    private final List<Player> substitutes = new ArrayList<>();

    // BR-T001 - Team has a country name.
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }

    // BR-T002 - Team has one head coach.
    public void setHeadCoach(String headCoach) {
        this.headCoach = headCoach;
    }

    public String getHeadCoach() {
        return headCoach;
    }

    // BR-T003 - Team has no more than 3 assistant coaches.
    public void addAssistantCoach(String coach) {
    assistantCoaches.add(coach);
    }

    // BR-T004 - Team has 1 staff/caretaker.
    public void setStaffMember(String staffMember) {
        this.staffMember = staffMember;
    }

    public String getStaffMember() {
        return staffMember;
    }

    // BR-T005 - Team has at most 22 players.
    public void addPlayer(Player player) {
        players.add(player);
    }

    // BR-T006 - Official lineup has 7 to 11 players.
    public void addStartingPlayer(Player player) {
        startingPlayers.add(player);
    }

    // BR-T007 - Team has at most 5 substitutes.
    public void addSubstitute(Player player) {
        substitutes.add(player);
    }

    // BR-T003 - Validate the number of assistant coaches.
    public boolean isAssistantCoachCountValid() {
        return assistantCoaches.size() <= 3;
    }

    // BR-T005 - Team has at most 22 players.
    public boolean isPlayerCountValid() {
        return players.size() <= 22;
    }

    // BR-T006 - Official lineup has 7 to 11 players.
    public boolean isStartingPlayerCountValid() {
        return startingPlayers.size() >= 7
            && startingPlayers.size() <= 11;
    }

    // BR-T007 - Team has at most 5 substitutes.
    public boolean isSubstituteCountValid() {
        return substitutes.size() <= 5;
    }

    public List<String> getAssistantCoaches() {
        return assistantCoaches;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Player> getStartingPlayers() {
        return startingPlayers;
    }

    public List<Player> getSubstitutes() {
        return substitutes;
    }
}