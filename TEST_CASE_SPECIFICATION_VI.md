# ĐẶC TẢ TEST CASE

## 1. Thiết kế Test Case

Các test case được thiết kế dựa trên các yêu cầu chức năng và quy tắc
nghiệp vụ được định nghĩa trong SRS và FRS.

Bộ kiểm thử áp dụng các kỹ thuật:

- Functional Testing.
- Equivalence Partitioning.
- Boundary Value Analysis.
- Decision-based Testing.
- White-box Testing.
- Unit Testing.
- Web UI Testing.

Danh sách test case chi tiết được quản lý riêng trong Test Case Register.

---

## 2. Định danh Test Case

Mỗi test case được gán một mã định danh duy nhất.

Ví dụ:

- TC-T001
- TC-T032
- TC-T070
- TC-T104
- TC-T166
- TC-T176
- TC-T243

Các Selenium test case được quản lý trong Selenium test suite.

---

## 3. Phân bố Test Case

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

## 4. Các Test Case tiêu biểu

### TC-T032

**Requirement:** FR-03 — Match Management

**Mục đích:** Kiểm tra một trận đấu loại trực tiếp có thể có hai hiệp phụ.

**Input:** `halfCount = 2`

**Expected result:** `true`

**Loại kiểm thử:** Functional / Boundary Value / White-box support

---

### TC-T070

**Requirement:** FR-03 — Match Management

**Mục đích:** Kiểm tra số lượng hiệp phụ âm là không hợp lệ.

**Input:** `halfCount = -1`

**Expected result:** `false`

**Loại kiểm thử:** Functional / Equivalence Partitioning / Boundary Value

---

### TC-T033

**Requirement:** FR-03 — Match Management

**Mục đích:** Kiểm tra nhiều hơn hai hiệp phụ là không hợp lệ.

**Input:** `halfCount = 3`

**Expected result:** `false`

**Loại kiểm thử:** Functional / Equivalence Partitioning / Boundary Value

---

### TC-T001

**Requirement:** FR-01 — Team Management

**Mục đích:** Kiểm tra đội tuyển lưu và trả về tên quốc gia.

**Input:** `Vietnam`

**Expected result:** Tên quốc gia được trả về là `Vietnam`.

---

### TC-T072

**Requirement:** FR-04 — Group Stage Management

**Mục đích:** Kiểm tra giải đấu chính thức có 32 đội.

**Input:** `32`

**Expected result:** `true`.

---

### TC-T104

**Requirement:** FR-05 — Knockout Stage Management

**Mục đích:** Kiểm tra Vòng 16 đội có 16 đội.

**Input:** `16`

**Expected result:** `true`.

---

### TC-T166

**Requirement:** FR-08 — Database Management

**Mục đích:** Kiểm tra một đội tuyển có thể được lưu vào cơ sở dữ liệu.

**Input:** Team ID `T01`, team name `Vietnam`

**Expected result:** Thao tác trả về `true`.

---

### TC-T176

**Requirement:** FR-06 — Tournament Management

**Mục đích:** Kiểm tra giải đấu có thể được khởi tạo với 32 đội.

**Input:** `32`

**Expected result:** `true`.

---

### TC-T154

**Requirement:** FR-07 — Top Scorer Management

**Mục đích:** Kiểm tra bàn thắng của cầu thủ có thể được ghi nhận.

**Input:** Player `Player A`

**Expected result:** Số bàn thắng được ghi nhận là `1`.

---

## 5. Selenium Web UI Test Cases

**Requirement:** FR-09 — Web Application

**Mục đích:** Kiểm tra chức năng xác thực thời lượng trận đấu thông qua
giao diện Web UI.

### Quy trình kiểm thử

1. Mở World Cup Web Application.
2. Nhập thời lượng trận đấu.
3. Submit form.
4. Đọc kết quả validation.
5. So sánh với expected result.

### Danh sách Selenium Test Case

