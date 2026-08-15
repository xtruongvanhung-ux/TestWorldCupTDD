# Test Case Specification

## 1. Test Case Design

The test cases were designed from the functional requirements and
business rules defined in the SRS and FRS documents.

The test suite applies different testing techniques, including:

- Functional testing.
- Equivalence Partitioning.
- Boundary Value Analysis.
- Decision-based testing.
- White-box testing.
- Unit testing.
- Web UI testing.

The detailed test case register is maintained separately in the
Excel test case register.

---

## 2. Test Case Identification

Each test case is assigned a unique identifier.

Examples:

- TC-T001
- TC-T032
- TC-T070
- TC-T104
- TC-T166
- TC-T176
- TC-T243

Selenium test cases are maintained in the Selenium test suite.

---

## 3. Test Case Distribution

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

## 4. Representative Test Cases

### TC-T032

**Requirement:** FR-03 — Match Management

**Purpose:** Verify that a knockout match may have two extra-time halves.

**Input:** `halfCount = 2`

**Expected result:** `true`

**Test type:** Functional / Boundary Value / White-box support

---

### TC-T070

**Requirement:** FR-03 — Match Management

**Purpose:** Verify that a negative extra-time half count is invalid.

**Input:** `halfCount = -1`

**Expected result:** `false`

**Test type:** Functional / Equivalence Partitioning / Boundary Value

---

### TC-T033

**Requirement:** FR-03 — Match Management

**Purpose:** Verify that more than two extra-time halves are invalid.

**Input:** `halfCount = 3`

**Expected result:** `false`

**Test type:** Functional / Equivalence Partitioning / Boundary Value

---

### TC-T001

**Requirement:** FR-01 — Team Management

**Purpose:** Verify that a team stores and returns its country name.

**Input:** `Vietnam`

**Expected result:** The country name returned by the system is
`Vietnam`.

---

### TC-T072

**Requirement:** FR-04 — Group Stage Management

**Purpose:** Verify that the final tournament contains 32 teams.

**Input:** `32`

**Expected result:** `true`.

---

### TC-T104

**Requirement:** FR-05 — Knockout Stage Management

**Purpose:** Verify that the Round of 16 contains 16 teams.

**Input:** `16`

**Expected result:** `true`.

---

### TC-T166

**Requirement:** FR-08 — Database Management

**Purpose:** Verify that a team can be stored in the database.

**Input:** Team ID `T01`, team name `Vietnam`

**Expected result:** The operation returns `true`.

---

### TC-T176

**Requirement:** FR-06 — Tournament Management

**Purpose:** Verify that a tournament can be initialized with 32 teams.

**Input:** `32`

**Expected result:** `true`.

---

### TC-T154

**Requirement:** FR-07 — Top Scorer Management

**Purpose:** Verify that a player's goal can be recorded.

**Input:** Player `Player A`

**Expected result:** The recorded goal count is `1`.

---

### Selenium Web Test

**Requirement:** FR-09 — Web Application

**Purpose:** Verify match-duration validation through the Web UI.

**Test approach:**

1. Open the World Cup web application.
2. Enter a match duration.
3. Submit the form.
4. Read the validation result.
5. Verify the expected result.

The Selenium suite contains 6 automated Web UI test cases.

- TC_WEB_001 — Valid 90-minute match.
- TC_WEB_002 — Invalid 89-minute match.
- TC_WEB_003 — Invalid 91-minute match.
- TC_WEB_004 — Homepage UI verification.
- TC_WEB_005 — Empty input validation.
- TC_WEB_006 — Invalid non-numeric input.
---

## 5. Boundary Value Analysis

### 5.1 Match Duration

**Requirement:** FR-03 — A group-stage match lasts 90 minutes.

The valid value for match duration is exactly 90 minutes.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 89 | TC-T192 | Invalid |
| Boundary value | 90 | TC-T025 | Valid |
| Above boundary | 91 | TC-T202 | Invalid |

The test cases verify the behavior immediately below, at, and
immediately above the required value.

**Conclusion:** The match-duration boundary is covered by the
existing test cases TC-T192, TC-T025, and TC-T202.

### 5.2 Half Duration

**Requirement:** FR-03 — Each half lasts 45 minutes.

The valid value for half duration is exactly 45 minutes.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 44 | TC-T193 | Invalid |
| Boundary value | 45 | TC-T027 | Valid |
| Above boundary | 46 | TC-T203 | Invalid |

The test cases verify the behavior immediately below, at, and
immediately above the required value.

**Conclusion:** The half-duration boundary is covered by the
existing test cases TC-T193, TC-T027, and TC-T203.

### 5.3 Half-time Break

**Requirement:** FR-03 — Half-time break cannot exceed 15 minutes.

