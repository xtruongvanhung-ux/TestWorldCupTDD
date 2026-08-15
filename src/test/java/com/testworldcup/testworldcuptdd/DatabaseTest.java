package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    // TC-T166 - Lưu đội bóng.
    @Test
    void TC_T166_shouldSaveTeam() {
        Database database = new Database();

        assertTrue(
                database.saveTeam("T01", "Vietnam")
        );
    }

    // TC-T167 - Truy xuất đội bóng đã lưu.
    @Test
    void TC_T167_shouldRetrieveSavedTeam() {
        Database database = new Database();

        database.saveTeam("T01", "Vietnam");

        assertEquals(
                "Vietnam",
                database.getTeam("T01")
        );
    }

    // TC-T168 - Lưu bảng đấu.
    @Test
    void TC_T168_shouldSaveGroup() {
        Database database = new Database();

        assertTrue(
                database.saveGroup("G01", "Group A")
        );
    }

    // TC-T169 - Truy xuất bảng đấu đã lưu.
    @Test
    void TC_T169_shouldRetrieveSavedGroup() {
        Database database = new Database();

        database.saveGroup("G01", "Group A");

        assertEquals(
                "Group A",
                database.getGroup("G01")
        );
    }

    // TC-T170 - Lưu trận đấu.
    @Test
    void TC_T170_shouldSaveMatch() {
        Database database = new Database();

        assertTrue(
                database.saveMatch(
                        "M01",
                        "Vietnam vs Thailand"
                )
        );
    }

    // TC-T171 - Truy xuất trận đấu đã lưu.
    @Test
    void TC_T171_shouldRetrieveSavedMatch() {
        Database database = new Database();

        database.saveMatch(
                "M01",
                "Vietnam vs Thailand"
        );

        assertEquals(
                "Vietnam vs Thailand",
                database.getMatch("M01")
        );
    }

    // TC-T172 - Lưu cầu thủ.
    @Test
    void TC_T172_shouldSavePlayer() {
        Database database = new Database();

        assertTrue(
                database.savePlayer(
                        "P01",
                        "Player A"
                )
        );
    }

    // TC-T173 - Truy xuất cầu thủ đã lưu.
    @Test
    void TC_T173_shouldRetrieveSavedPlayer() {
        Database database = new Database();

        database.savePlayer(
                "P01",
                "Player A"
        );

        assertEquals(
                "Player A",
                database.getPlayer("P01")
        );
    }

    // TC-T174 - Lưu kết quả trận đấu.
    @Test
    void TC_T174_shouldSaveMatchResult() {
        Database database = new Database();

        assertTrue(
                database.saveResult(
                        "M01",
                        2,
                        1
                )
        );
    }

    // TC-T175 - Truy xuất kết quả trận đấu đã lưu.
    @Test
    void TC_T175_shouldRetrieveSavedMatchResult() {
        Database database = new Database();

        database.saveResult(
                "M01",
                2,
                1
        );

        assertEquals(
                "2-1",
                database.getResult("M01")
        );
    }
    
    // TC-T232 - A missing team cannot be retrieved.
    @Test
    void TC_T232_shouldReturnNullForMissingTeam() {
        Database database = new Database();

        assertNull(database.getTeam("UNKNOWN"));
    }

    // TC-T233 - A missing group cannot be retrieved.
    @Test
    void TC_T233_shouldReturnNullForMissingGroup() {
        Database database = new Database();

        assertNull(database.getGroup("UNKNOWN"));
    }

    // TC-T234 - A missing match cannot be retrieved.
    @Test
    void TC_T234_shouldReturnNullForMissingMatch() {
        Database database = new Database();

        assertNull(database.getMatch("UNKNOWN"));
    }

    // TC-T235 - A missing player cannot be retrieved.
    @Test
    void TC_T235_shouldReturnNullForMissingPlayer() {
        Database database = new Database();

        assertNull(database.getPlayer("UNKNOWN"));
    }

    // TC-T236 - A missing match result cannot be retrieved.
    @Test
    void TC_T236_shouldReturnNullForMissingResult() {
        Database database = new Database();

        assertNull(database.getResult("UNKNOWN"));
    }
    
    // TC-T244 - Store and retrieve a second team.
    @Test
    void TC_T244_shouldSaveAndRetrieveSecondTeam() {
    Database database = new Database();

    assertTrue(
            database.saveTeam("T02", "Thailand")
    );

    assertEquals(
            "Thailand",
            database.getTeam("T02")
    );
}
    // TC-T245 - Store and retrieve a second group.
    @Test
    void TC_T245_shouldSaveAndRetrieveSecondGroup() {
        Database database = new Database();

        assertTrue(
                database.saveGroup("G02", "Group B")
        );

        assertEquals(
                "Group B",
                database.getGroup("G02")
        );
    }

    // TC-T246 - Store and retrieve a second match.
    @Test
    void TC_T246_shouldSaveAndRetrieveSecondMatch() {
        Database database = new Database();

        assertTrue(
                database.saveMatch(
                        "M02",
                        "Thailand vs Malaysia"
                )
        );

        assertEquals(
                "Thailand vs Malaysia",
                database.getMatch("M02")
        );
    }

    // TC-T247 - Store and retrieve a second player.
    @Test
    void TC_T247_shouldSaveAndRetrieveSecondPlayer() {
        Database database = new Database();

        assertTrue(
                database.savePlayer(
                        "P02",
                        "Player B"
                )
        );

        assertEquals(
                "Player B",
                database.getPlayer("P02")
        );
    }

    // TC-T248 - Store and retrieve a different match result.
    @Test
    void TC_T248_shouldSaveAndRetrieveSecondMatchResult() {
        Database database = new Database();

        assertTrue(
                database.saveResult(
                        "M02",
                        3,
                        2
                )
        );

        assertEquals(
                "3-2",
                database.getResult("M02")
        );
    }
}