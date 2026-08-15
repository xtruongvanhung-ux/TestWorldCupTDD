package com.testworldcup.testworldcuptdd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopScorer {

    private final Map<String, Integer> goalsByPlayer = new HashMap<>();

    // BR-S001 - Record a player who scores in a match.
    public void recordGoal(String playerName) {
        goalsByPlayer.put(
                playerName,
                goalsByPlayer.getOrDefault(playerName, 0) + 1
        );
    }

    // BR-S001 - Return the current goal list tracked for the tournament.
    public Map<String, Integer> getGoalScorers() {
        return goalsByPlayer;
    }

    // BR-S002 - Return the player(s) with the highest number of goals.
    public List<String> getTopScorers() {
        if (goalsByPlayer.isEmpty()) {
            return new ArrayList<>();
        }

        int maxGoals = 0;

        for (int goals : goalsByPlayer.values()) {
            if (goals > maxGoals) {
                maxGoals = goals;
            }
        }

        List<String> topScorers = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : goalsByPlayer.entrySet()) {
            if (entry.getValue() == maxGoals) {
                topScorers.add(entry.getKey());
            }
        }

        topScorers.sort(String::compareTo);

        return topScorers;
    }

    // BR-S003 - Players tied for the highest number of goals share the award.
    public boolean isSharedTopScorer(String playerName) {
        List<String> topScorers = getTopScorers();

        return topScorers.size() > 1
                && topScorers.contains(playerName);
    }
}