The maximum allowed half-time break is 15 minutes.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 14 | TC-T050 | Valid |
| Boundary value | 15 | TC-T029, TC-T051 | Valid |
| Above boundary | 16 | TC-T030, TC-T052 | Invalid |

The test cases verify the behavior immediately below, at, and
immediately above the maximum allowed break duration.

**Conclusion:** The half-time break boundary is covered by the
existing test cases TC-T050, TC-T029, TC-T051, TC-T030, and TC-T052.

### 5.4 Extra-time Half Count

**Requirement:** FR-03 — A knockout match may have 0, 1, or 2
extra-time halves.

The valid range for extra-time halves is from 0 to 2.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below lower boundary | -1 | TC-T070 | Invalid |
| Lower boundary | 0 | TC-T031, TC-T249 | Valid |
| Valid value | 1 | TC-T053 | Valid |
| Upper boundary | 2 | TC-T032, TC-T054 | Valid |
| Above upper boundary | 3 | TC-T033, TC-T055 | Invalid |

The test cases verify values below, at, within, and above the valid
range.

**Conclusion:** The extra-time half count boundaries are covered by
the existing test cases TC-T070, TC-T031, TC-T249, TC-T053, TC-T032,
TC-T054, TC-T033, and TC-T055.

### 5.5 Extra-time Half Duration

**Requirement:** FR-03 — An extra-time half lasts 30 minutes.

The valid value for an extra-time half is exactly 30 minutes.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 28 | TC-T215 | Invalid |
| Below boundary | 29 | TC-T056 | Invalid |
| Boundary value | 30 | TC-T034, TC-T057 | Valid |
| Above boundary | 31 | TC-T035, TC-T058 | Invalid |
| Above boundary | 32 | TC-T205 | Invalid |

The test cases verify values below, at, and above the required
extra-time duration.

**Conclusion:** The extra-time half duration boundary is covered by
the existing test cases TC-T215, TC-T056, TC-T034, TC-T057, TC-T035,
TC-T058, and TC-T205.

### 5.6 Minimum Players on Field

**Requirement:** FR-03 — A team must have at least 7 players on the
field to continue.

The minimum valid number of players on the field is 7.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 6 | TC-T044, TC-T059 | Invalid |
| Boundary value | 7 | TC-T043, TC-T060 | Valid |
| Above boundary | 8 | TC-T212 | Valid |

An additional valid value of 10 players is verified by TC-T213.

**Conclusion:** The minimum-player boundary is covered by the
existing test cases TC-T044, TC-T059, TC-T043, TC-T060, TC-T212,
and TC-T213.

### 5.7 Total Substitutions

**Requirement:** FR-03 — A team can make up to 3 substitutions.

The valid range for total substitutions is from 0 to 3.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below lower boundary | -1 | TC-T071 | Invalid |
| Lower boundary | 0 | TC-T195 | Valid |
| Valid value | 2 | TC-T061 | Valid |
| Upper boundary | 3 | TC-T045, TC-T062 | Valid |
| Above upper boundary | 4 | TC-T046, TC-T063 | Invalid |

The test cases verify values below, at, within, and above the valid
substitution range.

**Conclusion:** The total-substitution boundary is covered by the
existing test cases TC-T071, TC-T195, TC-T061, TC-T045, TC-T062,
TC-T046, and TC-T063.

### 5.8 Substitution Batch Size

**Requirement:** Each substitution event can replace from 1 to 3
players.

The valid range for a substitution batch is from 1 to 3 players.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below lower boundary | 0 | TC-T064 | Invalid |
| Lower boundary | 1 | TC-T047, TC-T065 | Valid |
| Valid value | 2 | TC-T214 | Valid |
| Upper boundary | 3 | TC-T066 | Valid |
| Above upper boundary | 4 | TC-T048, TC-T067 | Invalid |

The test cases verify values below, at, within, and above the valid
substitution batch range.

**Conclusion:** The substitution-batch boundary is covered by the
existing test cases TC-T064, TC-T047, TC-T065, TC-T214, TC-T066,
TC-T048, and TC-T067.

### 5.9 Final Tournament Team Count

**Requirement:** FR-04 — The final tournament contains 32 teams.

The required number of teams in the final tournament is exactly 32.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 31 | TC-T091 | Invalid |
| Boundary value | 32 | TC-T072, TC-T092 | Valid |
| Above boundary | 33 | TC-T093 | Invalid |

**Conclusion:** The final-tournament team-count boundary is covered
by the existing test cases TC-T091, TC-T072, TC-T092, and TC-T093.

### 5.10 Group Size

**Requirement:** FR-04 — A group has 4 teams.

The required number of teams in each group is exactly 4.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 3 | TC-T094 | Invalid |
| Boundary value | 4 | TC-T074, TC-T095 | Valid |
| Above boundary | 5 | TC-T075, TC-T096 | Invalid |

