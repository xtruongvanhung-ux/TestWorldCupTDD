package com.testworldcup.testworldcuptdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    // TC01 - Lưu đội bóng.
    @Test
    void TC01_shouldSaveTeam() {
        Database database = new Database();

        assertTrue(
                database.saveTeam("T01", "Vietnam")
        );
    }

    // TC02 - Truy xuất đội bóng đã lưu.
    @Test
    void TC02_shouldRetrieveSavedTeam() {
        Database database = new Database();

        database.saveTeam("T01", "Vietnam");

        assertEquals(
                "Vietnam",
                database.getTeam("T01")
        );
    }

    // TC03 - Lưu bảng đấu.
    @Test
    void TC03_shouldSaveGroup() {
        Database database = new Database();

        assertTrue(
                database.saveGroup("G01", "Group A")
        );
    }

    // TC04 - Truy xuất bảng đấu đã lưu.
    @Test
    void TC04_shouldRetrieveSavedGroup() {
        Database database = new Database();

        database.saveGroup("G01", "Group A");

        assertEquals(
                "Group A",
                database.getGroup("G01")
        );
    }

    // TC05 - Lưu trận đấu.
    @Test
    void TC05_shouldSaveMatch() {
        Database database = new Database();

        assertTrue(
                database.saveMatch(
                        "M01",
                        "Vietnam vs Thailand"
                )
        );
    }

    // TC06 - Truy xuất trận đấu đã lưu.
    @Test
    void TC06_shouldRetrieveSavedMatch() {
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

    // TC07 - Lưu cầu thủ.
    @Test
    void TC07_shouldSavePlayer() {
        Database database = new Database();

        assertTrue(
                database.savePlayer(
                        "P01",
                        "Player A"
                )
        );
    }

    // TC08 - Truy xuất cầu thủ đã lưu.
    @Test
    void TC08_shouldRetrieveSavedPlayer() {
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

    // TC09 - Lưu kết quả trận đấu.
    @Test
    void TC09_shouldSaveMatchResult() {
        Database database = new Database();

        assertTrue(
                database.saveResult(
                        "M01",
                        2,
                        1
                )
        );
    }

    // TC10 - Truy xuất kết quả trận đấu đã lưu.
    @Test
    void TC10_shouldRetrieveSavedMatchResult() {
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

    // TC11 - Không thể truy xuất đội bóng không tồn tại.
    @Test
    void TC11_shouldReturnNullForMissingTeam() {
        Database database = new Database();

        assertNull(database.getTeam("UNKNOWN"));
    }

    // TC12 - Không thể truy xuất bảng đấu không tồn tại.
    @Test
    void TC12_shouldReturnNullForMissingGroup() {
        Database database = new Database();

        assertNull(database.getGroup("UNKNOWN"));
    }

    // TC13 - Không thể truy xuất trận đấu không tồn tại.
    @Test
    void TC13_shouldReturnNullForMissingMatch() {
        Database database = new Database();

        assertNull(database.getMatch("UNKNOWN"));
    }

    // TC14 - Không thể truy xuất cầu thủ không tồn tại.
    @Test
    void TC14_shouldReturnNullForMissingPlayer() {
        Database database = new Database();

        assertNull(database.getPlayer("UNKNOWN"));
    }

    // TC15 - Không thể truy xuất kết quả trận đấu không tồn tại.
    @Test
    void TC15_shouldReturnNullForMissingResult() {
        Database database = new Database();

        assertNull(database.getResult("UNKNOWN"));
    }

    // TC16 - Lưu và truy xuất đội bóng thứ hai.
    @Test
    void TC16_shouldSaveAndRetrieveSecondTeam() {
        Database database = new Database();

        assertTrue(
                database.saveTeam(
                        "T02",
                        "Thailand"
                )
        );

        assertEquals(
                "Thailand",
                database.getTeam("T02")
        );
    }

    // TC17 - Lưu và truy xuất bảng đấu thứ hai.
    @Test
    void TC17_shouldSaveAndRetrieveSecondGroup() {
        Database database = new Database();

        assertTrue(
                database.saveGroup(
                        "G02",
                        "Group B"
                )
        );

        assertEquals(
                "Group B",
                database.getGroup("G02")
        );
    }

    // TC18 - Lưu và truy xuất trận đấu thứ hai.
    @Test
    void TC18_shouldSaveAndRetrieveSecondMatch() {
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

    // TC19 - Lưu và truy xuất cầu thủ thứ hai.
    @Test
    void TC19_shouldSaveAndRetrieveSecondPlayer() {
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

    // TC20 - Lưu và truy xuất một kết quả trận đấu khác.
    @Test
    void TC20_shouldSaveAndRetrieveSecondMatchResult() {
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