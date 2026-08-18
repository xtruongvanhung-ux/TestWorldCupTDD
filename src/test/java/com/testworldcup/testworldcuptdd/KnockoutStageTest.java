package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnockoutStageTest {

    // TC59 - Round of 16 has 16 teams.
    @Test
    void TC59_shouldAccept16TeamsInRoundOf16() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isRoundOf16TeamCountValid(16));
    }

    // TC60 - Round of 16 cannot have a team count different from 16.
    @Test
    void TC60_shouldRejectInvalidRoundOf16TeamCount() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isRoundOf16TeamCountValid(15));
    }

    // TC61 - Match 1 is First A versus Second B.
    @Test
    void TC61_shouldAcceptMatch1Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch1PairingValid(
                "First A",
                "Second B"
        ));
    }

    // TC62 - Match 2 is First B versus Second A.
    @Test
    void TC62_shouldAcceptMatch2Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch2PairingValid(
                "First B",
                "Second A"
        ));
    }

    // TC63 - Match 3 is First C versus Second D.
    @Test
    void TC63_shouldAcceptMatch3Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch3PairingValid(
                "First C",
                "Second D"
        ));
    }

    // TC64 - Match 4 is First D versus Second C.
    @Test
    void TC64_shouldAcceptMatch4Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch4PairingValid(
                "First D",
                "Second C"
        ));
    }

    // TC65 - Match 5 is First E versus Second F.
    @Test
    void TC65_shouldAcceptMatch5Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch5PairingValid(
                "First E",
                "Second F"
        ));
    }

    // TC66 - Match 6 is First F versus Second E.
    @Test
    void TC66_shouldAcceptMatch6Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch6PairingValid(
                "First F",
                "Second E"
        ));
    }

    // TC67 - Match 7 is First G versus Second H.
    @Test
    void TC67_shouldAcceptMatch7Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch7PairingValid(
                "First G",
                "Second H"
        ));
    }

    // TC68 - Match 8 is First H versus Second G.
    @Test
    void TC68_shouldAcceptMatch8Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch8PairingValid(
                "First H",
                "Second G"
        ));
    }

    // TC69 - 8 winners of the round of 16 advance.
    @Test
    void TC69_shouldAcceptEightRoundOf16Winners() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isQuarterfinalWinnerCountValid(8));
    }

    // TC70 - Quarterfinals contain 4 matches.
    @Test
    void TC70_shouldAcceptFourQuarterfinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isQuarterfinalMatchCountValid(4));
    }

    // TC71 - 4 quarterfinal winners advance to semifinals.
    @Test
    void TC71_shouldAcceptFourSemifinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isSemifinalistCountValid(4));
    }

    // TC72 - Semifinals contain 2 matches.
    @Test
    void TC72_shouldAcceptTwoSemifinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isSemifinalMatchCountValid(2));
    }

    // TC73 - 2 semifinal winners advance to the final.
    @Test
    void TC73_shouldAcceptTwoFinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isFinalistCountValid(2));
    }

    // TC74 - Final winner receives gold medal.
    @Test
    void TC74_shouldGiveGoldMedalToWinner() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.winnerReceivesGoldMedal(true));
    }

    // TC75 - Final loser receives silver medal.
    @Test
    void TC75_shouldGiveSilverMedalToLoser() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.loserReceivesSilverMedal(true));
    }

    // TC76 - Two semifinal losers receive bronze medals.
    @Test
    void TC76_shouldGiveBronzeMedalsToTwoSemifinalLosers() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.semifinalLosersReceiveBronzeMedals(2));
    }

    // TC77 - 15 teams are below the round of 16 boundary.
    @Test
    void TC77_shouldReject15Teams() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isRoundOf16TeamCountValid(15));
    }

    // TC78 - 16 teams meet the round of 16 boundary.
    @Test
    void TC78_shouldAccept16TeamsAtBoundary() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isRoundOf16TeamCountValid(16));
    }

    // TC79 - 17 teams exceed the round of 16 boundary.
    @Test
    void TC79_shouldReject17Teams() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isRoundOf16TeamCountValid(17));
    }

    // TC80 - 7 winners are below the quarterfinal boundary.
    @Test
    void TC80_shouldRejectSevenQuarterfinalWinners() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalWinnerCountValid(7));
    }

    // TC81 - 8 winners meet the quarterfinal boundary.
    @Test
    void TC81_shouldAcceptEightQuarterfinalWinnersAtBoundary() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isQuarterfinalWinnerCountValid(8));
    }

    // TC82 - 9 winners exceed the quarterfinal boundary.
    @Test
    void TC82_shouldRejectNineQuarterfinalWinners() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalWinnerCountValid(9));
    }

    // TC83 - 3 quarterfinal matches are below the boundary.
    @Test
    void TC83_shouldRejectThreeQuarterfinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalMatchCountValid(3));
    }

    // TC84 - 4 quarterfinal matches meet the boundary.
    @Test
    void TC84_shouldAcceptFourQuarterfinalMatchesAtBoundary() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isQuarterfinalMatchCountValid(4));
    }

    // TC85 - 5 quarterfinal matches exceed the boundary.
    @Test
    void TC85_shouldRejectFiveQuarterfinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalMatchCountValid(5));
    }

    // TC86 - 3 semifinalists are below the boundary.
    @Test
    void TC86_shouldRejectThreeSemifinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalistCountValid(3));
    }

    // TC87 - 4 semifinalists meet the boundary.
    @Test
    void TC87_shouldAcceptFourSemifinalistsAtBoundary() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isSemifinalistCountValid(4));
    }

    // TC88 - 5 semifinalists exceed the boundary.
    @Test
    void TC88_shouldRejectFiveSemifinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalistCountValid(5));
    }

    // TC89 - Match 1 rejects an incorrect home team.
    @Test
    void TC89_shouldRejectWrongHomeTeamMatch1() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch1PairingValid("First B", "Second B"));
    }

    // TC90 - Match 1 rejects an incorrect away team.
    @Test
    void TC90_shouldRejectWrongAwayTeamMatch1() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch1PairingValid("First A", "Second A"));
    }

    // TC91 - Match 2 rejects an incorrect home team.
    @Test
    void TC91_shouldRejectWrongHomeTeamMatch2() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch2PairingValid("First A", "Second A"));
    }

    // TC92 - Match 2 rejects an incorrect away team.
    @Test
    void TC92_shouldRejectWrongAwayTeamMatch2() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch2PairingValid("First B", "Second B"));
    }

    // TC93 - Match 3 rejects an incorrect home team.
    @Test
    void TC93_shouldRejectWrongHomeTeamMatch3() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch3PairingValid("First D", "Second D"));
    }

    // TC94 - Match 3 rejects an incorrect away team.
    @Test
    void TC94_shouldRejectWrongAwayTeamMatch3() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch3PairingValid("First C", "Second C"));
    }

    // TC95 - Match 4 rejects an incorrect home team.
    @Test
    void TC95_shouldRejectWrongHomeTeamMatch4() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch4PairingValid("First C", "Second C"));
    }

    // TC96 - Match 4 rejects an incorrect away team.
    @Test
    void TC96_shouldRejectWrongAwayTeamMatch4() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch4PairingValid("First D", "Second D"));
    }

    // TC97 - Match 5 rejects an incorrect home team.
    @Test
    void TC97_shouldRejectWrongHomeTeamMatch5() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch5PairingValid("First F", "Second F"));
    }

    // TC98 - Match 5 rejects an incorrect away team.
    @Test
    void TC98_shouldRejectWrongAwayTeamMatch5() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch5PairingValid("First E", "Second E"));
    }

    // TC99 - Match 6 rejects an incorrect home team.
    @Test
    void TC99_shouldRejectWrongHomeTeamMatch6() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch6PairingValid("First E", "Second E"));
    }

    // TC100 - Match 6 rejects an incorrect away team.
    @Test
    void TC100_shouldRejectWrongAwayTeamMatch6() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch6PairingValid("First F", "Second F"));
    }

    // TC101 - Match 7 rejects an incorrect home team.
    @Test
    void TC101_shouldRejectWrongHomeTeamMatch7() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch7PairingValid("First H", "Second H"));
    }

    // TC102 - Match 7 rejects an incorrect away team.
    @Test
    void TC102_shouldRejectWrongAwayTeamMatch7() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch7PairingValid("First G", "Second G"));
    }

    // TC103 - Match 8 rejects an incorrect home team.
    @Test
    void TC103_shouldRejectWrongHomeTeamMatch8() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch8PairingValid("First G", "Second G"));
    }

    // TC104 - Match 8 rejects an incorrect away team.
    @Test
    void TC104_shouldRejectWrongAwayTeamMatch8() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch8PairingValid("First H", "Second H"));
    }

    // TC105 - Five semifinalists are invalid.
    @Test
    void TC105_shouldRejectFiveSemifinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalistCountValid(5));
    }

    // TC106 - Three finalists are invalid.
    @Test
    void TC106_shouldRejectThreeFinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isFinalistCountValid(3));
    }

    // TC107 - Three semifinal losers are invalid.
    @Test
    void TC107_shouldRejectThreeSemifinalLosers() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.semifinalLosersReceiveBronzeMedals(3));
    }

    // TC108 - Three semifinal matches are invalid.
    @Test
    void TC108_shouldRejectThreeSemifinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalMatchCountValid(3));
    }

    // TC109 - Zero teams cannot form the round of 16.
    @Test
    void TC109_shouldRejectZeroTeamsInRoundOf16() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isRoundOf16TeamCountValid(0));
    }

    // TC110 - A negative team count is invalid for the round of 16.
    @Test
    void TC110_shouldRejectNegativeRoundOf16TeamCount() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isRoundOf16TeamCountValid(-1));
    }

    // TC111 - Zero quarterfinal winners are invalid.
    @Test
    void TC111_shouldRejectZeroQuarterfinalWinners() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalWinnerCountValid(0));
    }

    // TC112 - Six quarterfinal winners are invalid.
    @Test
    void TC112_shouldRejectSixQuarterfinalWinners() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalWinnerCountValid(6));
    }

    // TC113 - Ten quarterfinal winners are invalid.
    @Test
    void TC113_shouldRejectTenQuarterfinalWinners() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalWinnerCountValid(10));
    }

    // TC114 - Zero quarterfinal matches are invalid.
    @Test
    void TC114_shouldRejectZeroQuarterfinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalMatchCountValid(0));
    }

    // TC115 - Six quarterfinal matches are invalid.
    @Test
    void TC115_shouldRejectSixQuarterfinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalMatchCountValid(6));
    }

    // TC116 - Zero semifinalists are invalid.
    @Test
    void TC116_shouldRejectZeroSemifinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalistCountValid(0));
    }

    // TC117 - One semifinalist is invalid.
    @Test
    void TC117_shouldRejectOneSemifinalist() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalistCountValid(1));
    }

    // TC118 - Six semifinalists are invalid.
    @Test
    void TC118_shouldRejectSixSemifinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalistCountValid(6));
    }

    // TC119 - Zero semifinal matches are invalid.
    @Test
    void TC119_shouldRejectZeroSemifinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalMatchCountValid(0));
    }

    // TC120 - One semifinal match is invalid.
    @Test
    void TC120_shouldRejectOneSemifinalMatch() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalMatchCountValid(1));
    }

    // TC121 - Zero finalists are invalid.
    @Test
    void TC121_shouldRejectZeroFinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isFinalistCountValid(0));
    }

    // TC122 - One finalist is invalid.
    @Test
    void TC122_shouldRejectOneFinalist() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isFinalistCountValid(1));
    }

    // TC123 - Four finalists are invalid.
    @Test
    void TC123_shouldRejectFourFinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isFinalistCountValid(4));
    }
}