**Conclusion:** The group-size boundary is covered by the existing
test cases TC-T094, TC-T074, TC-T095, TC-T075, and TC-T096.

### 5.11 Round-robin Opponents

**Requirement:** FR-04 — Each team plays against 3 opponents.

The required number of opponents for each team is exactly 3.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 2 | TC-T077, TC-T097 | Invalid |
| Boundary value | 3 | TC-T076, TC-T098 | Valid |
| Above boundary | 4 | TC-T099 | Invalid |

**Conclusion:** The round-robin opponent boundary is covered by the
existing test cases TC-T077, TC-T097, TC-T076, TC-T098, and TC-T099.

### 5.12 Round of 16 Team Count

**Requirement:** FR-05 — Round of 16 has 16 teams.

The required number of teams entering the Round of 16 is exactly 16.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 15 | TC-T105, TC-T122 | Invalid |
| Boundary value | 16 | TC-T104, TC-T123 | Valid |
| Above boundary | 17 | TC-T124 | Invalid |

**Conclusion:** The Round-of-16 team-count boundary is covered by the
existing test cases TC-T105, TC-T122, TC-T104, TC-T123, and TC-T124.

### 5.13 Quarterfinal Winner Count

**Requirement:** FR-05 — 8 winners of the Round of 16 advance to the
quarterfinals.

The required number of Round-of-16 winners advancing to the
quarterfinals is exactly 8.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 7 | TC-T125 | Invalid |
| Boundary value | 8 | TC-T114, TC-T126 | Valid |
| Above boundary | 9 | TC-T127 | Invalid |

**Conclusion:** The quarterfinal-winner boundary is covered by the
existing test cases TC-T125, TC-T114, TC-T126, and TC-T127.

### 5.14 Quarterfinal Match Count

**Requirement:** FR-05 — Quarterfinals contain 4 matches.

The required number of quarterfinal matches is exactly 4.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 3 | TC-T128 | Invalid |
| Boundary value | 4 | TC-T115, TC-T129 | Valid |
| Above boundary | 5 | TC-T130 | Invalid |

**Conclusion:** The quarterfinal-match boundary is covered by the
existing test cases TC-T128, TC-T115, TC-T129, and TC-T130.

### 5.15 Semifinalist Count

**Requirement:** FR-05 — 4 quarterfinal winners advance to the
semifinals.

The required number of semifinalists is exactly 4.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 3 | TC-T131 | Invalid |
| Boundary value | 4 | TC-T116, TC-T132 | Valid |
| Above boundary | 5 | TC-T133, TC-T150 | Invalid |

**Conclusion:** The semifinalist-count boundary is covered by the
existing test cases TC-T131, TC-T116, TC-T132, TC-T133, and TC-T150.

### 5.16 Semifinal Match Count

**Requirement:** FR-05 — Semifinals contain 2 matches.

The required number of semifinal matches is exactly 2.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 0 | TC-T227 | Invalid |
| Below boundary | 1 | TC-T228 | Invalid |
| Boundary value | 2 | TC-T117 | Valid |
| Above boundary | 3 | TC-T153 | Invalid |

**Conclusion:** The semifinal-match boundary is covered by the
existing test cases TC-T227, TC-T228, TC-T117, and TC-T153.

### 5.17 Finalist Count

**Requirement:** FR-05 — 2 semifinal winners advance to the final.

The required number of finalists is exactly 2.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 0 | TC-T229 | Invalid |
| Below boundary | 1 | TC-T230 | Invalid |
| Boundary value | 2 | TC-T118 | Valid |
| Above boundary | 3 | TC-T151 | Invalid |
| Above boundary | 4 | TC-T231 | Invalid |

**Conclusion:** The finalist-count boundary is covered by the
existing test cases TC-T229, TC-T230, TC-T118, TC-T151, and TC-T231.

### 5.18 Bronze Medalist Count

**Requirement:** FR-05 — Two semifinal losers receive bronze medals.

The expected number of semifinal losers receiving bronze medals is 2.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below boundary | 1 | Not currently covered | Not tested |
| Boundary value | 2 | TC-T121 | Valid |
| Above boundary | 3 | TC-T152 | Invalid |

**Conclusion:** The upper boundary is covered by TC-T121 and
TC-T152. The value 1 is not currently covered by an automated
test case.

### 5.19 Assistant Coach Count

**Requirement:** FR-01 — Team Management.

The team may have up to 3 assistant coaches.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below upper boundary | 2 | TC-T005 | Valid |
| Upper boundary | 3 | TC-T003 | Valid |
| Above upper boundary | 4 | TC-T004 | Invalid |

