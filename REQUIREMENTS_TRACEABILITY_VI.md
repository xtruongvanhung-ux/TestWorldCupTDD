# MA TRẬN TRUY XUẤT YÊU CẦU (RTM)

## 1. Mục đích

Requirements Traceability Matrix (RTM) thiết lập mối quan hệ giữa các
yêu cầu chức năng được định nghĩa trong Software Requirements
Specification (SRS) và các test case tự động đã triển khai.

Mục đích của RTM là xác minh mỗi yêu cầu chức năng được liên kết với
một hoặc nhiều test case tương ứng và xác định mức độ bao phủ của bộ
kiểm thử tự động hiện tại.

Bộ kiểm thử tự động hiện tại có 257 test cases, bao gồm JUnit 5 unit
tests và Selenium Web UI tests.

---

## 2. Ma trận truy xuất

| Requirement ID | Yêu cầu | Test Case Coverage | Loại kiểm thử | Trạng thái |
|---|---|---|---|---|
| FR-01 | Quản lý đội tuyển | TC-T001 – TC-T020 | Unit / Functional / BVA | Covered |
| FR-02 | Quản lý cầu thủ | TC-P001 | Unit / Functional | Covered |
| FR-03 | Quản lý trận đấu | TC-T025 – TC-T071, TC-T192 – TC-T216, TC-T249 | Unit / Functional / BVA | Covered |
| FR-04 | Quản lý vòng bảng | TC-T072 – TC-T103 | Unit / Functional / Decision-based / BVA | Covered |
| FR-05 | Quản lý vòng loại trực tiếp | TC-T104 – TC-T153 | Unit / Functional / BVA | Covered |
| FR-06 | Quản lý giải đấu | TC-T176 – TC-T191 | Unit / Functional | Covered |
| FR-07 | Quản lý cầu thủ ghi bàn hàng đầu | TC-T154 – TC-T165, TC-T237 – TC-T243 | Unit / Functional | Covered |
| FR-08 | Quản lý cơ sở dữ liệu | TC-T166 – TC-T175, TC-T232 – TC-T236, TC-T244 – TC-T248 | Unit / Functional | Covered |
| FR-09 | Ứng dụng Web | TC_WEB_001 – TC_WEB_006 | Selenium / Web UI | Covered |
| FR-10 | Kiểm thử tự động | ProjectSetupTest, TestWorldCupTDDTest, JUnit 5 execution, Selenium execution và Allure reporting | Automated Testing | Covered |

---

## 3. Truy xuất chi tiết

### FR-01 — Quản lý đội tuyển

Các test case:

- TC-T001 — Tên quốc gia.
- TC-T002 — Huấn luyện viên trưởng.
- TC-T003 – TC-T005 — Trợ lý huấn luyện viên.
- TC-T006 – TC-T008 — Số lượng cầu thủ.
- TC-T009 – TC-T012 — Cầu thủ đá chính.
- TC-T013 – TC-T015 — Cầu thủ dự bị.
- TC-T016 – TC-T019 — Các collection của đội.
- TC-T020 — Thành viên ban huấn luyện / nhân viên.

Các test case kiểm tra thông tin đội tuyển và các quy tắc về số lượng
được định nghĩa trong FR-01.

**Coverage status:** Covered

---

### FR-02 — Quản lý cầu thủ

Test case:

- TC-P001 — Cầu thủ lưu và trả về tên cầu thủ.

Test case xác minh cầu thủ có thể được tạo bằng tên và tên đã lưu có thể
được truy xuất.

**Coverage status:** Covered

---

### FR-03 — Quản lý trận đấu

Các test case:

- TC-T025 – TC-T071.
- TC-T192 – TC-T216.
- TC-T249.

Các test case bao phủ:

- Thời lượng trận đấu.
- Thời lượng mỗi hiệp.
- Thời gian nghỉ giữa hiệp.
- Luật hiệp phụ.
- Bàn thắng bạc.
- Sút penalty.
- Thẻ vàng.
- Thẻ đỏ.
- Số cầu thủ tối thiểu trên sân.
- Tổng số lần thay người.
- Số cầu thủ trong mỗi lần thay người.
- Thay người không phụ thuộc vị trí.

Boundary Value Analysis được áp dụng cho các quy tắc số liệu của trận đấu.

**Coverage status:** Covered

---

### FR-04 — Quản lý vòng bảng

Các test case:

- TC-T072 – TC-T103.

Các test case bao phủ:

- Số lượng 32 đội.
- 4 đội mỗi bảng.
- 3 đối thủ mỗi đội.
- Điểm thắng.
- Điểm hòa.
- Điểm thua.
- Xếp hạng theo điểm.
- Xếp hạng theo hiệu số.
- Xếp hạng theo thẻ.
- Xếp hạng theo đối đầu.
- Xếp hạng theo bốc thăm.
- Trọng số thẻ.
- Quyền vào Vòng 16 đội.

Các test xếp hạng cũng hỗ trợ Decision Table Testing vì các tiêu chí
được đánh giá theo thứ tự.

**Coverage status:** Covered

---

### FR-05 — Quản lý vòng loại trực tiếp

Các test case:

- TC-T104 – TC-T153.

Các test case bao phủ:

- Số đội ở Vòng 16 đội.
- Các cặp đấu Vòng 16 đội.
- Đội thắng Vòng 16 đội.
- Các trận tứ kết.
- Đội vào bán kết.
- Các trận bán kết.
- Đội vào chung kết.
- Trận chung kết.
- Đội vô địch.
- Huy chương vàng.
- Huy chương bạc.
- Huy chương đồng.

**Coverage status:** Covered

---

### FR-06 — Quản lý giải đấu

Các test case:

- TC-T176 – TC-T191.

Các test case bao phủ:

- Khởi tạo giải đấu với 32 đội.
- Tạo 8 bảng.
- Kiểm tra kích thước bảng.
- Thực hiện vòng bảng.
- Ghi nhận kết quả vòng bảng.
- Chuẩn bị Vòng 16 đội.
- Đưa 16 đội đủ điều kiện vào Vòng 16 đội.
- Thực hiện vòng loại trực tiếp.
- Xác định đội vô địch.
- Lưu kết quả trận đấu.
- Xuất kết quả giải đấu.

**Coverage status:** Covered

---

### FR-07 — Quản lý cầu thủ ghi bàn hàng đầu

Các test case:

- TC-T154 – TC-T165.
- TC-T237 – TC-T243.

Các test case bao phủ:

- Ghi nhận bàn thắng.
- Cộng dồn bàn thắng qua nhiều trận.
- Xác định cầu thủ có nhiều bàn thắng nhất.
- Loại cầu thủ có ít bàn thắng hơn khỏi kết quả top scorer.
- Hai cầu thủ đồng hạng.
- Nhiều cầu thủ đồng hạng.
- Không có top scorer khi chưa có bàn thắng.
- Xác định shared top scorer.
- Cập nhật top scorer khi có thêm bàn thắng.

**Coverage status:** Covered

---

### FR-08 — Quản lý cơ sở dữ liệu

Các test case:

- TC-T166 – TC-T175.
- TC-T232 – TC-T236.
- TC-T244 – TC-T248.

Các test case bao phủ:

- Lưu đội tuyển.
- Truy xuất đội tuyển.
- Lưu bảng.
- Truy xuất bảng.
- Lưu trận đấu.
- Truy xuất trận đấu.
- Lưu cầu thủ.
- Truy xuất cầu thủ.
- Lưu kết quả trận đấu.
- Truy xuất kết quả trận đấu.
- Xử lý bản ghi không tồn tại.
- Lưu và truy xuất nhiều bản ghi.

**Coverage status:** Covered

---

### FR-09 — Ứng dụng Web

Các Selenium test case:

