package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnockoutStageTest {

    // TC-T104 - Round of 16 has 16 teams.
    @Test
    void TC_T104_shouldAccept16TeamsInRoundOf16() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isRoundOf16TeamCountValid(16));
    }

    // TC-T105 - Round of 16 cannot have a team count different from 16.
    @Test
    void TC_T105_shouldRejectInvalidRoundOf16TeamCount() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isRoundOf16TeamCountValid(15));
    }

    // TC-T106 - Match 1 is First A versus Second B.
    @Test
    void TC_T106_shouldAcceptMatch1Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch1PairingValid(
                "First A",
                "Second B"
        ));
    }

    // TC-T107 - Match 2 is First B versus Second A.
    @Test
    void TC_T107_shouldAcceptMatch2Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch2PairingValid(
                "First B",
                "Second A"
        ));
    }

    // TC-T108 - Match 3 is First C versus Second D.
    @Test
    void TC_T108_shouldAcceptMatch3Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch3PairingValid(
                "First C",
                "Second D"
        ));
    }

    // TC-T109 - Match 4 is First D versus Second C.
    @Test
    void TC_T109_shouldAcceptMatch4Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch4PairingValid(
                "First D",
                "Second C"
        ));
    }

    // TC-T110 - Match 5 is First E versus Second F.
    @Test
    void TC_T110_shouldAcceptMatch5Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch5PairingValid(
                "First E",
                "Second F"
        ));
    }

    // TC-T111 - Match 6 is First F versus Second E.
    @Test
    void TC_T111_shouldAcceptMatch6Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch6PairingValid(
                "First F",
                "Second E"
        ));
    }

    // TC-T112 - Match 7 is First G versus Second H.
    @Test
    void TC_T112_shouldAcceptMatch7Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch7PairingValid(
                "First G",
                "Second H"
        ));
    }

    // TC-T113 - Match 8 is First H versus Second G.
    @Test
    void TC_T113_shouldAcceptMatch8Pairing() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isMatch8PairingValid(
                "First H",
                "Second G"
        ));
    }

    // TC-T114 - 8 winners of the round of 16 advance.
    @Test
    void TC_T114_shouldAcceptEightRoundOf16Winners() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isQuarterfinalWinnerCountValid(8));
    }

    // TC-T115 - Quarterfinals contain 4 matches.
    @Test
    void TC_T115_shouldAcceptFourQuarterfinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isQuarterfinalMatchCountValid(4));
    }

    // TC-T116 - 4 quarterfinal winners advance to semifinals.
    @Test
    void TC_T116_shouldAcceptFourSemifinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isSemifinalistCountValid(4));
    }

    // TC-T117 - Semifinals contain 2 matches.
    @Test
    void TC_T117_shouldAcceptTwoSemifinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isSemifinalMatchCountValid(2));
    }

    // TC-T118 - 2 semifinal winners advance to the final.
    @Test
    void TC_T118_shouldAcceptTwoFinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isFinalistCountValid(2));
    }

    // TC-T119 - Final winner receives gold medal.
    @Test
    void TC_T119_shouldGiveGoldMedalToWinner() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.winnerReceivesGoldMedal(true));
    }

    // TC-T120 - Final loser receives silver medal.
    @Test
    void TC_T120_shouldGiveSilverMedalToLoser() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.loserReceivesSilverMedal(true));
    }

    // TC-T121 - Two semifinal losers receive bronze medals.
    @Test
    void TC_T121_shouldGiveBronzeMedalsToTwoSemifinalLosers() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.semifinalLosersReceiveBronzeMedals(2));
    }

    // TC-T122 - 15 teams are below the round of 16 boundary.
    @Test
    void TC_T122_shouldReject15Teams() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isRoundOf16TeamCountValid(15));
    }

    // TC-T123 - 16 teams meet the round of 16 boundary.
    @Test
    void TC_T123_shouldAccept16TeamsAtBoundary() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isRoundOf16TeamCountValid(16));
    }

    // TC-T124 - 17 teams exceed the round of 16 boundary.
    @Test
    void TC_T124_shouldReject17Teams() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isRoundOf16TeamCountValid(17));
    }

    // TC-T125 - 7 winners are below the quarterfinal boundary.
    @Test
    void TC_T125_shouldRejectSevenQuarterfinalWinners() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalWinnerCountValid(7));
    }

    // TC-T126 - 8 winners meet the quarterfinal boundary.
    @Test
    void TC_T126_shouldAcceptEightQuarterfinalWinnersAtBoundary() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isQuarterfinalWinnerCountValid(8));
    }

    // TC-T127 - 9 winners exceed the quarterfinal boundary.
    @Test
    void TC_T127_shouldRejectNineQuarterfinalWinners() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalWinnerCountValid(9));
    }

    // TC-T128 - 3 quarterfinal matches are below the boundary.
    @Test
    void TC_T128_shouldRejectThreeQuarterfinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalMatchCountValid(3));
    }

    // TC-T129 - 4 quarterfinal matches meet the boundary.
    @Test
    void TC_T129_shouldAcceptFourQuarterfinalMatchesAtBoundary() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isQuarterfinalMatchCountValid(4));
    }

    // TC-T130 - 5 quarterfinal matches exceed the boundary.
    @Test
    void TC_T130_shouldRejectFiveQuarterfinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalMatchCountValid(5));
    }

    // TC-T131 - 3 semifinalists are below the boundary.
    @Test
    void TC_T131_shouldRejectThreeSemifinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalistCountValid(3));
    }

    // TC-T132 - 4 semifinalists meet the boundary.
    @Test
    void TC_T132_shouldAcceptFourSemifinalistsAtBoundary() {
        KnockoutStage stage = new KnockoutStage();

        assertTrue(stage.isSemifinalistCountValid(4));
    }

    // TC-T133 - 5 semifinalists exceed the boundary.
    @Test
    void TC_T133_shouldRejectFiveSemifinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalistCountValid(5));
    }
    
    // TC-T134 - Match 1 rejects an incorrect home team.
    @Test
    void TC_T134_shouldRejectWrongHomeTeamMatch1() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch1PairingValid("First B", "Second B"));
    }

    // TC-T135 - Match 1 rejects an incorrect away team.
    @Test
    void TC_T135_shouldRejectWrongAwayTeamMatch1() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch1PairingValid("First A", "Second A"));
    }

    // TC-T136 - Match 2 rejects an incorrect home team.
    @Test
    void TC_T136_shouldRejectWrongHomeTeamMatch2() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch2PairingValid("First A", "Second A"));
    }

    // TC-T137 - Match 2 rejects an incorrect away team.
    @Test
    void TC_T137_shouldRejectWrongAwayTeamMatch2() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch2PairingValid("First B", "Second B"));
    }

    // TC-T138 - Match 3 rejects an incorrect home team.
    @Test
    void TC_T138_shouldRejectWrongHomeTeamMatch3() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch3PairingValid("First D", "Second D"));
    }

    // TC-T139 - Match 3 rejects an incorrect away team.
    @Test
    void TC_T139_shouldRejectWrongAwayTeamMatch3() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch3PairingValid("First C", "Second C"));
    }

    // TC-T140 - Match 4 rejects an incorrect home team.
    @Test
    void TC_T140_shouldRejectWrongHomeTeamMatch4() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch4PairingValid("First C", "Second C"));
    }

    // TC-T141 - Match 4 rejects an incorrect away team.
    @Test
    void TC_T141_shouldRejectWrongAwayTeamMatch4() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch4PairingValid("First D", "Second D"));
    }

    // TC-T142 - Match 5 rejects an incorrect home team.
    @Test
    void TC_T142_shouldRejectWrongHomeTeamMatch5() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch5PairingValid("First F", "Second F"));
    }

    // TC-T143 - Match 5 rejects an incorrect away team.
    @Test
    void TC_T143_shouldRejectWrongAwayTeamMatch5() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch5PairingValid("First E", "Second E"));
    }

    // TC-T144 - Match 6 rejects an incorrect home team.
    @Test
    void TC_T144_shouldRejectWrongHomeTeamMatch6() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch6PairingValid("First E", "Second E"));
    }

    // TC-T145 - Match 6 rejects an incorrect away team.
    @Test
    void TC_T145_shouldRejectWrongAwayTeamMatch6() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch6PairingValid("First F", "Second F"));
    }

    // TC-T146 - Match 7 rejects an incorrect home team.
    @Test
    void TC_T146_shouldRejectWrongHomeTeamMatch7() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch7PairingValid("First H", "Second H"));
    }

    // TC-T147 - Match 7 rejects an incorrect away team.
    @Test
    void TC_T147_shouldRejectWrongAwayTeamMatch7() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch7PairingValid("First G", "Second G"));
    }

    // TC-T148 - Match 8 rejects an incorrect home team.
    @Test
    void TC_T148_shouldRejectWrongHomeTeamMatch8() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch8PairingValid("First G", "Second G"));
    }

    // TC-T149 - Match 8 rejects an incorrect away team.
    @Test
    void TC_T149_shouldRejectWrongAwayTeamMatch8() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isMatch8PairingValid("First H", "Second H"));
    }

    // TC-T150 - Five semifinalists are invalid.
    @Test
    void TC_T150_shouldRejectFiveSemifinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalistCountValid(5));
    }

    // TC-T151 - Three finalists are invalid.
    @Test
    void TC_T151_shouldRejectThreeFinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isFinalistCountValid(3));
    }

    // TC-T152 - Three semifinal losers are invalid.
    @Test
    void TC_T152_shouldRejectThreeSemifinalLosers() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.semifinalLosersReceiveBronzeMedals(3));
    }
    
    // TC-T153 - Three semifinal matches are invalid.
    @Test
    void TC_T153_shouldRejectThreeSemifinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalMatchCountValid(3));
    }
    
    // TC-T217 - Zero teams cannot form the round of 16.
    @Test
    void TC_T217_shouldRejectZeroTeamsInRoundOf16() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isRoundOf16TeamCountValid(0));
    }

    // TC-T218 - A negative team count is invalid for the round of 16.
    @Test
    void TC_T218_shouldRejectNegativeRoundOf16TeamCount() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isRoundOf16TeamCountValid(-1));
    }

    // TC-T219 - Zero quarterfinal winners are invalid.
    @Test
    void TC_T219_shouldRejectZeroQuarterfinalWinners() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalWinnerCountValid(0));
    }

    // TC-T220 - Six quarterfinal winners are invalid.
    @Test
    void TC_T220_shouldRejectSixQuarterfinalWinners() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalWinnerCountValid(6));
    }

    // TC-T221 - Ten quarterfinal winners are invalid.
    @Test
    void TC_T221_shouldRejectTenQuarterfinalWinners() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalWinnerCountValid(10));
    }

    // TC-T222 - Zero quarterfinal matches are invalid.
    @Test
    void TC_T222_shouldRejectZeroQuarterfinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalMatchCountValid(0));
    }

    // TC-T223 - Six quarterfinal matches are invalid.
    @Test
    void TC_T223_shouldRejectSixQuarterfinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isQuarterfinalMatchCountValid(6));
    }

    // TC-T224 - Zero semifinalists are invalid.
    @Test
    void TC_T224_shouldRejectZeroSemifinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalistCountValid(0));
    }

    // TC-T225 - One semifinalist is invalid.
    @Test
    void TC_T225_shouldRejectOneSemifinalist() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalistCountValid(1));
    }

    // TC-T226 - Six semifinalists are invalid.
    @Test
    void TC_T226_shouldRejectSixSemifinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalistCountValid(6));
    }

    // TC-T227 - Zero semifinal matches are invalid.
    @Test
    void TC_T227_shouldRejectZeroSemifinalMatches() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalMatchCountValid(0));
    }

    // TC-T228 - One semifinal match is invalid.
    @Test
    void TC_T228_shouldRejectOneSemifinalMatch() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isSemifinalMatchCountValid(1));
    }

    // TC-T229 - Zero finalists are invalid.
    @Test
    void TC_T229_shouldRejectZeroFinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isFinalistCountValid(0));
    }

    // TC-T230 - One finalist is invalid.
    @Test
    void TC_T230_shouldRejectOneFinalist() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isFinalistCountValid(1));
    }

    // TC-T231 - Four finalists are invalid.
    @Test
    void TC_T231_shouldRejectFourFinalists() {
        KnockoutStage stage = new KnockoutStage();

        assertFalse(stage.isFinalistCountValid(4));
    }
}