| Test Case | Mục đích |
|---|---|
| TC_WEB_001 | Kiểm tra thời lượng 90 phút hợp lệ |
| TC_WEB_002 | Kiểm tra thời lượng 89 phút không hợp lệ |
| TC_WEB_003 | Kiểm tra thời lượng 91 phút không hợp lệ |
| TC_WEB_004 | Kiểm tra các thành phần giao diện trang chủ |
| TC_WEB_005 | Kiểm tra dữ liệu thời lượng rỗng |
| TC_WEB_006 | Kiểm tra dữ liệu không phải số |

Tổng cộng có **6 Selenium Web UI test cases**.

---

## 6. Boundary Value Analysis

### 6.1 Match Duration

**Requirement:** FR-03 — Trận đấu vòng bảng kéo dài 90 phút.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 89 | TC-T192 | Invalid |
| Boundary | 90 | TC-T025 | Valid |
| Trên boundary | 91 | TC-T202 | Invalid |

---

### 6.2 Half Duration

**Requirement:** FR-03 — Mỗi hiệp kéo dài 45 phút.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 44 | TC-T193 | Invalid |
| Boundary | 45 | TC-T027 | Valid |
| Trên boundary | 46 | TC-T203 | Invalid |

---

### 6.3 Half-time Break

**Requirement:** FR-03 — Thời gian nghỉ giữa hiệp không quá 15 phút.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 14 | TC-T050 | Valid |
| Boundary | 15 | TC-T029, TC-T051 | Valid |
| Trên boundary | 16 | TC-T030, TC-T052 | Invalid |

---

### 6.4 Extra-time Half Count

**Requirement:** FR-03 — Một trận đấu loại trực tiếp có từ 0 đến 2 hiệp phụ.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | -1 | TC-T070 | Invalid |
| Lower boundary | 0 | TC-T031, TC-T249 | Valid |
| Giá trị hợp lệ | 1 | TC-T053 | Valid |
| Upper boundary | 2 | TC-T032, TC-T054 | Valid |
| Trên boundary | 3 | TC-T033, TC-T055 | Invalid |

---

### 6.5 Extra-time Half Duration

**Requirement:** FR-03 — Mỗi hiệp phụ kéo dài 30 phút.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 28 | TC-T215 | Invalid |
| Dưới boundary | 29 | TC-T056 | Invalid |
| Boundary | 30 | TC-T034, TC-T057 | Valid |
| Trên boundary | 31 | TC-T035, TC-T058 | Invalid |
| Trên boundary | 32 | TC-T205 | Invalid |

---

### 6.6 Minimum Players on Field

**Requirement:** FR-03 — Đội phải có ít nhất 7 cầu thủ trên sân.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 6 | TC-T044, TC-T059 | Invalid |
| Boundary | 7 | TC-T043, TC-T060 | Valid |
| Trên boundary | 8 | TC-T212 | Valid |

Giá trị hợp lệ bổ sung 10 cầu thủ được kiểm tra bởi TC-T213.

---

### 6.7 Total Substitutions

**Requirement:** FR-03 — Một đội được tối đa 3 lần thay người.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới lower boundary | -1 | TC-T071 | Invalid |
| Lower boundary | 0 | TC-T195 | Valid |
| Giá trị hợp lệ | 2 | TC-T061 | Valid |
| Upper boundary | 3 | TC-T045, TC-T062 | Valid |
| Trên upper boundary | 4 | TC-T046, TC-T063 | Invalid |

---

### 6.8 Substitution Batch Size

**Requirement:** Mỗi sự kiện thay người có thể thay từ 1 đến 3 cầu thủ.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới lower boundary | 0 | TC-T064 | Invalid |
| Lower boundary | 1 | TC-T047, TC-T065 | Valid |
| Giá trị hợp lệ | 2 | TC-T214 | Valid |
| Upper boundary | 3 | TC-T066 | Valid |
| Trên upper boundary | 4 | TC-T048, TC-T067 | Invalid |

---

### 6.9 Final Tournament Team Count

**Requirement:** FR-04 — Giải đấu có 32 đội.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 31 | TC-T091 | Invalid |
| Boundary | 32 | TC-T072, TC-T092 | Valid |
| Trên boundary | 33 | TC-T093 | Invalid |

---

### 6.10 Group Size

