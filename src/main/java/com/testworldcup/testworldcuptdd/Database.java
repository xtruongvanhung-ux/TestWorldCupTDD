package com.testworldcup.testworldcuptdd;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private final Map<String, String> teams = new HashMap<>();
    private final Map<String, String> groups = new HashMap<>();
    private final Map<String, String> matches = new HashMap<>();
    private final Map<String, String> players = new HashMap<>();
    private final Map<String, String> results = new HashMap<>();

    // BR-DB001 - Database stores teams.
    public boolean saveTeam(String teamId, String countryName) {
        teams.put(teamId, countryName);
        return true;
    }

    public String getTeam(String teamId) {
        return teams.get(teamId);
    }

    // BR-DB002 - Database stores groups.
    public boolean saveGroup(String groupId, String groupName) {
        groups.put(groupId, groupName);
        return true;
    }

    public String getGroup(String groupId) {
        return groups.get(groupId);
    }

    // BR-DB003 - Database stores matches.
    public boolean saveMatch(String matchId, String description) {
        matches.put(matchId, description);
        return true;
    }

    public String getMatch(String matchId) {
        return matches.get(matchId);
    }

    // BR-DB004 - Database stores players.
    public boolean savePlayer(String playerId, String playerName) {
        players.put(playerId, playerName);
        return true;
    }

    // BR-DB004 - Database retrieves stored players.
    public String getPlayer(String playerId) {
        return players.get(playerId);
    }

    // BR-DB005 - Database stores match results.
    public boolean saveResult(String matchId, int homeScore, int awayScore) {
        results.put(matchId, homeScore + "-" + awayScore);
        return true;
    }

    // BR-DB005 - Database retrieves stored match results.
    public String getResult(String matchId) {
        return results.get(matchId);
    }
}