**Conclusion:** The assistant-coach boundary is covered by the
existing test cases TC-T005, TC-T003, and TC-T004.

### 5.20 Team Player Count

**Requirement:** FR-01 — Team Management.

The team player count is valid up to 22 players.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below upper boundary | 21 | TC-T008 | Valid |
| Upper boundary | 22 | TC-T006 | Valid |
| Above upper boundary | 23 | TC-T007 | Invalid |

**Conclusion:** The team-player-count boundary is covered by the
existing test cases TC-T008, TC-T006, and TC-T007.

### 5.21 Starting Player Count

**Requirement:** FR-01 — Team Management.

The valid number of starting players is from 7 to 11.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below lower boundary | 6 | TC-T011 | Invalid |
| Lower boundary | 7 | TC-T009 | Valid |
| Upper boundary | 11 | TC-T010 | Valid |
| Above upper boundary | 12 | TC-T012 | Invalid |

**Conclusion:** The starting-player-count boundaries are covered by
the existing test cases TC-T011, TC-T009, TC-T010, and TC-T012.

### 5.22 Substitute Count

**Requirement:** FR-01 — Team Management.

The team may have up to 5 substitutes.

| Boundary Type | Input | Test Case | Expected Result |
|---|---:|---|---|
| Below upper boundary | 4 | TC-T015 | Valid |
| Upper boundary | 5 | TC-T013 | Valid |
| Above upper boundary | 6 | TC-T014 | Invalid |

**Conclusion:** The substitute-count boundary is covered by the
existing test cases TC-T015, TC-T013, and TC-T014.

### 5.23 Tournament Group Count

**Requirement:** FR-06 — Tournament Management.

The tournament creates 8 groups after initialization with 32 teams.

| Test Condition | Input | Test Case | Expected Result |
|---|---:|---|---|
| Required group count | 8 | TC-T180 | Valid |
| Below boundary | 7 | Not currently covered | Not tested |
| Above boundary | 9 | Not currently covered | Not tested |

**Conclusion:** The required group count of 8 is covered by TC-T180.
Boundary values of 7 and 9 are not currently covered by automated
test cases.

---

## 6. Decision Table Testing

### 6.1 Group Stage Ranking Decision Table

The Group Stage ranking uses a sequence of comparison criteria.
A subsequent criterion is considered only when the current criterion
does not distinguish the teams.

| Rule | Points differ | Goal difference differs | Cards differ | Head-to-head differs | Draw lot differs | Decision |
|---|---|---|---|---|---|---|
| R1 | Yes | - | - | - | - | Rank by points |
| R2 | No | Yes | - | - | - | Rank by goal difference |
| R3 | No | No | Yes | - | - | Rank by cards |
| R4 | No | No | No | Yes | - | Rank by head-to-head |
| R5 | No | No | No | No | Yes | Rank by draw lot |
| R6 | No | No | No | No | No | Teams remain equal |

### Test Case Mapping

| Decision Rule | Test Case | Purpose |
|---|---|---|
| R1 | TC-T081 | Compare points first |
| R2 | TC-T082 | Compare goal difference |
| R3 | TC-T083 | Compare cards |
| R4 | TC-T084 | Compare head-to-head |
| R5 | TC-T085 | Compare draw lot |
| Continue to next criterion | TC-T087, TC-T088 | Determine whether the next criterion is required |

**Conclusion:** The decision-based test cases verify that ranking
criteria are evaluated in sequence and that the next criterion is
considered when the current criterion is equal.

---

## 7. White-box Testing

White-box testing was applied to verify the internal decision logic
implemented in the Java classes.

The existing JUnit test cases exercise both valid and invalid
branches of the implemented methods.

### 7.1 Match Duration

| Branch | Input | Test Case | Expected |
|---|---:|---|---|
| Valid branch | 90 | TC-T025 | true |
| Invalid branch | 89 | TC-T192 | false |
| Invalid branch | 91 | TC-T202 | false |

### 7.2 Extra-time Half Count

| Branch | Input | Test Case | Expected |
|---|---:|---|---|
| Valid branch | 0 | TC-T031 | true |
| Valid branch | 1 | TC-T053 | true |
| Valid branch | 2 | TC-T032 | true |
| Invalid branch | -1 | TC-T070 | false |
| Invalid branch | 3 | TC-T033 | false |
| Invalid branch | 4 | TC-T204 | false |

### 7.3 Red Card Decision

| Branch | Input | Test Case | Expected |
|---|---|---|---|
| Red card present | true | TC-T042 | true |
| No red card | false | TC-T194 | false |

### 7.4 Conclusion

The existing JUnit test suite exercises the main true and false
decision branches of the implemented business logic.

No additional test cases were created for this section because the
required branches are already covered by the existing automated tests.

