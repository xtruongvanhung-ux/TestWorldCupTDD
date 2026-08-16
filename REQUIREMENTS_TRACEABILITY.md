# Requirements Traceability Matrix

## 1. Purpose

The Requirements Traceability Matrix (RTM) establishes the relationship
between the functional requirements defined in the Software Requirements
Specification (SRS) and the implemented automated test cases.

The purpose of the RTM is to verify that each functional requirement is
mapped to one or more corresponding test cases and to identify whether
the requirements are fully covered by the current automated test suite.

The current automated test suite contains 257 test cases, including
JUnit 5 unit tests and Selenium Web UI tests.

---

## 2. Traceability Matrix

| Requirement ID | Requirement | Test Case Coverage | Test Type | Coverage Status |
|---|---|---|---|---|
| FR-01 | Team Management | TC-T001 – TC-T020 | Unit / Functional / BVA | Covered |
| FR-02 | Player Management | TC-P001 | Unit / Functional | Covered |
| FR-03 | Match Management | TC-T025 – TC-T071, TC-T192 – TC-T216, TC-T249 | Unit / Functional / BVA | Covered |
| FR-04 | Group Stage Management | TC-T072 – TC-T103 | Unit / Functional / Decision-based / BVA | Covered |
| FR-05 | Knockout Stage Management | TC-T104 – TC-T153 | Unit / Functional / BVA | Covered |
| FR-06 | Tournament Management | TC-T176 – TC-T191 | Unit / Functional | Covered |
| FR-07 | Top Scorer Management | TC-T154 – TC-T165, TC-T237 – TC-T243 | Unit / Functional | Covered |
| FR-08 | Database Management | TC-T166 – TC-T175, TC-T232 – TC-T236, TC-T244 – TC-T248 | Unit / Functional | Covered |
| FR-09 | Web Application | TC_WEB_001 – TC_WEB_006 | Selenium / Web UI | Covered |
| FR-10 | Automated Testing | ProjectSetupTest, TestWorldCupTDDTest, JUnit 5 execution, Selenium execution and Allure reporting | Automated Testing | Covered |

---

## 3. Detailed Traceability

### FR-01 — Team Management

Covered test cases:

- TC-T001 — Country name
- TC-T002 — Head coach
- TC-T003 – TC-T005 — Assistant coaches
- TC-T006 – TC-T008 — Team player count
- TC-T009 – TC-T012 — Starting players
- TC-T013 – TC-T015 — Substitute players
- TC-T016 – TC-T019 — Team collections
- TC-T020 — Staff member

The tests cover the team information and team-size rules defined in
FR-01, including assistant coaches, players, starting players,
substitutes, team collections, and staff information.

**Coverage status:** Covered

---

### FR-02 — Player Management

Covered test case:

- TC-P001 — Player stores and returns the player name.

The test verifies that a player can be created with a player name and
that the stored player name can be retrieved.

**Coverage status:** Covered

---

### FR-03 — Match Management

Covered test cases include:

- TC-T025 – TC-T071
- TC-T192 – TC-T216
- TC-T249

The tests cover:

- Match duration.
- Half duration.
- Half-time break.
- Extra-time rules.
- Silver goal.
- Penalty shootout.
- Yellow-card rules.
- Red-card rules.
- Minimum players on the field.
- Total substitutions.
- Substitution batch size.
- Position-independent substitution.

Boundary Value Analysis is applied to the numerical match rules,
including match duration, half duration, break duration, extra-time
count, extra-time duration, minimum players, and substitution limits.

**Coverage status:** Covered

---

### FR-04 — Group Stage Management

Covered test cases:

- TC-T072 – TC-T103

The tests cover:

- Final tournament team count.
- Four teams per group.
- Three opponents per team.
- Win points.
- Draw points.
- Loss points.
- Ranking by points.
- Ranking by goal difference.
- Ranking by cards.
- Ranking by head-to-head result.
- Ranking by draw lot.
- Card weighting.
- Qualification for the Round of 16.

The ranking tests also support Decision Table testing because the
ranking criteria are evaluated in sequence. Boundary Value Analysis
is applied to the main numerical group-stage rules.

**Coverage status:** Covered

---

### FR-05 — Knockout Stage Management

Covered test cases:

- TC-T104 – TC-T153

The tests cover the knockout-stage progression, including:

- Round of 16 team count.
- Round-of-16 match pairings.
- Round-of-16 winners.
- Quarterfinal matches.
- Semifinalists.
- Semifinal matches.
- Finalists.
- Final match.
- Champion.
- Gold medal.
- Silver medal.
- Bronze medal assignment.

Boundary Value Analysis is applied to the major knockout-stage
participant and match-count rules.

**Coverage status:** Covered

---

### FR-06 — Tournament Management

Covered test cases:

- TC-T176 – TC-T191

The tests cover:

- Tournament initialization with 32 teams.
- Creation of 8 groups.
- Group-size validation.
- Automatic group-stage execution.
- Recording group-stage results.
- Preparation of the Round of 16.
- Movement of 16 qualified teams to the Round of 16.
- Automatic knockout-stage execution.
- Champion identification.
- Storing match results in the database.
- Exporting tournament results.

