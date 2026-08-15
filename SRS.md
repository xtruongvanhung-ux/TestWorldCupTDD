# SOFTWARE REQUIREMENTS SPECIFICATION (SRS)

## World Cup Test Application

---

## 1. Introduction

### 1.1 Purpose

This document specifies the software requirements for the World Cup Test
Application.

The project is developed using Java and follows a Test-Driven Development
(TDD) approach. The system models and validates rules related to a World
Cup football tournament, including teams, players, group-stage matches,
knockout-stage matches, tournament results, top scorers, database
operations, and web-based validation.

The purpose of this document is to define the functional requirements
that are implemented and verified through automated tests.

---

### 1.2 Scope

The World Cup Test Application provides functionality for:

- Managing teams and players.
- Managing team staff and coaches.
- Validating match duration and match rules.
- Managing group-stage rules.
- Managing knockout-stage rules.
- Managing tournament progression.
- Tracking top goal scorers.
- Saving and retrieving tournament data.
- Testing the web interface using Selenium WebDriver.
- Generating automated test reports.

---

### 1.3 Technology

The project uses the following technologies:

- Java
- JUnit 5
- Maven
- Selenium WebDriver
- Apache NetBeans
- Allure Report
- Git / GitHub

---

### 1.4 Testing Approach

The project follows a Test-Driven Development (TDD) approach.

The main process is:

1. Define a business requirement.
2. Define test cases for the requirement.
3. Implement the required functionality.
4. Execute automated tests.
5. Verify that the tests pass.
6. Generate test reports.

The project contains unit tests for the main business classes and
Selenium WebDriver tests for the web interface.

The test suite applies several testing techniques, including:

- Functional testing.
- Equivalence Partitioning.
- Boundary Value Analysis.
- Decision-based testing.
- White-box testing.
- Unit testing.
- Web UI testing.

---

# 2. Functional Requirements

## FR-01: Team Management

The system shall support team information including:

- Country name.
- Head coach.
- Assistant coaches.
- Players.
- Starting players.
- Substitute players.
- Staff member.

The system shall validate:

- A team may have up to 3 assistant coaches.
- A team may have between 21 and 22 players.
- The starting lineup must contain between 7 and 11 players.
- A team may have between 4 and 5 substitute players.

---

## FR-02: Player Management

The system shall allow a player to be created with a player name.

The system shall return the stored player name.

---

## FR-03: Match Management

The system shall validate World Cup match rules including:

- A group-stage match lasts 90 minutes.
- Each half lasts 45 minutes.
- Half-time break is no more than 15 minutes.
- A knockout match may have from 0 to 2 extra-time halves.
- Each extra-time half lasts 30 minutes.
- A silver goal may end the match when the scores are different.
- A winner may be determined after five penalty kicks when scores differ.
- Equal penalty scores after five kicks require sudden death.
- A player must leave after receiving two or more yellow cards.
- A player must leave after receiving a red card.
- A team must have at least 7 players on the field.
- A team may make at most 3 substitutions.
- Each substitution event may replace between 1 and 3 players.
- Player position does not restrict substitution.

---

## FR-04: Group Stage Management

The system shall support group-stage rules including:

- The final tournament contains 32 teams.
- Each group contains 4 teams.
- Each team plays against 3 opponents.
- A win gives 3 points.
- A draw gives 1 point.
- A loss gives 0 points.

The system shall support ranking criteria including:

1. Points.
2. Goal difference.
3. Cards.
4. Head-to-head result.
5. Draw lot.

The system shall treat one red card as equivalent to two yellow cards
for card weighting.

The system shall allow teams in first and second place to qualify for
the Round of 16.

---

## FR-05: Knockout Stage Management

The system shall support the Round of 16 with 16 teams.

The system shall validate the Round-of-16 match pairings.

The system shall support:

- 8 Round-of-16 winners.
- 4 quarterfinal matches.
- 4 semifinalists.
- 2 semifinal matches.
- 2 finalists.
- 1 final match.
- 1 tournament champion.

The system shall support medal assignment:

- The final winner receives the gold medal.
- The final loser receives the silver medal.
- Two semifinal losers receive bronze medals.

---

## FR-06: Tournament Management

The system shall support tournament initialization with exactly
32 teams.

The system shall:

- Create 8 groups.
- Validate a group size of 4 teams.
- Run the group stage.
- Record group-stage results.
- Prepare the Round of 16.
- Move 16 qualified teams to the Round of 16.
- Run the knockout stage.
- Identify the tournament champion.
- Store match results in the database.
- Export tournament results.

---

## FR-07: Top Scorer Management

The system shall record goals scored by players.

The system shall:

- Track goals across multiple matches.
- Identify the player with the highest number of goals.
- Support multiple players sharing the top-scorer award.
- Return no top scorer when no goals have been recorded.
- Determine whether a player is a shared top scorer.
- Update the top-scorer result when additional goals are recorded.

---

## FR-08: Database Management

The system shall support storing and retrieving:

- Teams.
- Groups.
- Matches.
- Players.
- Match results.

The system shall:

- Store records successfully.
- Retrieve existing records.
- Support multiple stored records.
- Return no data when a requested record does not exist.

---

## FR-09: Web Application

The system shall provide a web interface for validating match duration.

The web application shall:

- Provide a homepage.
- Allow the user to enter match duration.
- Validate the entered duration.
- Display a valid result when the duration is 90 minutes.
- Display an invalid result when the duration is not 90 minutes.
- Handle empty match-duration input through browser validation.
- Handle invalid non-numeric input.
- Display an appropriate validation message for invalid non-numeric
  input.

For invalid non-numeric input, the application shall display:

`INVALID: Minutes must be a number.`

---

## FR-10: Automated Testing

The project shall provide automated tests using JUnit 5.

The project shall also provide Selenium WebDriver tests for the web
interface.

The project shall use Maven for automated test execution.

The project shall generate Allure test reports for automated test
execution.

The automated test suite shall provide evidence of test execution
through:

- JUnit 5 unit tests.
- Selenium WebDriver tests.
- Maven test execution.
- Allure reporting.

---

# 3. Requirements and Testing Summary

The functional requirements are verified through the project's
automated test suites.

| Requirement ID | Requirement | Main Test Coverage |
|---|---|---|
| FR-01 | Team Management | TeamTest |
| FR-02 | Player Management | PlayerTest |
| FR-03 | Match Management | MatchTest |
| FR-04 | Group Stage Management | GroupStageTest |
| FR-05 | Knockout Stage Management | KnockoutStageTest |
| FR-06 | Tournament Management | TournamentTest |
| FR-07 | Top Scorer Management | TopScorerTest |
| FR-08 | Database Management | DatabaseTest |
| FR-09 | Web Application | MatchWebTest |
| FR-10 | Automated Testing | JUnit 5 / Selenium / Maven / Allure |

---

# 4. Requirements Traceability

The requirements defined in this SRS are mapped to automated test cases
through the Requirements Traceability Matrix.

The current automated test suite contains:

- 257 automated test cases.
- 257 passed test cases.
- 0 failed test cases.
- 0 errors.
- 0 skipped tests.
- 100% pass rate.

The Selenium Web UI suite contains 6 automated test cases:

- TC_WEB_001 — Valid 90-minute match.
- TC_WEB_002 — Invalid 89-minute match.
- TC_WEB_003 — Invalid 91-minute match.
- TC_WEB_004 — Homepage UI verification.
- TC_WEB_005 — Empty match-duration input.
- TC_WEB_006 — Invalid non-numeric input.

All functional requirements defined in this SRS are covered by the
current automated test suite.

---

# 5. Conclusion

The World Cup Test Application defines functional requirements for
team management, player management, match management, group-stage
management, knockout-stage management, tournament management,
top-scorer management, database management, web application
validation, and automated testing.

The requirements are verified through JUnit 5 unit tests and Selenium
WebDriver tests.

The latest automated test execution produced:

**257 / 257 test cases passed — 100% pass rate.**

The final requirements coverage is:

**10 / 10 functional requirements covered.**