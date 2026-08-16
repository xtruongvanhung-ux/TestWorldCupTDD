# World Cup Test Application

A Java-based World Cup Test Application developed using a Test-Driven Development (TDD) approach.

The project models and validates World Cup football rules including team management, player management, match rules, group-stage management, knockout-stage progression, tournament management, top scorers, database operations, and web UI validation.

---

## 1. Project Overview

The project is developed as a software testing project using automated testing techniques.

The application provides:

- Team and player management.
- Match rule validation.
- Group-stage management.
- Knockout-stage management.
- Tournament progression.
- Top scorer management.
- Database storage and retrieval.
- Web UI validation using Selenium WebDriver.
- Automated test execution using Maven and JUnit 5.
- Allure test reporting.
- Continuous Integration using GitHub Actions.
- Allure report deployment using GitHub Pages.

---

## 2. Technologies

| Technology | Purpose |
|---|---|
| Java 21 | Application development |
| JUnit 5 | Unit testing |
| Maven | Build and test execution |
| Selenium WebDriver | Web UI testing |
| Apache NetBeans | Development IDE |
| Allure | Test reporting |
| Git / GitHub | Version control |
| GitHub Actions | Continuous Integration |
| GitHub Pages | Allure report deployment |

---

## 3. Functional Requirements

The project defines ten main functional requirements:

| ID | Requirement |
|---|---|
| FR-01 | Team Management |
| FR-02 | Player Management |
| FR-03 | Match Management |
| FR-04 | Group Stage Management |
| FR-05 | Knockout Stage Management |
| FR-06 | Tournament Management |
| FR-07 | Top Scorer Management |
| FR-08 | Database Management |
| FR-09 | Web Application |
| FR-10 | Automated Testing |

Detailed requirements are documented in:

- `SRS.md`
- `FRS.md`

---

## 4. Testing

The project applies multiple software testing techniques:

- Functional Testing
- Equivalence Partitioning
- Boundary Value Analysis
- Decision Table Testing
- White-box Testing
- Unit Testing
- Web UI Testing

The automated test suite contains **257 test cases**.

### Latest Test Result

| Metric | Result |
|---|---:|
| Total tests | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

All 257 automated test cases passed successfully in the latest local test execution.

---

## 5. Test Suite Distribution

| Test Suite | Test Cases |
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

## 6. Selenium Web UI Testing

The project includes Selenium WebDriver tests for the World Cup web application.

The Selenium suite contains six test cases:

- `TC_WEB_001` — Valid 90-minute match.
- `TC_WEB_002` — Invalid 89-minute match.
- `TC_WEB_003` — Invalid 91-minute match.
- `TC_WEB_004` — Homepage UI verification.
- `TC_WEB_005` — Empty match-duration input.
- `TC_WEB_006` — Invalid non-numeric input.

The web application validates match duration and displays the corresponding validation result.

The Selenium tests are executed automatically as part of the Maven test execution.

---

## 7. Requirements Traceability

The Requirements Traceability Matrix maps the functional requirements to their corresponding automated test cases.

The traceability document is available in:

`REQUIREMENTS_TRACEABILITY.md`

The matrix covers:

- FR-01 Team Management
- FR-02 Player Management
- FR-03 Match Management
- FR-04 Group Stage Management
- FR-05 Knockout Stage Management
- FR-06 Tournament Management
- FR-07 Top Scorer Management
- FR-08 Database Management
- FR-09 Web Application
- FR-10 Automated Testing

---

## 8. Test Case Documentation

The detailed test case design is documented in:

`TEST_CASE_SPECIFICATION.md`

The document includes:

- Test case design techniques.
- Test case identification.
- Test case distribution.
- Representative test cases.
- Boundary Value Analysis.
- Decision Table Testing.
- White-box Testing.

The detailed test case register is also maintained in:

`tc_register.txt`

---

## 9. Test Execution

Test execution results are documented in:

`TEST_EXECUTION.md`

The latest execution achieved:

**257 / 257 tests passed — 100% pass rate.**

---

## 10. Allure Reporting

The project uses Allure for automated test reporting.

The GitHub Actions workflow:

1. Checks out the project.
2. Sets up JDK 21.
3. Compiles the project.
4. Starts the World Cup Web Server.
5. Waits for the web server to become available.
6. Executes Maven tests.
7. Generates the Allure report.
8. Uploads the Allure report as a GitHub Pages artifact.
9. Deploys the report to GitHub Pages.

---

## 11. Continuous Integration

GitHub Actions is configured through:

`.github/workflows/allure-pages.yml`

The workflow is triggered by:

- Pushes to `main`.
- Pull requests targeting `main`.

The latest GitHub Actions workflow completed successfully with:

- Build: Success
- Deploy: Success
- Allure report: Deployed successfully

---

## 12. Allure Report

The latest Allure report is deployed using GitHub Pages.

The deployment is generated automatically by GitHub Actions after successful test execution.

---

## 13. Repository Structure

```text
TestWorldCupTDD/
│
├── .allure/
├── .github/
│   └── workflows/
│       └── allure-pages.yml
│
├── nbproject/
├── src/
│
├── FRS.md
├── REQUIREMENTS_TRACEABILITY.md
├── SRS.md
├── TEST_CASE_SPECIFICATION.md
├── TEST_EXECUTION.md
├── pom.xml
└── tc_register.txt