- TC_WEB_001 — Trận đấu 90 phút hợp lệ.
- TC_WEB_002 — Trận đấu 89 phút không hợp lệ.
- TC_WEB_003 — Trận đấu 91 phút không hợp lệ.
- TC_WEB_004 — Kiểm tra giao diện trang chủ.
- TC_WEB_005 — Input thời lượng rỗng.
- TC_WEB_006 — Input không phải số.

Các Selenium test bao phủ:

- Mở trang chủ.
- Nhập thời lượng trận đấu.
- Kiểm tra thời lượng hợp lệ.
- Kiểm tra thời lượng không hợp lệ.
- Kiểm tra các thành phần giao diện.
- Kiểm tra input rỗng.
- Kiểm tra input không phải số.
- Kiểm tra thông báo kết quả.

TC_WEB_006 xác minh input không phải số được xử lý đúng và ứng dụng
hiển thị:

`INVALID: Minutes must be a number.`

**Coverage status:** Covered

---

### FR-10 — Kiểm thử tự động

Dự án cung cấp automated testing bằng JUnit 5.

Các test suite chính:

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

Selenium WebDriver được sử dụng thông qua:

- MatchWebTest.

Maven được sử dụng để thực thi test và Allure được sử dụng để tạo báo
cáo kiểm thử.

**Coverage status:** Covered

---

## 4. Phân bố Test Case

Bộ kiểm thử tự động hiện tại có 257 test cases.

| Test Suite | Số Test Case |
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
| **Tổng cộng** | **257** |

---

## 5. Tổng kết truy xuất

| Requirement | Trạng thái |
|---|---|
| FR-01 — Quản lý đội tuyển | Covered |
| FR-02 — Quản lý cầu thủ | Covered |
| FR-03 — Quản lý trận đấu | Covered |
| FR-04 — Quản lý vòng bảng | Covered |
| FR-05 — Quản lý vòng loại trực tiếp | Covered |
| FR-06 — Quản lý giải đấu | Covered |
| FR-07 — Quản lý cầu thủ ghi bàn hàng đầu | Covered |
| FR-08 — Quản lý cơ sở dữ liệu | Covered |
| FR-09 — Ứng dụng Web | Covered |
| FR-10 — Kiểm thử tự động | Covered |

### Tổng quan Coverage

- Yêu cầu được bao phủ đầy đủ: 10.
- Yêu cầu được bao phủ một phần: 0.
- Yêu cầu chưa có test coverage: 0.

Tất cả các yêu cầu chức năng được định nghĩa trong SRS đều được bao phủ
bởi bộ kiểm thử tự động hiện tại.

---

## 6. Bằng chứng thực thi kiểm thử

Kết quả thực thi tự động mới nhất:

| Metric | Kết quả |
|---|---:|
| Tổng số test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Selenium Web UI suite có 6 test cases và cả 6 test đều passed.

Quá trình thực thi được thực hiện bằng Maven và JUnit 5. Allure
Reporting được sử dụng để cung cấp thêm bằng chứng về quá trình
thực thi kiểm thử tự động.

---

## 7. Kết luận

Requirements Traceability Matrix thiết lập mối quan hệ giữa các yêu cầu
chức năng trong SRS và các test case tự động.

FR-01 đến FR-08 được bao phủ bởi các JUnit test suite tương ứng.

FR-09 được bao phủ đầy đủ bởi Selenium Web UI tests, bao gồm kiểm tra
thời lượng hợp lệ, thời lượng không hợp lệ, input rỗng, giao diện trang
chủ và input không phải số.

FR-10 được hỗ trợ bởi JUnit 5, Selenium WebDriver, Maven test execution
và Allure reporting.

Bộ kiểm thử tự động hiện tại có 257 test cases và cả 257 test cases đều
passed.

Kết quả cuối cùng:

**10 / 10 functional requirements covered.**

**257 / 257 automated test cases passed — 100% pass rate.**
