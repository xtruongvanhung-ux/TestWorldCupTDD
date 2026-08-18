package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TopScorerTest {

    // TC217 - Record a player who scores in a match.
    @Test
    void TC217_shouldRecordGoalScorer() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");

        assertEquals(1, topScorer.getGoalScorers().get("Player A"));
    }

    // TC218 - Track scorers across multiple matches.
    @Test
    void TC218_shouldTrackGoalsAcrossMultipleMatches() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player B");

        Map<String, Integer> scorers = topScorer.getGoalScorers();

        assertEquals(2, scorers.get("Player A"));
        assertEquals(1, scorers.get("Player B"));
    }

    // TC219 - The player with the highest number of goals is the top scorer.
    @Test
    void TC219_shouldReturnPlayerWithMostGoals() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player B");

        assertEquals(
                List.of("Player A"),
                topScorer.getTopScorers()
        );
    }

    // TC220 - A player with fewer goals is not the top scorer.
    @Test
    void TC220_shouldNotReturnPlayerWithFewerGoals() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player B");
        topScorer.recordGoal("Player B");

        assertFalse(topScorer.getTopScorers().contains("Player A"));
    }

    // TC221 - Two players tied for most goals share the award.
    @Test
    void TC221_shouldReturnTwoSharedTopScorers() {
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

    // TC222 - Multiple players tied for most goals share the award.
    @Test
    void TC222_shouldReturnMultipleSharedTopScorers() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");

        topScorer.recordGoal("Player B");
        topScorer.recordGoal("Player B");

        topScorer.recordGoal("Player C");
        topScorer.recordGoal("Player C");

        assertEquals(3, topScorer.getTopScorers().size());
    }

    // TC223 - Zero recorded goals means no top scorer.
    @Test
    void TC223_shouldReturnNoTopScorerWhenNoGoalsAreRecorded() {
        TopScorer topScorer = new TopScorer();

        assertTrue(topScorer.getTopScorers().isEmpty());
    }

    // TC224 - One recorded goal creates a top scorer.
    @Test
    void TC224_shouldAcceptOneGoalAsHighestScore() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");

        assertEquals(
                List.of("Player A"),
                topScorer.getTopScorers()
        );
    }

    // TC225 - The player with the highest goal count is identified.
    @Test
    void TC225_shouldIdentifyHighestGoalCount() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player B");
        topScorer.recordGoal("Player B");

        assertTrue(topScorer.getTopScorers().contains("Player B"));
    }

    // TC226 - Players with equal highest goal counts share the award.
    @Test
    void TC226_shouldIdentifySharedTopScorer() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player B");

        assertTrue(topScorer.isSharedTopScorer("Player A"));
        assertTrue(topScorer.isSharedTopScorer("Player B"));
    }
    
    // TC227 - A single top scorer does not create a shared award.
    @Test
    void TC227_shouldReturnFalseWhenThereIsOnlyOneTopScorer() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");

        assertFalse(topScorer.isSharedTopScorer("Player A"));
    }

    // TC228 - A non-top player does not share the award.
    @Test
    void TC228_shouldReturnFalseForNonTopScorer() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");

        topScorer.recordGoal("Player B");
        topScorer.recordGoal("Player B");

        assertFalse(topScorer.isSharedTopScorer("Player C"));
    }
    
    // TC229 - Three goals by one player are accumulated.
    @Test
    void TC229_shouldAccumulateThreeGoalsForOnePlayer() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");

        assertEquals(
                3,
                topScorer.getGoalScorers().get("Player A")
        );
    }

    // TC230 - A player with three goals leads a player with two goals.
    @Test
    void TC230_shouldReturnPlayerWithThreeGoalsAsTopScorer() {
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

    // TC231 - One player leads among three players.
    @Test
    void TC231_shouldIdentifySingleLeaderAmongThreePlayers() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player A");

        topScorer.recordGoal("Player B");

        topScorer.recordGoal("Player C");

        assertEquals(1, topScorer.getTopScorers().size());
        assertTrue(topScorer.getTopScorers().contains("Player A"));
    }

    // TC232 - A trailing player becomes a shared top scorer after catching up.
    @Test
    void TC232_shouldCreateSharedTopScorerAfterPlayerCatchesUp() {
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

    // TC233 - An additional goal changes the top scorer.
    @Test
    void TC233_shouldUpdateTopScorerAfterAdditionalGoal() {
        TopScorer topScorer = new TopScorer();

        topScorer.recordGoal("Player A");
        topScorer.recordGoal("Player B");

        topScorer.recordGoal("Player A");

        assertEquals(
                List.of("Player A"),
                topScorer.getTopScorers()
        );
    }

    // TC234 - No goals means there is no shared top scorer.
    @Test
    void TC234_shouldNotHaveSharedTopScorerWhenNoGoalsExist() {
        TopScorer topScorer = new TopScorer();

        assertFalse(
                topScorer.isSharedTopScorer("Player A")
        );
    }

    // TC235 - Three players with equal highest scores share the award.
    @Test
    void TC235_shouldIdentifyThreeSharedTopScorers() {
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