**Requirement:** FR-04 — Mỗi bảng có 4 đội.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 3 | TC-T094 | Invalid |
| Boundary | 4 | TC-T074, TC-T095 | Valid |
| Trên boundary | 5 | TC-T075, TC-T096 | Invalid |

---

### 6.11 Round-robin Opponents

**Requirement:** FR-04 — Mỗi đội thi đấu với 3 đối thủ.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 2 | TC-T077, TC-T097 | Invalid |
| Boundary | 3 | TC-T076, TC-T098 | Valid |
| Trên boundary | 4 | TC-T099 | Invalid |

---

### 6.12 Round of 16 Team Count

**Requirement:** FR-05 — Vòng 16 đội có 16 đội.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 15 | TC-T105, TC-T122 | Invalid |
| Boundary | 16 | TC-T104, TC-T123 | Valid |
| Trên boundary | 17 | TC-T124 | Invalid |

---

### 6.13 Quarterfinal Winner Count

**Requirement:** FR-05 — 8 đội thắng Vòng 16 đội vào tứ kết.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 7 | TC-T125 | Invalid |
| Boundary | 8 | TC-T114, TC-T126 | Valid |
| Trên boundary | 9 | TC-T127 | Invalid |

---

### 6.14 Quarterfinal Match Count

**Requirement:** FR-05 — Tứ kết có 4 trận.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 3 | TC-T128 | Invalid |
| Boundary | 4 | TC-T115, TC-T129 | Valid |
| Trên boundary | 5 | TC-T130 | Invalid |

---

### 6.15 Semifinalist Count

**Requirement:** FR-05 — 4 đội thắng tứ kết vào bán kết.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 3 | TC-T131 | Invalid |
| Boundary | 4 | TC-T116, TC-T132 | Valid |
| Trên boundary | 5 | TC-T133, TC-T150 | Invalid |

---

### 6.16 Semifinal Match Count

**Requirement:** FR-05 — Bán kết có 2 trận.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 0 | TC-T227 | Invalid |
| Dưới boundary | 1 | TC-T228 | Invalid |
| Boundary | 2 | TC-T117 | Valid |
| Trên boundary | 3 | TC-T153 | Invalid |

---

### 6.17 Finalist Count

**Requirement:** FR-05 — 2 đội thắng bán kết vào chung kết.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 0 | TC-T229 | Invalid |
| Dưới boundary | 1 | TC-T230 | Invalid |
| Boundary | 2 | TC-T118 | Valid |
| Trên boundary | 3 | TC-T151 | Invalid |
| Trên boundary | 4 | TC-T231 | Invalid |

---

### 6.18 Bronze Medalist Count

**Requirement:** FR-05 — Hai đội thua bán kết nhận huy chương đồng.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới boundary | 1 | Không có | Chưa kiểm thử |
| Boundary | 2 | TC-T121 | Valid |
| Trên boundary | 3 | TC-T152 | Invalid |

---

### 6.19 Assistant Coach Count

**Requirement:** FR-01 — Đội có tối đa 3 trợ lý huấn luyện viên.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới upper boundary | 2 | TC-T005 | Valid |
| Upper boundary | 3 | TC-T003 | Valid |
| Trên upper boundary | 4 | TC-T004 | Invalid |

---

### 6.20 Team Player Count

**Requirement:** FR-01 — Đội có tối đa 22 cầu thủ.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới upper boundary | 21 | TC-T008 | Valid |
| Upper boundary | 22 | TC-T006 | Valid |
| Trên upper boundary | 23 | TC-T007 | Invalid |

---

### 6.21 Starting Player Count

**Requirement:** FR-01 — Đội hình xuất phát có từ 7 đến 11 cầu thủ.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới lower boundary | 6 | TC-T011 | Invalid |
| Lower boundary | 7 | TC-T009 | Valid |
| Upper boundary | 11 | TC-T010 | Valid |
| Trên upper boundary | 12 | TC-T012 | Invalid |

---

### 6.22 Substitute Count

**Requirement:** FR-01 — Đội có từ 4 đến 5 cầu thủ dự bị.

