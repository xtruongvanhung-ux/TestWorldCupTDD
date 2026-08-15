# Functional Requirements Specification (FRS)

## 1. Introduction

This document describes the functional requirements of the
TestWorldCupTDD application.

The requirements are derived from the implemented Java classes,
JUnit test cases, Selenium web test, and the World Cup business rules.

---

## 2. Functional Requirements

### FR-01 — Team Management

The system shall allow a team to store:

- Country name.
- Head coach.
- Assistant coaches.
- Staff member.
- Players.
- Starting players.
- Substitute players.

Validation rules:

| Requirement | Expected |
|---|---:|
| Maximum assistant coaches | 3 |
| Maximum players | 22 |
| Starting players | 7–11 |
| Maximum substitutes | 5 |

---

### FR-02 — Player Management

The system shall:

- Create a player with a name.
- Return the player's name.

---

### FR-03 — Match Management

The system shall validate:

| Rule | Expected value |
|---|---:|
| Match duration | 90 minutes |
| Half duration | 45 minutes |
| Half-time break | ≤ 15 minutes |
| Extra-time halves | 0–2 |
| Extra-time half duration | 30 minutes |
| Minimum players on field | 7 |
| Total substitutions | 0–3 |
| Players per substitution event | 1–3 |

The system shall also support:

- Silver-goal validation.
- Penalty-kick winner validation.
- Sudden-death validation.
- Yellow-card player removal.
- Red-card player removal.
- Position-independent substitutions.

---

### FR-04 — Group Stage Management

The system shall validate:

| Rule | Expected value |
|---|---:|
| Tournament teams | 32 |
| Teams per group | 4 |
| Opponents per team | 3 |
| Win points | 3 |
| Draw points | 1 |
| Loss points | 0 |

The system shall support ranking by:

1. Points.
2. Goal difference.
3. Cards.
4. Head-to-head result.
5. Draw lot.

The system shall determine whether a team qualifies for
the Round of 16 based on its position.

---

### FR-05 — Knockout Stage Management

The system shall support:

| Stage | Required count |
|---|---:|
| Round of 16 teams | 16 |
| Round of 16 winners | 8 |
| Quarterfinal matches | 4 |
| Semifinalists | 4 |
| Semifinal matches | 2 |
| Finalists | 2 |

The system shall validate the Round-of-16 pairings.

The system shall support:

- Gold medal for the winner.
- Silver medal for the final loser.
- Bronze medals for the two semifinal losers.

---

### FR-06 — Tournament Management

The system shall:

1. Initialize a tournament with 32 teams.
2. Create 8 groups.
3. Validate group size.
4. Run the group stage.
5. Record group-stage results.
6. Prepare the Round of 16.
7. Move 16 qualified teams to the Round of 16.
8. Run the knockout stage.
9. Identify the champion.
10. Store match results in the database.
11. Export tournament results.

---

### FR-07 — Top Scorer Management

The system shall:

- Record goals for players.
- Accumulate goals across matches.
- Identify the player with the highest number of goals.
- Support shared top scorers.
- Return no top scorer when no goals exist.
- Determine whether a player is a shared top scorer.

---

### FR-08 — Database Management

The system shall store and retrieve:

- Teams.
- Groups.
- Matches.
- Players.
- Match results.

The system shall return `null` when a requested record does not exist.

---

### FR-09 — Web Application

The system shall provide a web interface for match-duration validation.

The web application shall:

1. Display a homepage.
2. Allow the user to enter match duration.
3. Validate the entered value.
4. Display a valid result for 90 minutes.
5. Display an invalid result for other durations.
6. Handle invalid numeric input.

The web application shall expose the match validation through
the `/match` endpoint.

---

### FR-10 — Automated Testing

The project shall provide automated testing using JUnit 5.

The project shall provide Selenium WebDriver testing for the
web application.

The project shall generate Allure test reports.

The current project contains automated test classes covering:

- Team.
- Player.
- Match.
- Group Stage.
- Knockout Stage.
- Tournament.
- Top Scorer.
- Database.
- Project setup.
- Web application.

---

## 3. Traceability

The functional requirements shall be traced to:

- Java implementation classes.
- JUnit test cases.
- Selenium WebDriver test cases.
- Allure test results.

The final test execution shall be used to demonstrate that the
implemented functional requirements have been tested.

---

## 4. Requirements Traceability Matrix

| Requirement | Implementation | Test Cases |
|---|---|---|
| FR-01 Team Management | `Team.java` | TC-T001 – TC-T020 |
| FR-02 Player Management | `Player.java` | TC-P001 |
| FR-03 Match Management | `Match.java` | TC-T025 – TC-T071, TC-T192 – TC-T216 |
| FR-04 Group Stage Management | `GroupStage.java` | TC-T072 – TC-T103, TC-T196 – TC-T201 |
| FR-05 Knockout Stage Management | `KnockoutStage.java` | TC-T104 – TC-T153, TC-T217 – TC-T231 |
| FR-06 Tournament Management | `Tournament.java` | TC-T176 – TC-T191 |
| FR-07 Top Scorer Management | `TopScorer.java` | TC-T154 – TC-T165, TC-T237 – TC-T243 |
| FR-08 Database Management | `Database.java` | TC-T166 – TC-T175, TC-T232 – TC-T236, TC-T244 – TC-T248 |
| FR-09 Web Application | `WorldCupWebServer.java` | Selenium `MatchWebTest` |
| FR-10 Automated Testing | JUnit 5 + Selenium + Allure | 255 automated test cases |

### Test Case Distribution

| Test Suite | Number of Test Cases |
|---|---:|
| TeamTest | 20 |
| PlayerTest | 1 |
| MatchTest | 66 |
| GroupStageTest | 38 |
| KnockoutStageTest | 50 |
| TopScorerTest | 19 |
| DatabaseTest | 20 |
| TournamentTest | 16 |
| ProjectSetupTest | 3 |
| TestWorldCupTDDTest | 2 |
| Selenium MatchWebTest | 5 |
| **Total** | **240 + Selenium tests** |

> Note: The exact total reported by the current Allure/Maven execution is **255 test cases**. The detailed distribution should be verified against the generated Allure report before finalizing the report.