**Coverage status:** Covered

---

### FR-07 — Top Scorer Management

Covered test cases:

- TC-T154 – TC-T165
- TC-T237 – TC-T243

The tests cover:

- Recording goals.
- Accumulating goals across matches.
- Identifying the player with the highest number of goals.
- Excluding players with fewer goals from the top-scorer result.
- Supporting two shared top scorers.
- Supporting multiple shared top scorers.
- Returning no top scorer when no goals exist.
- Identifying a shared top scorer.
- Updating the top scorer after additional goals.

**Coverage status:** Covered

---

### FR-08 — Database Management

Covered test cases:

- TC-T166 – TC-T175
- TC-T232 – TC-T236
- TC-T244 – TC-T248

The tests cover:

- Saving teams.
- Retrieving teams.
- Saving groups.
- Retrieving groups.
- Saving matches.
- Retrieving matches.
- Saving players.
- Retrieving players.
- Saving match results.
- Retrieving match results.
- Handling missing records.
- Storing and retrieving multiple records.

**Coverage status:** Covered

---

### FR-09 — Web Application

Covered Selenium test cases:

- TC_WEB_001 — Valid 90-minute match.
- TC_WEB_002 — Invalid 89-minute match.
- TC_WEB_003 — Invalid 91-minute match.
- TC_WEB_004 — Homepage UI verification.
- TC_WEB_005 — Empty match-duration input.
- TC_WEB_006 — Invalid non-numeric input.

The Selenium tests cover:

- Opening the homepage.
- Match-duration input.
- Valid match-duration validation.
- Invalid match-duration validation.
- Homepage UI elements.
- Empty-input validation.
- Invalid non-numeric input.
- Displaying the expected validation result.

The TC_WEB_006 test verifies that invalid non-numeric input is handled
correctly and that the application displays:

`INVALID: Minutes must be a number.`

**Coverage status:** Covered

---

### FR-10 — Automated Testing

The project provides automated testing using JUnit 5.

Relevant JUnit test suites include:

- ProjectSetupTest.
- TestWorldCupTDDTest.
- TeamTest.
- PlayerTest.
- MatchTest.
- GroupStageTest.
- KnockoutStageTest.
- DatabaseTest.
- TournamentTest.
- TopScorerTest.

The project also provides Selenium WebDriver testing through:

- MatchWebTest.

The project uses Maven for automated test execution and generates an
Allure report as evidence of test execution.

The automated testing requirement is therefore supported by:

- JUnit 5.
- Selenium WebDriver.
- Maven test execution.
- Allure test reporting.

**Coverage status:** Covered

---

## 4. Test Case Distribution

The current automated test suite contains 257 test cases.

| Test Suite | Number of Test Cases |
|---|---:|
| TeamTest | 20 |
| PlayerTest | 1 |
| MatchTest | 67 |
| GroupStageTest | 38 |
| KnockoutStageTest | 65 |
| DatabaseTest | 20 |
| TournamentTest | 16 |
| TopScorerTest | 19 |
| ProjectSetupTest | 3 |
| TestWorldCupTDDTest | 2 |
| Selenium MatchWebTest | 6 |
| **Total** | **257** |

---

## 5. Traceability Summary

| Requirement | Status |
|---|---|
| FR-01 — Team Management | Covered |
| FR-02 — Player Management | Covered |
| FR-03 — Match Management | Covered |
| FR-04 — Group Stage Management | Covered |
| FR-05 — Knockout Stage Management | Covered |
| FR-06 — Tournament Management | Covered |
| FR-07 — Top Scorer Management | Covered |
| FR-08 — Database Management | Covered |
| FR-09 — Web Application | Covered |
| FR-10 — Automated Testing | Covered |

### Coverage Summary

- Fully covered requirements: 10
- Partially covered requirements: 0
- Requirements without test coverage: 0

All functional requirements defined in the SRS are covered by the
current automated test suite.

---

## 6. Test Execution Evidence

The latest automated test execution produced the following result:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

The Selenium Web UI suite contains 6 test cases, and all 6 Selenium
tests passed successfully.

The automated test execution was performed using Maven and JUnit 5.
Allure reporting was used to provide additional evidence of the
automated test execution.

---

## 7. Traceability Conclusion

The Requirements Traceability Matrix establishes the relationship
between the SRS functional requirements and the automated test cases.

FR-01 through FR-08 are covered by the corresponding JUnit test
suites.

FR-09 is fully covered by the Selenium Web UI tests, including valid
duration, invalid duration, empty input, homepage UI verification,
and invalid non-numeric input.

FR-10 is supported by the project's JUnit 5 tests, Selenium WebDriver
tests, Maven test execution, and Allure reporting.

The current automated test suite contains 257 test cases and all
257 test cases passed successfully.

Therefore, the final traceability result is:

**10 / 10 functional requirements covered.**

**257 / 257 automated test cases passed — 100% pass rate.**