| Loại Boundary | Input | Test Case | Expected Result |
|---|---:|---|---|
| Dưới upper boundary | 4 | TC-T015 | Valid |
| Upper boundary | 5 | TC-T013 | Valid |
| Trên upper boundary | 6 | TC-T014 | Invalid |

---

### 6.23 Tournament Group Count

**Requirement:** FR-06 — Giải đấu tạo 8 bảng sau khi khởi tạo với 32 đội.

| Điều kiện | Input | Test Case | Expected Result |
|---|---:|---|---|
| Giá trị yêu cầu | 8 | TC-T180 | Valid |
| Dưới boundary | 7 | Không có | Chưa kiểm thử |
| Trên boundary | 9 | Không có | Chưa kiểm thử |

---

## 7. Decision Table Testing

### 7.1 Bảng quyết định xếp hạng vòng bảng

Logic xếp hạng vòng bảng sử dụng chuỗi tiêu chí so sánh. Tiêu chí tiếp
theo chỉ được sử dụng khi tiêu chí hiện tại không phân biệt được hai đội.

| Rule | Điểm khác nhau | Hiệu số khác nhau | Thẻ khác nhau | Đối đầu khác nhau | Bốc thăm khác nhau | Quyết định |
|---|---|---|---|---|---|---|
| R1 | Có | - | - | - | - | Xếp theo điểm |
| R2 | Không | Có | - | - | - | Xếp theo hiệu số |
| R3 | Không | Không | Có | - | - | Xếp theo thẻ |
| R4 | Không | Không | Không | Có | - | Xếp theo đối đầu |
| R5 | Không | Không | Không | Không | Có | Xếp theo bốc thăm |
| R6 | Không | Không | Không | Không | Không | Hai đội vẫn bằng nhau |

### Mapping Test Case

| Decision Rule | Test Case | Mục đích |
|---|---|---|
| R1 | TC-T081 | So sánh điểm trước |
| R2 | TC-T082 | So sánh hiệu số |
| R3 | TC-T083 | So sánh thẻ |
| R4 | TC-T084 | So sánh đối đầu |
| R5 | TC-T085 | So sánh bốc thăm |
| Chuyển sang tiêu chí tiếp theo | TC-T087, TC-T088 | Xác định khi nào cần tiêu chí tiếp theo |

**Kết luận:** Các test case kiểm tra rằng các tiêu chí xếp hạng được
đánh giá theo đúng thứ tự và tiêu chí tiếp theo được sử dụng khi tiêu
chí hiện tại bằng nhau.

---

## 8. White-box Testing

White-box testing được áp dụng để kiểm tra logic quyết định bên trong
các lớp Java.

Các JUnit test hiện tại kiểm tra cả nhánh hợp lệ và không hợp lệ của
các phương thức được triển khai.

### 8.1 Match Duration

| Branch | Input | Test Case | Expected |
|---|---:|---|---|
| Nhánh hợp lệ | 90 | TC-T025 | true |
| Nhánh không hợp lệ | 89 | TC-T192 | false |
| Nhánh không hợp lệ | 91 | TC-T202 | false |

### 8.2 Extra-time Half Count

| Branch | Input | Test Case | Expected |
|---|---:|---|---|
| Nhánh hợp lệ | 0 | TC-T031 | true |
| Nhánh hợp lệ | 1 | TC-T053 | true |
| Nhánh hợp lệ | 2 | TC-T032 | true |
| Nhánh không hợp lệ | -1 | TC-T070 | false |
| Nhánh không hợp lệ | 3 | TC-T033 | false |
| Nhánh không hợp lệ | 4 | TC-T204 | false |

### 8.3 Red Card Decision

| Branch | Input | Test Case | Expected |
|---|---|---|---|
| Có thẻ đỏ | true | TC-T042 | true |
| Không có thẻ đỏ | false | TC-T194 | false |

### 8.4 Kết luận

Bộ JUnit hiện tại kiểm tra các nhánh true và false chính của logic
nghiệp vụ đã triển khai.

Không cần tạo thêm test case cho phần này vì các nhánh yêu cầu đã được
bao phủ bởi các automated test hiện tại.
