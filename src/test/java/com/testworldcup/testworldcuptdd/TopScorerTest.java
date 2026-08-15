package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TopScorerTest {

    // TC-T154 - Record a player who scores in a match.
    @Test
    void TC_T154_shouldRecordGoalScorer() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");

        assertEquals(1, topScorer.getGoalScorers().get("Player A"));
    }

    // TC-T155 - Track scorers across multiple matches.
    @Test
    void TC_T155_shouldTrackGoalsAcrossMultipleMatches() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player B");

        Map<String, Integer> scorers = topScorer.getGoalScorers();

        assertEquals(2, scorers.get("Player A"));
        assertEquals(1, scorers.get("Player B"));
    }

    // TC-T156 - The player with the highest number of goals is the top scorer.
    @Test
    void TC_T156_shouldReturnPlayerWithMostGoals() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player B");

        assertEquals(
                List.of("Player A"),
                topScorer.getTopScorers()
        );
    }

    // TC-T157 - A player with fewer goals is not the top scorer.
    @Test
    void TC_T157_shouldNotReturnPlayerWithFewerGoals() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player B");
        topScorer.recordGoal("Player B");

        assertFalse(topScorer.getTopScorers().contains("Player A"));
    }

    // TC-T158 - Two players tied for most goals share the award.
    @Test
    void TC_T158_shouldReturnTwoSharedTopScorers() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");

        topScorer.recordGoal("Player B");
        topScorer.recordGoal("Player B");

        assertEquals(
                List.of("Player A", "Player B"),
                topScorer.getTopScorers()
        );
    }

    // TC-T159 - Multiple players tied for most goals share the award.
    @Test
    void TC_T159_shouldReturnMultipleSharedTopScorers() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");

        topScorer.recordGoal("Player B");
        topScorer.recordGoal("Player B");

        topScorer.recordGoal("Player C");
        topScorer.recordGoal("Player C");

        assertEquals(3, topScorer.getTopScorers().size());
    }

    // TC-T160 - Zero recorded goals means no top scorer.
    @Test
    void TC_T160_shouldReturnNoTopScorerWhenNoGoalsAreRecorded() {
        TopScorer topScorer = new TopScorer();

        assertTrue(topScorer.getTopScorers().isEmpty());
    }

    // TC-T161 - One recorded goal creates a top scorer.
    @Test
    void TC_T161_shouldAcceptOneGoalAsHighestScore() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");

        assertEquals(
                List.of("Player A"),
                topScorer.getTopScorers()
        );
    }

    // TC-T162 - The player with the highest goal count is identified.
    @Test
    void TC_T162_shouldIdentifyHighestGoalCount() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player B");
        topScorer.recordGoal("Player B");

        assertTrue(topScorer.getTopScorers().contains("Player B"));
    }

    // TC-T163 - Players with equal highest goal counts share the award.
    @Test
    void TC_T163_shouldIdentifySharedTopScorer() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player B");

        assertTrue(topScorer.isSharedTopScorer("Player A"));
        assertTrue(topScorer.isSharedTopScorer("Player B"));
    }
    
    // TC-T164 - A single top scorer does not create a shared award.
    @Test
    void TC_T164_shouldReturnFalseWhenThereIsOnlyOneTopScorer() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");

        assertFalse(topScorer.isSharedTopScorer("Player A"));
    }

    // TC-T165 - A non-top player does not share the award.
    @Test
    void TC_T165_shouldReturnFalseForNonTopScorer() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");

        topScorer.recordGoal("Player B");
        topScorer.recordGoal("Player B");

        assertFalse(topScorer.isSharedTopScorer("Player C"));
    }
    
    // TC-T237 - Three goals by one player are accumulated.
    @Test
    void TC_T237_shouldAccumulateThreeGoalsForOnePlayer() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");

        assertEquals(
                3,
                topScorer.getGoalScorers().get("Player A")
        );
    }

    // TC-T238 - A player with three goals leads a player with two goals.
    @Test
    void TC_T238_shouldReturnPlayerWithThreeGoalsAsTopScorer() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");

        topScorer.recordGoal("Player B");
        topScorer.recordGoal("Player B");

        assertEquals(
                List.of("Player A"),
                topScorer.getTopScorers()
        );
    }

    // TC-T239 - One player leads among three players.
    @Test
    void TC_T239_shouldIdentifySingleLeaderAmongThreePlayers() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");

        topScorer.recordGoal("Player B");

        topScorer.recordGoal("Player C");

        assertEquals(1, topScorer.getTopScorers().size());
        assertTrue(topScorer.getTopScorers().contains("Player A"));
    }

    // TC-T240 - A trailing player becomes a shared top scorer after catching up.
    @Test
    void TC_T240_shouldCreateSharedTopScorerAfterPlayerCatchesUp() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");

        topScorer.recordGoal("Player B");
        topScorer.recordGoal("Player B");

        assertEquals(
                List.of("Player A", "Player B"),
                topScorer.getTopScorers()
        );
    }

    // TC-T241 - An additional goal changes the top scorer.
    @Test
    void TC_T241_shouldUpdateTopScorerAfterAdditionalGoal() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player B");

        topScorer.recordGoal("Player A");

        assertEquals(
                List.of("Player A"),
                topScorer.getTopScorers()
        );
    }

    // TC-T242 - No goals means there is no shared top scorer.
    @Test
    void TC_T242_shouldNotHaveSharedTopScorerWhenNoGoalsExist() {
        TopScorer topScorer = new TopScorer();

        assertFalse(
                topScorer.isSharedTopScorer("Player A")
        );
    }

    // TC-T243 - Three players with equal highest scores share the award.
    @Test
    void TC_T243_shouldIdentifyThreeSharedTopScorers() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player B");
        topScorer.recordGoal("Player C");

        assertEquals(3, topScorer.getTopScorers().size());

        assertTrue(topScorer.isSharedTopScorer("Player A"));
        assertTrue(topScorer.isSharedTopScorer("Player B"));
        assertTrue(topScorer.isSharedTopScorer("Player C"));
    }
}