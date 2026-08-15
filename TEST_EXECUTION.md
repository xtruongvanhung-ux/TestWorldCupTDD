# Test Execution Report

## 1. Test Execution Summary

The TestWorldCupTDD project was executed using Maven and JUnit 5.

The latest test execution produced the following result:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

The Maven test execution confirms that all 257 test cases passed
successfully.

---

## 2. Test Suite Distribution

| Test Suite | Test Cases |
|---|---:|
| MatchTest | 67 |
| KnockoutStageTest | 65 |
| GroupStageTest | 38 |
| DatabaseTest | 20 |
| TeamTest | 20 |
| TopScorerTest | 19 |
| TournamentTest | 16 |
| MatchWebTest | 6 |
| ProjectSetupTest | 3 |
| TestWorldCupTDDTest | 2 |
| PlayerTest | 1 |
| **Total** | **257** |

---

## 3. Test Result

All test suites completed successfully.

| Result | Number | Percentage |
|---|---:|---:|
| Passed | 257 | 100% |
| Failed | 0 | 0% |
| Errors | 0 | 0% |
| Skipped | 0 | 0% |
| **Total** | **257** | **100%** |

---

## 4. Web Testing

The project includes Selenium WebDriver testing for the web application.

The Selenium test suite contains:

- Match duration validation.
- Browser-based interaction with the web application.
- Validation of the displayed result.
- Homepage UI verification.
- Empty input validation.
- Invalid non-numeric input validation.

The Selenium test suite contains 6 test cases and all 6 tests passed.

The additional test case TC_WEB_006 verifies that invalid non-numeric
input is handled correctly and that the application displays:

`INVALID: Minutes must be a number.`

---

## 5. Allure Report

An Allure report is generated from the Maven test execution.

The latest automated test execution confirms:

- 257 total test cases.
- 100% passed.
- 0 failed tests.
- 0 errors.
- 0 skipped tests.
- 11 test suites.
- Maven as the test executor.

The Allure report is used as evidence of the automated test execution.

---

## 6. Test Execution Conclusion

The automated test execution was completed successfully.

All 257 test cases passed with a pass rate of 100%.

The results provide evidence that the implemented functional
requirements were tested through:

- JUnit 5 unit tests.
- Selenium WebDriver tests.
- Maven test execution.
- Allure test reporting.

The final execution result was:

**257 / 257 test cases passed — 100% pass rate.**