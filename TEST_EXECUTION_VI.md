# BÁO CÁO THỰC THI KIỂM THỬ

## 1. Tổng quan thực thi kiểm thử

Project TestWorldCupTDD được thực thi bằng Maven và JUnit 5.

Kết quả thực thi tự động mới nhất:

| Metric | Kết quả |
|---|---:|
| Tổng số test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Kết quả Maven test xác nhận tất cả 257 test cases đều passed
successfully.

---

## 2. Phân bố Test Suite

| Test Suite | Số Test Case |
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
| **Tổng cộng** | **257** |

---

## 3. Kết quả kiểm thử

Tất cả test suite đã hoàn thành thành công.

| Kết quả | Số lượng | Tỷ lệ |
|---|---:|---:|
| Passed | 257 | 100% |
| Failed | 0 | 0% |
| Errors | 0 | 0% |
| Skipped | 0 | 0% |
| **Tổng cộng** | **257** | **100%** |

---

## 4. Kiểm thử Web

Project bao gồm Selenium WebDriver testing cho ứng dụng web.

Selenium test suite có 6 test cases:

- Kiểm tra thời lượng trận đấu.
- Tương tác với ứng dụng web thông qua trình duyệt.
- Kiểm tra kết quả validation được hiển thị.
- Kiểm tra giao diện trang chủ.
- Kiểm tra input rỗng.
- Kiểm tra input không phải số.

### Selenium Test Cases

| Test Case | Nội dung |
|---|---|
| TC_WEB_001 | Thời lượng 90 phút hợp lệ |
| TC_WEB_002 | Thời lượng 89 phút không hợp lệ |
| TC_WEB_003 | Thời lượng 91 phút không hợp lệ |
| TC_WEB_004 | Kiểm tra giao diện trang chủ |
| TC_WEB_005 | Kiểm tra input rỗng |
| TC_WEB_006 | Kiểm tra input không phải số |

Tất cả 6 Selenium test cases đều passed.

TC_WEB_006 xác minh dữ liệu không phải số được xử lý chính xác và
ứng dụng hiển thị:

`INVALID: Minutes must be a number.`

---

## 5. Allure Report

Allure Report được tạo từ quá trình thực thi Maven test.

Kết quả thực thi tự động mới nhất xác nhận:

- 257 test cases.
- 100% passed.
- 0 failed.
- 0 errors.
- 0 skipped.
- 11 test suites.
- Maven là test executor.

Allure Report được sử dụng làm bằng chứng cho quá trình thực thi
automated testing.

---

## 6. GitHub Actions CI/CD

Project sử dụng GitHub Actions để tự động hóa quá trình build và test.

Workflow thực hiện các bước chính:

1. Checkout source code.
2. Thiết lập JDK 21.
3. Compile project bằng Maven.
4. Khởi động World Cup Web Server.
5. Kiểm tra Web Server đã sẵn sàng.
6. Chạy Maven tests.
7. Tạo Allure Report.
8. Upload Allure Report.
9. Deploy report lên GitHub Pages.

Workflow được kích hoạt khi:

- Push vào branch `main`.
- Pull Request vào branch `main`.

---

## 7. Kết luận thực thi kiểm thử

Quá trình thực thi automated testing đã hoàn thành thành công.

Tất cả 257 test cases đều passed với pass rate 100%.

Kết quả cung cấp bằng chứng rằng các yêu cầu chức năng đã được kiểm thử
thông qua:

- JUnit 5 unit tests.
- Selenium WebDriver tests.
- Maven test execution.
- Allure test reporting.
- GitHub Actions CI/CD.

Kết quả cuối cùng:

**257 / 257 test cases passed — 100% pass rate.**

**6 / 6 Selenium Web UI tests passed.**

**10 / 10 functional requirements covered.**
