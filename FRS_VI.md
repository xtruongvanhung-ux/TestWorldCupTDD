# ĐẶC TẢ YÊU CẦU CHỨC NĂNG (FRS)

## World Cup Test Application

---

# 1. Giới thiệu

## 1.1 Mục đích

Tài liệu Functional Requirements Specification (FRS) mô tả chi tiết
cách các yêu cầu chức năng của World Cup Test Application được thực
hiện trong hệ thống.

FRS được xây dựng dựa trên các yêu cầu chức năng đã được xác định
trong Software Requirements Specification (SRS), đồng thời đối chiếu
với source code và automated test suite thực tế của project.

Mục đích của FRS là cung cấp đặc tả đủ chi tiết để:

- Xác định chính xác hành vi của từng chức năng.
- Mô tả dữ liệu đầu vào và kết quả đầu ra.
- Mô tả các quy tắc xử lý nghiệp vụ.
- Mô tả các điều kiện hợp lệ và không hợp lệ.
- Mô tả luồng xử lý chính và các trường hợp ngoại lệ.
- Xác định các test case dùng để kiểm chứng chức năng.
- Hỗ trợ Developer trong quá trình triển khai.
- Hỗ trợ QA/Tester trong quá trình thiết kế và thực hiện kiểm thử.

---

## 1.2 Phạm vi

FRS mô tả chi tiết 10 nhóm yêu cầu chức năng của
World Cup Test Application:

| Requirement ID | Chức năng |
|---|---|
| FR-01 | Quản lý đội tuyển |
| FR-02 | Quản lý cầu thủ |
| FR-03 | Quản lý trận đấu |
| FR-04 | Quản lý vòng bảng |
| FR-05 | Quản lý vòng loại trực tiếp |
| FR-06 | Quản lý giải đấu |
| FR-07 | Quản lý cầu thủ ghi bàn hàng đầu |
| FR-08 | Quản lý cơ sở dữ liệu |
| FR-09 | Ứng dụng Web |
| FR-10 | Kiểm thử tự động |

FRS không thay thế SRS.

SRS xác định các yêu cầu mà hệ thống phải đáp ứng.

FRS đặc tả chi tiết hành vi của từng yêu cầu trong phạm vi triển khai
thực tế của project.

---

## 1.3 Cơ sở xây dựng FRS

FRS được xây dựng từ các nguồn sau:

- Software Requirements Specification (SRS).
- Source code của World Cup Test Application.
- JUnit 5 test suite.
- Selenium WebDriver test suite.
- Maven configuration.
- Allure reporting configuration.
- Requirements Traceability Matrix.
- Test Case Register.

Các nội dung trong FRS phải phản ánh chức năng thực tế đã được triển
khai và kiểm thử trong project.

FRS không tự bổ sung các chức năng chưa được xác định trong SRS hoặc
chưa có cơ sở từ implementation và test case thực tế.

---

## 1.4 Nguyên tắc đặc tả

Mỗi Functional Requirement sẽ được đặc tả theo các nội dung phù hợp
với chức năng thực tế, bao gồm:

- Mục đích của chức năng.
- Tác nhân hoặc thành phần tương tác.
- Dữ liệu đầu vào.
- Điều kiện tiền đề.
- Quy tắc xử lý.
- Luồng xử lý chính.
- Luồng xử lý thay thế hoặc ngoại lệ.
- Dữ liệu đầu ra.
- Điều kiện sau khi xử lý.
- Test case liên quan.

Không phải mọi Functional Requirement đều bắt buộc có tất cả các mục
trên nếu nội dung đó không phù hợp với bản chất của chức năng.

---

## 1.5 Mối quan hệ giữa SRS, FRS và Test Case

Các tài liệu được liên kết theo quy trình:

SRS
↓
Functional Requirement
↓
FRS
↓
Detailed Functional Behavior
↓
Test Case
↓
Test Execution
↓
Test Result

SRS xác định hệ thống cần đáp ứng yêu cầu gì.

FRS mô tả chi tiết chức năng phải hoạt động như thế nào.

Test Case xác minh hành vi được mô tả trong FRS.

Test Execution cung cấp kết quả thực tế của các test case.

---

## 1.6 Đối tượng sử dụng

FRS được sử dụng bởi:

- Developer.
- QA/Tester.
- Người thực hiện automated testing.
- Người đánh giá project.
- Giảng viên hoặc người kiểm tra tài liệu.

Tài liệu giúp Developer hiểu chính xác hành vi cần triển khai và giúp
QA/Tester xác định các trường hợp cần kiểm thử.

---

## 1.7 Phạm vi triển khai

FRS phản ánh trạng thái thực tế của World Cup Test Application tại
thời điểm hoàn thiện tài liệu.

Các đặc tả phải phù hợp với:

- Chức năng đã được triển khai.
- Quy tắc nghiệp vụ đã được xác định.
- Automated test case hiện có.
- Kết quả kiểm thử thực tế.

Các nội dung chỉ mang tính giả định hoặc chưa được triển khai sẽ
không được đưa vào FRS như một chức năng đã hoàn thành.

---

## 1.8 Phương pháp kiểm chứng

Các yêu cầu trong FRS được kiểm chứng thông qua các hình thức kiểm thử
được triển khai trong project:

- JUnit 5 Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Selenium Web UI Testing.
- Maven automated test execution.
- Allure test reporting.

Các kỹ thuật kiểm thử cụ thể sẽ được mô tả tại từng Functional
Requirement khi có liên quan.

---

## 1.9 Kết quả kiểm thử tham chiếu

FRS được đối chiếu với kết quả automated test execution hiện tại.

Kết quả kiểm thử gần nhất:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Bộ Selenium Web UI hiện có 6 test case:

- TC_WEB_001 — Valid 90-minute match.
- TC_WEB_002 — Invalid 89-minute match.
- TC_WEB_003 — Invalid 91-minute match.
- TC_WEB_004 — Homepage UI verification.
- TC_WEB_005 — Empty match-duration input.
- TC_WEB_006 — Invalid non-numeric input.

Các kết quả này được sử dụng làm bằng chứng kiểm chứng cho các
Functional Requirement tương ứng.

---

## 1.10 Cấu trúc các phần tiếp theo

Các phần tiếp theo của FRS sẽ lần lượt đặc tả các Functional
Requirement:

- FR-01 — Quản lý đội tuyển.
- FR-02 — Quản lý cầu thủ.
- FR-03 — Quản lý trận đấu.
- FR-04 — Quản lý vòng bảng.
- FR-05 — Quản lý vòng loại trực tiếp.
- FR-06 — Quản lý giải đấu.
- FR-07 — Quản lý cầu thủ ghi bàn hàng đầu.
- FR-08 — Quản lý cơ sở dữ liệu.
- FR-09 — Ứng dụng Web.
- FR-10 — Kiểm thử tự động.

Mỗi phần sẽ được xây dựng dựa trên yêu cầu tương ứng trong SRS và
được đối chiếu với implementation và test case thực tế.

---

## 1.11 Kết luận

FRS là tài liệu đặc tả chi tiết hành vi của các chức năng trong
World Cup Test Application.

Tài liệu được xây dựng từ SRS và được kiểm chứng bằng source code,
automated test suite và kết quả thực thi kiểm thử.

Phần tiếp theo sẽ bắt đầu đặc tả chi tiết:

**FR-01 — Quản lý đội tuyển.**

## 2. Yêu cầu chức năng

## 2.1 FR-01 — Team Management

### 2.1.1 Mục đích

FR-01 — Team Management đặc tả chức năng quản lý thông tin của một
đội tuyển trong World Cup Test Application.

Chức năng cho phép hệ thống lưu trữ và quản lý các thành phần chính của
đội tuyển, bao gồm:

- Tên quốc gia.
- Huấn luyện viên trưởng.
- Trợ lý huấn luyện viên.
- Cầu thủ.
- Cầu thủ đá chính.
- Cầu thủ dự bị.
- Thành viên ban huấn luyện / nhân viên.

FR-01 tập trung vào việc quản lý thông tin đội tuyển và kiểm tra các
giới hạn về số lượng được quy định trong SRS.

---

### 2.1.2 Dữ liệu đầu vào

Thông tin đầu vào của Team Management bao gồm:

| Dữ liệu | Mô tả |
|---|---|
| Country name | Tên quốc gia của đội tuyển |
| Head coach | Huấn luyện viên trưởng |
| Assistant coaches | Danh sách trợ lý huấn luyện viên |
| Players | Danh sách cầu thủ của đội |
| Starting players | Danh sách cầu thủ đá chính |
| Substitute players | Danh sách cầu thủ dự bị |
| Staff member | Thành viên ban huấn luyện / nhân viên |

Các dữ liệu trên được quản lý bởi đối tượng `Team` trong hệ thống.

---

### 2.1.3 Quy tắc xử lý

Hệ thống phải quản lý thông tin đội tuyển theo các quy tắc được xác
định trong SRS.

#### 2.1.3.1 Thông tin đội tuyển

Đội tuyển phải hỗ trợ:

- Tên quốc gia.
- Huấn luyện viên trưởng.
- Trợ lý huấn luyện viên.
- Cầu thủ.
- Cầu thủ đá chính.
- Cầu thủ dự bị.
- Thành viên ban huấn luyện / nhân viên.

#### 2.1.3.2 Trợ lý huấn luyện viên

Một đội tuyển được phép có tối đa **3 trợ lý huấn luyện viên**.

#### 2.1.3.3 Số lượng cầu thủ

Một đội tuyển phải có từ **21 đến 22 cầu thủ**.

#### 2.1.3.4 Đội hình xuất phát

Đội hình xuất phát phải có từ **7 đến 11 cầu thủ**.

#### 2.1.3.5 Cầu thủ dự bị

Một đội tuyển phải có từ **4 đến 5 cầu thủ dự bị**.

Các giới hạn số lượng trên được kiểm tra thông qua automated test suite.

---

### 2.1.4 Luồng xử lý chính

Luồng xử lý chính của Team Management:

1. Khởi tạo thông tin đội tuyển.
2. Thiết lập tên quốc gia.
3. Thiết lập huấn luyện viên trưởng.
4. Thiết lập danh sách trợ lý huấn luyện viên.
5. Thiết lập danh sách cầu thủ.
6. Thiết lập danh sách cầu thủ đá chính.
7. Thiết lập danh sách cầu thủ dự bị.
8. Thiết lập thông tin thành viên ban huấn luyện / nhân viên.
9. Kiểm tra các giới hạn số lượng tương ứng.
10. Truy xuất thông tin đội tuyển khi cần.

Kết quả xử lý phải phản ánh đúng thông tin đã được thiết lập cho đội
tuyển.

---

### 2.1.5 Luồng xử lý không hợp lệ

Hệ thống phải kiểm tra các trường hợp dữ liệu không đáp ứng giới hạn
được quy định.

Các trường hợp cần được kiểm tra bao gồm:

- Số lượng trợ lý huấn luyện viên vượt quá 3.
- Số lượng cầu thủ nhỏ hơn 21 hoặc lớn hơn 22.
- Số lượng cầu thủ đá chính nhỏ hơn 7 hoặc lớn hơn 11.
- Số lượng cầu thủ dự bị nhỏ hơn 4 hoặc lớn hơn 5.

Các trường hợp hợp lệ tại giới hạn cũng phải được kiểm tra để bảo đảm
hệ thống xử lý đúng giá trị biên.

Các hành vi validation cụ thể phải phù hợp với implementation thực tế
của lớp `Team`.

---

### 2.1.6 Kết quả đầu ra

Sau khi xử lý, hệ thống phải cung cấp các thông tin tương ứng của đội
tuyển:

- Tên quốc gia.
- Huấn luyện viên trưởng.
- Danh sách trợ lý huấn luyện viên.
- Danh sách cầu thủ.
- Danh sách cầu thủ đá chính.
- Danh sách cầu thủ dự bị.
- Thông tin thành viên ban huấn luyện / nhân viên.

Các thông tin đã lưu phải có thể được truy xuất thông qua chức năng
tương ứng của đối tượng `Team`.

---

### 2.1.7 Test Case

FR-01 được kiểm thử bởi `TeamTest.java`.

Các test case thuộc FR-01:

| Test Case | Nội dung |
|---|---|
| TC-T001 | Country name |
| TC-T002 | Head coach |
| TC-T003 – TC-T005 | Assistant coaches |
| TC-T006 – TC-T008 | Team player count |
| TC-T009 – TC-T012 | Starting players |
| TC-T013 – TC-T015 | Substitute players |
| TC-T016 – TC-T019 | Team collections |
| TC-T020 | Staff member |

Tổng số test case thuộc FR-01:

**20 test cases.**

---

### 2.1.8 Phân loại kỹ thuật kiểm thử

FR-01 được kiểm chứng bằng các kỹ thuật kiểm thử phù hợp với các quy
tắc của Team Management.

#### Unit Testing

Các chức năng của lớp `Team` được kiểm thử độc lập bằng JUnit 5
thông qua `TeamTest.java`.

#### Functional Testing

Các test case kiểm tra chức năng quản lý thông tin và các quy tắc
nghiệp vụ của đội tuyển.

#### Boundary Value Analysis

Boundary Value Analysis được áp dụng cho các quy tắc có giới hạn số
lượng, bao gồm:

- Tối đa 3 trợ lý huấn luyện viên.
- Từ 21 đến 22 cầu thủ.
- Từ 7 đến 11 cầu thủ đá chính.
- Từ 4 đến 5 cầu thủ dự bị.

Các giá trị tại biên và ngoài biên được sử dụng để kiểm tra hành vi
của hệ thống.

---

### 2.1.9 Traceability

FR-01 được ánh xạ từ SRS đến implementation và automated test suite
như sau:

| Thành phần | Ánh xạ |
|---|---|
| SRS Requirement | FR-01 — Team Management |
| Implementation | `Team` |
| Test Suite | `TeamTest.java` |
| Test Cases | TC-T001 – TC-T020 |
| Test Type | JUnit 5 Unit / Functional Testing |
| Test Technique | Boundary Value Analysis |

Quan hệ truy xuất:

`SRS FR-01 → FRS FR-01 → Team → TeamTest.java → TC-T001 – TC-T020`

---

### 2.1.10 Tiêu chí hoàn thành

FR-01 được xem là đáp ứng khi:

- Tên quốc gia được quản lý và truy xuất chính xác.
- Huấn luyện viên trưởng được quản lý và truy xuất chính xác.
- Trợ lý huấn luyện viên được quản lý theo giới hạn quy định.
- Tổng số cầu thủ tuân thủ giới hạn 21–22.
- Đội hình xuất phát tuân thủ giới hạn 7–11 cầu thủ.
- Đội hình dự bị tuân thủ giới hạn 4–5 cầu thủ.
- Thông tin thành viên ban huấn luyện / nhân viên được quản lý.
- Các giá trị biên được kiểm tra.
- Các trường hợp không hợp lệ được kiểm tra.
- Các test case thuộc FR-01 thực thi thành công.

---

### 2.1.11 Trạng thái kiểm thử

FR-01 — Team Management:

**Coverage Status: Covered**

Bộ kiểm thử `TeamTest.java` gồm **20 test cases** được ánh xạ tới
FR-01.

Kết quả automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

FR-01 hiện được bao phủ bởi automated test suite.

---

### 2.1.12 Kết luận

FR-01 — Team Management đặc tả việc quản lý thông tin đội tuyển và
các giới hạn về số lượng thành phần của đội.

Các yêu cầu của FR-01 được kiểm chứng bằng `TeamTest.java` với 20
automated test cases.

**FR-01 — Team Management: Covered.**

## 2.2 FR-02 — Player Management

### 2.2.1 Mục đích

FR-02 — Player Management đặc tả chức năng quản lý thông tin cơ bản
của một cầu thủ trong World Cup Test Application.

Chức năng cho phép hệ thống tạo một đối tượng cầu thủ với tên cầu thủ
và truy xuất lại tên đã được lưu.

FR-02 là chức năng đơn giản và được kiểm chứng bằng automated test
trong `PlayerTest.java`.

---

### 2.2.2 Dữ liệu đầu vào

Dữ liệu đầu vào của Player Management gồm:

| Dữ liệu | Mô tả |
|---|---|
| Player name | Tên của cầu thủ |

Tên cầu thủ được truyền khi tạo đối tượng `Player`.

---

### 2.2.3 Quy tắc xử lý

Hệ thống phải hỗ trợ các hành vi sau:

1. Tạo một đối tượng `Player` với tên cầu thủ.
2. Lưu tên cầu thủ trong đối tượng.
3. Cho phép truy xuất tên cầu thủ đã được lưu.

FR-02 không xác định các quy tắc về vị trí thi đấu, tuổi, quốc tịch,
số áo hoặc các thuộc tính khác của cầu thủ.

Các nội dung này không được đưa vào FRS vì không được xác định trong
FR-02 của SRS.

---

### 2.2.4 Luồng xử lý chính

Luồng xử lý chính:

1. Nhận tên cầu thủ.
2. Khởi tạo đối tượng `Player`.
3. Lưu tên cầu thủ vào đối tượng.
4. Truy xuất tên cầu thủ.
5. So sánh giá trị trả về với tên đã được thiết lập.

Kết quả trả về phải tương ứng với tên cầu thủ đã được lưu.

---

### 2.2.5 Luồng xử lý không hợp lệ

FR-02 trong SRS hiện tại chỉ yêu cầu tạo cầu thủ với tên và trả về
tên đã lưu.

SRS không quy định các điều kiện validation đối với tên cầu thủ.

Do đó, FRS không đưa ra thêm các quy tắc như:

- Độ dài tối thiểu của tên.
- Độ dài tối đa của tên.
- Ký tự đặc biệt.
- Tên trống.
- Tên bị trùng.

Các điều kiện trên chỉ được đặc tả nếu implementation hoặc yêu cầu
chính thức của project xác định chúng.

---

### 2.2.6 Kết quả đầu ra

Kết quả đầu ra của Player Management là tên cầu thủ đã được lưu
trong đối tượng `Player`.

Ví dụ về hành vi chức năng:

`Player name → Player → stored player name`

Giá trị được trả về phải tương ứng với tên đã được thiết lập khi tạo
đối tượng.

---

### 2.2.7 Test Case

FR-02 được kiểm thử bởi `PlayerTest.java`.

Test case thuộc FR-02:

| Test Case | Nội dung |
|---|---|
| TC-P001 | Player stores and returns the player name |

Tổng số test case thuộc FR-02:

**1 test case.**

Test case kiểm tra rằng:

- Một player có thể được tạo với tên.
- Tên được lưu trong đối tượng.
- Tên đã lưu có thể được truy xuất chính xác.

---

### 2.2.8 Phân loại kỹ thuật kiểm thử

FR-02 được kiểm chứng bằng:

#### Unit Testing

Lớp `Player` được kiểm thử độc lập bằng JUnit 5 thông qua
`PlayerTest.java`.

#### Functional Testing

Test case xác minh chức năng tạo player và truy xuất tên player theo
yêu cầu FR-02.

FR-02 không có quy tắc số lượng hoặc giới hạn số học được xác định
trong SRS, do đó Boundary Value Analysis không được áp dụng cho
requirement này.

---

### 2.2.9 Traceability

FR-02 được ánh xạ từ SRS đến implementation và automated test suite
như sau:

| Thành phần | Ánh xạ |
|---|---|
| SRS Requirement | FR-02 — Player Management |
| Implementation | `Player` |
| Test Suite | `PlayerTest.java` |
| Test Case | TC-P001 |
| Test Type | JUnit 5 Unit / Functional Testing |

Quan hệ truy xuất:

`SRS FR-02 → FRS FR-02 → Player → PlayerTest.java → TC-P001`

---

### 2.2.10 Tiêu chí hoàn thành

FR-02 được xem là đáp ứng khi:

- Có thể tạo một đối tượng `Player` với tên cầu thủ.
- Tên cầu thủ được lưu trong đối tượng.
- Có thể truy xuất tên cầu thủ đã lưu.
- Giá trị trả về khớp với tên đã thiết lập.
- TC-P001 thực thi thành công.

---

### 2.2.11 Trạng thái kiểm thử

FR-02 — Player Management:

**Coverage Status: Covered**

Bộ kiểm thử `PlayerTest.java` gồm **1 test case** được ánh xạ tới
FR-02.

Kết quả automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

FR-02 hiện được bao phủ bởi automated test suite.

---

### 2.2.12 Kết luận

FR-02 — Player Management đặc tả chức năng tạo và quản lý tên của một
cầu thủ.

Chức năng được kiểm chứng bằng `PlayerTest.java` với test case
TC-P001.

**FR-02 — Player Management: Covered.**

## 2.3 FR-03 — Match Management

### 2.3.1 Mục đích

FR-03 — Match Management đặc tả các chức năng và quy tắc nghiệp vụ
liên quan đến một trận đấu trong World Cup Test Application.

Chức năng bao gồm việc kiểm tra:

- Thời lượng trận đấu.
- Thời lượng mỗi hiệp.
- Thời gian nghỉ giữa hai hiệp.
- Hiệp phụ.
- Bàn thắng bạc.
- Sút luân lưu.
- Thẻ vàng.
- Thẻ đỏ.
- Số lượng cầu thủ tối thiểu trên sân.
- Quy tắc thay người.
- Số lượng cầu thủ được thay trong mỗi lần thay người.
- Việc thay người không phụ thuộc vào vị trí cầu thủ.

FR-03 được kiểm chứng chủ yếu bằng `MatchTest.java`.

---

### 2.3.2 Dữ liệu đầu vào

Dữ liệu liên quan đến Match Management bao gồm các thông tin và giá
trị được sử dụng để kiểm tra luật thi đấu:

| Dữ liệu | Mô tả |
|---|---|
| Match duration | Tổng thời lượng trận đấu |
| Half duration | Thời lượng của một hiệp |
| Half-time break | Thời gian nghỉ giữa hai hiệp |
| Extra-time halves | Số lượng hiệp phụ |
| Extra-time duration | Thời lượng mỗi hiệp phụ |
| Match score | Tỷ số trận đấu |
| Penalty score | Tỷ số sút luân lưu |
| Yellow cards | Số lượng thẻ vàng của cầu thủ |
| Red cards | Trạng thái thẻ đỏ của cầu thủ |
| Players on field | Số lượng cầu thủ trên sân |
| Substitutions | Thông tin thay người |
| Substitution batch size | Số lượng cầu thủ được thay trong một lần |

Các dữ liệu trên được xử lý theo các quy tắc được triển khai trong
project.

---

### 2.3.3 Quy tắc xử lý

Hệ thống phải kiểm tra các quy tắc thi đấu được xác định trong FR-03.

#### 2.3.3.1 Thời lượng trận đấu

Một trận đấu vòng bảng phải kéo dài **90 phút**.

Giá trị thời lượng được kiểm tra để xác định trận đấu có đáp ứng quy
tắc hay không.

#### 2.3.3.2 Thời lượng mỗi hiệp

Mỗi hiệp đấu phải kéo dài **45 phút**.

#### 2.3.3.3 Thời gian nghỉ giữa hai hiệp

Thời gian nghỉ giữa hai hiệp phải **không quá 15 phút**.

#### 2.3.3.4 Hiệp phụ

Một trận đấu loại trực tiếp có thể có từ **0 đến 2 hiệp phụ**.

Mỗi hiệp phụ kéo dài **30 phút**.

#### 2.3.3.5 Bàn thắng bạc

Hệ thống phải hỗ trợ quy tắc bàn thắng bạc theo logic được triển khai
trong project.

Bàn thắng bạc có thể kết thúc trận đấu khi tỷ số giữa hai đội khác
nhau theo điều kiện của trận đấu.

#### 2.3.3.6 Sút luân lưu

Hệ thống phải hỗ trợ xác định đội thắng sau các lượt sút luân lưu.

Sau **5 lượt sút**, nếu tỷ số giữa hai đội khác nhau thì có thể xác
định đội thắng.

Nếu tỷ số vẫn bằng nhau sau 5 lượt, trận đấu tiếp tục theo hình thức
**sudden death**.

#### 2.3.3.7 Thẻ vàng

Cầu thủ phải rời sân khi nhận từ **2 thẻ vàng trở lên** theo quy tắc
được triển khai.

#### 2.3.3.8 Thẻ đỏ

Cầu thủ phải rời sân sau khi nhận **thẻ đỏ**.

#### 2.3.3.9 Số lượng cầu thủ tối thiểu

Một đội phải có ít nhất **7 cầu thủ trên sân** để tiếp tục thi đấu.

#### 2.3.3.10 Thay người

Một đội được thực hiện tối đa **3 lần thay người**.

#### 2.3.3.11 Số lượng cầu thủ trong một lần thay người

Mỗi lần thay người có thể thay từ **1 đến 3 cầu thủ**.

#### 2.3.3.12 Vị trí cầu thủ

Vị trí của cầu thủ không hạn chế việc thay người theo quy tắc được
triển khai trong project.

---

### 2.3.4 Luồng xử lý chính

Luồng xử lý tổng quát của Match Management:

1. Khởi tạo hoặc thiết lập thông tin trận đấu.
2. Xác định thời lượng trận đấu.
3. Kiểm tra thời lượng mỗi hiệp.
4. Kiểm tra thời gian nghỉ giữa hai hiệp.
5. Kiểm tra điều kiện hiệp phụ nếu trận đấu cần hiệp phụ.
6. Xử lý các điều kiện liên quan đến bàn thắng.
7. Xử lý sút luân lưu khi cần xác định đội thắng.
8. Kiểm tra thẻ vàng và thẻ đỏ.
9. Kiểm tra số lượng cầu thủ còn lại trên sân.
10. Kiểm tra số lần thay người.
11. Kiểm tra số lượng cầu thủ được thay trong mỗi lần thay.
12. Xác định kết quả theo các quy tắc được triển khai.

---

### 2.3.5 Luồng xử lý không hợp lệ

Hệ thống phải xử lý các trường hợp vi phạm giới hạn hoặc quy tắc
thi đấu.

Các trường hợp cần được kiểm tra bao gồm:

- Thời lượng trận đấu khác 90 phút.
- Thời lượng mỗi hiệp khác 45 phút.
- Thời gian nghỉ vượt quá 15 phút.
- Số lượng hiệp phụ nhỏ hơn 0 hoặc lớn hơn 2.
- Thời lượng hiệp phụ khác 30 phút.
- Số lượng cầu thủ trên sân thấp hơn 7.
- Số lần thay người vượt quá 3.
- Số cầu thủ được thay trong một lần nằm ngoài khoảng 1–3.
- Điều kiện thẻ vàng hoặc thẻ đỏ làm thay đổi trạng thái cầu thủ.

Các giá trị tại biên và ngoài biên được kiểm tra bằng automated test.

---

### 2.3.6 Kết quả đầu ra

Sau khi xử lý, hệ thống phải xác định trạng thái hoặc kết quả tương
ứng với các quy tắc của trận đấu.

Các kết quả có thể bao gồm:

- Xác định thời lượng trận đấu hợp lệ hoặc không hợp lệ.
- Xác định thời lượng hiệp hợp lệ hoặc không hợp lệ.
- Xác định thời gian nghỉ hợp lệ hoặc không hợp lệ.
- Xác định điều kiện hiệp phụ.
- Xác định kết quả theo quy tắc bàn thắng bạc.
- Xác định đội thắng sau sút luân lưu.
- Xác định trạng thái cầu thủ sau thẻ vàng hoặc thẻ đỏ.
- Xác định điều kiện số lượng cầu thủ tối thiểu.
- Xác định tính hợp lệ của việc thay người.

Kết quả được cung cấp cho các chức năng khác của hệ thống khi cần.

---

### 2.3.7 Test Case

FR-03 được kiểm thử chủ yếu bởi `MatchTest.java`.

Các nhóm test case liên quan:

| Test Case | Nội dung |
|---|---|
| TC-T025 – TC-T071 | Các quy tắc Match |
| TC-T192 – TC-T216 | Các quy tắc Match bổ sung |
| TC-T249 | Quy tắc Match bổ sung |

Các test case bao phủ các nhóm chức năng:

- Match duration.
- Half duration.
- Half-time break.
- Extra-time rules.
- Silver goal.
- Penalty shootout.
- Yellow-card rules.
- Red-card rules.
- Minimum players on the field.
- Substitution rules.
- Substitution batch size.
- Position-independent substitution.

Tổng số test case được ánh xạ tới FR-03:

**68 automated test cases.**

---

### 2.3.8 Phân loại kỹ thuật kiểm thử

FR-03 được kiểm chứng bằng các kỹ thuật sau:

#### Unit Testing

Các logic liên quan đến Match được kiểm thử độc lập bằng JUnit 5
thông qua `MatchTest.java`.

#### Functional Testing

Các test case kiểm tra hành vi của Match theo các yêu cầu nghiệp vụ.

#### Boundary Value Analysis

Boundary Value Analysis được áp dụng cho các quy tắc có giới hạn số,
bao gồm:

- 90 phút của trận đấu.
- 45 phút của mỗi hiệp.
- 15 phút thời gian nghỉ.
- 0–2 hiệp phụ.
- 30 phút mỗi hiệp phụ.
- Ít nhất 7 cầu thủ trên sân.
- Tối đa 3 lần thay người.
- 1–3 cầu thủ trong một lần thay người.

Các giá trị tại biên và ngoài biên được sử dụng để kiểm tra hành vi
của hệ thống.

---

### 2.3.9 Traceability

FR-03 được ánh xạ từ SRS đến implementation và automated test suite
như sau:

| Thành phần | Ánh xạ |
|---|---|
| SRS Requirement | FR-03 — Match Management |
| Implementation | `Match` |
| Test Suite | `MatchTest.java` |
| Test Cases | TC-T025 – TC-T071, TC-T192 – TC-T216, TC-T249 |
| Test Type | JUnit 5 Unit / Functional Testing |
| Test Technique | Boundary Value Analysis |

Quan hệ truy xuất:

`SRS FR-03 → FRS FR-03 → Match → MatchTest.java → Match Test Cases`

---

### 2.3.10 Tiêu chí hoàn thành

FR-03 được xem là đáp ứng khi:

- Trận đấu vòng bảng được kiểm tra với thời lượng 90 phút.
- Mỗi hiệp được kiểm tra với thời lượng 45 phút.
- Thời gian nghỉ được kiểm tra với giới hạn không quá 15 phút.
- Số lượng hiệp phụ được kiểm tra trong khoảng 0–2.
- Thời lượng mỗi hiệp phụ được kiểm tra là 30 phút.
- Quy tắc bàn thắng bạc được kiểm tra.
- Quy tắc sút luân lưu được kiểm tra.
- Quy tắc sudden death được kiểm tra.
- Quy tắc thẻ vàng được kiểm tra.
- Quy tắc thẻ đỏ được kiểm tra.
- Số lượng cầu thủ tối thiểu trên sân được kiểm tra.
- Số lần thay người được kiểm tra.
- Số cầu thủ trong một lần thay người được kiểm tra.
- Việc thay người không bị giới hạn bởi vị trí được kiểm tra.
- Các giá trị biên và ngoài biên được kiểm thử.
- Các test case thuộc FR-03 thực thi thành công.

---

### 2.3.11 Trạng thái kiểm thử

FR-03 — Match Management:

**Coverage Status: Covered**

Các nhóm test case của Match Management được triển khai trong
`MatchTest.java`.

Kết quả automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

FR-03 hiện được bao phủ bởi automated test suite.

---

### 2.3.12 Kết luận

FR-03 — Match Management đặc tả các quy tắc nghiệp vụ cốt lõi của một
trận đấu trong World Cup Test Application.

Chức năng bao gồm thời lượng trận đấu, thời lượng hiệp, thời gian
nghỉ, hiệp phụ, bàn thắng bạc, sút luân lưu, thẻ phạt, số lượng cầu
thủ trên sân và quy tắc thay người.

FR-03 được kiểm chứng thông qua các test case trong `MatchTest.java`
và được đánh giá là:

**FR-03 — Match Management: Covered.**

## 2.4 FR-04 — Group Stage Management

### 2.4.1 Mục đích

FR-04 — Group Stage Management đặc tả các chức năng và quy tắc nghiệp
vụ liên quan đến giai đoạn vòng bảng của World Cup Test Application.

Chức năng bao gồm:

- Tổ chức các đội thành các bảng đấu.
- Xác định số lượng đội trong giải đấu.
- Xác định số lượng đội trong mỗi bảng.
- Xác định số đối thủ của mỗi đội.
- Tính điểm dựa trên kết quả trận đấu.
- Xếp hạng các đội trong bảng.
- Xử lý các tiêu chí phân định thứ hạng.
- Xác định các đội đủ điều kiện tham dự Round of 16.

FR-04 được kiểm chứng chủ yếu bằng `GroupStageTest.java`.

---

### 2.4.2 Dữ liệu đầu vào

Dữ liệu liên quan đến Group Stage Management bao gồm:

| Dữ liệu | Mô tả |
|---|---|
| Teams | Danh sách các đội tham gia giải đấu |
| Groups | Danh sách các bảng đấu |
| Matches | Các trận đấu trong từng bảng |
| Match results | Kết quả các trận đấu |
| Points | Điểm số của các đội |
| Goals | Số bàn thắng và bàn thua |
| Goal difference | Hiệu số bàn thắng |
| Cards | Thông tin thẻ phạt |
| Head-to-head result | Kết quả đối đầu trực tiếp |
| Qualification status | Trạng thái đủ điều kiện đi tiếp |

Các dữ liệu được xử lý theo các quy tắc vòng bảng được triển khai
trong project.

---

### 2.4.3 Quy tắc xử lý

Hệ thống phải hỗ trợ các quy tắc vòng bảng được xác định trong FR-04.

#### 2.4.3.1 Cấu trúc giải đấu

Giải đấu chính thức có **32 đội**.

Các đội được tổ chức thành **8 bảng**.

Mỗi bảng có **4 đội**.

#### 2.4.3.2 Đối thủ của mỗi đội

Mỗi đội trong một bảng phải thi đấu với **3 đối thủ** còn lại trong
cùng bảng.

#### 2.4.3.3 Tính điểm

Điểm số được tính dựa trên kết quả trận đấu:

| Kết quả | Điểm |
|---|---:|
| Thắng | 3 |
| Hòa | 1 |
| Thua | 0 |

#### 2.4.3.4 Xếp hạng

Hệ thống phải hỗ trợ các tiêu chí xếp hạng theo thứ tự:

1. Điểm số.
2. Hiệu số bàn thắng.
3. Thẻ phạt.
4. Kết quả đối đầu trực tiếp.
5. Bốc thăm.

Các tiêu chí được sử dụng để phân định thứ hạng giữa các đội trong
cùng bảng.

#### 2.4.3.5 Trọng số thẻ

Khi sử dụng tiêu chí thẻ phạt để phân định thứ hạng:

**1 thẻ đỏ tương đương 2 thẻ vàng.**

Hệ thống phải áp dụng quy tắc trọng số này theo implementation thực
tế.

#### 2.4.3.6 Điều kiện đi tiếp

Các đội đứng ở vị trí **thứ nhất và thứ hai** trong mỗi bảng được
phép vào Round of 16.

Với 8 bảng, tổng số đội đủ điều kiện vào Round of 16 là **16 đội**.

---

### 2.4.4 Luồng xử lý chính

Luồng xử lý chính của Group Stage Management:

1. Nhận danh sách 32 đội tham gia giải đấu.
2. Tạo 8 bảng đấu.
3. Phân bổ 4 đội vào mỗi bảng.
4. Xác định 3 đối thủ của mỗi đội.
5. Tổ chức các trận đấu trong từng bảng.
6. Ghi nhận kết quả các trận đấu.
7. Tính điểm cho từng đội.
8. Tính hiệu số bàn thắng.
9. Cập nhật thông tin thẻ phạt.
10. Áp dụng các tiêu chí xếp hạng theo thứ tự.
11. Sử dụng kết quả đối đầu khi cần.
12. Sử dụng bốc thăm khi các tiêu chí trước đó không thể phân định.
13. Xác định đội đứng thứ nhất và thứ hai trong mỗi bảng.
14. Tạo danh sách 16 đội đủ điều kiện tham dự Round of 16.

---

### 2.4.5 Luồng xử lý không hợp lệ

Hệ thống phải kiểm tra các trường hợp vi phạm quy tắc cấu trúc vòng
bảng.

Các trường hợp cần được kiểm tra bao gồm:

- Tổng số đội không đáp ứng cấu trúc 32 đội.
- Số lượng đội trong một bảng khác 4.
- Số lượng đối thủ của một đội không đúng theo cấu trúc vòng bảng.
- Các điều kiện liên quan đến tính điểm không hợp lệ.
- Các điều kiện liên quan đến xếp hạng không hợp lệ.

Đối với các quy tắc có giới hạn số lượng, các giá trị biên và ngoài
biên được kiểm tra bằng Boundary Value Analysis.

---

### 2.4.6 Kết quả đầu ra

Sau khi hoàn thành vòng bảng, hệ thống phải cung cấp:

- Danh sách các bảng đấu.
- Danh sách đội trong từng bảng.
- Kết quả các trận đấu.
- Điểm số của từng đội.
- Hiệu số bàn thắng.
- Thông tin thẻ được sử dụng trong xếp hạng.
- Thứ hạng của các đội trong từng bảng.
- Danh sách các đội đủ điều kiện đi tiếp.

Kết quả cuối cùng của vòng bảng phải xác định được **16 đội** tham
dự Round of 16.

---

### 2.4.7 Test Case

FR-04 được kiểm thử bởi `GroupStageTest.java`.

Các test case liên quan:

| Test Case | Nội dung |
|---|---|
| TC-T072 – TC-T103 | Group Stage Management |

Các test case bao phủ:

- Tổng số đội.
- Số lượng đội trong bảng.
- Số đối thủ của mỗi đội.
- Điểm thắng.
- Điểm hòa.
- Điểm thua.
- Xếp hạng theo điểm.
- Xếp hạng theo hiệu số bàn thắng.
- Xếp hạng theo thẻ.
- Xếp hạng theo kết quả đối đầu.
- Bốc thăm.
- Trọng số thẻ.
- Điều kiện vào Round of 16.

Tổng số test case thuộc FR-04:

**32 test cases.**

---

### 2.4.8 Phân loại kỹ thuật kiểm thử

FR-04 được kiểm chứng bằng các kỹ thuật sau:

#### Unit Testing

Các logic của Group Stage được kiểm thử độc lập bằng JUnit 5 thông
qua `GroupStageTest.java`.

#### Functional Testing

Các test case kiểm tra chức năng tổ chức vòng bảng, tính điểm, xếp
hạng và xác định đội đi tiếp.

#### Boundary Value Analysis

Boundary Value Analysis được áp dụng đối với các quy tắc có giới hạn
số lượng, bao gồm:

- 32 đội của giải đấu.
- 4 đội trong mỗi bảng.
- 3 đối thủ của mỗi đội.

Các giá trị biên và ngoài biên được sử dụng để kiểm tra hành vi của
hệ thống.

#### Decision-based Testing

Các tiêu chí xếp hạng được kiểm tra theo chuỗi điều kiện:

1. Điểm số.
2. Hiệu số bàn thắng.
3. Thẻ phạt.
4. Kết quả đối đầu.
5. Bốc thăm.

Các test case kiểm tra những trường hợp khi một tiêu chí không đủ để
phân định và hệ thống phải chuyển sang tiêu chí tiếp theo.

---

### 2.4.9 Traceability

FR-04 được ánh xạ từ SRS đến implementation và automated test suite
như sau:

| Thành phần | Ánh xạ |
|---|---|
| SRS Requirement | FR-04 — Group Stage Management |
| Implementation | `GroupStage` |
| Test Suite | `GroupStageTest.java` |
| Test Cases | TC-T072 – TC-T103 |
| Test Type | JUnit 5 Unit / Functional Testing |
| Test Techniques | Boundary Value Analysis / Decision-based Testing |

Quan hệ truy xuất:

`SRS FR-04 → FRS FR-04 → GroupStage → GroupStageTest.java → TC-T072 – TC-T103`

---

### 2.4.10 Tiêu chí hoàn thành

FR-04 được xem là đáp ứng khi:

- Giải đấu được xử lý với 32 đội.
- Các đội được tổ chức thành 8 bảng.
- Mỗi bảng có 4 đội.
- Mỗi đội có 3 đối thủ trong bảng.
- Thắng được 3 điểm.
- Hòa được 1 điểm.
- Thua được 0 điểm.
- Xếp hạng theo điểm được xử lý chính xác.
- Hiệu số bàn thắng được sử dụng đúng khi cần.
- Quy tắc trọng số thẻ được áp dụng đúng.
- Kết quả đối đầu được sử dụng đúng khi cần.
- Bốc thăm được sử dụng khi các tiêu chí trước đó không thể phân
  định.
- Các đội đứng thứ nhất và thứ hai được xác định chính xác.
- 16 đội đủ điều kiện được chuẩn bị cho Round of 16.
- Các test case thuộc FR-04 thực thi thành công.

---

### 2.4.11 Trạng thái kiểm thử

FR-04 — Group Stage Management:

**Coverage Status: Covered**

Bộ kiểm thử `GroupStageTest.java` gồm **32 test cases** được ánh xạ
tới FR-04.

Kết quả automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

FR-04 hiện được bao phủ bởi automated test suite.

---

### 2.4.12 Kết luận

FR-04 — Group Stage Management đặc tả các quy tắc tổ chức và vận hành
vòng bảng của World Cup Test Application.

Chức năng bao gồm cấu trúc 32 đội, 8 bảng, 4 đội mỗi bảng, tính điểm,
xếp hạng theo nhiều tiêu chí và xác định 16 đội đủ điều kiện vào
Round of 16.

FR-04 được kiểm chứng bằng 32 automated test cases trong
`GroupStageTest.java`.

**FR-04 — Group Stage Management: Covered.**

## 2.5 FR-05 — Knockout Stage Management

### 2.5.1 Mục đích

FR-05 — Knockout Stage Management đặc tả các chức năng và quy tắc
nghiệp vụ liên quan đến giai đoạn vòng loại trực tiếp của
World Cup Test Application.

Chức năng bao gồm:

- Vòng 16 đội.
- Các cặp đấu Vòng 16 đội.
- Đội thắng Vòng 16 đội.
- Vòng tứ kết.
- Các đội vào bán kết.
- Vòng bán kết.
- Các đội vào chung kết.
- Trận chung kết.
- Xác định đội vô địch.
- Phân bổ huy chương vàng, bạc và đồng.

FR-05 được kiểm chứng chủ yếu bằng `KnockoutStageTest.java`.

---

### 2.5.2 Dữ liệu đầu vào

Dữ liệu liên quan đến Knockout Stage Management bao gồm:

| Dữ liệu | Mô tả |
|---|---|
| Qualified teams | Danh sách các đội đủ điều kiện tham dự vòng loại trực tiếp |
| Round of 16 teams | 16 đội tham dự Vòng 16 đội |
| Match pairings | Các cặp đấu của từng vòng |
| Match results | Kết quả các trận đấu |
| Winners | Các đội thắng ở từng vòng |
| Finalists | Hai đội vào chung kết |
| Champion | Đội thắng trận chung kết |

Các dữ liệu được xử lý theo cấu trúc vòng loại trực tiếp được triển
khai trong project.

---

### 2.5.3 Quy tắc xử lý

Hệ thống phải hỗ trợ các quy tắc vòng loại trực tiếp được xác định
trong FR-05.

#### 2.5.3.1 Vòng 16 đội

Vòng 16 đội phải có **16 đội** tham dự.

Các đội được ghép thành **8 cặp đấu**.

Sau khi các trận đấu hoàn thành, hệ thống phải xác định **8 đội thắng**
để tiếp tục vào vòng tứ kết.

#### 2.5.3.2 Vòng tứ kết

Vòng tứ kết phải có **4 trận đấu**.

Kết quả của 4 trận đấu xác định **4 đội vào bán kết**.

#### 2.5.3.3 Vòng bán kết

Vòng bán kết phải có **2 trận đấu**.

Kết quả của hai trận đấu xác định **2 đội vào chung kết**.

Hai đội thua ở bán kết được xác định là các đội nhận huy chương đồng.

#### 2.5.3.4 Trận chung kết

Trận chung kết có **2 đội** tham dự.

Đội thắng trận chung kết được xác định là **đội vô địch giải đấu**.

Đội thua trận chung kết nhận huy chương bạc.

Đội thắng trận chung kết nhận huy chương vàng.

#### 2.5.3.5 Huy chương

Hệ thống phải hỗ trợ việc phân bổ huy chương:

- Đội vô địch nhận huy chương vàng.
- Đội thua trận chung kết nhận huy chương bạc.
- Hai đội thua ở bán kết nhận huy chương đồng.

---

### 2.5.4 Luồng xử lý chính

Luồng xử lý chính của Knockout Stage Management:

1. Nhận danh sách 16 đội đủ điều kiện từ vòng bảng.
2. Chuẩn bị các cặp đấu Vòng 16 đội.
3. Thực hiện 8 trận đấu Vòng 16 đội.
4. Xác định 8 đội thắng.
5. Chuẩn bị 4 trận tứ kết.
6. Xác định 4 đội thắng và đưa vào bán kết.
7. Chuẩn bị 2 trận bán kết.
8. Xác định 2 đội thắng vào chung kết.
9. Xác định 2 đội thua ở bán kết để trao huy chương đồng.
10. Chuẩn bị trận chung kết.
11. Xác định đội thắng trận chung kết.
12. Xác định đội vô địch.
13. Trao huy chương vàng cho đội vô địch.
14. Trao huy chương bạc cho đội thua trận chung kết.
15. Trao huy chương đồng cho hai đội thua ở bán kết.

---

### 2.5.5 Luồng xử lý không hợp lệ

Hệ thống phải kiểm tra các điều kiện liên quan đến số lượng đội và
cấu trúc của từng vòng.

Các trường hợp cần được kiểm tra bao gồm:

- Số lượng đội tham dự Vòng 16 đội khác 16.
- Số lượng cặp đấu Vòng 16 đội không phù hợp.
- Số lượng đội thắng Vòng 16 đội khác 8.
- Số lượng trận tứ kết không phải 4.
- Số lượng đội vào bán kết không phải 4.
- Số lượng trận bán kết không phải 2.
- Số lượng đội vào chung kết không phải 2.
- Không xác định được đội thắng trận chung kết theo kết quả trận đấu.

Các giới hạn số lượng được kiểm tra bằng automated test.

---

### 2.5.6 Kết quả đầu ra

Sau khi hoàn thành giai đoạn loại trực tiếp, hệ thống phải cung cấp:

- Danh sách 16 đội tham dự Vòng 16 đội.
- Các cặp đấu Vòng 16 đội.
- 8 đội thắng Vòng 16 đội.
- 4 trận tứ kết.
- 4 đội vào bán kết.
- 2 trận bán kết.
- 2 đội vào chung kết.
- Kết quả trận chung kết.
- Đội vô địch.
- Đội nhận huy chương vàng.
- Đội nhận huy chương bạc.
- Hai đội nhận huy chương đồng.

Kết quả của Knockout Stage được sử dụng để xác định kết quả cuối cùng
của giải đấu.

---

### 2.5.7 Test Case

FR-05 được kiểm thử bởi `KnockoutStageTest.java`.

Các test case liên quan:

| Test Case | Nội dung |
|---|---|
| TC-T104 – TC-T153 | Knockout Stage Management |

Các test case bao phủ:

- Số lượng đội Vòng 16 đội.
- Các cặp đấu Vòng 16 đội.
- Đội thắng Vòng 16 đội.
- Các trận tứ kết.
- Các đội vào bán kết.
- Các trận bán kết.
- Các đội vào chung kết.
- Trận chung kết.
- Đội vô địch.
- Huy chương vàng.
- Huy chương bạc.
- Huy chương đồng.

Tổng số test case thuộc FR-05:

**50 test cases.**

---

### 2.5.8 Phân loại kỹ thuật kiểm thử

FR-05 được kiểm chứng bằng các kỹ thuật sau:

#### Unit Testing

Các logic của Knockout Stage được kiểm thử độc lập bằng JUnit 5
thông qua `KnockoutStageTest.java`.

#### Functional Testing

Các test case kiểm tra sự chuyển tiếp của đội tuyển qua từng vòng
loại trực tiếp và kết quả cuối cùng của giải đấu.

#### Boundary Value Analysis

Boundary Value Analysis được áp dụng đối với các quy tắc có giới hạn
số lượng, bao gồm:

- 16 đội ở Vòng 16 đội.
- 8 đội thắng Vòng 16 đội.
- 4 trận tứ kết.
- 4 đội vào bán kết.
- 2 trận bán kết.
- 2 đội vào chung kết.
- 1 trận chung kết.
- 1 đội vô địch.

Các giá trị biên và ngoài biên được sử dụng để kiểm tra cấu trúc của
từng vòng.

---

### 2.5.9 Traceability

FR-05 được ánh xạ từ SRS đến implementation và automated test suite
như sau:

| Thành phần | Ánh xạ |
|---|---|
| SRS Requirement | FR-05 — Knockout Stage Management |
| Implementation | `KnockoutStage` |
| Test Suite | `KnockoutStageTest.java` |
| Test Cases | TC-T104 – TC-T153 |
| Test Type | JUnit 5 Unit / Functional Testing |
| Test Technique | Boundary Value Analysis |

Quan hệ truy xuất:

`SRS FR-05 → FRS FR-05 → KnockoutStage → KnockoutStageTest.java → TC-T104 – TC-T153`

FR-05 nhận danh sách các đội đủ điều kiện từ Group Stage Management
và cung cấp kết quả cho Tournament Management.

---

### 2.5.10 Tiêu chí hoàn thành

FR-05 được xem là đáp ứng khi:

- Vòng 16 đội có 16 đội.
- Các cặp đấu Vòng 16 đội được tạo đúng.
- 8 đội thắng Vòng 16 đội được xác định.
- Có 4 trận tứ kết.
- 4 đội vào bán kết được xác định.
- Có 2 trận bán kết.
- 2 đội vào chung kết được xác định.
- Trận chung kết được xác định.
- Đội vô địch được xác định.
- Đội vô địch nhận huy chương vàng.
- Đội thua trận chung kết nhận huy chương bạc.
- Hai đội thua ở bán kết nhận huy chương đồng.
- Các giới hạn số lượng được kiểm tra.
- Các test case thuộc FR-05 thực thi thành công.

---

### 2.5.11 Trạng thái kiểm thử

FR-05 — Knockout Stage Management:

**Coverage Status: Covered**

Bộ kiểm thử `KnockoutStageTest.java` gồm **50 test cases** được ánh
xạ tới FR-05.

Kết quả automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

FR-05 hiện được bao phủ bởi automated test suite.

---

### 2.5.12 Kết luận

FR-05 — Knockout Stage Management đặc tả quá trình thi đấu từ Vòng 16
đội đến trận chung kết và xác định kết quả cuối cùng của giải đấu.

Chức năng bao gồm việc quản lý 16 đội ở Vòng 16 đội, 8 đội thắng, 4
trận tứ kết, 4 đội vào bán kết, 2 trận bán kết, 2 đội vào chung kết,
trận chung kết và đội vô địch.

FR-05 được kiểm chứng bằng 50 automated test cases trong
`KnockoutStageTest.java`.

**FR-05 — Knockout Stage Management: Covered.**

## 2.6 FR-06 — Tournament Management

### 2.6.1 Mục đích

FR-06 — Tournament Management đặc tả chức năng quản lý toàn bộ quá
trình của một giải đấu trong World Cup Test Application.

Chức năng kết nối các giai đoạn chính của giải đấu, bao gồm:

- Khởi tạo giải đấu.
- Quản lý 32 đội.
- Tạo các bảng đấu.
- Thực hiện vòng bảng.
- Ghi nhận kết quả vòng bảng.
- Chuẩn bị Round of 16.
- Thực hiện vòng loại trực tiếp.
- Xác định đội vô địch.
- Lưu kết quả trận đấu vào cơ sở dữ liệu.
- Xuất kết quả giải đấu.

FR-06 được kiểm chứng chủ yếu bằng `TournamentTest.java`.

---

### 2.6.2 Dữ liệu đầu vào

Dữ liệu đầu vào của Tournament Management bao gồm:

| Dữ liệu | Mô tả |
|---|---|
| Teams | Danh sách các đội tham gia giải đấu |
| Groups | Các bảng đấu được tạo từ danh sách đội |
| Group results | Kết quả các trận đấu vòng bảng |
| Qualified teams | Các đội đủ điều kiện vào Round of 16 |
| Knockout results | Kết quả các trận đấu vòng loại trực tiếp |
| Match results | Kết quả các trận đấu được ghi nhận trong giải đấu |

Giải đấu phải được khởi tạo với chính xác **32 đội**.

---

### 2.6.3 Quy tắc xử lý

Hệ thống phải quản lý quá trình giải đấu theo các quy tắc được xác
định trong FR-06.

#### 2.6.3.1 Khởi tạo giải đấu

Giải đấu phải được khởi tạo với chính xác:

**32 đội.**

#### 2.6.3.2 Tạo bảng đấu

Hệ thống phải tạo:

**8 bảng đấu.**

Mỗi bảng phải có:

**4 đội.**

#### 2.6.3.3 Thực hiện vòng bảng

Sau khi các bảng được tạo, hệ thống phải hỗ trợ thực hiện vòng bảng
và ghi nhận kết quả của các trận đấu.

Kết quả vòng bảng được sử dụng để xác định các đội đủ điều kiện đi
tiếp.

#### 2.6.3.4 Chuẩn bị Round of 16

Sau khi vòng bảng hoàn thành, hệ thống phải chuẩn bị danh sách các đội
đủ điều kiện vào Round of 16.

Tổng số đội được đưa vào Round of 16 là:

**16 đội.**

#### 2.6.3.5 Thực hiện vòng loại trực tiếp

Hệ thống phải hỗ trợ thực hiện giai đoạn knockout sau Round of 16.

Quá trình này bao gồm:

- Round of 16.
- Quarterfinals.
- Semifinals.
- Final.

#### 2.6.3.6 Xác định đội vô địch

Sau khi trận chung kết hoàn thành, hệ thống phải xác định đội thắng
trận chung kết là đội vô địch giải đấu.

#### 2.6.3.7 Lưu kết quả

Hệ thống phải hỗ trợ lưu kết quả các trận đấu vào cơ sở dữ liệu.

#### 2.6.3.8 Xuất kết quả

Hệ thống phải hỗ trợ xuất kết quả của giải đấu theo chức năng được
triển khai trong project.

---

### 2.6.4 Luồng xử lý chính

Luồng xử lý chính của Tournament Management:

1. Nhận danh sách 32 đội.
2. Khởi tạo giải đấu.
3. Tạo 8 bảng đấu.
4. Phân bổ 4 đội vào mỗi bảng.
5. Thực hiện vòng bảng.
6. Ghi nhận kết quả vòng bảng.
7. Xác định các đội đủ điều kiện đi tiếp.
8. Chuẩn bị danh sách 16 đội cho Round of 16.
9. Thực hiện giai đoạn knockout.
10. Xác định đội thắng ở từng vòng.
11. Thực hiện trận chung kết.
12. Xác định đội vô địch.
13. Lưu các kết quả trận đấu vào cơ sở dữ liệu.
14. Xuất kết quả giải đấu.

---

### 2.6.5 Luồng xử lý không hợp lệ

Hệ thống phải kiểm tra các điều kiện liên quan đến cấu trúc giải đấu.

Các trường hợp cần được kiểm tra bao gồm:

- Số lượng đội khởi tạo khác 32.
- Số lượng đội trong một bảng khác 4.
- Cấu trúc bảng đấu không đáp ứng yêu cầu của giải đấu.
- Không đủ 16 đội đủ điều kiện vào Round of 16.
- Dữ liệu kết quả cần thiết cho quá trình chuyển tiếp giữa các giai
  đoạn không hợp lệ.

Các trường hợp validation cụ thể phải phù hợp với implementation thực
tế của `Tournament`.

---

### 2.6.6 Kết quả đầu ra

Sau khi Tournament Management hoàn thành, hệ thống phải cung cấp:

- Giải đấu được khởi tạo với 32 đội.
- 8 bảng đấu.
- Kết quả vòng bảng.
- Danh sách 16 đội đủ điều kiện vào Round of 16.
- Kết quả các vòng knockout.
- Đội vô địch.
- Kết quả trận đấu được lưu vào cơ sở dữ liệu.
- Kết quả giải đấu được xuất theo chức năng được triển khai.

Các kết quả của Tournament Management được sử dụng để phản ánh trạng
thái cuối cùng của giải đấu.

---

### 2.6.7 Test Case

FR-06 được kiểm thử bởi `TournamentTest.java`.

Các test case liên quan:

| Test Case | Nội dung |
|---|---|
| TC-T176 – TC-T191 | Tournament Management |

Các test case bao phủ:

- Khởi tạo tournament với 32 đội.
- Tạo 8 bảng.
- Kiểm tra kích thước bảng.
- Thực hiện vòng bảng.
- Ghi nhận kết quả vòng bảng.
- Chuẩn bị Round of 16.
- Chuyển 16 đội đủ điều kiện vào Round of 16.
- Thực hiện vòng knockout.
- Xác định đội vô địch.
- Lưu kết quả trận đấu.
- Xuất kết quả giải đấu.

Tổng số test case thuộc FR-06:

**16 test cases.**

---

### 2.6.8 Phân loại kỹ thuật kiểm thử

FR-06 được kiểm chứng bằng các kỹ thuật sau:

#### Unit Testing

Các chức năng của Tournament được kiểm thử bằng JUnit 5 thông qua
`TournamentTest.java`.

#### Functional Testing

Các test case kiểm tra luồng hoạt động của giải đấu từ khởi tạo,
vòng bảng, Round of 16, knockout stage đến xác định đội vô địch.

#### Boundary Value Analysis

Boundary Value Analysis được áp dụng đối với các quy tắc có giới hạn
số lượng, bao gồm:

- 32 đội trong giải đấu.
- 8 bảng.
- 4 đội trong mỗi bảng.
- 16 đội vào Round of 16.

Các giá trị biên và trường hợp không hợp lệ được sử dụng để kiểm tra
cấu trúc giải đấu.

---

### 2.6.9 Traceability

FR-06 được ánh xạ từ SRS đến implementation và automated test suite
như sau:

| Thành phần | Ánh xạ |
|---|---|
| SRS Requirement | FR-06 — Tournament Management |
| Implementation | `Tournament` |
| Test Suite | `TournamentTest.java` |
| Test Cases | TC-T176 – TC-T191 |
| Test Type | JUnit 5 Unit / Functional Testing |
| Test Technique | Boundary Value Analysis |

FR-06 có quan hệ với các chức năng:

`FR-04 Group Stage Management`

và

`FR-05 Knockout Stage Management`

Quan hệ truy xuất tổng quát:

`SRS FR-06 → FRS FR-06 → Tournament → TournamentTest.java → TC-T176 – TC-T191`

---

### 2.6.10 Tiêu chí hoàn thành

FR-06 được xem là đáp ứng khi:

- Tournament được khởi tạo với chính xác 32 đội.
- 8 bảng được tạo.
- Mỗi bảng có 4 đội.
- Vòng bảng được thực hiện.
- Kết quả vòng bảng được ghi nhận.
- 16 đội đủ điều kiện được đưa vào Round of 16.
- Giai đoạn knockout được thực hiện.
- Đội vô địch được xác định.
- Kết quả trận đấu được lưu vào cơ sở dữ liệu.
- Kết quả giải đấu được xuất.
- Các trường hợp validation được kiểm tra.
- Các test case thuộc FR-06 thực thi thành công.

---

### 2.6.11 Trạng thái kiểm thử

FR-06 — Tournament Management:

**Coverage Status: Covered**

Bộ kiểm thử `TournamentTest.java` gồm **16 test cases** được ánh xạ
tới FR-06.

Kết quả automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

FR-06 hiện được bao phủ bởi automated test suite.

---

### 2.6.12 Kết luận

FR-06 — Tournament Management đặc tả quá trình quản lý toàn bộ giải
đấu từ khởi tạo 32 đội, tổ chức vòng bảng, chuẩn bị Round of 16, thực
hiện vòng loại trực tiếp đến xác định đội vô địch.

Chức năng đồng thời hỗ trợ lưu trữ kết quả trận đấu vào cơ sở dữ liệu
và xuất kết quả giải đấu theo implementation của project.

FR-06 được kiểm chứng bằng **16 automated test cases** trong
`TournamentTest.java`.

**FR-06 — Tournament Management: Covered.**

## 2.7 FR-07 — Top Scorer Management

### 2.7.1 Mục đích

FR-07 — Top Scorer Management đặc tả chức năng ghi nhận và quản lý
thông tin cầu thủ ghi bàn hàng đầu trong World Cup Test Application.

Chức năng cho phép hệ thống:

- Ghi nhận số bàn thắng của cầu thủ.
- Cộng dồn bàn thắng qua nhiều trận đấu.
- Xác định cầu thủ có số bàn thắng cao nhất.
- Xử lý trường hợp nhiều cầu thủ có cùng số bàn thắng cao nhất.
- Xác định trường hợp chưa có cầu thủ ghi bàn hàng đầu.
- Cập nhật kết quả khi có thêm bàn thắng.

FR-07 được kiểm chứng chủ yếu bằng `TopScorerTest.java`.

---

### 2.7.2 Dữ liệu đầu vào

Dữ liệu liên quan đến Top Scorer Management bao gồm:

| Dữ liệu | Mô tả |
|---|---|
| Player | Cầu thủ được theo dõi |
| Goals | Số bàn thắng của cầu thủ |
| Match goals | Bàn thắng được ghi trong từng trận đấu |
| Goal totals | Tổng số bàn thắng được cộng dồn |

Hệ thống sử dụng thông tin cầu thủ và số bàn thắng để xác định cầu
thủ ghi bàn hàng đầu.

---

### 2.7.3 Quy tắc xử lý

Hệ thống phải hỗ trợ các quy tắc được xác định trong FR-07.

#### 2.7.3.1 Ghi nhận bàn thắng

Hệ thống phải cho phép ghi nhận bàn thắng cho một cầu thủ.

Số bàn thắng của cầu thủ phải được cập nhật khi có bàn thắng mới.

#### 2.7.3.2 Cộng dồn bàn thắng

Bàn thắng của một cầu thủ phải được cộng dồn qua nhiều trận đấu.

Tổng số bàn thắng được sử dụng để xác định cầu thủ ghi bàn hàng đầu.

#### 2.7.3.3 Xác định cầu thủ ghi bàn hàng đầu

Cầu thủ có tổng số bàn thắng cao nhất được xác định là cầu thủ ghi
bàn hàng đầu.

Các cầu thủ có số bàn thắng thấp hơn không được xác định là cầu thủ
ghi bàn hàng đầu khi tồn tại cầu thủ có số bàn thắng cao hơn.

#### 2.7.3.4 Đồng hạng ghi bàn hàng đầu

Nếu có từ hai cầu thủ trở lên có cùng số bàn thắng cao nhất, hệ thống
phải hỗ trợ việc xác định các cầu thủ này là những cầu thủ đồng hạng
ghi bàn hàng đầu.

#### 2.7.3.5 Không có bàn thắng

Khi chưa có bàn thắng nào được ghi nhận, hệ thống phải trả về trạng
thái không có cầu thủ ghi bàn hàng đầu.

#### 2.7.3.6 Cập nhật kết quả

Khi một cầu thủ ghi thêm bàn thắng, tổng số bàn thắng phải được cập
nhật.

Kết quả top scorer phải được xác định lại dựa trên tổng số bàn thắng
mới.

---

### 2.7.4 Luồng xử lý chính

Luồng xử lý chính của Top Scorer Management:

1. Khởi tạo hoặc nhận thông tin cầu thủ.
2. Ghi nhận bàn thắng của cầu thủ.
3. Cập nhật tổng số bàn thắng.
4. Tiếp tục ghi nhận bàn thắng từ các trận đấu khác.
5. Cộng dồn tổng số bàn thắng của từng cầu thủ.
6. So sánh tổng số bàn thắng giữa các cầu thủ.
7. Xác định cầu thủ có số bàn thắng cao nhất.
8. Kiểm tra trường hợp có nhiều cầu thủ cùng đạt số bàn thắng cao
   nhất.
9. Trả về cầu thủ hoặc danh sách cầu thủ ghi bàn hàng đầu.
10. Cập nhật lại kết quả khi có thêm bàn thắng.

---

### 2.7.5 Luồng xử lý không hợp lệ

FR-07 tập trung vào việc quản lý số bàn thắng và xác định top scorer.

Các trường hợp cần được xử lý hoặc kiểm tra bao gồm:

- Chưa có cầu thủ nào ghi bàn.
- Cầu thủ có số bàn thắng thấp hơn cầu thủ đứng đầu.
- Nhiều cầu thủ có cùng số bàn thắng cao nhất.
- Tổng số bàn thắng thay đổi sau khi ghi nhận thêm bàn thắng.

Khi chưa có bàn thắng, hệ thống phải trả về trạng thái không có top
scorer theo implementation.

Các hành vi validation cụ thể phải phù hợp với implementation thực tế
của project.

---

### 2.7.6 Kết quả đầu ra

Kết quả của Top Scorer Management có thể bao gồm:

- Tổng số bàn thắng của từng cầu thủ.
- Cầu thủ có số bàn thắng cao nhất.
- Danh sách các cầu thủ đồng hạng ghi bàn hàng đầu.
- Trạng thái không có top scorer khi chưa có bàn thắng.

Khi có thêm bàn thắng, kết quả top scorer phải phản ánh tổng số bàn
thắng đã được cập nhật.

---

### 2.7.7 Test Case

FR-07 được kiểm thử bởi `TopScorerTest.java`.

Các test case liên quan:

| Test Case | Nội dung |
|---|---|
| TC-T154 – TC-T165 | Top Scorer Management |
| TC-T237 – TC-T243 | Top Scorer Management bổ sung |

Các test case bao phủ:

- Ghi nhận bàn thắng.
- Cộng dồn bàn thắng qua nhiều trận đấu.
- Xác định cầu thủ có nhiều bàn thắng nhất.
- Loại trừ cầu thủ có ít bàn thắng hơn.
- Hai cầu thủ đồng hạng top scorer.
- Nhiều cầu thủ đồng hạng top scorer.
- Không có top scorer khi chưa có bàn thắng.
- Xác định shared top scorer.
- Cập nhật top scorer sau khi có thêm bàn thắng.

Tổng số test case thuộc FR-07:

**19 test cases.**

---

### 2.7.8 Phân loại kỹ thuật kiểm thử

FR-07 được kiểm chứng bằng các kỹ thuật sau:

#### Unit Testing

Các chức năng Top Scorer được kiểm thử độc lập bằng JUnit 5 thông
qua `TopScorerTest.java`.

#### Functional Testing

Các test case kiểm tra việc ghi nhận bàn thắng, cộng dồn bàn thắng,
xác định top scorer và xử lý trường hợp đồng hạng.

#### Decision-based Testing

Các trường hợp lựa chọn top scorer được kiểm tra dựa trên kết quả so
sánh số bàn thắng:

- Không có bàn thắng.
- Một cầu thủ có số bàn thắng cao nhất.
- Hai cầu thủ có cùng số bàn thắng cao nhất.
- Nhiều cầu thủ có cùng số bàn thắng cao nhất.
- Kết quả thay đổi sau khi có thêm bàn thắng.

---

### 2.7.9 Traceability

FR-07 được ánh xạ từ SRS đến implementation và automated test suite
như sau:

| Thành phần | Ánh xạ |
|---|---|
| SRS Requirement | FR-07 — Top Scorer Management |
| Implementation | Top Scorer component |
| Test Suite | `TopScorerTest.java` |
| Test Cases | TC-T154 – TC-T165, TC-T237 – TC-T243 |
| Test Type | JUnit 5 Unit / Functional Testing |
| Test Technique | Decision-based Testing |

Quan hệ truy xuất:

`SRS FR-07 → FRS FR-07 → Top Scorer → TopScorerTest.java → TC-T154 – TC-T165, TC-T237 – TC-T243`

---

### 2.7.10 Tiêu chí hoàn thành

FR-07 được xem là đáp ứng khi:

- Bàn thắng của cầu thủ được ghi nhận.
- Bàn thắng được cộng dồn qua nhiều trận đấu.
- Cầu thủ có số bàn thắng cao nhất được xác định chính xác.
- Cầu thủ có ít bàn thắng hơn không được xác định là top scorer khi
  có cầu thủ có số bàn thắng cao hơn.
- Hai cầu thủ đồng hạng được hỗ trợ.
- Nhiều cầu thủ đồng hạng được hỗ trợ.
- Trạng thái không có top scorer được xử lý khi chưa có bàn thắng.
- Kết quả top scorer được cập nhật sau khi có thêm bàn thắng.
- Các test case thuộc FR-07 thực thi thành công.

---

### 2.7.11 Trạng thái kiểm thử

FR-07 — Top Scorer Management:

**Coverage Status: Covered**

Bộ kiểm thử `TopScorerTest.java` gồm **19 test cases** được ánh xạ
tới FR-07.

Kết quả automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

FR-07 hiện được bao phủ bởi automated test suite.

---

### 2.7.12 Kết luận

FR-07 — Top Scorer Management đặc tả việc ghi nhận, cộng dồn và xác
định cầu thủ ghi bàn hàng đầu của giải đấu.

Chức năng hỗ trợ cả trường hợp một cầu thủ đứng đầu, nhiều cầu thủ
đồng hạng, chưa có bàn thắng và cập nhật kết quả sau khi phát sinh
bàn thắng mới.

FR-07 được kiểm chứng bằng **19 automated test cases** trong
`TopScorerTest.java`.

**FR-07 — Top Scorer Management: Covered.**## 2.7 FR-07 — Top Scorer Management

### 2.7.1 Mục đích

FR-07 — Top Scorer Management đặc tả chức năng ghi nhận và quản lý
thông tin cầu thủ ghi bàn hàng đầu trong World Cup Test Application.

Chức năng cho phép hệ thống:

- Ghi nhận số bàn thắng của cầu thủ.
- Cộng dồn bàn thắng qua nhiều trận đấu.
- Xác định cầu thủ có số bàn thắng cao nhất.
- Xử lý trường hợp nhiều cầu thủ có cùng số bàn thắng cao nhất.
- Xác định trường hợp chưa có cầu thủ ghi bàn hàng đầu.
- Cập nhật kết quả khi có thêm bàn thắng.

FR-07 được kiểm chứng chủ yếu bằng `TopScorerTest.java`.

---

### 2.7.2 Dữ liệu đầu vào

Dữ liệu liên quan đến Top Scorer Management bao gồm:

| Dữ liệu | Mô tả |
|---|---|
| Player | Cầu thủ được theo dõi |
| Goals | Số bàn thắng của cầu thủ |
| Match goals | Bàn thắng được ghi trong từng trận đấu |
| Goal totals | Tổng số bàn thắng được cộng dồn |

Hệ thống sử dụng thông tin cầu thủ và số bàn thắng để xác định cầu
thủ ghi bàn hàng đầu.

---

### 2.7.3 Quy tắc xử lý

Hệ thống phải hỗ trợ các quy tắc được xác định trong FR-07.

#### 2.7.3.1 Ghi nhận bàn thắng

Hệ thống phải cho phép ghi nhận bàn thắng cho một cầu thủ.

Số bàn thắng của cầu thủ phải được cập nhật khi có bàn thắng mới.

#### 2.7.3.2 Cộng dồn bàn thắng

Bàn thắng của một cầu thủ phải được cộng dồn qua nhiều trận đấu.

Tổng số bàn thắng được sử dụng để xác định cầu thủ ghi bàn hàng đầu.

#### 2.7.3.3 Xác định cầu thủ ghi bàn hàng đầu

Cầu thủ có tổng số bàn thắng cao nhất được xác định là cầu thủ ghi
bàn hàng đầu.

Các cầu thủ có số bàn thắng thấp hơn không được xác định là cầu thủ
ghi bàn hàng đầu khi tồn tại cầu thủ có số bàn thắng cao hơn.

#### 2.7.3.4 Đồng hạng ghi bàn hàng đầu

Nếu có từ hai cầu thủ trở lên có cùng số bàn thắng cao nhất, hệ thống
phải hỗ trợ việc xác định các cầu thủ này là những cầu thủ đồng hạng
ghi bàn hàng đầu.

#### 2.7.3.5 Không có bàn thắng

Khi chưa có bàn thắng nào được ghi nhận, hệ thống phải trả về trạng
thái không có cầu thủ ghi bàn hàng đầu.

#### 2.7.3.6 Cập nhật kết quả

Khi một cầu thủ ghi thêm bàn thắng, tổng số bàn thắng phải được cập
nhật.

Kết quả top scorer phải được xác định lại dựa trên tổng số bàn thắng
mới.

---

### 2.7.4 Luồng xử lý chính

Luồng xử lý chính của Top Scorer Management:

1. Khởi tạo hoặc nhận thông tin cầu thủ.
2. Ghi nhận bàn thắng của cầu thủ.
3. Cập nhật tổng số bàn thắng.
4. Tiếp tục ghi nhận bàn thắng từ các trận đấu khác.
5. Cộng dồn tổng số bàn thắng của từng cầu thủ.
6. So sánh tổng số bàn thắng giữa các cầu thủ.
7. Xác định cầu thủ có số bàn thắng cao nhất.
8. Kiểm tra trường hợp có nhiều cầu thủ cùng đạt số bàn thắng cao
   nhất.
9. Trả về cầu thủ hoặc danh sách cầu thủ ghi bàn hàng đầu.
10. Cập nhật lại kết quả khi có thêm bàn thắng.

---

### 2.7.5 Luồng xử lý không hợp lệ

FR-07 tập trung vào việc quản lý số bàn thắng và xác định top scorer.

Các trường hợp cần được xử lý hoặc kiểm tra bao gồm:

- Chưa có cầu thủ nào ghi bàn.
- Cầu thủ có số bàn thắng thấp hơn cầu thủ đứng đầu.
- Nhiều cầu thủ có cùng số bàn thắng cao nhất.
- Tổng số bàn thắng thay đổi sau khi ghi nhận thêm bàn thắng.

Khi chưa có bàn thắng, hệ thống phải trả về trạng thái không có top
scorer theo implementation.

Các hành vi validation cụ thể phải phù hợp với implementation thực tế
của project.

---

### 2.7.6 Kết quả đầu ra

Kết quả của Top Scorer Management có thể bao gồm:

- Tổng số bàn thắng của từng cầu thủ.
- Cầu thủ có số bàn thắng cao nhất.
- Danh sách các cầu thủ đồng hạng ghi bàn hàng đầu.
- Trạng thái không có top scorer khi chưa có bàn thắng.

Khi có thêm bàn thắng, kết quả top scorer phải phản ánh tổng số bàn
thắng đã được cập nhật.

---

### 2.7.7 Test Case

FR-07 được kiểm thử bởi `TopScorerTest.java`.

Các test case liên quan:

| Test Case | Nội dung |
|---|---|
| TC-T154 – TC-T165 | Top Scorer Management |
| TC-T237 – TC-T243 | Top Scorer Management bổ sung |

Các test case bao phủ:

- Ghi nhận bàn thắng.
- Cộng dồn bàn thắng qua nhiều trận đấu.
- Xác định cầu thủ có nhiều bàn thắng nhất.
- Loại trừ cầu thủ có ít bàn thắng hơn.
- Hai cầu thủ đồng hạng top scorer.
- Nhiều cầu thủ đồng hạng top scorer.
- Không có top scorer khi chưa có bàn thắng.
- Xác định shared top scorer.
- Cập nhật top scorer sau khi có thêm bàn thắng.

Tổng số test case thuộc FR-07:

**19 test cases.**

---

### 2.7.8 Phân loại kỹ thuật kiểm thử

FR-07 được kiểm chứng bằng các kỹ thuật sau:

#### Unit Testing

Các chức năng Top Scorer được kiểm thử độc lập bằng JUnit 5 thông
qua `TopScorerTest.java`.

#### Functional Testing

Các test case kiểm tra việc ghi nhận bàn thắng, cộng dồn bàn thắng,
xác định top scorer và xử lý trường hợp đồng hạng.

#### Decision-based Testing

Các trường hợp lựa chọn top scorer được kiểm tra dựa trên kết quả so
sánh số bàn thắng:

- Không có bàn thắng.
- Một cầu thủ có số bàn thắng cao nhất.
- Hai cầu thủ có cùng số bàn thắng cao nhất.
- Nhiều cầu thủ có cùng số bàn thắng cao nhất.
- Kết quả thay đổi sau khi có thêm bàn thắng.

---

### 2.7.9 Traceability

FR-07 được ánh xạ từ SRS đến implementation và automated test suite
như sau:

| Thành phần | Ánh xạ |
|---|---|
| SRS Requirement | FR-07 — Top Scorer Management |
| Implementation | Top Scorer component |
| Test Suite | `TopScorerTest.java` |
| Test Cases | TC-T154 – TC-T165, TC-T237 – TC-T243 |
| Test Type | JUnit 5 Unit / Functional Testing |
| Test Technique | Decision-based Testing |

Quan hệ truy xuất:

`SRS FR-07 → FRS FR-07 → Top Scorer → TopScorerTest.java → TC-T154 – TC-T165, TC-T237 – TC-T243`

---

### 2.7.10 Tiêu chí hoàn thành

FR-07 được xem là đáp ứng khi:

- Bàn thắng của cầu thủ được ghi nhận.
- Bàn thắng được cộng dồn qua nhiều trận đấu.
- Cầu thủ có số bàn thắng cao nhất được xác định chính xác.
- Cầu thủ có ít bàn thắng hơn không được xác định là top scorer khi
  có cầu thủ có số bàn thắng cao hơn.
- Hai cầu thủ đồng hạng được hỗ trợ.
- Nhiều cầu thủ đồng hạng được hỗ trợ.
- Trạng thái không có top scorer được xử lý khi chưa có bàn thắng.
- Kết quả top scorer được cập nhật sau khi có thêm bàn thắng.
- Các test case thuộc FR-07 thực thi thành công.

---

### 2.7.11 Trạng thái kiểm thử

FR-07 — Top Scorer Management:

**Coverage Status: Covered**

Bộ kiểm thử `TopScorerTest.java` gồm **19 test cases** được ánh xạ
tới FR-07.

Kết quả automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

FR-07 hiện được bao phủ bởi automated test suite.

---

### 2.7.12 Kết luận

FR-07 — Top Scorer Management đặc tả việc ghi nhận, cộng dồn và xác
định cầu thủ ghi bàn hàng đầu của giải đấu.

Chức năng hỗ trợ cả trường hợp một cầu thủ đứng đầu, nhiều cầu thủ
đồng hạng, chưa có bàn thắng và cập nhật kết quả sau khi phát sinh
bàn thắng mới.

FR-07 được kiểm chứng bằng **19 automated test cases** trong
`TopScorerTest.java`.

**FR-07 — Top Scorer Management: Covered.**

## 2.8 FR-08 — Database Management

### 2.8.1 Mục đích

FR-08 — Database Management đặc tả chức năng lưu trữ và truy xuất dữ
liệu của World Cup Test Application.

Hệ thống phải hỗ trợ lưu trữ và truy xuất:

- Đội tuyển.
- Bảng đấu.
- Trận đấu.
- Cầu thủ.
- Kết quả trận đấu.

Chức năng Database Management giúp các dữ liệu được lưu trữ và có thể
được truy xuất khi các chức năng khác của hệ thống cần sử dụng.

FR-08 được kiểm chứng chủ yếu bằng `DatabaseTest.java`.

---

### 2.8.2 Dữ liệu đầu vào

Dữ liệu đầu vào của Database Management bao gồm các đối tượng cần
được lưu trữ:

| Dữ liệu | Mô tả |
|---|---|
| Team | Thông tin đội tuyển |
| Group | Thông tin bảng đấu |
| Match | Thông tin trận đấu |
| Player | Thông tin cầu thủ |
| Match Result | Kết quả của trận đấu |

Hệ thống nhận các đối tượng tương ứng để thực hiện thao tác lưu trữ
và truy xuất.

---

### 2.8.3 Quy tắc xử lý

Hệ thống phải hỗ trợ các quy tắc lưu trữ và truy xuất được xác định
trong FR-08.

#### 2.8.3.1 Lưu Team

Hệ thống phải cho phép lưu thông tin đội tuyển vào cơ sở dữ liệu.

#### 2.8.3.2 Truy xuất Team

Hệ thống phải cho phép truy xuất đội tuyển đã được lưu.

#### 2.8.3.3 Lưu Group

Hệ thống phải cho phép lưu thông tin bảng đấu vào cơ sở dữ liệu.

#### 2.8.3.4 Truy xuất Group

Hệ thống phải cho phép truy xuất bảng đấu đã được lưu.

#### 2.8.3.5 Lưu Match

Hệ thống phải cho phép lưu thông tin trận đấu vào cơ sở dữ liệu.

#### 2.8.3.6 Truy xuất Match

Hệ thống phải cho phép truy xuất trận đấu đã được lưu.

#### 2.8.3.7 Lưu Player

Hệ thống phải cho phép lưu thông tin cầu thủ vào cơ sở dữ liệu.

#### 2.8.3.8 Truy xuất Player

Hệ thống phải cho phép truy xuất cầu thủ đã được lưu.

#### 2.8.3.9 Lưu Match Result

Hệ thống phải cho phép lưu kết quả trận đấu vào cơ sở dữ liệu.

#### 2.8.3.10 Truy xuất Match Result

Hệ thống phải cho phép truy xuất kết quả trận đấu đã được lưu.

#### 2.8.3.11 Nhiều bản ghi

Hệ thống phải hỗ trợ lưu trữ và truy xuất nhiều bản ghi tương ứng với
các đối tượng được hỗ trợ.

#### 2.8.3.12 Bản ghi không tồn tại

Khi yêu cầu truy xuất một bản ghi không tồn tại, hệ thống phải trả về
trạng thái không có dữ liệu theo implementation.

---

### 2.8.4 Luồng xử lý chính

Luồng xử lý lưu trữ dữ liệu:

1. Nhận đối tượng cần lưu trữ.
2. Xác định loại dữ liệu.
3. Thực hiện thao tác lưu vào cơ sở dữ liệu.
4. Xác nhận dữ liệu đã được lưu.
5. Có thể truy xuất lại dữ liệu khi cần.

Luồng xử lý truy xuất dữ liệu:

1. Nhận yêu cầu truy xuất.
2. Xác định loại dữ liệu cần truy xuất.
3. Tìm kiếm bản ghi tương ứng.
4. Trả về bản ghi nếu tồn tại.
5. Trả về trạng thái không có dữ liệu nếu bản ghi không tồn tại.

---

### 2.8.5 Luồng xử lý không hợp lệ

Hệ thống phải xử lý trường hợp yêu cầu truy xuất bản ghi không tồn
tại.

Các trường hợp cần được kiểm tra bao gồm:

- Truy xuất Team không tồn tại.
- Truy xuất Group không tồn tại.
- Truy xuất Match không tồn tại.
- Truy xuất Player không tồn tại.
- Truy xuất Match Result không tồn tại.

Hệ thống phải trả về trạng thái không có dữ liệu thay vì trả về một
bản ghi không tồn tại.

Các hành vi cụ thể phải phù hợp với implementation thực tế của
database component.

---

### 2.8.6 Kết quả đầu ra

Kết quả của Database Management bao gồm:

- Dữ liệu Team được lưu và truy xuất.
- Dữ liệu Group được lưu và truy xuất.
- Dữ liệu Match được lưu và truy xuất.
- Dữ liệu Player được lưu và truy xuất.
- Dữ liệu Match Result được lưu và truy xuất.
- Nhiều bản ghi có thể được lưu trữ và truy xuất.
- Trạng thái không có dữ liệu khi bản ghi được yêu cầu không tồn tại.

Dữ liệu được truy xuất phải tương ứng với dữ liệu đã được lưu.

---

### 2.8.7 Test Case

FR-08 được kiểm thử bởi `DatabaseTest.java`.

Các test case liên quan:

| Test Case | Nội dung |
|---|---|
| TC-T166 – TC-T175 | Database Management |
| TC-T232 – TC-T236 | Database Management bổ sung |
| TC-T244 – TC-T248 | Database Management bổ sung |

Các test case bao phủ:

- Lưu Team.
- Truy xuất Team.
- Lưu Group.
- Truy xuất Group.
- Lưu Match.
- Truy xuất Match.
- Lưu Player.
- Truy xuất Player.
- Lưu Match Result.
- Truy xuất Match Result.
- Xử lý bản ghi không tồn tại.
- Lưu và truy xuất nhiều bản ghi.

Tổng số test case thuộc FR-08:

**20 test cases.**

---

### 2.8.8 Phân loại kỹ thuật kiểm thử

FR-08 được kiểm chứng bằng các kỹ thuật sau:

#### Unit Testing

Các chức năng database được kiểm thử bằng JUnit 5 thông qua
`DatabaseTest.java`.

#### Functional Testing

Các test case kiểm tra hành vi lưu trữ và truy xuất đối với từng loại
dữ liệu.

#### Data Validation Testing

Các test case kiểm tra việc truy xuất dữ liệu đã lưu và xử lý trường
hợp bản ghi không tồn tại.

#### Multiple Record Testing

Các test case kiểm tra khả năng lưu trữ và truy xuất nhiều bản ghi.

---

### 2.8.9 Traceability

FR-08 được ánh xạ từ SRS đến implementation và automated test suite
như sau:

| Thành phần | Ánh xạ |
|---|---|
| SRS Requirement | FR-08 — Database Management |
| Implementation | Database component |
| Test Suite | `DatabaseTest.java` |
| Test Cases | TC-T166 – TC-T175, TC-T232 – TC-T236, TC-T244 – TC-T248 |
| Test Type | JUnit 5 Unit / Functional Testing |

Quan hệ truy xuất:

`SRS FR-08 → FRS FR-08 → Database → DatabaseTest.java → Database Test Cases`

FR-08 có quan hệ với các chức năng cần lưu trữ hoặc truy xuất dữ liệu,
đặc biệt là Tournament Management.

---

### 2.8.10 Tiêu chí hoàn thành

FR-08 được xem là đáp ứng khi:

- Team có thể được lưu vào cơ sở dữ liệu.
- Team đã lưu có thể được truy xuất.
- Group có thể được lưu vào cơ sở dữ liệu.
- Group đã lưu có thể được truy xuất.
- Match có thể được lưu vào cơ sở dữ liệu.
- Match đã lưu có thể được truy xuất.
- Player có thể được lưu vào cơ sở dữ liệu.
- Player đã lưu có thể được truy xuất.
- Match Result có thể được lưu vào cơ sở dữ liệu.
- Match Result đã lưu có thể được truy xuất.
- Nhiều bản ghi được hỗ trợ.
- Bản ghi không tồn tại được xử lý đúng.
- Dữ liệu truy xuất tương ứng với dữ liệu đã lưu.
- Các test case thuộc FR-08 thực thi thành công.

---

### 2.8.11 Trạng thái kiểm thử

FR-08 — Database Management:

**Coverage Status: Covered**

Bộ kiểm thử `DatabaseTest.java` gồm **20 test cases** được ánh xạ
tới FR-08.

Kết quả automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

FR-08 hiện được bao phủ bởi automated test suite.

---

### 2.8.12 Kết luận

FR-08 — Database Management đặc tả chức năng lưu trữ và truy xuất dữ
liệu của World Cup Test Application.

Hệ thống hỗ trợ các loại dữ liệu Team, Group, Match, Player và Match
Result, đồng thời xử lý trường hợp bản ghi không tồn tại và nhiều bản
ghi.

FR-08 được kiểm chứng bằng **20 automated test cases** trong
`DatabaseTest.java`.

**FR-08 — Database Management: Covered.**

## 2.9 FR-09 — Web Application

### 2.9.1 Mục đích

FR-09 — Web Application đặc tả chức năng giao diện web của
World Cup Test Application.

Ứng dụng web cung cấp giao diện để người dùng nhập thời lượng trận
đấu và kiểm tra tính hợp lệ của giá trị được nhập.

Chức năng được kiểm chứng bằng Selenium WebDriver thông qua
`MatchWebTest.java`.

---

### 2.9.2 Dữ liệu đầu vào

Dữ liệu đầu vào của Web Application bao gồm:

| Dữ liệu | Mô tả |
|---|---|
| Match duration | Thời lượng trận đấu do người dùng nhập |
| Empty input | Trường hợp người dùng không nhập giá trị |
| Numeric input | Giá trị số được nhập vào trường thời lượng |
| Non-numeric input | Giá trị không phải số được nhập vào trường thời lượng |

Trường match duration là thành phần đầu vào chính của chức năng.

---

### 2.9.3 Quy tắc xử lý

Ứng dụng web phải cung cấp trang chủ và chức năng kiểm tra thời lượng
trận đấu.

#### 2.9.3.1 Trang chủ

Ứng dụng phải cung cấp homepage với các thành phần giao diện cần thiết
cho chức năng kiểm tra thời lượng trận đấu.

#### 2.9.3.2 Nhập thời lượng trận đấu

Người dùng phải có thể nhập thời lượng trận đấu thông qua trường nhập
liệu trên giao diện web.

#### 2.9.3.3 Thời lượng hợp lệ

Giá trị **90 phút** được xem là thời lượng hợp lệ.

Khi người dùng nhập 90, ứng dụng phải hiển thị kết quả hợp lệ tương
ứng.

#### 2.9.3.4 Thời lượng không hợp lệ

Các giá trị khác 90 phút được xem là không hợp lệ.

Các giá trị 89 phút và 91 phút được sử dụng trong automated test để
kiểm tra trường hợp này.

#### 2.9.3.5 Dữ liệu nhập rỗng

Khi trường match duration để trống, giao diện phải xử lý thông qua
cơ chế validation được triển khai trên web application.

#### 2.9.3.6 Dữ liệu không phải số

Khi người dùng nhập giá trị không phải số, ứng dụng phải xử lý dữ liệu
không hợp lệ và hiển thị thông báo validation tương ứng.

Thông báo được yêu cầu là:

`INVALID: Minutes must be a number.`

---

### 2.9.4 Luồng xử lý chính

Luồng xử lý chính của Web Application:

1. Mở homepage của ứng dụng.
2. Hiển thị các thành phần giao diện cần thiết.
3. Người dùng nhập thời lượng trận đấu.
4. Hệ thống nhận giá trị được nhập.
5. Hệ thống kiểm tra giá trị.
6. Nếu giá trị là 90, hệ thống xác định thời lượng hợp lệ.
7. Nếu giá trị khác 90, hệ thống xác định thời lượng không hợp lệ.
8. Hiển thị kết quả validation trên giao diện.

---

### 2.9.5 Luồng xử lý không hợp lệ

Ứng dụng phải xử lý các trường hợp nhập dữ liệu không hợp lệ.

#### 2.9.5.1 Thời lượng nhỏ hơn 90

Ví dụ:

`89`

Kết quả phải được xác định là không hợp lệ.

#### 2.9.5.2 Thời lượng lớn hơn 90

Ví dụ:

`91`

Kết quả phải được xác định là không hợp lệ.

#### 2.9.5.3 Dữ liệu rỗng

Khi người dùng không nhập thời lượng trận đấu, validation của trình
duyệt phải xử lý trường hợp dữ liệu bắt buộc.

#### 2.9.5.4 Dữ liệu không phải số

Khi người dùng nhập dữ liệu không phải số, ứng dụng phải xử lý trường
hợp này và hiển thị:

`INVALID: Minutes must be a number.`

---

### 2.9.6 Kết quả đầu ra

Kết quả hiển thị trên giao diện web bao gồm:

| Input | Kết quả |
|---|---|
| 90 | Valid |
| 89 | Invalid |
| 91 | Invalid |
| Empty | Browser validation |
| Non-numeric | Invalid với thông báo tương ứng |

Đối với dữ liệu không phải số, thông báo phải là:

`INVALID: Minutes must be a number.`

Kết quả phải được hiển thị trên giao diện để Selenium WebDriver có
thể xác minh.

---

### 2.9.7 Test Case

FR-09 được kiểm thử bằng Selenium WebDriver thông qua
`MatchWebTest.java`.

Các test case liên quan:

| Test Case | Nội dung |
|---|---|
| TC_WEB_001 | Valid 90-minute match |
| TC_WEB_002 | Invalid 89-minute match |
| TC_WEB_003 | Invalid 91-minute match |
| TC_WEB_004 | Homepage UI verification |
| TC_WEB_005 | Empty match-duration input |
| TC_WEB_006 | Invalid non-numeric input |

Tổng số Selenium test case thuộc FR-09:

**6 test cases.**

#### TC_WEB_001 — Valid 90-minute match

Kiểm tra rằng giá trị 90 phút được ứng dụng xác định là hợp lệ.

#### TC_WEB_002 — Invalid 89-minute match

Kiểm tra rằng giá trị 89 phút được xác định là không hợp lệ.

#### TC_WEB_003 — Invalid 91-minute match

Kiểm tra rằng giá trị 91 phút được xác định là không hợp lệ.

#### TC_WEB_004 — Homepage UI verification

Kiểm tra các thành phần giao diện cần thiết trên homepage.

#### TC_WEB_005 — Empty match-duration input

Kiểm tra validation khi người dùng không nhập thời lượng trận đấu.

#### TC_WEB_006 — Invalid non-numeric input

Kiểm tra việc xử lý dữ liệu không phải số và thông báo:

`INVALID: Minutes must be a number.`

---

### 2.9.8 Phân loại kỹ thuật kiểm thử

FR-09 được kiểm chứng bằng các kỹ thuật sau:

#### Selenium Web UI Testing

Selenium WebDriver được sử dụng để mở ứng dụng web, tương tác với
các thành phần giao diện và kiểm tra kết quả hiển thị.

#### Functional Testing

Các test case kiểm tra chức năng nhập thời lượng và validation theo
yêu cầu FR-09.

#### Boundary Value Analysis

Các giá trị gần giới hạn 90 phút được sử dụng:

- 89 phút.
- 90 phút.
- 91 phút.

Các giá trị này giúp kiểm tra hành vi của hệ thống tại và xung quanh
giá trị hợp lệ.

#### Input Validation Testing

Các trường hợp empty input và non-numeric input được kiểm tra để xác
minh khả năng xử lý dữ liệu đầu vào không hợp lệ.

---

### 2.9.9 Traceability

FR-09 được ánh xạ từ SRS đến implementation và Selenium test suite
như sau:

| Thành phần | Ánh xạ |
|---|---|
| SRS Requirement | FR-09 — Web Application |
| Implementation | Web Application |
| Test Suite | `MatchWebTest.java` |
| Test Cases | TC_WEB_001 – TC_WEB_006 |
| Test Type | Selenium Web UI Testing |
| Test Techniques | Functional Testing / BVA / Input Validation |

Quan hệ truy xuất:

`SRS FR-09 → FRS FR-09 → Web Application → MatchWebTest.java → TC_WEB_001 – TC_WEB_006`

---

### 2.9.10 Tiêu chí hoàn thành

FR-09 được xem là đáp ứng khi:

- Homepage có thể được mở thành công.
- Các thành phần giao diện cần thiết được hiển thị.
- Người dùng có thể nhập thời lượng trận đấu.
- Giá trị 90 phút được xác định là hợp lệ.
- Giá trị 89 phút được xác định là không hợp lệ.
- Giá trị 91 phút được xác định là không hợp lệ.
- Empty input được xử lý bằng validation.
- Non-numeric input được xử lý đúng.
- Thông báo `INVALID: Minutes must be a number.` được hiển thị đối
  với non-numeric input.
- Các Selenium test case thực thi thành công.

---

### 2.9.11 Trạng thái kiểm thử

FR-09 — Web Application:

**Coverage Status: Covered**

Bộ kiểm thử Selenium `MatchWebTest.java` gồm **6 test cases** được
ánh xạ tới FR-09.

Kết quả automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Kết quả Selenium Web UI:

| Metric | Result |
|---|---:|
| Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

FR-09 hiện được bao phủ bởi Selenium automated test suite.

---

### 2.9.12 Kết luận

FR-09 — Web Application đặc tả giao diện web và chức năng kiểm tra
thời lượng trận đấu.

Ứng dụng hỗ trợ nhập thời lượng, kiểm tra giá trị 90 phút, xử lý các
giá trị không hợp lệ, empty input và non-numeric input.

FR-09 được kiểm chứng bằng **6 Selenium Web UI test cases** trong
`MatchWebTest.java`.

**FR-09 — Web Application: Covered.**

## 2.10 FR-10 — Automated Testing

### 2.10.1 Mục đích

FR-10 — Automated Testing đặc tả hệ thống kiểm thử tự động được sử
dụng để kiểm chứng các chức năng của World Cup Test Application.

Project phải cung cấp automated testing cho các chức năng nghiệp vụ
và giao diện Web thông qua:

- JUnit 5.
- Selenium WebDriver.
- Maven test execution.
- Allure reporting.

Automated testing cung cấp bằng chứng cho việc thực thi và kết quả
kiểm thử của hệ thống.

---

### 2.10.2 Thành phần kiểm thử tự động

Hệ thống kiểm thử tự động bao gồm các test suite chính:

| Test Suite | Mục đích |
|---|---|
| `ProjectSetupTest` | Kiểm tra cấu hình và trạng thái cơ bản của project |
| `TestWorldCupTDDTest` | Kiểm tra các thành phần liên quan đến TDD |
| `TeamTest` | Kiểm thử Team Management |
| `PlayerTest` | Kiểm thử Player Management |
| `MatchTest` | Kiểm thử Match Management |
| `GroupStageTest` | Kiểm thử Group Stage Management |
| `KnockoutStageTest` | Kiểm thử Knockout Stage Management |
| `TournamentTest` | Kiểm thử Tournament Management |
| `DatabaseTest` | Kiểm thử Database Management |
| `TopScorerTest` | Kiểm thử Top Scorer Management |
| `MatchWebTest` | Kiểm thử Web Application bằng Selenium |

Các test suite được thực thi tự động thông qua Maven và JUnit 5.

---

### 2.10.3 JUnit 5

JUnit 5 được sử dụng làm framework chính cho automated unit testing
của project.

JUnit 5 được sử dụng để kiểm thử các thành phần nghiệp vụ chính:

- Team.
- Player.
- Match.
- Group Stage.
- Knockout Stage.
- Tournament.
- Database.
- Top Scorer.

Các test suite tương ứng được tổ chức thành các lớp test riêng biệt.

JUnit 5 cho phép các test case được thực thi tự động và cung cấp kết
quả Passed, Failed hoặc các trạng thái tương ứng.

---

### 2.10.4 Selenium WebDriver

Selenium WebDriver được sử dụng để kiểm thử giao diện Web của
World Cup Test Application.

Test suite:

`MatchWebTest.java`

Selenium test kiểm tra:

- Mở homepage.
- Các thành phần giao diện.
- Nhập thời lượng trận đấu.
- Giá trị hợp lệ 90 phút.
- Giá trị không hợp lệ 89 phút.
- Giá trị không hợp lệ 91 phút.
- Empty input.
- Non-numeric input.
- Thông báo validation tương ứng.

Selenium WebDriver kiểm tra hành vi của ứng dụng thông qua tương tác
với giao diện Web thay vì chỉ kiểm tra trực tiếp source code.

---

### 2.10.5 Maven Test Execution

Maven được sử dụng để quản lý quá trình build và automated test
execution của project.

Quá trình test execution phải:

1. Build project.
2. Chuẩn bị môi trường kiểm thử.
3. Compile source code và test code.
4. Thực thi automated test suite.
5. Thu thập kết quả kiểm thử.
6. Tạo các file kết quả phục vụ báo cáo.

Maven cung cấp cơ chế thực thi tập trung cho các test suite của
project.

---

### 2.10.6 Allure Reporting

Allure Report được sử dụng để cung cấp báo cáo trực quan cho kết quả
automated testing.

Allure reporting cung cấp bằng chứng về:

- Test cases đã được thực thi.
- Test cases Passed.
- Test cases Failed.
- Trạng thái thực thi của test suite.
- Thông tin liên quan đến quá trình kiểm thử.

Báo cáo Allure được sử dụng làm test execution evidence cho project.

---

### 2.10.7 Test Case

FR-10 được kiểm chứng thông qua toàn bộ automated test suite của
project.

Các test suite chính:

| Test Suite | Số test case |
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

Các test case được thực thi thông qua automated test execution của
project.

#### Selenium Test Cases

Bộ Selenium Web UI gồm:

- TC_WEB_001 — Valid 90-minute match.
- TC_WEB_002 — Invalid 89-minute match.
- TC_WEB_003 — Invalid 91-minute match.
- TC_WEB_004 — Homepage UI verification.
- TC_WEB_005 — Empty match-duration input.
- TC_WEB_006 — Invalid non-numeric input.

---

### 2.10.8 Traceability

FR-10 được ánh xạ tới các thành phần kiểm thử tự động của project:

| Thành phần | Ánh xạ |
|---|---|
| SRS Requirement | FR-10 — Automated Testing |
| Test Framework | JUnit 5 |
| Web Test Framework | Selenium WebDriver |
| Test Execution | Maven |
| Reporting | Allure Report |
| Unit Test Suites | JUnit 5 test suites |
| Web Test Suite | `MatchWebTest.java` |

Quan hệ truy xuất:

`SRS FR-10 → FRS FR-10 → JUnit 5 / Selenium → Maven → Allure Report`

FR-10 đồng thời hỗ trợ việc kiểm chứng các yêu cầu FR-01 đến FR-09.

---

### 2.10.9 Tiêu chí hoàn thành

FR-10 được xem là đáp ứng khi:

- Project có automated unit tests bằng JUnit 5.
- Các chức năng nghiệp vụ chính có test suite tương ứng.
- Project có Selenium WebDriver test cho giao diện Web.
- Maven có thể thực thi automated test suite.
- Kết quả test execution được thu thập.
- Allure Report được tạo từ kết quả kiểm thử.
- Các test case được thực thi thành công.
- Kết quả kiểm thử có thể được sử dụng làm bằng chứng cho yêu cầu
  chức năng.

---

### 2.10.10 Trạng thái kiểm thử

FR-10 — Automated Testing:

**Coverage Status: Covered**

Automated test suite hiện tại gồm:

**257 test cases.**

Kết quả thực thi:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Selenium Web UI:

| Metric | Result |
|---|---:|
| Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

FR-10 hiện được bao phủ bởi JUnit 5, Selenium WebDriver, Maven test
execution và Allure reporting.

---

### 2.10.11 Kết luận

FR-10 — Automated Testing đặc tả cơ chế kiểm thử tự động của
World Cup Test Application.

Project sử dụng JUnit 5 để kiểm thử các chức năng nghiệp vụ, Selenium
WebDriver để kiểm thử giao diện Web, Maven để thực thi automated test
suite và Allure Report để cung cấp test execution evidence.

Toàn bộ automated test suite hiện tại gồm:

**257 / 257 test cases passed — 100% pass rate.**

**FR-10 — Automated Testing: Covered.**

## 3. Yêu cầu phi chức năng

## 3.1 Hiệu năng

### 3.1.1 Mục đích

Yêu cầu phi chức năng về hiệu năng mô tả khả năng của
World Cup Test Application trong việc thực hiện các chức năng và
hoàn thành quá trình kiểm thử trong điều kiện sử dụng của project.

Đối với project hiện tại, hiệu năng được xem xét chủ yếu ở:

- Thời gian thực thi automated test suite.
- Khả năng thực thi các phép kiểm tra nghiệp vụ.
- Khả năng thực hiện các thao tác lưu trữ và truy xuất dữ liệu.
- Khả năng thực hiện Selenium Web UI test.
- Khả năng hoàn thành toàn bộ quá trình test execution mà không xảy ra
  lỗi do quá tải tài nguyên trong phạm vi môi trường kiểm thử.

Project hiện tại không xác định một ngưỡng thời gian phản hồi cụ thể
cho từng chức năng trong SRS.

Do đó, FRS không tự đặt ra các giá trị thời gian hoặc throughput chưa
được xác định trong yêu cầu chính thức.

---

### 3.1.2 Phạm vi đánh giá

Các thành phần có liên quan đến hiệu năng trong phạm vi project gồm:

| Thành phần | Nội dung đánh giá |
|---|---|
| Business logic | Khả năng thực hiện các phép kiểm tra nghiệp vụ |
| Database | Khả năng lưu trữ và truy xuất dữ liệu |
| Web Application | Khả năng phản hồi trong quá trình Selenium test |
| Automated Testing | Khả năng thực thi toàn bộ test suite |
| Test Reporting | Khả năng hoàn thành quá trình tạo test evidence |

---

### 3.1.3 Yêu cầu hiệu năng

Trong phạm vi hiện tại, hệ thống phải có khả năng:

- Thực hiện các chức năng nghiệp vụ mà không bị gián đoạn trong quá
  trình kiểm thử.
- Thực hiện các thao tác database được yêu cầu bởi application.
- Cho phép Selenium WebDriver tương tác với Web Application trong quá
  trình automated testing.
- Hoàn thành automated test execution trong môi trường kiểm thử được
  cấu hình cho project.
- Hoàn thành quá trình tạo kết quả test và Allure report sau khi test
  execution kết thúc.

Không có yêu cầu chính thức về:

- Thời gian phản hồi tối đa của từng chức năng.
- Số lượng request đồng thời.
- Throughput tối thiểu.
- Số lượng người dùng đồng thời.
- Mức sử dụng CPU hoặc RAM tối đa.

Các chỉ số trên không được đặc tả thêm vì chưa được xác định trong
SRS và test suite hiện tại.

---

### 3.1.4 Hiệu năng của automated test execution

Automated test suite phải có khả năng thực thi toàn bộ các test case
được định nghĩa trong project.

Bộ automated test suite hiện tại gồm:

**257 test cases.**

Kết quả thực thi gần nhất:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Kết quả trên cho thấy test suite có thể hoàn thành quá trình
automated test execution trong môi trường kiểm thử hiện tại.

---

### 3.1.5 Hiệu năng của Web Application

Web Application được kiểm tra thông qua Selenium WebDriver.

Bộ Selenium test hiện tại gồm:

**6 test cases.**

Các test case kiểm tra:

- Mở homepage.
- Kiểm tra giao diện.
- Nhập thời lượng trận đấu.
- Validation giá trị 90 phút.
- Validation giá trị 89 phút.
- Validation giá trị 91 phút.
- Empty input.
- Non-numeric input.

Kết quả Selenium test hiện tại:

| Metric | Result |
|---|---:|
| Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

FRS không xác định thời gian phản hồi cụ thể của Web Application vì
project hiện tại không có yêu cầu định lượng tương ứng.

---

### 3.1.6 Hiệu năng của Database

Database Management phải cho phép các chức năng của hệ thống thực hiện
các thao tác:

- Lưu Team.
- Truy xuất Team.
- Lưu Group.
- Truy xuất Group.
- Lưu Match.
- Truy xuất Match.
- Lưu Player.
- Truy xuất Player.
- Lưu Match Result.
- Truy xuất Match Result.

Các thao tác trên được kiểm chứng bằng `DatabaseTest.java`.

FRS hiện tại không đặt ra giới hạn thời gian truy vấn hoặc số lượng
giao dịch mỗi giây vì các chỉ số này không được xác định trong SRS.

---

### 3.1.7 Phương pháp kiểm chứng

Hiệu năng trong phạm vi project được xem xét thông qua:

- Automated test execution.
- JUnit 5 execution.
- Selenium WebDriver execution.
- Database test execution.
- Kết quả thực thi Maven.
- Allure test reporting.

Các phương pháp kiểm thử hiệu năng chuyên biệt như load testing,
stress testing hoặc performance benchmarking không được xác định
trong automated test suite hiện tại.

---

### 3.1.8 Tiêu chí hoàn thành

Yêu cầu về hiệu năng được xem là đáp ứng trong phạm vi project khi:

- Automated test suite có thể được thực thi hoàn chỉnh.
- Các test case không bị lỗi do vấn đề thực thi hoặc tài nguyên trong
  môi trường kiểm thử.
- Các thao tác database cần thiết có thể được thực hiện.
- Selenium Web UI test có thể tương tác với Web Application.
- Kết quả test execution được tạo thành công.
- Allure reporting có thể sử dụng kết quả test execution để tạo báo
  cáo.

Do project không quy định các ngưỡng hiệu năng định lượng, việc đánh
giá không sử dụng các tiêu chí như thời gian phản hồi tối đa hoặc
throughput tối thiểu.

---

### 3.1.9 Trạng thái

**Status: Satisfied within project scope**

Automated test suite hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

Selenium Web UI suite:

**6 / 6 test cases passed — 100% pass rate.**

Không có yêu cầu hiệu năng định lượng riêng được xác định trong SRS
hiện tại.

---

### 3.1.10 Kết luận

World Cup Test Application đáp ứng yêu cầu hiệu năng trong phạm vi
được xác định cho project thông qua khả năng thực thi các chức năng
nghiệp vụ, database operations, Web UI testing và automated test
execution.

Project hiện chưa xác định các chỉ tiêu hiệu năng định lượng như
response time, throughput hoặc concurrent users.

Do đó, FRS chỉ ghi nhận các yêu cầu hiệu năng có cơ sở từ SRS,
implementation và automated test suite, không bổ sung các ngưỡng
hiệu năng giả định.

## 3.2 Độ tin cậy

### 3.2.1 Mục đích

Yêu cầu phi chức năng về độ tin cậy mô tả khả năng của
World Cup Test Application thực hiện đúng các chức năng đã được đặc
tả và duy trì trạng thái hoạt động ổn định trong quá trình kiểm thử.

Trong phạm vi project, độ tin cậy được đánh giá chủ yếu thông qua:

- Kết quả automated test execution.
- Tính nhất quán của kết quả kiểm thử.
- Khả năng xử lý các trường hợp hợp lệ và không hợp lệ.
- Khả năng thực hiện các thao tác database.
- Khả năng thực hiện Web UI testing.

---

### 3.2.2 Phạm vi đánh giá

Độ tin cậy được xem xét đối với các thành phần:

| Thành phần | Nội dung đánh giá |
|---|---|
| Business logic | Chức năng phải xử lý đúng các luật nghiệp vụ |
| Database | Dữ liệu được lưu trữ và truy xuất đúng |
| Web Application | Validation và kết quả hiển thị đúng |
| Automated Testing | Test suite thực thi ổn định |
| Test Reporting | Kết quả kiểm thử được ghi nhận |

---

### 3.2.3 Yêu cầu độ tin cậy

Hệ thống phải:

- Thực hiện đúng các yêu cầu chức năng đã được đặc tả.
- Trả về kết quả nhất quán đối với cùng một điều kiện đầu vào.
- Xử lý được các trường hợp hợp lệ và không hợp lệ đã được xác định.
- Không làm mất hoặc trả về sai dữ liệu trong các thao tác database
  được kiểm thử.
- Cho phép automated test suite thực thi mà không phát sinh lỗi
  ngoài mong đợi.

Độ tin cậy trong project được xác minh thông qua automated tests thay
vì thông qua một chỉ tiêu uptime hoặc MTBF cụ thể.

---

### 3.2.4 Độ tin cậy của Business Logic

Các chức năng nghiệp vụ chính được kiểm thử bằng JUnit 5.

Các nhóm chức năng được kiểm chứng gồm:

- Team Management.
- Player Management.
- Match Management.
- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Top Scorer Management.
- Database Management.

Các test case bao gồm cả trường hợp hợp lệ và không hợp lệ nhằm xác
minh rằng business logic xử lý đúng các quy tắc được đặc tả.

---

### 3.2.5 Độ tin cậy của Database

Database Management phải duy trì tính nhất quán giữa dữ liệu được lưu
và dữ liệu được truy xuất.

Các thao tác được kiểm thử gồm:

- Lưu Team và truy xuất Team.
- Lưu Group và truy xuất Group.
- Lưu Match và truy xuất Match.
- Lưu Player và truy xuất Player.
- Lưu Match Result và truy xuất Match Result.
- Xử lý trường hợp bản ghi không tồn tại.
- Xử lý nhiều bản ghi.

Kết quả truy xuất phải tương ứng với dữ liệu đã được lưu.

---

### 3.2.6 Độ tin cậy của Web Application

Web Application được kiểm thử bằng Selenium WebDriver.

Các trường hợp được kiểm chứng gồm:

- Thời lượng 90 phút.
- Thời lượng 89 phút.
- Thời lượng 91 phút.
- Empty input.
- Non-numeric input.
- Homepage UI.

Ứng dụng phải hiển thị kết quả validation tương ứng với từng trường
hợp kiểm thử.

Đối với dữ liệu không phải số, ứng dụng phải hiển thị:

`INVALID: Minutes must be a number.`

---

### 3.2.7 Độ tin cậy của Automated Test Suite

Automated test suite hiện tại gồm:

**257 test cases.**

Kết quả thực thi hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Selenium Web UI test suite gồm:

| Metric | Result |
|---|---:|
| Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

Kết quả trên là bằng chứng cho trạng thái kiểm thử hiện tại của
project.

---

### 3.2.8 Phương pháp kiểm chứng

Độ tin cậy được kiểm chứng thông qua:

- JUnit 5 Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Selenium Web UI Testing.
- Automated Regression Testing.
- Maven Test Execution.
- Allure Test Reporting.

Các kỹ thuật trên giúp kiểm tra việc hệ thống duy trì hành vi đúng
đối với các trường hợp đã được đặc tả.

---

### 3.2.9 Tiêu chí hoàn thành

Yêu cầu về độ tin cậy được xem là đáp ứng khi:

- Các chức năng được kiểm thử trả về kết quả đúng.
- Các trường hợp không hợp lệ được xử lý đúng.
- Database operations được kiểm thử thành công.
- Web Application validation hoạt động đúng.
- Automated test suite có thể thực thi hoàn chỉnh.
- Không có test case Failed.
- Không có test case Error.
- Kết quả kiểm thử được ghi nhận trong test execution evidence.

---

### 3.2.10 Giới hạn đánh giá

Project hiện tại không định nghĩa các chỉ tiêu độ tin cậy định lượng
như:

- Uptime.
- Mean Time Between Failures (MTBF).
- Mean Time To Recovery (MTTR).
- Failure rate theo thời gian.
- Availability percentage.

Do đó, các chỉ tiêu trên không được sử dụng làm tiêu chí nghiệm thu
cho FR/NFR hiện tại.

Đánh giá độ tin cậy được giới hạn trong phạm vi automated test suite
và các chức năng được project kiểm thử.

---

### 3.2.11 Trạng thái

**Status: Satisfied within project scope**

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

Kết quả Selenium Web UI:

**6 / 6 test cases passed — 100% pass rate.**

Các chức năng trong phạm vi kiểm thử hiện tại không có test case
Failed hoặc Error.

---

### 3.2.12 Kết luận

World Cup Test Application đáp ứng yêu cầu độ tin cậy trong phạm vi
các chức năng và test suite được xác định của project.

Độ tin cậy được chứng minh thông qua automated testing, trong đó các
chức năng nghiệp vụ, database và Web Application đều được kiểm chứng.

Kết quả kiểm thử hiện tại đạt:

**257 / 257 test cases passed — 100% pass rate.**

Project không đưa ra các chỉ tiêu định lượng về uptime, MTBF hoặc MTTR,
vì vậy các chỉ tiêu này không được bổ sung vào đặc tả.

## 3.3 Khả năng bảo trì

### 3.3.1 Mục đích

Yêu cầu phi chức năng về khả năng bảo trì mô tả mức độ thuận tiện
trong việc đọc hiểu, kiểm tra, sửa đổi và mở rộng
World Cup Test Application.

Project được tổ chức thành các thành phần và test suite riêng biệt,
giúp việc phát triển và kiểm thử có thể được thực hiện theo từng
chức năng.

---

### 3.3.2 Phạm vi đánh giá

Khả năng bảo trì được xem xét đối với:

| Thành phần | Nội dung |
|---|---|
| Source code | Các thành phần chức năng được tổ chức theo nhiệm vụ |
| Unit tests | Test suite được tổ chức theo từng nhóm chức năng |
| Web tests | Selenium test được tách riêng khỏi unit test |
| Build | Maven quản lý quá trình build và test execution |
| Reporting | Allure cung cấp test execution evidence |
| Version control | Git / GitHub hỗ trợ quản lý thay đổi |

---

### 3.3.3 Cấu trúc theo chức năng

Các chức năng chính của hệ thống được kiểm thử bằng các test suite
riêng biệt:

- `TeamTest`
- `PlayerTest`
- `MatchTest`
- `GroupStageTest`
- `KnockoutStageTest`
- `TournamentTest`
- `DatabaseTest`
- `TopScorerTest`

Cách tổ chức này cho phép xác định test suite tương ứng với từng
nhóm chức năng khi cần kiểm tra hoặc thay đổi.

---

### 3.3.4 Khả năng bảo trì của Automated Test

Automated test suite được chia thành các nhóm tương ứng với các
thành phần nghiệp vụ.

Ví dụ:

| Chức năng | Test Suite |
|---|---|
| Team Management | `TeamTest` |
| Player Management | `PlayerTest` |
| Match Management | `MatchTest` |
| Group Stage Management | `GroupStageTest` |
| Knockout Stage Management | `KnockoutStageTest` |
| Tournament Management | `TournamentTest` |
| Database Management | `DatabaseTest` |
| Top Scorer Management | `TopScorerTest` |
| Web Application | `MatchWebTest` |

Khi một chức năng được thay đổi, test suite tương ứng có thể được sử
dụng để kiểm tra lại hành vi của chức năng đó.

---

### 3.3.5 Khả năng bảo trì của Web UI Test

Selenium Web UI test được tổ chức riêng trong:

`MatchWebTest.java`

Việc tách Web UI testing khỏi các JUnit unit test giúp phân biệt:

- Kiểm thử business logic.
- Kiểm thử database.
- Kiểm thử giao diện Web.

Các thay đổi liên quan đến Web Application có thể được kiểm tra thông
qua Selenium test suite tương ứng.

---

### 3.3.6 Maven và khả năng bảo trì

Maven được sử dụng để quản lý quá trình build và automated test
execution.

Việc sử dụng Maven giúp quá trình thực thi test được tổ chức thống
nhất thay vì phụ thuộc vào việc chạy từng test thủ công.

Maven cũng cung cấp cơ chế quản lý dependencies và quá trình build của
project.

---

### 3.3.7 Allure và khả năng theo dõi thay đổi

Allure Report cung cấp test execution evidence.

Kết quả kiểm thử giúp xác định liệu thay đổi trong source code có làm
phát sinh test failure hay không.

Khi automated test được thực thi lại sau một thay đổi, kết quả test
có thể được sử dụng để đánh giá ảnh hưởng của thay đổi đó.

---

### 3.3.8 Git / GitHub

Git / GitHub được sử dụng để quản lý source code và lịch sử thay đổi
của project.

Version control hỗ trợ:

- Theo dõi thay đổi source code.
- Quản lý các phiên bản của project.
- Khôi phục phiên bản trước khi cần thiết.
- Lưu trữ project trên GitHub.
- Theo dõi các thay đổi liên quan đến tài liệu và test.

---

### 3.3.9 Phương pháp kiểm chứng

Khả năng bảo trì được hỗ trợ và kiểm chứng thông qua:

- Cấu trúc source code theo chức năng.
- Cấu trúc test suite theo chức năng.
- JUnit 5.
- Selenium WebDriver.
- Maven.
- Allure Report.
- Git / GitHub.

Automated test suite được sử dụng để phát hiện regression khi source
code được thay đổi.

---

### 3.3.10 Tiêu chí hoàn thành

Yêu cầu về khả năng bảo trì được xem là đáp ứng khi:

- Các chức năng chính có test suite tương ứng.
- Unit test và Web UI test được tổ chức riêng.
- Maven có thể thực hiện automated test execution.
- Kết quả test có thể được tạo thành Allure report.
- Source code và tài liệu được quản lý bằng Git / GitHub.
- Có thể xác định test suite liên quan khi một chức năng thay đổi.
- Automated tests có thể được chạy lại để kiểm tra regression.

---

### 3.3.11 Trạng thái

**Status: Satisfied within project scope**

Project có:

- Các test suite được tổ chức theo chức năng.
- JUnit 5 cho unit testing.
- Selenium WebDriver cho Web UI testing.
- Maven cho build và test execution.
- Allure cho test reporting.
- Git / GitHub cho version control.

Automated test suite hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 3.3.12 Kết luận

World Cup Test Application có khả năng bảo trì trong phạm vi kiến trúc,
cấu trúc test và công cụ được sử dụng trong project.

Việc tổ chức test suite theo từng nhóm chức năng, kết hợp với Maven,
Allure và Git / GitHub giúp hỗ trợ việc kiểm tra regression, theo dõi
thay đổi và duy trì project.

**NFR — Khả năng bảo trì: Satisfied within project scope.**

## 3.4 Khả năng kiểm thử

### 3.4.1 Mục đích

Yêu cầu phi chức năng về khả năng kiểm thử mô tả khả năng của
World Cup Test Application trong việc hỗ trợ kiểm tra, xác minh và
đánh giá các chức năng của hệ thống thông qua automated testing.

Khả năng kiểm thử là một đặc điểm quan trọng của project vì hệ thống
được phát triển theo phương pháp Test-Driven Development (TDD).

Project cung cấp các cơ chế kiểm thử cho:

- Business logic.
- Database operations.
- Web Application.
- Các trường hợp hợp lệ và không hợp lệ.
- Các giá trị biên.
- Các điều kiện quyết định.
- Automated regression testing.

---

### 3.4.2 Phạm vi đánh giá

Khả năng kiểm thử được xem xét đối với:

| Thành phần | Cơ chế kiểm thử |
|---|---|
| Team Management | JUnit 5 |
| Player Management | JUnit 5 |
| Match Management | JUnit 5 |
| Group Stage Management | JUnit 5 |
| Knockout Stage Management | JUnit 5 |
| Tournament Management | JUnit 5 |
| Database Management | JUnit 5 |
| Top Scorer Management | JUnit 5 |
| Web Application | Selenium WebDriver |
| Automated execution | Maven |
| Test reporting | Allure |

---

### 3.4.3 Test-Driven Development

Project áp dụng phương pháp Test-Driven Development (TDD).

Quy trình kiểm thử chính gồm:

1. Xác định yêu cầu nghiệp vụ.
2. Xác định test case.
3. Triển khai chức năng.
4. Thực thi automated test.
5. Kiểm tra kết quả.
6. Điều chỉnh implementation khi cần.
7. Thực thi lại test để xác minh.

Cách tiếp cận này giúp test case trở thành một phần của quá trình phát
triển chức năng.

---

### 3.4.4 Khả năng kiểm thử Business Logic

Các chức năng nghiệp vụ chính được tổ chức thành các test suite riêng:

- `TeamTest`
- `PlayerTest`
- `MatchTest`
- `GroupStageTest`
- `KnockoutStageTest`
- `TournamentTest`
- `DatabaseTest`
- `TopScorerTest`

Việc tổ chức này cho phép từng nhóm chức năng được kiểm thử độc lập.

---

### 3.4.5 Khả năng kiểm thử bằng JUnit 5

JUnit 5 được sử dụng để thực hiện unit testing cho các thành phần
nghiệp vụ.

JUnit test cho phép:

- Kiểm tra từng chức năng độc lập.
- Kiểm tra dữ liệu đầu vào và kết quả đầu ra.
- Kiểm tra các trường hợp hợp lệ.
- Kiểm tra các trường hợp không hợp lệ.
- Kiểm tra các giá trị biên.
- Thực thi lại test sau khi source code thay đổi.

Các test suite JUnit là thành phần chính của automated test suite.

---

### 3.4.6 Khả năng kiểm thử Web Application

Web Application được kiểm thử bằng Selenium WebDriver.

`MatchWebTest.java` kiểm tra các hành vi của giao diện Web thông qua
tương tác thực tế với application.

Các trường hợp được kiểm thử gồm:

- Homepage.
- Match-duration input.
- Giá trị 90 phút.
- Giá trị 89 phút.
- Giá trị 91 phút.
- Empty input.
- Non-numeric input.
- Validation message.

Việc sử dụng Selenium giúp kiểm tra Web Application ở mức giao diện
người dùng thay vì chỉ kiểm tra business logic bên dưới.

---

### 3.4.7 Khả năng kiểm thử các trường hợp biên

Project áp dụng Boundary Value Analysis cho các yêu cầu có giới hạn
số.

Các ví dụ bao gồm:

- Match duration.
- Half duration.
- Half-time break.
- Extra-time limits.
- Minimum players.
- Substitution limits.
- Group size.
- Tournament team count.
- Knockout-stage participant count.

Các giá trị tại biên và ngoài biên được sử dụng để kiểm tra hành vi
của hệ thống.

---

### 3.4.8 Khả năng kiểm thử điều kiện quyết định

Decision-based Testing được sử dụng đối với các chức năng có nhiều
điều kiện quyết định.

Ví dụ:

- Xếp hạng vòng bảng.
- Các tiêu chí phân định thứ hạng.
- Xác định top scorer.
- Các điều kiện liên quan đến kết quả trận đấu.

Các test case giúp xác minh rằng hệ thống chuyển sang điều kiện tiếp
theo khi điều kiện trước đó không đủ để xác định kết quả.

---

### 3.4.9 Automated Regression Testing

Automated test suite có thể được thực thi lại sau khi source code
hoặc chức năng được thay đổi.

Regression testing giúp kiểm tra xem thay đổi mới có làm ảnh hưởng
đến các chức năng đã hoạt động trước đó hay không.

Maven được sử dụng để hỗ trợ việc thực thi tập trung automated test
suite.

---

### 3.4.10 Test Execution và Reporting

Khả năng kiểm thử được hỗ trợ bởi:

- JUnit 5.
- Selenium WebDriver.
- Maven.
- Allure Report.

Maven thực hiện automated test execution.

Kết quả test execution được sử dụng để tạo Allure Report.

Allure cung cấp test execution evidence cho quá trình kiểm thử.

---

### 3.4.11 Tiêu chí hoàn thành

Yêu cầu về khả năng kiểm thử được xem là đáp ứng khi:

- Các chức năng chính có automated test tương ứng.
- Business logic có JUnit 5 test.
- Web Application có Selenium Web UI test.
- Các trường hợp hợp lệ được kiểm thử.
- Các trường hợp không hợp lệ được kiểm thử.
- Các giá trị biên được kiểm thử khi có yêu cầu.
- Các điều kiện quyết định quan trọng được kiểm thử.
- Automated test suite có thể được thực thi bằng Maven.
- Kết quả test execution được ghi nhận.
- Allure Report có thể được tạo từ kết quả kiểm thử.
- Automated tests có thể được chạy lại để thực hiện regression
  testing.

---

### 3.4.12 Trạng thái

**Status: Satisfied within project scope**

Project hiện có:

- JUnit 5 automated testing.
- Selenium WebDriver testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Functional Testing.
- Automated Regression Testing.
- Maven test execution.
- Allure reporting.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 3.4.13 Kết luận

World Cup Test Application có khả năng kiểm thử tốt trong phạm vi
project thông qua TDD, JUnit 5, Selenium WebDriver, Maven và Allure
Report.

Các chức năng nghiệp vụ, database và Web Application đều có cơ chế
automated testing tương ứng.

Khả năng kiểm thử cũng được hỗ trợ bởi Boundary Value Analysis,
Decision-based Testing và automated regression testing.

**NFR — Khả năng kiểm thử: Satisfied within project scope.**

## 3.5 Tính tương thích

### 3.5.1 Mục đích

Yêu cầu phi chức năng về tính tương thích mô tả khả năng của
World Cup Test Application hoạt động cùng với các công nghệ, công cụ
và môi trường được sử dụng trong project.

Project được xây dựng trên nền tảng Java và sử dụng các công cụ hỗ trợ
build, automated testing, Web UI testing và reporting.

---

### 3.5.2 Phạm vi đánh giá

Tính tương thích được xem xét đối với:

| Thành phần | Công nghệ / Công cụ |
|---|---|
| Programming language | Java |
| Unit testing | JUnit 5 |
| Build và test execution | Maven |
| Web UI testing | Selenium WebDriver |
| Test reporting | Allure Report |
| IDE | Apache NetBeans |
| Version control | Git / GitHub |

---

### 3.5.3 Tương thích với Java

Source code của project được phát triển bằng Java.

Các thành phần nghiệp vụ và automated test được triển khai trên nền
tảng Java.

Môi trường thực thi phải cung cấp phiên bản Java phù hợp với cấu hình
của project để source code và test code có thể được compile và
execute.

---

### 3.5.4 Tương thích với JUnit 5

JUnit 5 được sử dụng làm framework cho các automated unit test.

Các test suite nghiệp vụ được tổ chức để thực thi thông qua JUnit 5,
bao gồm:

- `TeamTest`
- `PlayerTest`
- `MatchTest`
- `GroupStageTest`
- `KnockoutStageTest`
- `TournamentTest`
- `DatabaseTest`
- `TopScorerTest`

Project phải sử dụng môi trường tương thích với JUnit 5 để các test
suite có thể được thực thi.

---

### 3.5.5 Tương thích với Maven

Maven được sử dụng để quản lý build và automated test execution.

Các thành phần source code, test code và dependencies phải được cấu
hình phù hợp với Maven để project có thể:

- Build.
- Compile.
- Execute automated tests.
- Thu thập test results.
- Hỗ trợ quá trình tạo test report.

---

### 3.5.6 Tương thích với Selenium WebDriver

Selenium WebDriver được sử dụng để kiểm thử Web Application.

Môi trường kiểm thử phải hỗ trợ Selenium WebDriver và trình duyệt
được cấu hình cho Selenium test.

`MatchWebTest.java` sử dụng Selenium để:

- Mở Web Application.
- Tương tác với giao diện.
- Nhập dữ liệu.
- Kiểm tra validation.
- Kiểm tra kết quả hiển thị.

Tính tương thích của Web UI testing được đánh giá trong môi trường
được cấu hình cho project.

---

### 3.5.7 Tương thích với Allure

Allure Report được sử dụng để hiển thị kết quả automated testing.

Kết quả test execution phải được tạo theo định dạng mà Allure có thể
sử dụng để tạo report.

Allure không thay đổi logic của application mà đóng vai trò là công
cụ báo cáo kết quả kiểm thử.

---

### 3.5.8 Tương thích với Apache NetBeans

Apache NetBeans được sử dụng làm môi trường phát triển của project.

Project phải có khả năng được mở và phát triển trong môi trường
Apache NetBeans với cấu hình Java và Maven phù hợp.

NetBeans không phải là thành phần runtime bắt buộc của application mà
là công cụ hỗ trợ phát triển.

---

### 3.5.9 Tương thích với Git / GitHub

Source code và tài liệu của project được quản lý bằng Git / GitHub.

Các thay đổi của source code, automated tests và documentation có thể
được quản lý thông qua version control.

Git / GitHub hỗ trợ việc duy trì các phiên bản của project và không
làm thay đổi yêu cầu chức năng của application.

---

### 3.5.10 Phương pháp kiểm chứng

Tính tương thích được kiểm chứng thông qua:

- Project build bằng Maven.
- Java source code compilation.
- JUnit 5 test execution.
- Selenium WebDriver test execution.
- Allure report generation.
- Khả năng mở và phát triển project trong Apache NetBeans.
- Quản lý source code bằng Git / GitHub.

Các công nghệ trên phải hoạt động đúng với cấu hình được sử dụng
trong project.

---

### 3.5.11 Tiêu chí hoàn thành

Yêu cầu về tính tương thích được xem là đáp ứng khi:

- Java source code có thể được compile.
- Project có thể được build bằng Maven.
- JUnit 5 test suite có thể được thực thi.
- Selenium WebDriver test có thể được thực thi.
- Web Application có thể được kiểm thử trong môi trường Selenium
  được cấu hình.
- Allure Report có thể được tạo từ test execution results.
- Project có thể được quản lý bằng Git / GitHub.
- Các công cụ được sử dụng không gây lỗi tương thích trong quá trình
  build và test execution.

---

### 3.5.12 Giới hạn

Project hiện tại không đặc tả một danh sách cụ thể về:

- Các phiên bản trình duyệt được hỗ trợ.
- Các hệ điều hành được hỗ trợ.
- Các phiên bản Java ngoài phiên bản được cấu hình trong project.
- Ma trận tương thích giữa nhiều trình duyệt.
- Ma trận tương thích giữa nhiều hệ điều hành.

Do đó, FRS không tự bổ sung các phiên bản hoặc môi trường chưa được
xác định trong project.

---

### 3.5.13 Trạng thái

**Status: Satisfied within project scope**

Project hiện sử dụng và tích hợp:

- Java.
- JUnit 5.
- Maven.
- Selenium WebDriver.
- Allure Report.
- Apache NetBeans.
- Git / GitHub.

Automated test execution hiện tại đạt:

**257 / 257 test cases passed — 100% pass rate.**

---

### 3.5.14 Kết luận

World Cup Test Application đáp ứng yêu cầu về tính tương thích trong
phạm vi các công nghệ và công cụ được sử dụng trong project.

Java, JUnit 5, Maven, Selenium WebDriver, Allure Report,
Apache NetBeans và Git / GitHub được sử dụng như các thành phần của
môi trường phát triển, kiểm thử và quản lý project.

**NFR — Tính tương thích: Satisfied within project scope.**

## 3.6 Khả năng sử dụng

### 3.6.1 Mục đích

Yêu cầu phi chức năng về khả năng sử dụng mô tả mức độ thuận tiện
khi người sử dụng tương tác với World Cup Test Application.

Trong phạm vi project, khả năng sử dụng được xem xét chủ yếu đối với
Web Application, nơi người dùng trực tiếp nhập dữ liệu và nhận kết
quả validation từ hệ thống.

---

### 3.6.2 Phạm vi đánh giá

Khả năng sử dụng được xem xét đối với:

| Thành phần | Nội dung |
|---|---|
| Homepage | Trang giao diện chính của Web Application |
| Input | Trường nhập thời lượng trận đấu |
| Validation | Kiểm tra dữ liệu người dùng nhập |
| Output | Kết quả validation hiển thị trên giao diện |
| Error handling | Xử lý dữ liệu không hợp lệ |

---

### 3.6.3 Giao diện người dùng

Web Application phải cung cấp giao diện cho phép người dùng:

- Mở homepage.
- Nhập thời lượng trận đấu.
- Thực hiện chức năng kiểm tra.
- Nhận kết quả validation.

Các thành phần giao diện cần thiết được kiểm tra thông qua Selenium
WebDriver.

---

### 3.6.4 Nhập dữ liệu

Người dùng phải có thể nhập giá trị thời lượng trận đấu thông qua
trường nhập liệu trên Web Application.

Hệ thống phải có khả năng xử lý:

- Giá trị số hợp lệ.
- Giá trị số không hợp lệ.
- Dữ liệu rỗng.
- Dữ liệu không phải số.

Việc kiểm tra các trường hợp trên giúp người dùng nhận được phản hồi
phù hợp với dữ liệu đã nhập.

---

### 3.6.5 Validation và phản hồi

Web Application phải cung cấp phản hồi sau khi người dùng thực hiện
kiểm tra.

Các trường hợp được xác định trong project gồm:

| Dữ liệu nhập | Kết quả |
|---|---|
| 90 | Valid |
| 89 | Invalid |
| 91 | Invalid |
| Empty input | Browser validation |
| Non-numeric input | Invalid với thông báo lỗi |

Đối với dữ liệu không phải số, hệ thống phải hiển thị:

`INVALID: Minutes must be a number.`

Phản hồi này giúp người dùng nhận biết nguyên nhân dữ liệu nhập không
hợp lệ.

---

### 3.6.6 Xử lý dữ liệu không hợp lệ

Hệ thống không chỉ kiểm tra dữ liệu hợp lệ mà còn phải xử lý các
trường hợp người dùng nhập dữ liệu không phù hợp.

Các trường hợp được kiểm thử gồm:

- Thời lượng nhỏ hơn 90 phút.
- Thời lượng lớn hơn 90 phút.
- Không nhập dữ liệu.
- Nhập dữ liệu không phải số.

Kết quả validation phải được hiển thị để người dùng có thể nhận biết
trạng thái của dữ liệu.

---

### 3.6.7 Khả năng sử dụng và Selenium WebDriver

Khả năng sử dụng của Web Application được hỗ trợ kiểm chứng thông qua
`MatchWebTest.java`.

Các test case Selenium kiểm tra:

- Homepage UI.
- Match-duration input.
- Valid input.
- Invalid input.
- Empty input.
- Non-numeric input.
- Validation result.

Bộ Selenium test hiện tại gồm:

**6 test cases.**

Kết quả:

| Metric | Result |
|---|---:|
| Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 3.6.8 Phương pháp kiểm chứng

Khả năng sử dụng được kiểm chứng thông qua:

- Selenium WebDriver.
- Functional Web UI Testing.
- Input Validation Testing.
- Homepage UI Verification.

Các kiểm thử tập trung vào việc xác minh người dùng có thể tương tác
với giao diện và nhận được kết quả phù hợp.

---

### 3.6.9 Tiêu chí hoàn thành

Yêu cầu về khả năng sử dụng được xem là đáp ứng khi:

- Homepage có thể được mở.
- Các thành phần giao diện cần thiết được hiển thị.
- Người dùng có thể nhập thời lượng trận đấu.
- Hệ thống phản hồi với dữ liệu hợp lệ.
- Hệ thống phản hồi với dữ liệu không hợp lệ.
- Empty input được xử lý.
- Non-numeric input được xử lý.
- Thông báo lỗi phù hợp được hiển thị.
- Selenium Web UI tests thực thi thành công.

---

### 3.6.10 Giới hạn đánh giá

Project hiện tại không thực hiện một usability study riêng với người
dùng thực tế.

Các tiêu chí như:

- User satisfaction score.
- Task completion time.
- Learning curve.
- Accessibility compliance.
- Formal usability survey.

không được xác định trong SRS hoặc automated test suite hiện tại.

Do đó, FRS không tự bổ sung các chỉ tiêu định lượng cho các nội dung
trên.

---

### 3.6.11 Trạng thái

**Status: Satisfied within project scope**

Web Application có giao diện cho phép người dùng nhập và kiểm tra
thời lượng trận đấu.

Selenium Web UI test hiện tại:

**6 / 6 test cases passed — 100% pass rate.**

Toàn bộ automated test suite:

**257 / 257 test cases passed — 100% pass rate.**

---

### 3.6.12 Kết luận

World Cup Test Application đáp ứng yêu cầu về khả năng sử dụng trong
phạm vi Web Application được triển khai và kiểm thử.

Người dùng có thể mở homepage, nhập thời lượng trận đấu và nhận kết
quả validation tương ứng.

Các trường hợp hợp lệ, không hợp lệ, empty input và non-numeric input
đều được kiểm tra bằng Selenium WebDriver.

**NFR — Khả năng sử dụng: Satisfied within project scope.**

## 4. Giao diện và tương tác hệ thống

## 4.1 Giao diện Web

### 4.1.1 Mục đích

Giao diện Web cung cấp cách thức để người sử dụng tương tác trực tiếp
với World Cup Test Application thông qua trình duyệt.

Trong phạm vi project hiện tại, giao diện Web tập trung vào chức năng
nhập và kiểm tra thời lượng trận đấu.

Giao diện Web được kiểm thử tự động bằng Selenium WebDriver thông qua
`MatchWebTest.java`.

---

### 4.1.2 Trang chủ

Web Application phải cung cấp một homepage để người sử dụng có thể
truy cập chức năng kiểm tra thời lượng trận đấu.

Homepage phải chứa các thành phần giao diện cần thiết cho chức năng
này.

Selenium test `TC_WEB_004` được sử dụng để kiểm tra các thành phần
giao diện của homepage.

---

### 4.1.3 Trường nhập thời lượng trận đấu

Giao diện Web phải cung cấp trường nhập liệu cho thời lượng trận đấu.

Người sử dụng có thể nhập giá trị thời lượng vào trường này trước khi
thực hiện kiểm tra.

Dữ liệu nhập có thể thuộc các trường hợp:

- Giá trị số hợp lệ.
- Giá trị số không hợp lệ.
- Dữ liệu rỗng.
- Dữ liệu không phải số.

---

### 4.1.4 Chức năng kiểm tra

Sau khi nhập thời lượng trận đấu, người sử dụng có thể thực hiện chức
năng kiểm tra.

Hệ thống phải xử lý giá trị được nhập và hiển thị kết quả tương ứng.

Giá trị **90 phút** được xác định là hợp lệ.

Các giá trị khác 90 phút được xác định là không hợp lệ.

---

### 4.1.5 Phản hồi trên giao diện

Giao diện Web phải hiển thị kết quả validation sau khi dữ liệu được
kiểm tra.

Các trường hợp chính:

| Dữ liệu | Kết quả |
|---|---|
| 90 | Valid |
| 89 | Invalid |
| 91 | Invalid |
| Empty | Browser validation |
| Non-numeric | Invalid với thông báo lỗi |

Đối với dữ liệu không phải số, hệ thống phải hiển thị:

`INVALID: Minutes must be a number.`

---

### 4.1.6 Kiểm thử giao diện

Giao diện Web được kiểm thử bằng Selenium WebDriver thông qua
`MatchWebTest.java`.

Các test case:

| Test Case | Nội dung |
|---|---|
| TC_WEB_001 | Valid 90-minute match |
| TC_WEB_002 | Invalid 89-minute match |
| TC_WEB_003 | Invalid 91-minute match |
| TC_WEB_004 | Homepage UI verification |
| TC_WEB_005 | Empty match-duration input |
| TC_WEB_006 | Invalid non-numeric input |

Tổng số Selenium Web UI test case:

**6 test cases.**

Kết quả kiểm thử hiện tại:

**6 / 6 test cases passed — 100% pass rate.**

---

### 4.1.7 Tiêu chí hoàn thành

Giao diện Web được xem là đáp ứng yêu cầu khi:

- Homepage có thể được mở.
- Các thành phần giao diện cần thiết được hiển thị.
- Có trường nhập thời lượng trận đấu.
- Người sử dụng có thể nhập dữ liệu.
- Hệ thống có thể kiểm tra giá trị được nhập.
- Kết quả validation được hiển thị.
- Dữ liệu rỗng được xử lý.
- Dữ liệu không phải số được xử lý.
- Thông báo lỗi phù hợp được hiển thị.
- Các Selenium Web UI test thực thi thành công.

---

### 4.1.8 Trạng thái

**Status: Covered**

Giao diện Web được kiểm chứng bằng 6 Selenium Web UI test cases.

Kết quả:

| Metric | Result |
|---|---:|
| Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 4.1.9 Kết luận

Giao diện Web của World Cup Test Application cung cấp homepage và
chức năng nhập, kiểm tra thời lượng trận đấu.

Giao diện hỗ trợ xử lý dữ liệu hợp lệ, dữ liệu không hợp lệ, dữ liệu
rỗng và dữ liệu không phải số.

Chức năng được kiểm chứng bằng Selenium WebDriver thông qua
`MatchWebTest.java`.

**4.1 — Giao diện Web: Covered.**

## 4.2 Luồng tương tác người dùng

### 4.2.1 Mục đích

Mục này mô tả luồng tương tác cơ bản giữa người sử dụng và
World Cup Test Application thông qua giao diện Web.

Trong phạm vi project hiện tại, luồng tương tác tập trung vào chức năng
kiểm tra thời lượng trận đấu.

---

### 4.2.2 Luồng tương tác chính

Luồng tương tác chính của người sử dụng với Web Application:

1. Người sử dụng mở homepage.
2. Hệ thống hiển thị giao diện Web.
3. Người sử dụng nhập thời lượng trận đấu.
4. Người sử dụng thực hiện chức năng kiểm tra.
5. Hệ thống nhận dữ liệu đầu vào.
6. Hệ thống kiểm tra giá trị thời lượng.
7. Hệ thống xác định dữ liệu hợp lệ hoặc không hợp lệ.
8. Hệ thống hiển thị kết quả trên giao diện.

Luồng tổng quát:

`User → Homepage → Input Match Duration → Validation → Result`

---

### 4.2.3 Luồng với dữ liệu hợp lệ

Khi người sử dụng nhập:

`90`

luồng xử lý là:

1. Người sử dụng mở homepage.
2. Nhập giá trị `90`.
3. Thực hiện kiểm tra.
4. Hệ thống nhận giá trị.
5. Hệ thống xác định 90 phút là thời lượng hợp lệ.
6. Kết quả hợp lệ được hiển thị trên giao diện.

Luồng:

`User → Enter 90 → Validate → Valid Result`

---

### 4.2.4 Luồng với dữ liệu số không hợp lệ

Khi người sử dụng nhập một giá trị số khác 90, ví dụ:

`89`

hoặc:

`91`

luồng xử lý là:

1. Người sử dụng mở homepage.
2. Nhập giá trị thời lượng.
3. Thực hiện kiểm tra.
4. Hệ thống nhận giá trị.
5. Hệ thống xác định giá trị khác 90.
6. Hệ thống xác định dữ liệu không hợp lệ.
7. Kết quả không hợp lệ được hiển thị.

Luồng:

`User → Enter Numeric Value → Validate → Invalid Result`

---

### 4.2.5 Luồng với dữ liệu rỗng

Khi người sử dụng không nhập thời lượng:

1. Người sử dụng mở homepage.
2. Để trống trường match duration.
3. Thực hiện chức năng kiểm tra.
4. Validation của trình duyệt xử lý dữ liệu bắt buộc.
5. Người sử dụng nhận được phản hồi validation.

Luồng:

`User → Empty Input → Browser Validation → Validation Result`

---

### 4.2.6 Luồng với dữ liệu không phải số

Khi người sử dụng nhập dữ liệu không phải số:

1. Người sử dụng mở homepage.
2. Nhập giá trị không phải số.
3. Thực hiện chức năng kiểm tra.
4. Hệ thống nhận dữ liệu.
5. Hệ thống xác định dữ liệu không phải số.
6. Hệ thống hiển thị thông báo lỗi.

Thông báo lỗi:

`INVALID: Minutes must be a number.`

Luồng:

`User → Non-numeric Input → Validation → Error Message`

---

### 4.2.7 Luồng kiểm thử tự động

Luồng tương tác trên Web Application được kiểm chứng bằng Selenium
WebDriver.

Selenium thực hiện các bước tương tự thao tác của người sử dụng:

1. Mở Web Application.
2. Truy cập homepage.
3. Tìm thành phần giao diện cần kiểm tra.
4. Nhập dữ liệu.
5. Thực hiện thao tác kiểm tra.
6. Đọc kết quả hiển thị.
7. So sánh kết quả thực tế với kết quả mong đợi.

Test suite:

`MatchWebTest.java`

---

### 4.2.8 Test Case liên quan

Các Selenium test case kiểm chứng luồng tương tác:

| Test Case | Luồng được kiểm tra |
|---|---|
| TC_WEB_001 | Nhập 90 phút và kiểm tra kết quả hợp lệ |
| TC_WEB_002 | Nhập 89 phút và kiểm tra kết quả không hợp lệ |
| TC_WEB_003 | Nhập 91 phút và kiểm tra kết quả không hợp lệ |
| TC_WEB_004 | Kiểm tra homepage UI |
| TC_WEB_005 | Kiểm tra empty input |
| TC_WEB_006 | Kiểm tra non-numeric input |

Tổng số test case:

**6 Selenium Web UI test cases.**

---

### 4.2.9 Tiêu chí hoàn thành

Luồng tương tác người dùng được xem là đáp ứng khi:

- Homepage có thể được mở.
- Người sử dụng có thể nhập dữ liệu.
- Hệ thống nhận được dữ liệu đầu vào.
- Hệ thống thực hiện validation.
- Dữ liệu hợp lệ được xử lý đúng.
- Dữ liệu không hợp lệ được xử lý đúng.
- Empty input được xử lý.
- Non-numeric input được xử lý.
- Kết quả validation được hiển thị.
- Selenium test có thể thực hiện và xác minh luồng tương tác.

---

### 4.2.10 Trạng thái

**Status: Covered**

Luồng tương tác Web được kiểm chứng thông qua:

`MatchWebTest.java`

Kết quả Selenium test hiện tại:

| Metric | Result |
|---|---:|
| Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 4.2.11 Kết luận

World Cup Test Application cung cấp luồng tương tác Web rõ ràng từ
việc mở homepage, nhập thời lượng trận đấu, thực hiện validation đến
hiển thị kết quả.

Các luồng hợp lệ, không hợp lệ, empty input và non-numeric input đều
được kiểm chứng bằng Selenium WebDriver.

**4.2 — Luồng tương tác người dùng: Covered.**

## 4.3 Validation trên giao diện Web

### 4.3.1 Mục đích

Mục này đặc tả cơ chế validation dữ liệu đầu vào trên giao diện Web
của World Cup Test Application.

Validation được sử dụng để kiểm tra thời lượng trận đấu do người sử
dụng nhập và xác định dữ liệu có hợp lệ hay không.

Các trường hợp validation được kiểm chứng bằng Selenium WebDriver
thông qua `MatchWebTest.java`.

---

### 4.3.2 Dữ liệu đầu vào

Trường nhập liệu Match Duration nhận các dạng dữ liệu sau:

| Loại dữ liệu | Ví dụ |
|---|---|
| Giá trị hợp lệ | `90` |
| Giá trị số nhỏ hơn giới hạn | `89` |
| Giá trị số lớn hơn giới hạn | `91` |
| Dữ liệu rỗng | Không nhập giá trị |
| Dữ liệu không phải số | Giá trị dạng text |

---

### 4.3.3 Quy tắc validation

Web Application phải kiểm tra giá trị Match Duration theo các quy tắc
được triển khai trong project.

#### Giá trị 90 phút

Giá trị:

`90`

được xác định là hợp lệ.

#### Giá trị khác 90 phút

Các giá trị số khác 90 được xác định là không hợp lệ.

Các giá trị 89 và 91 được sử dụng để kiểm tra trường hợp này.

#### Dữ liệu rỗng

Khi trường Match Duration không có dữ liệu, validation của trình
duyệt phải xử lý trường nhập liệu bắt buộc.

#### Dữ liệu không phải số

Khi người sử dụng nhập dữ liệu không phải số, hệ thống phải xác định
đây là dữ liệu không hợp lệ và hiển thị thông báo tương ứng.

Thông báo được yêu cầu:

`INVALID: Minutes must be a number.`

---

### 4.3.4 Validation đối với giá trị hợp lệ

Khi người sử dụng nhập:

`90`

hệ thống phải:

1. Nhận giá trị từ trường Match Duration.
2. Kiểm tra giá trị.
3. Xác định giá trị bằng 90.
4. Xác định dữ liệu hợp lệ.
5. Hiển thị kết quả hợp lệ.

Test case tương ứng:

`TC_WEB_001`

---

### 4.3.5 Validation đối với giá trị số không hợp lệ

Khi người sử dụng nhập giá trị số khác 90, hệ thống phải xác định
giá trị không hợp lệ.

Các trường hợp được kiểm tra:

- `89`
- `91`

Test cases tương ứng:

- `TC_WEB_002`
- `TC_WEB_003`

Các test case này kiểm tra giá trị ở hai phía của giới hạn 90 phút.

---

### 4.3.6 Validation đối với dữ liệu rỗng

Khi người sử dụng không nhập dữ liệu vào trường Match Duration:

1. Trường nhập liệu được để trống.
2. Người sử dụng thực hiện chức năng kiểm tra.
3. Browser validation xử lý trường dữ liệu bắt buộc.
4. Hệ thống không thực hiện validation thời lượng như đối với giá trị
   số thông thường.
5. Người sử dụng nhận được phản hồi validation của trình duyệt.

Test case tương ứng:

`TC_WEB_005`

---

### 4.3.7 Validation đối với dữ liệu không phải số

Khi người sử dụng nhập dữ liệu không phải số:

1. Dữ liệu được nhập vào trường Match Duration.
2. Người sử dụng thực hiện chức năng kiểm tra.
3. Hệ thống xác định dữ liệu không phải số.
4. Hệ thống xử lý dữ liệu không hợp lệ.
5. Thông báo lỗi được hiển thị.

Thông báo lỗi:

`INVALID: Minutes must be a number.`

Test case tương ứng:

`TC_WEB_006`

---

### 4.3.8 Bảng tổng hợp validation

| Test Case | Input | Expected Result |
|---|---|---|
| TC_WEB_001 | `90` | Valid |
| TC_WEB_002 | `89` | Invalid |
| TC_WEB_003 | `91` | Invalid |
| TC_WEB_005 | Empty | Browser validation |
| TC_WEB_006 | Non-numeric | Invalid + `INVALID: Minutes must be a number.` |

`TC_WEB_004` được sử dụng để kiểm tra homepage UI và không trực tiếp
kiểm tra một giá trị Match Duration cụ thể.

---

### 4.3.9 Kỹ thuật kiểm thử

Validation trên Web Application được kiểm chứng bằng:

#### Functional Testing

Kiểm tra kết quả validation tương ứng với từng loại dữ liệu đầu vào.

#### Boundary Value Analysis

Sử dụng các giá trị:

- 89.
- 90.
- 91.

để kiểm tra hành vi tại và xung quanh giá trị hợp lệ 90 phút.

#### Input Validation Testing

Kiểm tra:

- Empty input.
- Non-numeric input.
- Numeric input hợp lệ.
- Numeric input không hợp lệ.

#### Selenium Web UI Testing

Selenium WebDriver được sử dụng để nhập dữ liệu và xác minh kết quả
trực tiếp trên giao diện Web.

---

### 4.3.10 Tiêu chí hoàn thành

Validation trên giao diện Web được xem là đáp ứng khi:

- Giá trị 90 được xác định là hợp lệ.
- Giá trị 89 được xác định là không hợp lệ.
- Giá trị 91 được xác định là không hợp lệ.
- Empty input được xử lý bằng browser validation.
- Non-numeric input được xử lý đúng.
- Thông báo `INVALID: Minutes must be a number.` được hiển thị đối
  với non-numeric input.
- Selenium test có thể xác minh các kết quả validation.

---

### 4.3.11 Trạng thái

**Status: Covered**

Các test case validation liên quan:

- TC_WEB_001.
- TC_WEB_002.
- TC_WEB_003.
- TC_WEB_005.
- TC_WEB_006.

Kết quả Selenium Web UI test hiện tại:

| Metric | Result |
|---|---:|
| Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 4.3.12 Kết luận

Web Application cung cấp validation cho trường Match Duration và xử lý
các trường hợp hợp lệ, không hợp lệ, dữ liệu rỗng và dữ liệu không
phải số.

Các quy tắc validation được kiểm chứng bằng Selenium WebDriver và
Boundary Value Analysis.

Đối với dữ liệu không phải số, hệ thống hiển thị:

`INVALID: Minutes must be a number.`

**4.3 — Validation trên giao diện Web: Covered.**

## 4.4 Kết quả hiển thị

### 4.4.1 Mục đích

Mục này đặc tả các kết quả mà World Cup Test Application hiển thị
trên giao diện Web sau khi người sử dụng nhập và kiểm tra thời lượng
trận đấu.

Kết quả hiển thị phải phản ánh đúng trạng thái validation của dữ liệu
đầu vào.

---

### 4.4.2 Kết quả hợp lệ

Khi người sử dụng nhập:

`90`

hệ thống phải xác định thời lượng trận đấu là hợp lệ và hiển thị kết
quả tương ứng trên giao diện.

Test case kiểm chứng:

`TC_WEB_001`

---

### 4.4.3 Kết quả không hợp lệ

Khi người sử dụng nhập giá trị số khác 90, hệ thống phải xác định
thời lượng trận đấu là không hợp lệ.

Các giá trị được kiểm thử:

- `89`
- `91`

Test cases tương ứng:

- `TC_WEB_002`
- `TC_WEB_003`

Kết quả hiển thị phải cho người sử dụng biết giá trị thời lượng đã
nhập không đáp ứng quy tắc của hệ thống.

---

### 4.4.4 Kết quả khi dữ liệu rỗng

Khi người sử dụng không nhập giá trị Match Duration, hệ thống phải
xử lý thông qua browser validation.

Test case kiểm chứng:

`TC_WEB_005`

Kết quả validation được cung cấp bởi cơ chế validation của trình
duyệt theo implementation của Web Application.

---

### 4.4.5 Kết quả khi dữ liệu không phải số

Khi người sử dụng nhập dữ liệu không phải số, hệ thống phải hiển thị
thông báo lỗi tương ứng.

Thông báo lỗi phải là:

`INVALID: Minutes must be a number.`

Test case kiểm chứng:

`TC_WEB_006`

---

### 4.4.6 Bảng kết quả hiển thị

| Test Case | Dữ liệu đầu vào | Kết quả mong đợi |
|---|---|---|
| TC_WEB_001 | `90` | Valid |
| TC_WEB_002 | `89` | Invalid |
| TC_WEB_003 | `91` | Invalid |
| TC_WEB_005 | Empty | Browser validation |
| TC_WEB_006 | Non-numeric | Invalid + thông báo lỗi |

`TC_WEB_004` kiểm tra homepage UI và các thành phần giao diện, do đó
không tạo ra một kết quả validation Match Duration cụ thể.

---

### 4.4.7 Yêu cầu đối với kết quả hiển thị

Kết quả hiển thị phải:

- Phản ánh đúng trạng thái validation.
- Phân biệt được dữ liệu hợp lệ và không hợp lệ.
- Hiển thị thông báo lỗi khi dữ liệu không hợp lệ yêu cầu thông báo.
- Có thể được Selenium WebDriver xác minh.
- Không làm mất thông tin cần thiết để xác định kết quả kiểm tra.

Đối với non-numeric input, kết quả phải chứa thông báo:

`INVALID: Minutes must be a number.`

---

### 4.4.8 Kiểm thử kết quả hiển thị

Kết quả hiển thị được kiểm chứng thông qua Selenium WebDriver trong
`MatchWebTest.java`.

Các test case liên quan:

- TC_WEB_001 — Kiểm tra kết quả hợp lệ.
- TC_WEB_002 — Kiểm tra kết quả không hợp lệ với 89 phút.
- TC_WEB_003 — Kiểm tra kết quả không hợp lệ với 91 phút.
- TC_WEB_005 — Kiểm tra browser validation với dữ liệu rỗng.
- TC_WEB_006 — Kiểm tra thông báo với dữ liệu không phải số.

Kết quả Selenium test hiện tại:

| Metric | Result |
|---|---:|
| Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 4.4.9 Tiêu chí hoàn thành

Yêu cầu về kết quả hiển thị được xem là đáp ứng khi:

- Kết quả hợp lệ được hiển thị đúng với input 90.
- Kết quả không hợp lệ được hiển thị đúng với input 89.
- Kết quả không hợp lệ được hiển thị đúng với input 91.
- Empty input được xử lý bằng browser validation.
- Non-numeric input được xử lý đúng.
- Thông báo `INVALID: Minutes must be a number.` được hiển thị khi
  nhập dữ liệu không phải số.
- Selenium có thể xác minh kết quả hiển thị.

---

### 4.4.10 Trạng thái

**Status: Covered**

Kết quả hiển thị của Web Application được kiểm chứng bằng Selenium
WebDriver.

Kết quả hiện tại:

**6 / 6 Selenium test cases passed — 100% pass rate.**

---

### 4.4.11 Kết luận

World Cup Test Application hiển thị kết quả validation tương ứng với
dữ liệu Match Duration do người sử dụng nhập.

Các trường hợp hợp lệ, không hợp lệ, dữ liệu rỗng và dữ liệu không
phải số đều được kiểm tra.

Đối với non-numeric input, hệ thống hiển thị:

`INVALID: Minutes must be a number.`

**4.4 — Kết quả hiển thị: Covered.**

## 5. Dữ liệu và cơ sở dữ liệu

## 5.1 Dữ liệu Team

### 5.1.1 Mục đích

Mục này đặc tả dữ liệu Team được sử dụng trong
World Cup Test Application.

Team là một thành phần dữ liệu chính của hệ thống và được sử dụng
trong các chức năng:

- Team Management.
- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Database Management.

---

### 5.1.2 Thông tin Team

Một Team có thể chứa các thông tin liên quan đến:

- Tên quốc gia.
- Huấn luyện viên trưởng.
- Các trợ lý huấn luyện viên.
- Danh sách cầu thủ.
- Cầu thủ đá chính.
- Cầu thủ dự bị.
- Thành viên ban huấn luyện / nhân viên.

Các thông tin trên được sử dụng để mô hình hóa một đội tuyển trong
giải đấu.

---

### 5.1.3 Quy tắc dữ liệu Team

Hệ thống phải kiểm tra các giới hạn liên quan đến Team:

- Một Team có tối đa 3 trợ lý huấn luyện viên.
- Một Team có từ 21 đến 22 cầu thủ.
- Đội hình xuất phát có từ 7 đến 11 cầu thủ.
- Một Team có từ 4 đến 5 cầu thủ dự bị.

Các giới hạn trên được đặc tả trong FR-01 — Team Management.

---

### 5.1.4 Quan hệ với Player

Team có quan hệ với danh sách Player.

Một Team có thể chứa nhiều Player và các Player có thể được phân loại
theo vai trò trong đội:

- Starting players.
- Substitute players.

Thông tin Player được quản lý bởi FR-02 — Player Management và được
sử dụng trong Team Management.

---

### 5.1.5 Quan hệ với Group

Team được sử dụng để tạo các Group trong vòng bảng.

Theo quy tắc của hệ thống:

- Tournament có 32 Team.
- Có 8 Group.
- Mỗi Group có 4 Team.

Team được phân bổ vào Group để thực hiện các trận đấu vòng bảng.

---

### 5.1.6 Quan hệ với Match

Team tham gia các Match trong giải đấu.

Thông tin Team được sử dụng để xác định các đội tham gia:

- Group-stage matches.
- Knockout-stage matches.

Kết quả của Match được sử dụng trong quá trình quản lý Tournament.

---

### 5.1.7 Lưu trữ Team

Team là một trong các loại dữ liệu được hỗ trợ bởi
Database Management.

Hệ thống phải hỗ trợ:

- Lưu Team.
- Truy xuất Team.
- Lưu nhiều Team.
- Xử lý trường hợp Team được yêu cầu không tồn tại.

Các thao tác này được kiểm chứng trong `DatabaseTest.java`.

---

### 5.1.8 Kiểm thử dữ liệu Team

Dữ liệu Team được kiểm thử thông qua:

`TeamTest.java`

Các nội dung được kiểm tra gồm:

- Thông tin Team.
- Số lượng assistant coaches.
- Số lượng Player.
- Số lượng starting players.
- Số lượng substitute players.
- Các giá trị nằm trong giới hạn.
- Các giá trị nằm ngoài giới hạn.

Database operations của Team được kiểm thử thêm thông qua:

`DatabaseTest.java`

---

### 5.1.9 Kỹ thuật kiểm thử

Dữ liệu Team được kiểm chứng bằng các kỹ thuật:

- Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Database Testing.

Boundary Value Analysis được áp dụng đối với các giới hạn số lượng
Team, Player, starting players, substitute players và assistant
coaches.

---

### 5.1.10 Tiêu chí hoàn thành

Dữ liệu Team được xem là đáp ứng khi:

- Team có thể được tạo và quản lý.
- Các thông tin Team được lưu trữ đúng.
- Các giới hạn số lượng được kiểm tra.
- Team có thể được sử dụng trong Group và Match.
- Team có thể được lưu vào database.
- Team đã lưu có thể được truy xuất.
- Trường hợp Team không tồn tại được xử lý.
- Các test case liên quan đến Team thực thi thành công.

---

### 5.1.11 Traceability

Dữ liệu Team được ánh xạ tới:

| Thành phần | Ánh xạ |
|---|---|
| Functional Requirement | FR-01 — Team Management |
| Related Requirement | FR-04 — Group Stage Management |
| Related Requirement | FR-05 — Knockout Stage Management |
| Related Requirement | FR-06 — Tournament Management |
| Database Requirement | FR-08 — Database Management |
| Unit Test | `TeamTest.java` |
| Database Test | `DatabaseTest.java` |

Quan hệ tổng quát:

`Team Data → Team Management → Group / Match / Tournament → Database`

---

### 5.1.12 Kết luận

Team là dữ liệu cốt lõi của World Cup Test Application và được sử dụng
xuyên suốt quá trình quản lý giải đấu.

Hệ thống hỗ trợ thông tin đội tuyển, cầu thủ, ban huấn luyện và các
giới hạn liên quan đến cấu trúc Team.

Dữ liệu Team được kiểm chứng bằng unit testing, functional testing,
boundary value analysis và database testing.

**5.1 — Dữ liệu Team: Covered.**

## 5.2 Dữ liệu Player

### 5.2.1 Mục đích

Mục này đặc tả dữ liệu Player được sử dụng trong
World Cup Test Application.

Player là thành phần dữ liệu được sử dụng trong:

- Player Management.
- Team Management.
- Match Management.
- Top Scorer Management.
- Database Management.

---

### 5.2.2 Thông tin Player

Một Player được tạo với thông tin tên cầu thủ.

Hệ thống phải lưu trữ tên Player và có khả năng trả về tên Player đã
được lưu.

Thông tin Player được sử dụng để xác định cầu thủ trong các chức năng
khác của hệ thống.

---

### 5.2.3 Player và Team

Player được liên kết với Team trong quá trình quản lý đội tuyển.

Một Team có nhiều Player.

Theo quy tắc của Team Management:

- Một Team có từ 21 đến 22 Player.
- Đội hình xuất phát có từ 7 đến 11 Player.
- Một Team có từ 4 đến 5 Player dự bị.

Player có thể được sử dụng ở các nhóm:

- Starting players.
- Substitute players.

---

### 5.2.4 Player và Match

Player được sử dụng trong các quy tắc liên quan đến Match.

Các thông tin Player có thể được sử dụng trong quá trình kiểm tra:

- Thẻ vàng.
- Thẻ đỏ.
- Thay người.
- Số lượng Player trên sân.
- Bàn thắng.

Các quy tắc xử lý cụ thể được đặc tả trong FR-03 — Match Management.

---

### 5.2.5 Player và Top Scorer

Player là đối tượng chính của Top Scorer Management.

Hệ thống phải hỗ trợ:

- Ghi nhận bàn thắng của Player.
- Cộng dồn bàn thắng qua nhiều Match.
- Xác định Player có số bàn thắng cao nhất.
- Hỗ trợ nhiều Player đồng hạng top scorer.
- Xác định trường hợp chưa có Player ghi bàn.
- Cập nhật kết quả top scorer khi Player ghi thêm bàn thắng.

Các chức năng này được đặc tả trong FR-07 — Top Scorer Management.

---

### 5.2.6 Lưu trữ Player

Player là một trong các loại dữ liệu được hỗ trợ bởi
Database Management.

Hệ thống phải hỗ trợ:

- Lưu Player.
- Truy xuất Player.
- Lưu nhiều Player.
- Xử lý trường hợp Player được yêu cầu không tồn tại.

Các thao tác lưu trữ và truy xuất Player được kiểm chứng trong
`DatabaseTest.java`.

---

### 5.2.7 Kiểm thử dữ liệu Player

Dữ liệu Player được kiểm thử thông qua:

`PlayerTest.java`

Nội dung kiểm tra chính:

- Tạo Player.
- Lưu tên Player.
- Trả về tên Player đã lưu.

Player còn được sử dụng trong các test suite liên quan đến:

- Team.
- Match.
- Top Scorer.
- Database.

---

### 5.2.8 Kỹ thuật kiểm thử

Dữ liệu Player được kiểm chứng bằng:

- Unit Testing.
- Functional Testing.
- Database Testing.

Các test case kiểm tra dữ liệu đầu vào và kết quả đầu ra của Player.

Các chức năng sử dụng Player tiếp tục được kiểm thử trong các test
suite tương ứng.

---

### 5.2.9 Tiêu chí hoàn thành

Dữ liệu Player được xem là đáp ứng khi:

- Player có thể được tạo.
- Tên Player được lưu chính xác.
- Hệ thống trả về tên Player đã lưu.
- Player có thể được sử dụng trong Team.
- Player có thể được sử dụng trong Match.
- Player có thể được sử dụng trong Top Scorer Management.
- Player có thể được lưu vào database.
- Player đã lưu có thể được truy xuất.
- Trường hợp Player không tồn tại được xử lý.
- Các test case liên quan thực thi thành công.

---

### 5.2.10 Traceability

Dữ liệu Player được ánh xạ tới:

| Thành phần | Ánh xạ |
|---|---|
| Functional Requirement | FR-02 — Player Management |
| Related Requirement | FR-01 — Team Management |
| Related Requirement | FR-03 — Match Management |
| Related Requirement | FR-07 — Top Scorer Management |
| Database Requirement | FR-08 — Database Management |
| Unit Test | `PlayerTest.java` |
| Database Test | `DatabaseTest.java` |

Quan hệ tổng quát:

`Player Data → Player Management → Team / Match / Top Scorer → Database`

---

### 5.2.11 Trạng thái

**Status: Covered**

Player Management được kiểm chứng bằng `PlayerTest.java`.

Các chức năng liên quan đến Player tiếp tục được kiểm chứng trong các
test suite của Team, Match, Top Scorer và Database.

Kết quả automated test suite hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 5.2.12 Kết luận

Player là dữ liệu cơ bản được sử dụng trong nhiều chức năng của
World Cup Test Application.

Hệ thống hỗ trợ tạo Player, lưu và trả về tên Player, đồng thời sử
dụng Player trong Team Management, Match Management, Top Scorer
Management và Database Management.

**5.2 — Dữ liệu Player: Covered.**

## 5.3 Dữ liệu Group

### 5.3.1 Mục đích

Mục này đặc tả dữ liệu Group được sử dụng trong
World Cup Test Application.

Group là thành phần dữ liệu dùng để tổ chức các Team trong vòng bảng
và hỗ trợ quá trình xác định các Team đủ điều kiện vào vòng loại trực
tiếp.

---

### 5.3.2 Cấu trúc Group

Theo quy tắc của hệ thống:

- Tournament có 32 Team.
- Tournament được chia thành 8 Group.
- Mỗi Group có 4 Team.
- Mỗi Team thi đấu với 3 đối thủ trong Group.

Group được sử dụng để tổ chức các trận đấu của vòng bảng.

---

### 5.3.3 Dữ liệu Team trong Group

Mỗi Group phải chứa 4 Team.

Các Team trong Group được sử dụng để tạo các trận đấu vòng bảng.

Kết quả các trận đấu giữa các Team được sử dụng để tính toán thứ hạng
của các Team trong Group.

---

### 5.3.4 Dữ liệu kết quả vòng bảng

Group liên quan đến các dữ liệu kết quả của các trận đấu vòng bảng.

Kết quả được sử dụng để xác định:

- Điểm số.
- Hiệu số bàn thắng.
- Thẻ phạt.
- Kết quả đối đầu trực tiếp.
- Thứ hạng của Team.

Các tiêu chí xếp hạng được đặc tả trong FR-04 — Group Stage Management.

---

### 5.3.5 Xếp hạng trong Group

Hệ thống hỗ trợ các tiêu chí xếp hạng theo thứ tự:

1. Điểm số.
2. Hiệu số bàn thắng.
3. Thẻ phạt.
4. Kết quả đối đầu trực tiếp.
5. Bốc thăm.

Quy tắc tính điểm:

- Thắng: 3 điểm.
- Hòa: 1 điểm.
- Thua: 0 điểm.

Một thẻ đỏ được xem tương đương với hai thẻ vàng khi tính trọng số
thẻ phạt.

---

### 5.3.6 Qualification từ Group

Sau khi vòng bảng hoàn thành, các Team đứng:

- Thứ nhất.
- Thứ hai.

được xác định là đủ điều kiện vào Round of 16.

Với 8 Group, tổng số Team đủ điều kiện là:

**16 Team.**

Danh sách này được sử dụng để chuẩn bị cho Knockout Stage.

---

### 5.3.7 Lưu trữ Group

Group là một trong các loại dữ liệu được hỗ trợ bởi
Database Management.

Hệ thống phải hỗ trợ:

- Lưu Group.
- Truy xuất Group.
- Lưu nhiều Group.
- Xử lý trường hợp Group được yêu cầu không tồn tại.

Các thao tác lưu trữ và truy xuất được kiểm chứng trong
`DatabaseTest.java`.

---

### 5.3.8 Kiểm thử dữ liệu Group

Dữ liệu Group được kiểm thử thông qua:

`GroupStageTest.java`

Các nội dung được kiểm tra gồm:

- Số lượng Team trong Group.
- Cấu trúc Group.
- Số trận đấu của Team trong Group.
- Điểm số.
- Xếp hạng.
- Các tiêu chí phân định thứ hạng.
- Qualification vào Round of 16.

Các thao tác lưu trữ và truy xuất Group được kiểm thử thêm thông qua
`DatabaseTest.java`.

---

### 5.3.9 Kỹ thuật kiểm thử

Dữ liệu Group được kiểm chứng bằng:

- Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Database Testing.

Boundary Value Analysis được áp dụng đối với các giới hạn liên quan
đến số lượng Team và cấu trúc Group.

Decision-based Testing được sử dụng đối với quá trình xếp hạng và
qualification.

---

### 5.3.10 Tiêu chí hoàn thành

Dữ liệu Group được xem là đáp ứng khi:

- Tournament có thể tạo 8 Group.
- Mỗi Group có 4 Team.
- Team có thể thi đấu với các đối thủ trong Group.
- Kết quả vòng bảng được ghi nhận.
- Điểm số được tính đúng.
- Các tiêu chí xếp hạng được áp dụng đúng.
- Hai Team đứng đầu Group được xác định là đủ điều kiện đi tiếp.
- Tổng cộng 16 Team được chuẩn bị cho Round of 16.
- Group có thể được lưu vào database.
- Group đã lưu có thể được truy xuất.
- Trường hợp Group không tồn tại được xử lý.
- Các test case liên quan thực thi thành công.

---

### 5.3.11 Traceability

Dữ liệu Group được ánh xạ tới:

| Thành phần | Ánh xạ |
|---|---|
| Functional Requirement | FR-04 — Group Stage Management |
| Related Requirement | FR-05 — Knockout Stage Management |
| Related Requirement | FR-06 — Tournament Management |
| Database Requirement | FR-08 — Database Management |
| Unit Test | `GroupStageTest.java` |
| Database Test | `DatabaseTest.java` |

Quan hệ tổng quát:

`Group Data → Group Stage → Qualification → Round of 16 → Tournament`

---

### 5.3.12 Trạng thái

**Status: Covered**

Group Stage Management được kiểm chứng bằng `GroupStageTest.java`.

Các chức năng liên quan đến Group tiếp tục được kiểm chứng trong
`TournamentTest.java` và `DatabaseTest.java`.

Kết quả automated test suite hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 5.3.13 Kết luận

Group là dữ liệu dùng để tổ chức 32 Team thành 8 bảng, mỗi bảng có
4 Team và hỗ trợ quá trình thực hiện vòng bảng.

Dữ liệu Group bao gồm cấu trúc Team, kết quả vòng bảng, điểm số, thứ
hạng và thông tin qualification.

Group được sử dụng để xác định 16 Team đủ điều kiện vào Round of 16 và
được kiểm chứng thông qua Group Stage, Tournament và Database testing.

**5.3 — Dữ liệu Group: Covered.**

## 5.4 Dữ liệu Match

### 5.4.1 Mục đích

Mục này đặc tả dữ liệu Match được sử dụng trong
World Cup Test Application.

Match là thành phần dữ liệu trung tâm dùng để mô hình hóa các trận đấu
trong vòng bảng và vòng loại trực tiếp.

Dữ liệu Match liên quan trực tiếp đến:

- Team.
- Player.
- Group Stage.
- Knockout Stage.
- Match Result.
- Tournament.
- Database.

---

### 5.4.2 Thông tin Match

Match được sử dụng để biểu diễn một trận đấu giữa các Team.

Dữ liệu Match phục vụ việc kiểm tra các quy tắc liên quan đến:

- Thời lượng trận đấu.
- Hiệp đấu.
- Hiệp phụ.
- Bàn thắng bạc.
- Sút luân lưu.
- Thẻ phạt.
- Số lượng Player trên sân.
- Thay người.

Các quy tắc chi tiết được đặc tả trong FR-03 — Match Management.

---

### 5.4.3 Match vòng bảng

Match trong vòng bảng phải tuân theo các quy tắc:

- Trận đấu kéo dài 90 phút.
- Mỗi hiệp kéo dài 45 phút.
- Thời gian nghỉ giữa hai hiệp không quá 15 phút.

Mỗi Team trong một Group thi đấu với 3 đối thủ.

Kết quả các Match vòng bảng được sử dụng để tính:

- Điểm số.
- Hiệu số bàn thắng.
- Thẻ phạt.
- Kết quả đối đầu trực tiếp.
- Thứ hạng Group.

---

### 5.4.4 Match vòng loại trực tiếp

Match trong Knockout Stage hỗ trợ các giai đoạn:

- Round of 16.
- Quarterfinals.
- Semifinals.
- Final.

Một Match knockout có thể có từ 0 đến 2 hiệp phụ.

Mỗi hiệp phụ kéo dài 30 phút.

Các quy tắc xác định đội thắng trong trường hợp cần thiết bao gồm:

- Bàn thắng bạc.
- Sút luân lưu.
- Sudden death.

---

### 5.4.5 Quy tắc Player trong Match

Dữ liệu Match liên quan đến các trạng thái và hành vi của Player.

Hệ thống phải kiểm tra:

- Player phải rời sân sau khi nhận từ hai thẻ vàng trở lên.
- Player phải rời sân sau khi nhận thẻ đỏ.
- Một Team phải có ít nhất 7 Player trên sân để tiếp tục thi đấu.
- Một Team được thực hiện tối đa 3 lần thay người.
- Mỗi lần thay người có thể thay từ 1 đến 3 Player.
- Vị trí của Player không hạn chế việc thay người.

---

### 5.4.6 Match Result

Kết quả Match được sử dụng để xác định trạng thái của trận đấu.

Match Result có thể được sử dụng trong:

- Tính điểm vòng bảng.
- Xếp hạng Group.
- Xác định đội thắng ở Knockout Stage.
- Xác định đội vô địch.
- Lưu trữ kết quả Tournament.

Match Result là một loại dữ liệu được hỗ trợ bởi
Database Management.

---

### 5.4.7 Lưu trữ Match

Match là một trong các loại dữ liệu được Database Management hỗ trợ.

Hệ thống phải hỗ trợ:

- Lưu Match.
- Truy xuất Match.
- Lưu nhiều Match.
- Xử lý trường hợp Match được yêu cầu không tồn tại.

Match Result cũng phải có khả năng được lưu và truy xuất.

Các thao tác database được kiểm chứng thông qua
`DatabaseTest.java`.

---

### 5.4.8 Kiểm thử dữ liệu Match

Dữ liệu Match được kiểm thử thông qua:

`MatchTest.java`

Các nội dung được kiểm tra gồm:

- Thời lượng Match.
- Thời lượng từng hiệp.
- Thời gian nghỉ.
- Hiệp phụ.
- Bàn thắng bạc.
- Sút luân lưu.
- Sudden death.
- Thẻ vàng.
- Thẻ đỏ.
- Số lượng Player trên sân.
- Thay người.
- Quy tắc liên quan đến Player.

Match và Match Result được kiểm thử thêm trong
`DatabaseTest.java`.

---

### 5.4.9 Kỹ thuật kiểm thử

Dữ liệu Match được kiểm chứng bằng:

- Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Database Testing.

Boundary Value Analysis được áp dụng đối với các giới hạn như:

- 90 phút.
- 45 phút mỗi hiệp.
- 15 phút thời gian nghỉ.
- 30 phút mỗi hiệp phụ.
- 7 Player tối thiểu trên sân.
- 3 lần thay người tối đa.
- 1 đến 3 Player trong một lần thay người.

Decision-based Testing được sử dụng đối với các điều kiện xác định
kết quả Match.

---

### 5.4.10 Tiêu chí hoàn thành

Dữ liệu Match được xem là đáp ứng khi:

- Match giữa các Team có thể được quản lý.
- Quy tắc thời lượng Match được kiểm tra.
- Quy tắc hiệp đấu được kiểm tra.
- Quy tắc hiệp phụ được kiểm tra.
- Quy tắc bàn thắng bạc được kiểm tra.
- Quy tắc sút luân lưu được kiểm tra.
- Quy tắc thẻ phạt được kiểm tra.
- Quy tắc số lượng Player trên sân được kiểm tra.
- Quy tắc thay người được kiểm tra.
- Match có thể được lưu vào database.
- Match đã lưu có thể được truy xuất.
- Match Result có thể được lưu và truy xuất.
- Trường hợp Match không tồn tại được xử lý.
- Các test case liên quan thực thi thành công.

---

### 5.4.11 Traceability

Dữ liệu Match được ánh xạ tới:

| Thành phần | Ánh xạ |
|---|---|
| Functional Requirement | FR-03 — Match Management |
| Related Requirement | FR-04 — Group Stage Management |
| Related Requirement | FR-05 — Knockout Stage Management |
| Related Requirement | FR-06 — Tournament Management |
| Database Requirement | FR-08 — Database Management |
| Unit Test | `MatchTest.java` |
| Database Test | `DatabaseTest.java` |
| Web Test | `MatchWebTest.java` |

Quan hệ tổng quát:

`Match Data → Match Management → Group / Knockout / Tournament → Match Result → Database`

---

### 5.4.12 Trạng thái

**Status: Covered**

Match Management được kiểm chứng bằng `MatchTest.java`.

Match và Match Result được kiểm chứng thêm bằng
`DatabaseTest.java`.

Chức năng kiểm tra thời lượng Match trên Web được kiểm chứng bằng
`MatchWebTest.java`.

Kết quả automated test suite hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 5.4.13 Kết luận

Match là dữ liệu trung tâm được sử dụng để quản lý các trận đấu của
World Cup Test Application.

Dữ liệu Match liên kết với Team, Player, Group, Match Result và
Tournament, đồng thời hỗ trợ các quy tắc của cả vòng bảng và vòng
loại trực tiếp.

Match được kiểm chứng bằng unit testing, functional testing,
boundary value analysis, decision-based testing, database testing và
Selenium Web UI testing đối với chức năng Web liên quan.

**5.4 — Dữ liệu Match: Covered.**

## 5.5 Dữ liệu Match Result

### 5.5.1 Mục đích

Mục này đặc tả dữ liệu Match Result được sử dụng để lưu trữ và xử lý
kết quả của các trận đấu trong World Cup Test Application.

Match Result được sử dụng trong:

- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Database Management.

---

### 5.5.2 Thông tin Match Result

Match Result biểu diễn kết quả của một Match sau khi trận đấu được
thực hiện.

Kết quả Match được sử dụng để xác định trạng thái của trận đấu và
phục vụ các bước xử lý tiếp theo của Tournament.

Match Result có thể được sử dụng để:

- Ghi nhận kết quả trận đấu.
- Tính điểm vòng bảng.
- Xác định đội thắng trong Knockout Stage.
- Xác định đội đủ điều kiện đi tiếp.
- Xác định đội vô địch.
- Lưu trữ kết quả trong database.

---

### 5.5.3 Match Result trong vòng bảng

Kết quả các Match vòng bảng được sử dụng để tính điểm cho Team.

Quy tắc tính điểm:

- Thắng: 3 điểm.
- Hòa: 1 điểm.
- Thua: 0 điểm.

Match Result được sử dụng cùng với các dữ liệu khác để xác định thứ
hạng trong Group.

Các tiêu chí xếp hạng gồm:

1. Điểm số.
2. Hiệu số bàn thắng.
3. Thẻ phạt.
4. Kết quả đối đầu trực tiếp.
5. Bốc thăm.

---

### 5.5.4 Match Result trong Knockout Stage

Trong Knockout Stage, Match Result được sử dụng để xác định đội thắng
và đội tiếp tục thi đấu ở vòng tiếp theo.

Kết quả được sử dụng trong các giai đoạn:

- Round of 16.
- Quarterfinals.
- Semifinals.
- Final.

Kết quả trận chung kết được sử dụng để xác định đội vô địch.

---

### 5.5.5 Match Result và Tournament

Match Result là một phần của quá trình quản lý Tournament.

Kết quả được sử dụng để:

- Ghi nhận kết quả vòng bảng.
- Xác định các Team đủ điều kiện.
- Chuẩn bị Round of 16.
- Xác định các đội thắng ở Knockout Stage.
- Xác định đội vô địch.
- Lưu kết quả Tournament.

---

### 5.5.6 Lưu trữ Match Result

Match Result là một trong các loại dữ liệu được Database Management
hỗ trợ.

Hệ thống phải hỗ trợ:

- Lưu Match Result.
- Truy xuất Match Result.
- Lưu nhiều Match Result.
- Xử lý trường hợp Match Result được yêu cầu không tồn tại.

Dữ liệu Match Result sau khi được lưu phải có khả năng được truy xuất
lại.

Các thao tác này được kiểm chứng trong `DatabaseTest.java`.

---

### 5.5.7 Quan hệ với Match

Match Result được tạo ra từ quá trình xử lý Match.

Quan hệ tổng quát:

`Match → Match Result`

Match Result được sử dụng để phản ánh kết quả của Match và cung cấp
dữ liệu cho các chức năng quản lý Group, Knockout Stage và Tournament.

---

### 5.5.8 Kiểm thử dữ liệu Match Result

Match Result được kiểm thử trong các test suite liên quan đến:

- `MatchTest.java`
- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `TournamentTest.java`
- `DatabaseTest.java`

Database testing tập trung vào việc lưu và truy xuất Match Result.

Các test liên quan đến Group, Knockout Stage và Tournament sử dụng
Match Result để kiểm tra quá trình xử lý kết quả trận đấu.

---

### 5.5.9 Kỹ thuật kiểm thử

Dữ liệu Match Result được kiểm chứng bằng:

- Unit Testing.
- Functional Testing.
- Decision-based Testing.
- Database Testing.

Decision-based Testing được sử dụng đối với các trường hợp kết quả
Match dẫn đến các quyết định khác nhau, chẳng hạn như:

- Thắng.
- Hòa.
- Thua.
- Đội được đi tiếp.
- Đội bị loại.
- Xác định đội vô địch.

---

### 5.5.10 Tiêu chí hoàn thành

Dữ liệu Match Result được xem là đáp ứng khi:

- Kết quả Match có thể được ghi nhận.
- Kết quả vòng bảng có thể được sử dụng để tính điểm.
- Kết quả có thể được sử dụng để xác định thứ hạng.
- Kết quả Knockout Stage có thể được sử dụng để xác định đội đi tiếp.
- Kết quả trận chung kết có thể được sử dụng để xác định đội vô địch.
- Match Result có thể được lưu vào database.
- Match Result đã lưu có thể được truy xuất.
- Nhiều Match Result được hỗ trợ.
- Trường hợp Match Result không tồn tại được xử lý.
- Các test case liên quan thực thi thành công.

---

### 5.5.11 Traceability

Dữ liệu Match Result được ánh xạ tới:

| Thành phần | Ánh xạ |
|---|---|
| Functional Requirement | FR-03 — Match Management |
| Related Requirement | FR-04 — Group Stage Management |
| Related Requirement | FR-05 — Knockout Stage Management |
| Related Requirement | FR-06 — Tournament Management |
| Database Requirement | FR-08 — Database Management |
| Unit Test | `MatchTest.java` |
| Group Stage Test | `GroupStageTest.java` |
| Knockout Stage Test | `KnockoutStageTest.java` |
| Tournament Test | `TournamentTest.java` |
| Database Test | `DatabaseTest.java` |

Quan hệ tổng quát:

`Match → Match Result → Group / Knockout / Tournament → Database`

---

### 5.5.12 Trạng thái

**Status: Covered**

Match Result được kiểm chứng thông qua các test suite liên quan đến
Match, Group Stage, Knockout Stage, Tournament và Database.

Kết quả automated test suite hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 5.5.13 Kết luận

Match Result là dữ liệu quan trọng dùng để ghi nhận kết quả của các
trận đấu và cung cấp dữ liệu cho quá trình xử lý Tournament.

Dữ liệu này được sử dụng trong vòng bảng, vòng loại trực tiếp và quá
trình xác định đội vô địch.

Match Result được kiểm chứng bằng unit testing, functional testing,
decision-based testing và database testing.

**5.5 — Dữ liệu Match Result: Covered.**

## 5.6 Lưu trữ và truy xuất dữ liệu

### 5.6.1 Mục đích

Mục này đặc tả cơ chế lưu trữ và truy xuất dữ liệu của
World Cup Test Application.

Database Management hỗ trợ việc lưu trữ và truy xuất các loại dữ liệu
chính của hệ thống:

- Team.
- Group.
- Match.
- Player.
- Match Result.

---

### 5.6.2 Các loại dữ liệu được lưu trữ

Hệ thống phải hỗ trợ lưu trữ:

| Loại dữ liệu | Chức năng liên quan |
|---|---|
| Team | Team Management |
| Group | Group Stage Management |
| Match | Match Management |
| Player | Player Management |
| Match Result | Match / Tournament Management |

Các dữ liệu này được sử dụng bởi các chức năng nghiệp vụ tương ứng
trong quá trình thực hiện Tournament.

---

### 5.6.3 Lưu trữ dữ liệu

Hệ thống phải cho phép lưu các đối tượng được hỗ trợ vào database.

Quá trình lưu trữ tổng quát:

1. Nhận đối tượng cần lưu.
2. Xác định loại dữ liệu.
3. Thực hiện thao tác lưu trữ.
4. Hoàn thành việc lưu bản ghi.
5. Cho phép truy xuất lại dữ liệu đã lưu.

Các thao tác lưu trữ phải được kiểm chứng bằng automated testing.

---

### 5.6.4 Truy xuất dữ liệu

Hệ thống phải cho phép truy xuất dữ liệu đã được lưu.

Quá trình truy xuất tổng quát:

1. Nhận yêu cầu truy xuất.
2. Xác định loại dữ liệu.
3. Tìm kiếm bản ghi tương ứng.
4. Trả về dữ liệu nếu bản ghi tồn tại.
5. Trả về trạng thái không có dữ liệu nếu bản ghi không tồn tại.

Dữ liệu được truy xuất phải tương ứng với dữ liệu đã lưu.

---

### 5.6.5 Hỗ trợ nhiều bản ghi

Database Management phải hỗ trợ việc lưu trữ nhiều bản ghi.

Các loại dữ liệu có thể có nhiều bản ghi bao gồm:

- Nhiều Team.
- Nhiều Group.
- Nhiều Match.
- Nhiều Player.
- Nhiều Match Result.

Việc hỗ trợ nhiều bản ghi được kiểm chứng trong automated test suite.

---

### 5.6.6 Xử lý bản ghi không tồn tại

Khi người dùng hoặc chức năng khác yêu cầu truy xuất một bản ghi
không tồn tại, hệ thống phải trả về trạng thái không có dữ liệu.

Trường hợp này được kiểm tra đối với các loại dữ liệu được hỗ trợ.

Hệ thống không được trả về một bản ghi không tồn tại như một kết quả
hợp lệ.

---

### 5.6.7 Quan hệ với các chức năng nghiệp vụ

Database Management hỗ trợ nhiều chức năng khác của hệ thống.

Quan hệ tổng quát:

`Team / Player / Group / Match / Match Result → Database`

Các chức năng nghiệp vụ sử dụng dữ liệu:

- Team Management.
- Player Management.
- Match Management.
- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Top Scorer Management.

Database cung cấp khả năng lưu trữ và truy xuất dữ liệu cần thiết cho
các chức năng trên.

---

### 5.6.8 Kiểm thử lưu trữ và truy xuất

Các thao tác database được kiểm thử chủ yếu thông qua:

`DatabaseTest.java`

Các nội dung được kiểm tra gồm:

- Lưu Team.
- Truy xuất Team.
- Lưu Group.
- Truy xuất Group.
- Lưu Match.
- Truy xuất Match.
- Lưu Player.
- Truy xuất Player.
- Lưu Match Result.
- Truy xuất Match Result.
- Nhiều bản ghi.
- Bản ghi không tồn tại.

---

### 5.6.9 Kỹ thuật kiểm thử

Lưu trữ và truy xuất dữ liệu được kiểm chứng bằng:

- Unit Testing.
- Functional Testing.
- Database Testing.
- Multiple Record Testing.
- Negative Testing đối với bản ghi không tồn tại.

Các test case xác minh cả trường hợp dữ liệu tồn tại và trường hợp
không tồn tại.

---

### 5.6.10 Tiêu chí hoàn thành

Yêu cầu lưu trữ và truy xuất dữ liệu được xem là đáp ứng khi:

- Team có thể được lưu và truy xuất.
- Group có thể được lưu và truy xuất.
- Match có thể được lưu và truy xuất.
- Player có thể được lưu và truy xuất.
- Match Result có thể được lưu và truy xuất.
- Nhiều bản ghi được hỗ trợ.
- Dữ liệu truy xuất tương ứng với dữ liệu đã lưu.
- Bản ghi không tồn tại được xử lý đúng.
- Các database test thực thi thành công.

---

### 5.6.11 Traceability

Chức năng lưu trữ và truy xuất dữ liệu được ánh xạ tới:

| Thành phần | Ánh xạ |
|---|---|
| Functional Requirement | FR-08 — Database Management |
| Related Requirement | FR-01 — Team Management |
| Related Requirement | FR-02 — Player Management |
| Related Requirement | FR-03 — Match Management |
| Related Requirement | FR-04 — Group Stage Management |
| Related Requirement | FR-05 — Knockout Stage Management |
| Related Requirement | FR-06 — Tournament Management |
| Related Requirement | FR-07 — Top Scorer Management |
| Test Suite | `DatabaseTest.java` |

Quan hệ tổng quát:

`FR-08 → Database → Store / Retrieve → Business Functions`

---

### 5.6.12 Trạng thái

**Status: Covered**

Database Management được kiểm chứng bằng `DatabaseTest.java`.

Các chức năng liên quan đến dữ liệu tiếp tục được sử dụng trong các
test suite nghiệp vụ tương ứng.

Kết quả automated test suite hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 5.6.13 Kết luận

World Cup Test Application hỗ trợ lưu trữ và truy xuất Team, Group,
Match, Player và Match Result.

Hệ thống hỗ trợ nhiều bản ghi và xử lý trường hợp bản ghi không tồn
tại.

Các chức năng lưu trữ và truy xuất được kiểm chứng thông qua
`DatabaseTest.java` và được sử dụng bởi các chức năng nghiệp vụ khác
của hệ thống.

**5.6 — Lưu trữ và truy xuất dữ liệu: Covered.**

## 6. Kiến trúc và công nghệ

## 6.1 Kiến trúc tổng quát

### 6.1.1 Mục đích

Mục này mô tả kiến trúc tổng quát của World Cup Test Application và
mối quan hệ giữa các thành phần chính của hệ thống.

Kiến trúc được mô tả dựa trên các thành phần thực tế của project,
bao gồm:

- Business logic.
- Database.
- Web Application.
- Automated Testing.
- Test Reporting.

---

### 6.1.2 Các thành phần chính

Hệ thống có thể được mô tả thông qua các nhóm thành phần chính:

| Thành phần | Vai trò |
|---|---|
| Business Logic | Xử lý các quy tắc nghiệp vụ của World Cup |
| Database | Lưu trữ và truy xuất dữ liệu |
| Web Application | Cung cấp giao diện Web |
| JUnit 5 Tests | Kiểm thử các chức năng nghiệp vụ |
| Selenium Tests | Kiểm thử giao diện Web |
| Maven | Build và automated test execution |
| Allure | Test reporting |
| Git / GitHub | Version control và quản lý project |

---

### 6.1.3 Business Logic

Business logic là phần xử lý các yêu cầu nghiệp vụ chính của hệ thống.

Các nhóm chức năng bao gồm:

- Team Management.
- Player Management.
- Match Management.
- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Top Scorer Management.
- Database Management.

Business logic được kiểm chứng thông qua các JUnit 5 test suite tương
ứng.

---

### 6.1.4 Database Layer

Database được sử dụng để lưu trữ và truy xuất các dữ liệu chính:

- Team.
- Group.
- Match.
- Player.
- Match Result.

Database Management cung cấp các thao tác lưu trữ và truy xuất cho các
chức năng nghiệp vụ cần sử dụng dữ liệu.

Các thao tác database được kiểm thử thông qua:

`DatabaseTest.java`

---

### 6.1.5 Web Application

Web Application cung cấp giao diện để người sử dụng tương tác với hệ
thống.

Trong phạm vi project hiện tại, Web Application tập trung vào chức
năng:

- Mở homepage.
- Nhập Match Duration.
- Kiểm tra Match Duration.
- Hiển thị kết quả validation.

Web Application được kiểm thử bằng:

`MatchWebTest.java`

và Selenium WebDriver.

---

### 6.1.6 Automated Testing Layer

Automated Testing là thành phần quan trọng của project do project áp
dụng phương pháp Test-Driven Development.

Automated testing bao gồm:

- JUnit 5 Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Selenium Web UI Testing.
- Automated Regression Testing.

Các test suite được tổ chức theo từng nhóm chức năng.

---

### 6.1.7 Test Execution

Maven được sử dụng để hỗ trợ quá trình build và automated test
execution.

Luồng tổng quát:

`Source Code + Test Code → Maven → Test Execution → Test Results`

Test results được sử dụng làm đầu vào cho quá trình reporting.

---

### 6.1.8 Test Reporting

Allure Report được sử dụng để tạo báo cáo từ kết quả automated test
execution.

Luồng tổng quát:

`Test Execution → Test Results → Allure Report`

Allure cung cấp test execution evidence cho project.

---

### 6.1.9 Version Control

Git / GitHub được sử dụng để quản lý source code, test code và tài
liệu của project.

Version control hỗ trợ:

- Theo dõi thay đổi.
- Quản lý phiên bản.
- Lưu trữ source code.
- Quản lý documentation.
- Theo dõi lịch sử phát triển project.

---

### 6.1.10 Luồng tương tác tổng quát

Kiến trúc tổng quát có thể được mô tả như sau:

`User → Web Application → Business Logic`

Đối với database:

`Business Logic → Database`

Đối với automated testing:

`JUnit 5 / Selenium → Application → Test Results`

Đối với reporting:

`Test Results → Allure Report`

Đối với quản lý source code:

`Source Code / Tests / Documentation → Git / GitHub`

---

### 6.1.11 Quan hệ giữa các thành phần

Các thành phần của hệ thống có mối quan hệ:

| Thành phần nguồn | Thành phần đích | Mối quan hệ |
|---|---|---|
| User | Web Application | Tương tác |
| Web Application | Business Logic | Xử lý chức năng |
| Business Logic | Database | Lưu / truy xuất dữ liệu |
| JUnit 5 | Business Logic | Kiểm thử |
| Selenium WebDriver | Web Application | Kiểm thử UI |
| Maven | Test Suite | Build / Test Execution |
| Test Results | Allure | Reporting |
| Project Files | Git / GitHub | Version Control |

---

### 6.1.12 Kiến trúc phục vụ kiểm thử

Kiến trúc của project hỗ trợ việc kiểm thử bằng cách tách các nhóm
chức năng và test suite.

Ví dụ:

- `Team` được kiểm thử bằng `TeamTest`.
- `Player` được kiểm thử bằng `PlayerTest`.
- `Match` được kiểm thử bằng `MatchTest`.
- `Group Stage` được kiểm thử bằng `GroupStageTest`.
- `Knockout Stage` được kiểm thử bằng `KnockoutStageTest`.
- `Tournament` được kiểm thử bằng `TournamentTest`.
- `Database` được kiểm thử bằng `DatabaseTest`.
- `Top Scorer` được kiểm thử bằng `TopScorerTest`.
- Web Application được kiểm thử bằng `MatchWebTest`.

Cách tổ chức này hỗ trợ traceability giữa chức năng, implementation
và automated tests.

---

### 6.1.13 Tiêu chí hoàn thành

Kiến trúc tổng quát được xem là đáp ứng khi:

- Các thành phần chính của project được xác định.
- Business logic có automated tests tương ứng.
- Database có cơ chế lưu trữ và truy xuất.
- Web Application có Selenium test.
- Maven hỗ trợ build và test execution.
- Allure hỗ trợ test reporting.
- Git / GitHub hỗ trợ version control.
- Các thành phần có mối quan hệ rõ ràng trong quá trình phát triển và
  kiểm thử.

---

### 6.1.14 Trạng thái

**Status: Satisfied within project scope**

Project hiện có đầy đủ các nhóm thành phần được sử dụng trong quá
trình phát triển và kiểm thử:

- Java.
- JUnit 5.
- Selenium WebDriver.
- Maven.
- Allure Report.
- Git / GitHub.
- Business Logic.
- Database.
- Web Application.

Automated test suite hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 6.1.15 Kết luận

Kiến trúc tổng quát của World Cup Test Application bao gồm Business
Logic, Database, Web Application và các thành phần hỗ trợ automated
testing, build, reporting và version control.

Các thành phần được liên kết để hỗ trợ quá trình phát triển, thực thi
và kiểm chứng các yêu cầu của hệ thống.

**6.1 — Kiến trúc tổng quát: Satisfied within project scope.**

## 6.2 Java

### 6.2.1 Mục đích

Java là ngôn ngữ lập trình được sử dụng để phát triển
World Cup Test Application.

Java được sử dụng cho:

- Business logic.
- Các lớp dữ liệu của hệ thống.
- Database operations.
- Automated unit tests.
- Các thành phần phục vụ Web Application.

---

### 6.2.2 Vai trò trong hệ thống

Java là nền tảng chính để triển khai các chức năng nghiệp vụ của
project.

Các nhóm chức năng được triển khai và kiểm thử trên nền tảng Java
bao gồm:

- Team Management.
- Player Management.
- Match Management.
- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Top Scorer Management.
- Database Management.

---

### 6.2.3 Java và Business Logic

Business logic của hệ thống được triển khai bằng Java.

Các quy tắc nghiệp vụ liên quan đến:

- Team.
- Player.
- Match.
- Group Stage.
- Knockout Stage.
- Tournament.
- Top Scorer.

được xử lý trong các thành phần Java tương ứng.

Các thành phần này được kiểm chứng bằng JUnit 5.

---

### 6.2.4 Java và Database

Java được sử dụng để triển khai các thao tác liên quan đến dữ liệu
trong Database Management.

Các loại dữ liệu được hỗ trợ gồm:

- Team.
- Group.
- Match.
- Player.
- Match Result.

Các thao tác lưu trữ và truy xuất được kiểm thử bằng:

`DatabaseTest.java`

---

### 6.2.5 Java và Automated Testing

Java được sử dụng để viết automated unit tests với JUnit 5.

Các test suite chính bao gồm:

- `TeamTest.java`
- `PlayerTest.java`
- `MatchTest.java`
- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `TournamentTest.java`
- `DatabaseTest.java`
- `TopScorerTest.java`

Các test suite này kiểm chứng các chức năng nghiệp vụ của
application.

---

### 6.2.6 Java và Web Testing

Java cũng được sử dụng trong Selenium WebDriver test để kiểm thử
Web Application.

Test suite:

`MatchWebTest.java`

được sử dụng để kiểm tra:

- Homepage.
- Match-duration input.
- Valid input.
- Invalid input.
- Empty input.
- Non-numeric input.
- Validation result.

---

### 6.2.7 Build và thực thi

Source code Java được quản lý và build thông qua Maven.

Luồng tổng quát:

`Java Source Code → Maven Build → Compile → Test Execution`

Maven quản lý các dependency và hỗ trợ quá trình thực thi automated
test suite.

---

### 6.2.8 Khả năng tương thích

Project phải sử dụng môi trường Java phù hợp với cấu hình của project
để:

- Compile source code.
- Compile test code.
- Execute application.
- Execute JUnit 5 tests.
- Execute Selenium tests.

FRS không tự xác định một phiên bản Java cụ thể nếu phiên bản đó
không được đặc tả trong project.

---

### 6.2.9 Kiểm thử Java

Các thành phần Java được kiểm chứng thông qua automated testing.

Các kỹ thuật được sử dụng gồm:

- Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Regression Testing.

Kết quả automated test suite hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 6.2.10 Tiêu chí hoàn thành

Việc sử dụng Java được xem là đáp ứng khi:

- Source code Java có thể được compile.
- Business logic có thể được thực thi.
- Database operations có thể được thực hiện.
- JUnit 5 tests có thể được thực thi.
- Selenium WebDriver tests có thể được thực thi.
- Maven có thể build project và thực hiện test execution.
- Automated test suite hoàn thành mà không có Failed hoặc Error.

---

### 6.2.11 Trạng thái

**Status: Satisfied within project scope**

Java là nền tảng phát triển chính của World Cup Test Application và
được sử dụng xuyên suốt application, automated testing và database
operations.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 6.2.12 Kết luận

Java là công nghệ nền tảng của World Cup Test Application, được sử
dụng để triển khai business logic, data operations, automated tests
và các thành phần liên quan đến Web Application.

Java kết hợp với JUnit 5, Maven và Selenium WebDriver tạo thành nền
tảng chính cho quá trình phát triển và kiểm thử project.

**6.2 — Java: Satisfied within project scope.**

## 6.3 JUnit 5

### 6.3.1 Mục đích

JUnit 5 là framework kiểm thử được sử dụng để thực hiện automated
unit testing cho World Cup Test Application.

JUnit 5 hỗ trợ kiểm chứng các chức năng nghiệp vụ và các quy tắc được
đặc tả trong các Functional Requirements.

---

### 6.3.2 Vai trò trong hệ thống

JUnit 5 được sử dụng để kiểm thử các nhóm chức năng:

- Team Management.
- Player Management.
- Match Management.
- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Top Scorer Management.
- Database Management.

Các chức năng Web được kiểm thử riêng bằng Selenium WebDriver.

---

### 6.3.3 Các Test Suite

Các test suite JUnit 5 chính của project gồm:

| Test Suite | Chức năng |
|---|---|
| `TeamTest.java` | Team Management |
| `PlayerTest.java` | Player Management |
| `MatchTest.java` | Match Management |
| `GroupStageTest.java` | Group Stage Management |
| `KnockoutStageTest.java` | Knockout Stage Management |
| `TournamentTest.java` | Tournament Management |
| `TopScorerTest.java` | Top Scorer Management |
| `DatabaseTest.java` | Database Management |

Ngoài các test suite chức năng, project còn có các test hỗ trợ cấu hình
và kiểm tra TDD theo cấu trúc thực tế của project.

---

### 6.3.4 Unit Testing

JUnit 5 được sử dụng để kiểm tra các thành phần Java ở mức unit.

Mỗi test case kiểm tra một hành vi hoặc một điều kiện cụ thể của
application.

Các test case có thể kiểm tra:

- Input.
- Business rule.
- Expected result.
- Boundary condition.
- Invalid condition.
- Database operation.

---

### 6.3.5 Functional Testing

JUnit 5 được sử dụng để kiểm chứng các yêu cầu chức năng thông qua
các test case tương ứng.

Các Functional Requirements được kiểm thử bằng JUnit 5 gồm:

- FR-01 — Team Management.
- FR-02 — Player Management.
- FR-03 — Match Management.
- FR-04 — Group Stage Management.
- FR-05 — Knockout Stage Management.
- FR-06 — Tournament Management.
- FR-07 — Top Scorer Management.
- FR-08 — Database Management.

FR-09 — Web Application được kiểm thử bằng Selenium WebDriver.

FR-10 — Automated Testing được kiểm chứng thông qua toàn bộ automated
test infrastructure.

---

### 6.3.6 Boundary Value Analysis

JUnit 5 được sử dụng để kiểm tra các giá trị biên trong business
logic.

Các nhóm giá trị biên bao gồm:

- Số lượng Assistant Coach.
- Số lượng Player.
- Số lượng Starting Player.
- Số lượng Substitute Player.
- Match Duration.
- Half Duration.
- Half-time Break.
- Extra-time.
- Số lượng Player tối thiểu trên sân.
- Số lần thay người.
- Số Player trong một lần thay người.
- Số lượng Team trong Tournament.
- Số lượng Team trong Group.

Các giá trị tại biên và ngoài biên được sử dụng để xác minh hành vi
của hệ thống.

---

### 6.3.7 Decision-based Testing

JUnit 5 cũng được sử dụng để kiểm tra các logic có nhiều điều kiện
quyết định.

Các chức năng liên quan gồm:

- Match rules.
- Group ranking.
- Qualification.
- Knockout progression.
- Top scorer determination.
- Database record handling.

Các test case kiểm tra kết quả tương ứng với từng điều kiện của
business logic.

---

### 6.3.8 Automated Test Execution

JUnit 5 test suite được thực thi tự động thông qua Maven.

Luồng tổng quát:

`JUnit 5 Test Cases → Maven → Test Execution → Test Results`

Kết quả test execution được sử dụng cho:

- Đánh giá trạng thái test.
- Regression testing.
- Test execution evidence.
- Allure reporting.

---

### 6.3.9 Regression Testing

Các JUnit 5 test có thể được thực thi lại sau khi source code thay
đổi.

Việc chạy lại test suite giúp kiểm tra xem thay đổi mới có làm ảnh
hưởng đến các chức năng đã được kiểm thử trước đó hay không.

Automated regression testing là một phần của quy trình kiểm thử của
project.

---

### 6.3.10 Kết quả kiểm thử

Automated test suite hiện tại của project gồm:

**257 test cases.**

Kết quả thực thi:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Kết quả này bao gồm các automated tests của project và Selenium Web UI
tests.

---

### 6.3.11 Tiêu chí hoàn thành

JUnit 5 được xem là đáp ứng yêu cầu khi:

- Các test suite có thể được compile.
- Các test case có thể được thực thi thông qua Maven.
- Business logic được kiểm thử.
- Các trường hợp hợp lệ được kiểm thử.
- Các trường hợp không hợp lệ được kiểm thử.
- Các giá trị biên quan trọng được kiểm thử.
- Các decision-based conditions được kiểm thử.
- Test results được tạo sau quá trình execution.
- Automated regression testing có thể được thực hiện.
- Test execution hoàn thành mà không có Failed hoặc Error.

---

### 6.3.12 Trạng thái

**Status: Satisfied within project scope**

JUnit 5 đang được sử dụng làm framework chính cho automated unit
testing của project.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 6.3.13 Kết luận

JUnit 5 cung cấp nền tảng automated unit testing cho
World Cup Test Application.

JUnit 5 được sử dụng để kiểm thử business logic, functional
requirements, boundary conditions, decision-based logic và regression
testing.

JUnit 5 kết hợp với Maven và Allure tạo thành một phần quan trọng của
automated testing infrastructure của project.

**6.3 — JUnit 5: Satisfied within project scope.**

## 6.4 Selenium WebDriver

### 6.4.1 Mục đích

Selenium WebDriver được sử dụng để thực hiện automated testing đối với
giao diện Web của World Cup Test Application.

Selenium cho phép mô phỏng các thao tác của người sử dụng trên Web
Application và kiểm tra kết quả thực tế được hiển thị trên giao diện.

---

### 6.4.2 Vai trò trong hệ thống

Selenium WebDriver được sử dụng cho:

- Web UI Testing.
- Functional Testing trên giao diện Web.
- Input Validation Testing.
- Boundary Value Analysis đối với Match Duration.
- Homepage UI Verification.
- Automated Regression Testing cho Web Application.

Selenium tập trung vào Web Application thay vì kiểm tra trực tiếp
business logic bằng unit test.

---

### 6.4.3 Test Suite

Test suite Selenium chính của project là:

`MatchWebTest.java`

Test suite này kiểm tra chức năng Web liên quan đến Match Duration.

Các test case:

| Test Case | Nội dung |
|---|---|
| TC_WEB_001 | Valid 90-minute match |
| TC_WEB_002 | Invalid 89-minute match |
| TC_WEB_003 | Invalid 91-minute match |
| TC_WEB_004 | Homepage UI verification |
| TC_WEB_005 | Empty match-duration input |
| TC_WEB_006 | Invalid non-numeric input |

Tổng số Selenium test case:

**6 test cases.**

---

### 6.4.4 Homepage UI Testing

Selenium được sử dụng để mở Web Application và kiểm tra homepage.

Các thành phần giao diện cần thiết phải được hiển thị để người sử
dụng có thể thực hiện chức năng kiểm tra Match Duration.

Test case tương ứng:

`TC_WEB_004 — Homepage UI verification`

---

### 6.4.5 Match Duration Testing

Selenium kiểm tra việc nhập Match Duration trên giao diện Web.

Giá trị được kiểm thử gồm:

- `90` — hợp lệ.
- `89` — không hợp lệ.
- `91` — không hợp lệ.

Các test case tương ứng:

- `TC_WEB_001`
- `TC_WEB_002`
- `TC_WEB_003`

Ba giá trị này được sử dụng để kiểm tra hành vi tại và xung quanh
giá trị hợp lệ 90 phút.

---

### 6.4.6 Empty Input Testing

Selenium kiểm tra trường hợp người sử dụng không nhập Match Duration.

Luồng kiểm tra:

1. Mở Web Application.
2. Để trống trường Match Duration.
3. Thực hiện thao tác kiểm tra.
4. Xác minh browser validation.

Test case:

`TC_WEB_005 — Empty match-duration input`

---

### 6.4.7 Non-numeric Input Testing

Selenium kiểm tra trường hợp người sử dụng nhập dữ liệu không phải số.

Luồng kiểm tra:

1. Mở Web Application.
2. Nhập dữ liệu không phải số.
3. Thực hiện thao tác kiểm tra.
4. Xác minh kết quả validation.
5. Kiểm tra thông báo lỗi.

Thông báo lỗi yêu cầu:

`INVALID: Minutes must be a number.`

Test case:

`TC_WEB_006 — Invalid non-numeric input`

---

### 6.4.8 Functional Testing

Selenium WebDriver được sử dụng để kiểm tra chức năng Web từ góc độ
người sử dụng.

Các chức năng được kiểm tra:

- Mở homepage.
- Nhập Match Duration.
- Kiểm tra giá trị hợp lệ.
- Kiểm tra giá trị không hợp lệ.
- Xử lý empty input.
- Xử lý non-numeric input.
- Hiển thị kết quả validation.

---

### 6.4.9 Boundary Value Analysis

Selenium sử dụng các giá trị:

- `89`
- `90`
- `91`

để kiểm tra hành vi của Web Application tại và xung quanh giới hạn
90 phút.

Trong đó:

- 89 là giá trị ngay trước 90.
- 90 là giá trị hợp lệ.
- 91 là giá trị ngay sau 90.

Các test case tương ứng:

- `TC_WEB_002`
- `TC_WEB_001`
- `TC_WEB_003`

---

### 6.4.10 Automated Execution

Selenium WebDriver test được thực thi trong automated test process
của project.

Luồng tổng quát:

`MatchWebTest → Selenium WebDriver → Web Application → Validation Result`

Kết quả test execution được thu thập cùng với các automated test khác
của project.

---

### 6.4.11 Kết quả kiểm thử

Selenium Web UI suite hiện tại gồm:

**6 test cases.**

Kết quả:

| Metric | Result |
|---|---:|
| Total Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

Các test case Selenium hiện tại đều thực thi thành công.

---

### 6.4.12 Tiêu chí hoàn thành

Selenium WebDriver được xem là đáp ứng yêu cầu khi:

- Web Application có thể được mở bằng Selenium.
- Homepage có thể được kiểm tra.
- Match Duration có thể được nhập.
- Giá trị 90 được kiểm tra là hợp lệ.
- Giá trị 89 được kiểm tra là không hợp lệ.
- Giá trị 91 được kiểm tra là không hợp lệ.
- Empty input được kiểm tra.
- Non-numeric input được kiểm tra.
- Validation message được xác minh.
- Selenium test suite thực thi thành công.

---

### 6.4.13 Trạng thái

**Status: Satisfied within project scope**

Selenium WebDriver được sử dụng để kiểm thử Web Application thông qua
`MatchWebTest.java`.

Kết quả hiện tại:

**6 / 6 Selenium test cases passed — 100% pass rate.**

---

### 6.4.14 Kết luận

Selenium WebDriver cung cấp cơ chế automated Web UI testing cho
World Cup Test Application.

Selenium kiểm tra homepage, Match Duration, các trường hợp hợp lệ,
không hợp lệ, empty input và non-numeric input.

Selenium WebDriver là thành phần chính để kiểm chứng FR-09 —
Web Application ở mức giao diện người dùng.

**6.4 — Selenium WebDriver: Satisfied within project scope.**

## 6.5 Maven

### 6.5.1 Mục đích

Maven được sử dụng để quản lý quá trình build, dependency và
automated test execution của World Cup Test Application.

Maven giúp chuẩn hóa quá trình biên dịch source code và thực thi
automated test suite của project.

---

### 6.5.2 Vai trò trong hệ thống

Maven hỗ trợ:

- Quản lý project build.
- Compile source code.
- Compile test code.
- Quản lý dependencies.
- Thực thi automated tests.
- Thu thập test execution results.
- Hỗ trợ quá trình tạo test report.

Maven là thành phần trung gian giữa project source code và quá trình
automated test execution.

---

### 6.5.3 Maven Project

World Cup Test Application được tổ chức dưới dạng Maven project.

Các thành phần chính của project bao gồm:

- Java source code.
- Java test code.
- Maven configuration.
- Dependencies.
- Test resources.

Cấu hình Maven được sử dụng để xác định cách project được build và
cách automated tests được thực thi.

---

### 6.5.4 Dependency Management

Maven được sử dụng để quản lý các thư viện mà project cần trong quá
trình build và test.

Các công nghệ kiểm thử chính được project sử dụng gồm:

- JUnit 5.
- Selenium WebDriver.
- Allure.

Dependencies được quản lý thông qua cấu hình Maven của project.

Việc quản lý tập trung giúp quá trình build và test execution sử dụng
các dependency được cấu hình thống nhất.

---

### 6.5.5 Build Process

Maven hỗ trợ quá trình build project.

Luồng tổng quát:

`Source Code → Maven Build → Compile → Test → Test Results`

Trong quá trình build, Maven xử lý các bước cần thiết theo cấu hình
của project.

---

### 6.5.6 Automated Test Execution

Maven được sử dụng để thực thi automated test suite.

Các test suite được thực thi bao gồm:

- JUnit 5 tests.
- Selenium WebDriver tests.

Luồng tổng quát:

`Maven → Test Suite → Test Execution → Test Results`

Maven giúp thực hiện automated testing thay vì phải chạy từng test
case thủ công.

---

### 6.5.7 Maven và JUnit 5

Maven hỗ trợ thực thi các JUnit 5 test suite của project.

Các test suite chính:

- `TeamTest.java`
- `PlayerTest.java`
- `MatchTest.java`
- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `TournamentTest.java`
- `TopScorerTest.java`
- `DatabaseTest.java`

Các test này được sử dụng để kiểm chứng business logic và database
operations.

---

### 6.5.8 Maven và Selenium

Maven cũng hỗ trợ quá trình thực thi Selenium Web UI tests.

Test suite:

`MatchWebTest.java`

được thực thi cùng automated testing process của project.

Selenium test kiểm tra:

- Homepage.
- Match Duration.
- Valid input.
- Invalid input.
- Empty input.
- Non-numeric input.
- Validation result.

---

### 6.5.9 Maven và Test Reporting

Kết quả automated test execution do Maven hỗ trợ được sử dụng trong
quá trình tạo test report.

Luồng tổng quát:

`Maven Test Execution → Test Results → Allure Report`

Maven không phải công cụ trực tiếp để hiển thị Allure report mà cung
cấp test execution results cần thiết cho quá trình reporting.

---

### 6.5.10 Automated Regression Testing

Maven cho phép automated test suite được thực thi lại sau khi source
code thay đổi.

Quá trình này hỗ trợ regression testing:

1. Thay đổi source code.
2. Build project bằng Maven.
3. Thực thi automated test suite.
4. Kiểm tra test results.
5. Xác định các regression failure nếu có.

---

### 6.5.11 Kết quả kiểm thử

Automated test execution hiện tại của project đạt:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Selenium Web UI suite:

| Metric | Result |
|---|---:|
| Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 6.5.12 Tiêu chí hoàn thành

Maven được xem là đáp ứng yêu cầu khi:

- Project có thể được build.
- Source code có thể được compile.
- Test code có thể được compile.
- Dependencies được quản lý theo cấu hình project.
- JUnit 5 tests có thể được thực thi.
- Selenium tests có thể được thực thi.
- Test results được tạo sau quá trình execution.
- Automated regression testing có thể được thực hiện.
- Automated test execution hoàn thành mà không có Failed hoặc Error.

---

### 6.5.13 Trạng thái

**Status: Satisfied within project scope**

Maven được sử dụng làm công cụ build và automated test execution của
World Cup Test Application.

Maven hỗ trợ quá trình thực thi JUnit 5 và Selenium WebDriver tests.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 6.5.14 Kết luận

Maven đóng vai trò quan trọng trong việc chuẩn hóa build process,
dependency management và automated test execution của
World Cup Test Application.

Maven kết nối source code, test suite và test execution results,
đồng thời hỗ trợ quá trình regression testing và test reporting.

**6.5 — Maven: Satisfied within project scope.**

## 6.6 Allure

### 6.6.1 Mục đích

Allure Report được sử dụng để tạo báo cáo từ kết quả automated test
execution của World Cup Test Application.

Allure cung cấp test execution evidence và giúp trình bày kết quả kiểm
thử theo dạng báo cáo.

---

### 6.6.2 Vai trò trong hệ thống

Allure được sử dụng để:

- Thu thập kết quả kiểm thử.
- Tạo test report.
- Hiển thị trạng thái test.
- Cung cấp test execution evidence.
- Hỗ trợ đánh giá kết quả automated testing.

Allure là thành phần reporting và không trực tiếp xử lý business
logic của application.

---

### 6.6.3 Luồng tạo báo cáo

Luồng tổng quát:

`Source Code → Maven Test Execution → Test Results → Allure Report`

Quá trình tạo report sử dụng kết quả được tạo ra sau khi automated
test suite được thực thi.

---

### 6.6.4 Dữ liệu được sử dụng cho Report

Allure sử dụng test execution results để tạo báo cáo.

Các thông tin có thể được sử dụng trong report gồm:

- Test case.
- Test status.
- Test execution result.
- Passed test.
- Failed test.
- Test execution evidence.

Report phản ánh kết quả của automated test execution tại thời điểm
thực thi.

---

### 6.6.5 Allure và JUnit 5

Các JUnit 5 test suite của project được thực thi trong automated test
process.

Kết quả test execution được sử dụng làm dữ liệu cho quá trình
reporting.

Các nhóm test chính gồm:

- `TeamTest.java`
- `PlayerTest.java`
- `MatchTest.java`
- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `TournamentTest.java`
- `TopScorerTest.java`
- `DatabaseTest.java`

---

### 6.6.6 Allure và Selenium WebDriver

Selenium WebDriver test cũng thuộc automated test suite của project.

Test suite:

`MatchWebTest.java`

Các kết quả Selenium test được sử dụng cùng với các automated test
khác trong quá trình test reporting.

Các test case Web gồm:

- `TC_WEB_001`
- `TC_WEB_002`
- `TC_WEB_003`
- `TC_WEB_004`
- `TC_WEB_005`
- `TC_WEB_006`

---

### 6.6.7 Test Execution Evidence

Allure Report được sử dụng để cung cấp bằng chứng về quá trình thực
thi automated testing.

Test execution evidence giúp xác định:

- Test nào đã được thực thi.
- Test nào passed.
- Test nào failed.
- Tổng số test.
- Kết quả của test execution.

Report được tạo từ kết quả thực tế của test execution và không thay
thế cho automated test suite.

---

### 6.6.8 Allure và Regression Testing

Sau khi source code thay đổi, automated test suite có thể được chạy
lại.

Kết quả execution mới có thể được tạo thành Allure Report để so sánh
và đánh giá trạng thái của test suite sau thay đổi.

Luồng:

`Code Change → Maven Test Execution → New Test Results → Allure Report`

---

### 6.6.9 Kết quả kiểm thử

Automated test suite hiện tại đạt:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Selenium Web UI suite đạt:

| Metric | Result |
|---|---:|
| Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

Các kết quả này là dữ liệu đầu vào để đánh giá test execution và
reporting.

---

### 6.6.10 Tiêu chí hoàn thành

Allure được xem là đáp ứng yêu cầu khi:

- Automated test execution tạo ra test results.
- Test results có thể được sử dụng để tạo Allure Report.
- Report phản ánh trạng thái test execution.
- Report cung cấp test execution evidence.
- Kết quả passed và failed có thể được xác định.
- Report có thể được tạo lại sau các lần test execution mới.

---

### 6.6.11 Trạng thái

**Status: Satisfied within project scope**

Allure Report được sử dụng trong project để hỗ trợ test reporting và
cung cấp test execution evidence.

Automated test suite hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 6.6.12 Kết luận

Allure đóng vai trò là công cụ reporting cho automated testing của
World Cup Test Application.

Allure sử dụng test execution results từ automated test suite để tạo
báo cáo và cung cấp bằng chứng cho quá trình kiểm thử.

Allure kết hợp với Maven, JUnit 5 và Selenium WebDriver tạo thành
chuỗi automated testing và reporting của project.

**6.6 — Allure: Satisfied within project scope.**

## 6.7 GitHub Actions

### 6.7.1 Mục đích

GitHub Actions được sử dụng để hỗ trợ tự động hóa các quy trình của
World Cup Test Application trong môi trường GitHub.

Trong phạm vi project, GitHub Actions được sử dụng để hỗ trợ quá trình
build và automated testing theo cấu hình của repository.

---

### 6.7.2 Vai trò trong hệ thống

GitHub Actions có vai trò hỗ trợ tự động hóa quá trình:

- Build project.
- Thực thi automated tests.
- Kiểm tra trạng thái của project sau khi thay đổi source code.
- Hỗ trợ Continuous Integration (CI).

GitHub Actions hoạt động cùng với GitHub repository và các công cụ
build, testing được cấu hình trong project.

---

### 6.7.3 Continuous Integration

GitHub Actions hỗ trợ Continuous Integration bằng cách tự động thực
hiện các bước được cấu hình khi có thay đổi đối với repository.

Luồng tổng quát:

`GitHub Repository → GitHub Actions → Maven Build → Automated Tests → Test Result`

Quá trình này giúp phát hiện lỗi build hoặc test sau khi source code
được thay đổi.

---

### 6.7.4 Maven trong GitHub Actions

GitHub Actions có thể sử dụng Maven để thực hiện build và automated
test execution.

Luồng xử lý:

`GitHub Actions → Maven → Compile → Test Execution → Result`

Việc sử dụng cùng Maven trong môi trường CI giúp quá trình build và
test được thực hiện theo cấu hình của project.

---

### 6.7.5 Automated Testing trong GitHub Actions

Automated tests được thực thi trong CI workflow theo cấu hình của
project.

Các nhóm automated tests bao gồm:

- JUnit 5 tests.
- Selenium WebDriver tests.

Kết quả test được sử dụng để xác định trạng thái của workflow.

Nếu test execution phát sinh lỗi hoặc test failure theo cấu hình
workflow, CI process có thể được đánh dấu không thành công.

---

### 6.7.6 Kiểm tra sau khi thay đổi source code

GitHub Actions hỗ trợ kiểm tra project sau khi source code được thay
đổi và push lên repository.

Luồng tổng quát:

1. Source code được thay đổi.
2. Thay đổi được đưa lên GitHub repository.
3. GitHub Actions thực thi workflow.
4. Maven build project.
5. Automated tests được thực thi.
6. Workflow ghi nhận kết quả.

Quá trình này hỗ trợ phát hiện regression trong quá trình phát triển.

---

### 6.7.7 Quan hệ với các công cụ khác

GitHub Actions kết hợp với các công cụ của project như sau:

| Thành phần | Vai trò |
|---|---|
| GitHub | Repository |
| GitHub Actions | CI automation |
| Maven | Build và test execution |
| JUnit 5 | Unit testing |
| Selenium WebDriver | Web UI testing |
| Allure | Test reporting |

Quan hệ tổng quát:

`GitHub → GitHub Actions → Maven → JUnit 5 / Selenium → Test Results`

---

### 6.7.8 Kiểm thử

GitHub Actions hỗ trợ automated verification bằng cách thực thi
test suite trong CI environment.

Các test suite được sử dụng trong project gồm:

- `TeamTest.java`
- `PlayerTest.java`
- `MatchTest.java`
- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `TournamentTest.java`
- `TopScorerTest.java`
- `DatabaseTest.java`
- `MatchWebTest.java`

---

### 6.7.9 Tiêu chí hoàn thành

GitHub Actions được xem là đáp ứng yêu cầu khi:

- Repository có workflow được cấu hình.
- Workflow có thể được kích hoạt theo cấu hình của project.
- Project có thể được build trong workflow.
- Automated tests có thể được thực thi trong workflow.
- Kết quả build và test được ghi nhận.
- Workflow có thể xác định trạng thái thành công hoặc thất bại.
- Quá trình CI hỗ trợ kiểm tra project sau khi source code thay đổi.

---

### 6.7.10 Trạng thái

**Status: Covered within project scope**

GitHub Actions được sử dụng như thành phần hỗ trợ Continuous
Integration của project.

CI workflow được sử dụng để tự động hóa build và automated testing
theo cấu hình của repository.

---

### 6.7.11 Kết luận

GitHub Actions hỗ trợ tự động hóa quá trình build và kiểm thử của
World Cup Test Application trong môi trường GitHub.

Việc kết hợp GitHub Actions với Maven, JUnit 5 và Selenium WebDriver
giúp project có khả năng thực hiện automated verification sau các thay
đổi source code.

**6.7 — GitHub Actions: Covered within project scope.**

## 6.8 GitHub Pages

### 6.8.1 Mục đích

GitHub Pages được sử dụng để cung cấp khả năng xuất bản các nội dung
tĩnh của project thông qua GitHub.

Trong phạm vi World Cup Test Application, GitHub Pages có thể được sử
dụng để cung cấp các tài liệu hoặc báo cáo được tạo trong quá trình
phát triển và kiểm thử.

---

### 6.8.2 Vai trò trong hệ thống

GitHub Pages đóng vai trò là nền tảng publishing cho các nội dung
được cấu hình để hiển thị trên Web.

GitHub Pages không xử lý business logic của World Cup Test Application
và không thay thế Web Application chính của project.

Vai trò của GitHub Pages tập trung vào việc cung cấp nội dung đã được
publish từ repository.

---

### 6.8.3 Quan hệ với GitHub Repository

GitHub Pages sử dụng nội dung từ GitHub repository theo cấu hình của
project.

Luồng tổng quát:

`GitHub Repository → GitHub Pages → Published Content`

Các nội dung được publish phải tồn tại trong repository hoặc được tạo
ra bởi quá trình build/publishing tương ứng.

---

### 6.8.4 Quan hệ với Documentation

GitHub Pages có thể được sử dụng để publish các tài liệu của project
khi repository được cấu hình cho mục đích này.

Các tài liệu có thể bao gồm:

- Project documentation.
- Testing documentation.
- Test execution evidence.
- Các nội dung Markdown được cấu hình để publish.

Việc publish phụ thuộc vào cấu hình thực tế của repository.

---

### 6.8.5 Quan hệ với Test Reporting

Allure Report là công cụ được sử dụng để tạo test report.

Nếu report được cấu hình để publish thông qua GitHub Pages, luồng
tổng quát có thể được mô tả:

`Maven Test Execution → Test Results → Allure Report → GitHub Pages`

GitHub Pages chỉ đóng vai trò cung cấp nội dung report đã được publish
và không thực hiện quá trình kiểm thử.

---

### 6.8.6 Quan hệ với GitHub Actions

GitHub Actions có thể được sử dụng để tự động hóa quá trình build,
tạo nội dung và publish lên GitHub Pages khi workflow của repository
được cấu hình cho mục đích này.

Luồng tổng quát:

`GitHub Repository → GitHub Actions → Build / Generate Content → GitHub Pages`

Quá trình cụ thể phụ thuộc vào workflow được cấu hình trong project.

---

### 6.8.7 Phạm vi sử dụng

Trong project, GitHub Pages được xem là thành phần hỗ trợ publishing
và presentation.

GitHub Pages không chịu trách nhiệm:

- Xử lý Team.
- Xử lý Player.
- Xử lý Match.
- Xử lý Group Stage.
- Xử lý Knockout Stage.
- Xử lý Tournament.
- Lưu trữ Database.
- Thực hiện business logic.

Các chức năng trên thuộc application và các thành phần tương ứng của
project.

---

### 6.8.8 Tiêu chí hoàn thành

GitHub Pages được xem là đáp ứng yêu cầu khi:

- Repository có cấu hình GitHub Pages nếu project yêu cầu publish.
- Nội dung được cấu hình có thể được publish.
- Nội dung sau khi publish có thể được truy cập thông qua GitHub Pages.
- Quá trình publish không làm thay đổi business logic của
  application.
- Nếu sử dụng GitHub Actions, workflow publish phải hoàn thành thành
  công.

---

### 6.8.9 Trạng thái

**Status: Covered within project scope**

GitHub Pages được xác định là thành phần hỗ trợ publishing trong
kiến trúc và công nghệ của project.

Việc sử dụng GitHub Pages cho từng loại tài liệu hoặc report cụ thể
phụ thuộc vào cấu hình publishing của repository.

---

### 6.8.10 Kết luận

GitHub Pages cung cấp khả năng publish các nội dung Web tĩnh của
World Cup Test Application và các tài liệu hoặc report được cấu hình
để công khai.

GitHub Pages kết hợp với GitHub Repository và GitHub Actions có thể
tạo thành quy trình:

`Repository → CI / Build → Published Content → GitHub Pages`

**6.8 — GitHub Pages: Covered within project scope.**

## 7. Quy tắc nghiệp vụ chính

## 7.1 Quy tắc Team

### 7.1.1 Mục đích

Mục này đặc tả các quy tắc nghiệp vụ liên quan đến Team trong
World Cup Test Application.

Các quy tắc này được sử dụng trong Team Management và có liên quan
đến Group Stage, Knockout Stage và Tournament Management.

---

### 7.1.2 Thông tin Team

Một Team phải hỗ trợ các thông tin:

- Tên quốc gia.
- Huấn luyện viên trưởng.
- Các trợ lý huấn luyện viên.
- Danh sách Player.
- Starting players.
- Substitute players.
- Staff member.

Các thông tin này được sử dụng để mô hình hóa một Team trong
Tournament.

---

### 7.1.3 Quy tắc Assistant Coach

Một Team được phép có tối đa:

**3 Assistant Coaches.**

Hệ thống phải kiểm tra số lượng Assistant Coach và không cho phép
Team vượt quá giới hạn được quy định.

---

### 7.1.4 Quy tắc Player

Một Team phải có:

**Từ 21 đến 22 Players.**

Giá trị nhỏ hơn 21 hoặc lớn hơn 22 không đáp ứng quy tắc về số lượng
Player của Team.

---

### 7.1.5 Quy tắc Starting Players

Đội hình xuất phát của Team phải có:

**Từ 7 đến 11 Starting Players.**

Hệ thống phải kiểm tra giới hạn tối thiểu và tối đa của đội hình xuất
phát.

---

### 7.1.6 Quy tắc Substitute Players

Một Team phải có:

**Từ 4 đến 5 Substitute Players.**

Số lượng Substitute Player phải nằm trong giới hạn được quy định.

---

### 7.1.7 Quan hệ giữa Team và Player

Team chứa danh sách Player.

Player có thể được phân loại thành:

- Starting Player.
- Substitute Player.

Các giới hạn của Team phải được kiểm tra khi dữ liệu Player được sử
dụng để tạo hoặc quản lý Team.

---

### 7.1.8 Team trong Tournament

Team là thành phần cơ bản của Tournament.

Tournament phải được khởi tạo với:

**Chính xác 32 Teams.**

32 Teams được sử dụng để tạo:

- 8 Groups.
- Mỗi Group có 4 Teams.

Sau Group Stage, các Team đủ điều kiện được đưa vào Round of 16.

---

### 7.1.9 Team trong Group Stage

Mỗi Group chứa 4 Teams.

Mỗi Team thi đấu với 3 đối thủ trong Group.

Kết quả các trận đấu được sử dụng để xác định thứ hạng Team trong
Group.

Hai Team đứng đầu mỗi Group được xác định là đủ điều kiện vào
Round of 16.

---

### 7.1.10 Team trong Knockout Stage

Các Team đủ điều kiện từ Group Stage được đưa vào Round of 16.

Tổng số Team tham gia Round of 16:

**16 Teams.**

Kết quả các trận Knockout xác định Team tiếp tục vào:

- Quarterfinals.
- Semifinals.
- Final.

Đội thắng trận Final được xác định là Tournament Champion.

---

### 7.1.11 Team và Database

Team là một loại dữ liệu được hỗ trợ bởi Database Management.

Hệ thống phải hỗ trợ:

- Lưu Team.
- Truy xuất Team.
- Lưu nhiều Team.
- Xử lý trường hợp Team không tồn tại.

Các thao tác database được kiểm thử thông qua:

`DatabaseTest.java`

---

### 7.1.12 Kiểm thử quy tắc Team

Các quy tắc Team được kiểm chứng thông qua:

`TeamTest.java`

Các nội dung chính:

- Số lượng Assistant Coaches.
- Số lượng Players.
- Số lượng Starting Players.
- Số lượng Substitute Players.
- Các giá trị trong giới hạn.
- Các giá trị ngoài giới hạn.

Các chức năng liên quan đến Team tiếp tục được kiểm chứng trong:

- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `TournamentTest.java`
- `DatabaseTest.java`

---

### 7.1.13 Kỹ thuật kiểm thử

Các quy tắc Team được kiểm chứng bằng:

- Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Database Testing.

Boundary Value Analysis được sử dụng đối với các giới hạn số lượng:

- Assistant Coaches.
- Players.
- Starting Players.
- Substitute Players.

---

### 7.1.14 Tiêu chí hoàn thành

Quy tắc Team được xem là đáp ứng khi:

- Team hỗ trợ đầy đủ thông tin cần thiết.
- Số lượng Assistant Coaches không vượt quá 3.
- Team có từ 21 đến 22 Players.
- Starting Players nằm trong khoảng từ 7 đến 11.
- Substitute Players nằm trong khoảng từ 4 đến 5.
- Team có thể được sử dụng trong Group Stage.
- Team có thể được sử dụng trong Knockout Stage.
- Team có thể được sử dụng trong Tournament.
- Team có thể được lưu và truy xuất từ Database.
- Các test case liên quan thực thi thành công.

---

### 7.1.15 Traceability

Các quy tắc Team được ánh xạ tới:

| Thành phần | Ánh xạ |
|---|---|
| Functional Requirement | FR-01 — Team Management |
| Related Requirement | FR-04 — Group Stage Management |
| Related Requirement | FR-05 — Knockout Stage Management |
| Related Requirement | FR-06 — Tournament Management |
| Database Requirement | FR-08 — Database Management |
| Unit Test | `TeamTest.java` |
| Group Stage Test | `GroupStageTest.java` |
| Knockout Stage Test | `KnockoutStageTest.java` |
| Tournament Test | `TournamentTest.java` |
| Database Test | `DatabaseTest.java` |

---

### 7.1.16 Trạng thái

**Status: Covered**

Các quy tắc Team được kiểm chứng bằng automated test suite.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 7.1.17 Kết luận

Team Management xác định các quy tắc về cấu trúc Team, số lượng
Player, Starting Player, Substitute Player và Assistant Coach.

Các quy tắc này được sử dụng xuyên suốt Group Stage, Knockout Stage
và Tournament Management và được kiểm chứng bằng automated testing.

**7.1 — Quy tắc Team: Covered.**

## 7.2 Quy tắc Match

### 7.2.1 Mục đích

Mục này đặc tả các quy tắc nghiệp vụ liên quan đến Match trong
World Cup Test Application.

Các quy tắc được áp dụng cho các trận đấu vòng bảng và vòng loại trực
tiếp, đồng thời liên quan đến Player, Team và Match Result.

---

### 7.2.2 Quy tắc thời lượng trận đấu

Một trận đấu vòng bảng phải có thời lượng:

**90 phút.**

Mỗi hiệp chính kéo dài:

**45 phút.**

Thời gian nghỉ giữa hai hiệp:

**Không quá 15 phút.**

---

### 7.2.3 Quy tắc hiệp phụ

Một trận đấu Knockout có thể có:

**Từ 0 đến 2 hiệp phụ.**

Mỗi hiệp phụ kéo dài:

**30 phút.**

Số lượng hiệp phụ phải nằm trong giới hạn được quy định.

---

### 7.2.4 Quy tắc bàn thắng bạc

Trong trường hợp áp dụng bàn thắng bạc, bàn thắng có thể kết thúc
trận đấu khi tỷ số giữa hai đội khác nhau.

Quy tắc này được kiểm chứng trong Match Management.

---

### 7.2.5 Quy tắc sút luân lưu

Khi trận đấu cần được quyết định bằng sút luân lưu:

- Đội thắng có thể được xác định sau 5 lượt sút khi tỷ số khác nhau.
- Nếu tỷ số bằng nhau sau 5 lượt sút, trận đấu tiếp tục theo hình thức
  sudden death.

Các điều kiện này được kiểm chứng trong Match testing.

---

### 7.2.6 Quy tắc thẻ vàng

Player phải rời sân khi nhận:

**Từ 2 thẻ vàng trở lên.**

Hệ thống phải kiểm tra số lượng thẻ vàng của Player trong Match.

---

### 7.2.7 Quy tắc thẻ đỏ

Player phải rời sân khi nhận:

**Thẻ đỏ.**

Quy tắc này được áp dụng độc lập với quy tắc xử lý thẻ vàng.

---

### 7.2.8 Quy tắc số lượng Player trên sân

Một Team phải có ít nhất:

**7 Players trên sân**

để tiếp tục thi đấu.

Nếu số lượng Player trên sân thấp hơn giới hạn này, Team không đáp
ứng điều kiện tiếp tục thi đấu.

---

### 7.2.9 Quy tắc thay người

Một Team được thực hiện tối đa:

**3 lần thay người.**

Mỗi lần thay người có thể thay:

**Từ 1 đến 3 Players.**

Vị trí của Player không hạn chế việc thay người.

---

### 7.2.10 Match và Team

Một Match được tổ chức giữa các Team.

Team tham gia Match trong:

- Group Stage.
- Knockout Stage.

Kết quả Match được sử dụng để cập nhật Group Stage hoặc xác định Team
được đi tiếp trong Knockout Stage.

---

### 7.2.11 Match và Player

Player tham gia Match và có thể chịu các quy tắc:

- Thẻ vàng.
- Thẻ đỏ.
- Số lượng Player trên sân.
- Thay người.
- Ghi bàn.

Các thông tin liên quan đến Player được sử dụng để xử lý và xác định
kết quả Match.

---

### 7.2.12 Match và Match Result

Sau khi Match được xử lý, kết quả được ghi nhận dưới dạng
Match Result.

Match Result được sử dụng để:

- Tính điểm vòng bảng.
- Xác định đội thắng.
- Xác định đội đi tiếp.
- Xác định đội vô địch.
- Lưu trữ kết quả Tournament.

---

### 7.2.13 Kiểm thử quy tắc Match

Các quy tắc Match được kiểm chứng thông qua:

`MatchTest.java`

Các nội dung chính:

- Match duration.
- Half duration.
- Half-time break.
- Extra-time.
- Silver goal.
- Penalty kicks.
- Sudden death.
- Yellow cards.
- Red cards.
- Minimum players.
- Substitutions.
- Player position.

Chức năng Match Duration trên Web được kiểm thử thêm thông qua:

`MatchWebTest.java`

---

### 7.2.14 Kỹ thuật kiểm thử

Các quy tắc Match được kiểm chứng bằng:

- Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Selenium Web UI Testing.

Boundary Value Analysis được áp dụng đối với các giới hạn:

- 90 phút.
- 45 phút.
- 15 phút.
- 30 phút.
- 7 Players.
- 3 lần thay người.
- 1 đến 3 Players trong một lần thay người.

Decision-based Testing được sử dụng đối với các điều kiện xác định
kết quả Match.

---

### 7.2.15 Tiêu chí hoàn thành

Quy tắc Match được xem là đáp ứng khi:

- Match duration được kiểm tra đúng.
- Half duration được kiểm tra đúng.
- Half-time break được kiểm tra đúng.
- Extra-time được kiểm tra đúng.
- Silver goal được kiểm tra.
- Penalty kicks được kiểm tra.
- Sudden death được kiểm tra.
- Yellow-card rule được kiểm tra.
- Red-card rule được kiểm tra.
- Minimum players rule được kiểm tra.
- Substitution rule được kiểm tra.
- Player position không ngăn cản việc thay người.
- Các test case liên quan thực thi thành công.

---

### 7.2.16 Traceability

Các quy tắc Match được ánh xạ tới:

| Thành phần | Ánh xạ |
|---|---|
| Functional Requirement | FR-03 — Match Management |
| Related Requirement | FR-04 — Group Stage Management |
| Related Requirement | FR-05 — Knockout Stage Management |
| Related Requirement | FR-06 — Tournament Management |
| Web Requirement | FR-09 — Web Application |
| Unit Test | `MatchTest.java` |
| Web UI Test | `MatchWebTest.java` |

---

### 7.2.17 Trạng thái

**Status: Covered**

Các quy tắc Match được kiểm chứng bằng automated test suite.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

Selenium Web UI suite:

**6 / 6 test cases passed — 100% pass rate.**

---

### 7.2.18 Kết luận

Match Management xác định các quy tắc về thời lượng trận đấu, hiệp
đấu, hiệp phụ, sút luân lưu, thẻ phạt, số lượng Player trên sân và
thay người.

Các quy tắc được áp dụng cho Group Stage và Knockout Stage và được
kiểm chứng bằng JUnit 5 và Selenium WebDriver đối với chức năng Web.

**7.2 — Quy tắc Match: Covered.**

## 7.3 Quy tắc Group Stage

### 7.3.1 Mục đích

Mục này đặc tả các quy tắc nghiệp vụ liên quan đến Group Stage của
World Cup Test Application.

Các quy tắc Group Stage được sử dụng để tổ chức 32 Team thành các
Group, thực hiện các trận đấu vòng bảng, tính điểm, xếp hạng và xác
định các Team đủ điều kiện vào Round of 16.

---

### 7.3.2 Quy tắc số lượng Team

Tournament phải có chính xác:

**32 Teams.**

32 Teams được chia thành:

**8 Groups.**

Mỗi Group phải có:

**4 Teams.**

---

### 7.3.3 Quy tắc thi đấu

Mỗi Team trong một Group phải thi đấu với:

**3 đối thủ.**

Các trận đấu của Group Stage được sử dụng để tạo kết quả và tính
điểm cho các Team.

---

### 7.3.4 Quy tắc tính điểm

Hệ thống phải tính điểm dựa trên kết quả Match:

| Kết quả | Điểm |
|---|---:|
| Win | 3 |
| Draw | 1 |
| Loss | 0 |

Điểm số của Team được sử dụng làm tiêu chí đầu tiên trong quá trình
xếp hạng.

---

### 7.3.5 Quy tắc xếp hạng

Hệ thống phải hỗ trợ các tiêu chí xếp hạng theo thứ tự:

1. Points.
2. Goal Difference.
3. Cards.
4. Head-to-head Result.
5. Draw Lot.

Các tiêu chí được áp dụng tuần tự để xác định thứ hạng của Team.

---

### 7.3.6 Quy tắc tính thẻ phạt

Khi tính trọng số thẻ phạt:

**1 Red Card = 2 Yellow Cards.**

Quy tắc này được sử dụng trong tiêu chí Cards của quá trình xếp hạng.

---

### 7.3.7 Quy tắc Qualification

Sau khi Group Stage hoàn thành:

- Team đứng thứ nhất được qualify.
- Team đứng thứ hai được qualify.

Với 8 Groups, tổng số Team qualify là:

**16 Teams.**

16 Teams này được sử dụng để chuẩn bị Round of 16.

---

### 7.3.8 Quan hệ với Match

Kết quả Match trong Group Stage được sử dụng để:

- Tính điểm.
- Tính Goal Difference.
- Tính Cards.
- Xác định Head-to-head Result.
- Xác định thứ hạng.
- Xác định Qualification.

Quan hệ tổng quát:

`Group → Matches → Match Results → Ranking → Qualification`

---

### 7.3.9 Quan hệ với Knockout Stage

Sau khi Group Stage hoàn thành, 16 Team đủ điều kiện được đưa vào
Round of 16.

Luồng tổng quát:

`Group Stage → Ranking → 16 Qualified Teams → Round of 16`

---

### 7.3.10 Quan hệ với Tournament

Group Stage là giai đoạn đầu tiên của Tournament.

Tournament phải:

1. Khởi tạo 32 Teams.
2. Tạo 8 Groups.
3. Phân bổ 4 Teams vào mỗi Group.
4. Thực hiện Group Stage.
5. Ghi nhận Match Results.
6. Xếp hạng Teams.
7. Xác định 16 Qualified Teams.
8. Chuẩn bị Round of 16.

---

### 7.3.11 Kiểm thử quy tắc Group Stage

Các quy tắc Group Stage được kiểm chứng thông qua:

`GroupStageTest.java`

Các nội dung chính:

- Số lượng Team trong Tournament.
- Số lượng Group.
- Số lượng Team trong mỗi Group.
- Số đối thủ của mỗi Team.
- Điểm thắng.
- Điểm hòa.
- Điểm thua.
- Goal Difference.
- Cards.
- Head-to-head Result.
- Draw Lot.
- Red Card và Yellow Card weighting.
- Qualification.

Các chức năng liên quan đến Tournament được kiểm chứng thêm thông qua:

`TournamentTest.java`

---

### 7.3.12 Kỹ thuật kiểm thử

Các quy tắc Group Stage được kiểm chứng bằng:

- Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.

Boundary Value Analysis được áp dụng đối với các giới hạn:

- 32 Teams.
- 8 Groups.
- 4 Teams mỗi Group.
- 3 đối thủ mỗi Team.

Decision-based Testing được sử dụng đối với:

- Point calculation.
- Ranking criteria.
- Qualification.

---

### 7.3.13 Tiêu chí hoàn thành

Quy tắc Group Stage được xem là đáp ứng khi:

- Tournament có chính xác 32 Teams.
- Tournament có 8 Groups.
- Mỗi Group có 4 Teams.
- Mỗi Team thi đấu với 3 đối thủ.
- Win được 3 điểm.
- Draw được 1 điểm.
- Loss được 0 điểm.
- Ranking criteria được áp dụng đúng thứ tự.
- 1 Red Card được tính tương đương 2 Yellow Cards.
- Team đứng thứ nhất được qualify.
- Team đứng thứ hai được qualify.
- Tổng cộng 16 Teams được qualify.
- 16 Qualified Teams được chuyển sang Round of 16.
- Các test case liên quan thực thi thành công.

---

### 7.3.14 Traceability

Các quy tắc Group Stage được ánh xạ tới:

| Thành phần | Ánh xạ |
|---|---|
| Functional Requirement | FR-04 — Group Stage Management |
| Related Requirement | FR-03 — Match Management |
| Related Requirement | FR-05 — Knockout Stage Management |
| Related Requirement | FR-06 — Tournament Management |
| Database Requirement | FR-08 — Database Management |
| Unit Test | `GroupStageTest.java` |
| Tournament Test | `TournamentTest.java` |
| Database Test | `DatabaseTest.java` |

---

### 7.3.15 Trạng thái

**Status: Covered**

Các quy tắc Group Stage được kiểm chứng bằng automated test suite.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 7.3.16 Kết luận

Group Stage xác định cách tổ chức 32 Teams thành 8 Groups, thực hiện
các trận đấu vòng bảng, tính điểm, xếp hạng và xác định các Team đủ
điều kiện đi tiếp.

Hai Team đứng đầu mỗi Group được qualify, tạo thành tổng cộng
16 Qualified Teams cho Round of 16.

**7.3 — Quy tắc Group Stage: Covered.**

## 7.4 Quy tắc Knockout Stage

### 7.4.1 Mục đích

Mục này đặc tả các quy tắc nghiệp vụ liên quan đến Knockout Stage của
World Cup Test Application.

Knockout Stage bắt đầu sau Group Stage và được sử dụng để xác định
các Team tiếp tục thi đấu cho đến khi xác định được Tournament
Champion.

---

### 7.4.2 Quy tắc Round of 16

Round of 16 phải có:

**16 Teams.**

16 Teams được lấy từ các Team đủ điều kiện sau Group Stage.

Round of 16 phải được tổ chức thành:

**8 Matches.**

Kết quả của 8 Matches tạo ra:

**8 Winners.**

---

### 7.4.3 Quy tắc Quarterfinals

8 Winners từ Round of 16 tiếp tục vào Quarterfinals.

Quarterfinals gồm:

**4 Matches.**

Kết quả của 4 Matches tạo ra:

**4 Semifinalists.**

---

### 7.4.4 Quy tắc Semifinals

4 Semifinalists tiếp tục vào Semifinals.

Semifinals gồm:

**2 Matches.**

Kết quả tạo ra:

**2 Finalists.**

Hai Team thua ở Semifinals được xác định là các đội nhận huy chương
đồng.

---

### 7.4.5 Quy tắc Final

2 Finalists thi đấu:

**1 Final Match.**

Đội thắng Final được xác định là:

**Tournament Champion.**

Đội thua Final nhận:

**Silver Medal.**

Đội thắng Final nhận:

**Gold Medal.**

---

### 7.4.6 Quy tắc huy chương

Hệ thống phải hỗ trợ phân bổ huy chương:

| Kết quả | Huy chương |
|---|---|
| Final Winner | Gold |
| Final Loser | Silver |
| Semifinal Losers | Bronze |

Có:

- 1 Gold Medal.
- 1 Silver Medal.
- 2 Bronze Medals.

---

### 7.4.7 Quy tắc tiến trình

Knockout Stage phải tuân theo tiến trình:

`Round of 16 → Quarterfinals → Semifinals → Final → Champion`

Số lượng Team giảm qua từng vòng:

| Giai đoạn | Teams | Matches |
|---|---:|---:|
| Round of 16 | 16 | 8 |
| Quarterfinals | 8 | 4 |
| Semifinals | 4 | 2 |
| Final | 2 | 1 |
| Champion | 1 | - |

---

### 7.4.8 Quy tắc xác định đội thắng

Kết quả của Knockout Match được sử dụng để xác định Team tiếp tục
vào vòng tiếp theo.

Trong trường hợp Match cần được quyết định sau thời gian thi đấu
chính, các quy tắc Match liên quan đến:

- Extra-time.
- Silver goal.
- Penalty kicks.
- Sudden death.

được áp dụng theo FR-03 — Match Management.

---

### 7.4.9 Quan hệ với Group Stage

Knockout Stage nhận 16 Qualified Teams từ Group Stage.

Luồng tổng quát:

`Group Stage → 16 Qualified Teams → Round of 16`

Không có Team nào ngoài danh sách Qualified Teams được đưa trực tiếp
vào Round of 16.

---

### 7.4.10 Quan hệ với Tournament

Knockout Stage là giai đoạn quyết định của Tournament.

Tournament phải sử dụng kết quả của từng vòng để xác định:

- Round-of-16 winners.
- Quarterfinalists.
- Semifinalists.
- Finalists.
- Tournament Champion.

Luồng tổng quát:

`Round of 16 → Quarterfinals → Semifinals → Final → Champion`

---

### 7.4.11 Kiểm thử quy tắc Knockout Stage

Các quy tắc Knockout Stage được kiểm chứng thông qua:

`KnockoutStageTest.java`

Các nội dung chính:

- 16 Teams ở Round of 16.
- Các cặp đấu Round of 16.
- 8 Round-of-16 winners.
- 4 Quarterfinal matches.
- 4 Semifinalists.
- 2 Semifinal matches.
- 2 Finalists.
- Final.
- Tournament Champion.
- Gold Medal.
- Silver Medal.
- Bronze Medals.

Các chức năng liên quan đến Tournament được kiểm chứng thêm thông qua:

`TournamentTest.java`

---

### 7.4.12 Kỹ thuật kiểm thử

Các quy tắc Knockout Stage được kiểm chứng bằng:

- Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.

Boundary Value Analysis được áp dụng đối với số lượng Team và Match
ở từng vòng.

Decision-based Testing được sử dụng để kiểm tra quá trình xác định
Team thắng và Team tiếp tục vào vòng tiếp theo.

---

### 7.4.13 Tiêu chí hoàn thành

Quy tắc Knockout Stage được xem là đáp ứng khi:

- Round of 16 có 16 Teams.
- Round of 16 có 8 Matches.
- Có 8 Round-of-16 winners.
- Quarterfinals có 4 Matches.
- Có 4 Semifinalists.
- Semifinals có 2 Matches.
- Có 2 Finalists.
- Final có 2 Finalists.
- Tournament Champion được xác định.
- Final Winner nhận Gold Medal.
- Final Loser nhận Silver Medal.
- Hai Semifinal Losers nhận Bronze Medals.
- Tiến trình giữa các vòng được thực hiện đúng.
- Các test case liên quan thực thi thành công.

---

### 7.4.14 Traceability

Các quy tắc Knockout Stage được ánh xạ tới:

| Thành phần | Ánh xạ |
|---|---|
| Functional Requirement | FR-05 — Knockout Stage Management |
| Related Requirement | FR-03 — Match Management |
| Related Requirement | FR-04 — Group Stage Management |
| Related Requirement | FR-06 — Tournament Management |
| Unit Test | `KnockoutStageTest.java` |
| Tournament Test | `TournamentTest.java` |

---

### 7.4.15 Trạng thái

**Status: Covered**

Các quy tắc Knockout Stage được kiểm chứng bằng automated test suite.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 7.4.16 Kết luận

Knockout Stage bắt đầu với 16 Qualified Teams từ Group Stage và được
thực hiện qua Round of 16, Quarterfinals, Semifinals và Final.

Kết quả cuối cùng xác định Tournament Champion và phân bổ Gold,
Silver và Bronze Medals theo quy tắc của hệ thống.

**7.4 — Quy tắc Knockout Stage: Covered.**

## 7.5 Quy tắc Tournament

### 7.5.1 Mục đích

Mục này đặc tả các quy tắc nghiệp vụ liên quan đến Tournament của
World Cup Test Application.

Tournament quản lý toàn bộ tiến trình của giải đấu từ khi khởi tạo
32 Teams, thực hiện Group Stage, Knockout Stage cho đến khi xác định
Tournament Champion.

---

### 7.5.2 Quy tắc khởi tạo Tournament

Tournament phải được khởi tạo với:

**Chính xác 32 Teams.**

Số lượng Team được kiểm tra trước khi Tournament được thực hiện.

---

### 7.5.3 Quy tắc tạo Group

Tournament phải tạo:

**8 Groups.**

Mỗi Group phải có:

**4 Teams.**

Tổng số Team được phân bổ:

**8 × 4 = 32 Teams.**

---

### 7.5.4 Quy tắc Group Stage

Sau khi Tournament được khởi tạo, Group Stage được thực hiện.

Tournament phải:

1. Tạo 8 Groups.
2. Phân bổ 32 Teams vào các Groups.
3. Thực hiện các Group-stage Matches.
4. Ghi nhận Match Results.
5. Tính điểm.
6. Xếp hạng các Teams.
7. Xác định Qualified Teams.

Mỗi Group có 4 Teams và mỗi Team thi đấu với 3 đối thủ.

---

### 7.5.5 Quy tắc Qualification

Sau Group Stage, Team đứng thứ nhất và thứ hai trong mỗi Group được
xác định là Qualified Teams.

Với 8 Groups:

**8 × 2 = 16 Qualified Teams.**

16 Qualified Teams được đưa vào Round of 16.

---

### 7.5.6 Quy tắc Knockout Stage

Tournament phải thực hiện Knockout Stage theo thứ tự:

`Round of 16 → Quarterfinals → Semifinals → Final`

Số lượng Team và Match giảm theo từng vòng:

| Giai đoạn | Teams | Matches |
|---|---:|---:|
| Round of 16 | 16 | 8 |
| Quarterfinals | 8 | 4 |
| Semifinals | 4 | 2 |
| Final | 2 | 1 |

---

### 7.5.7 Quy tắc xác định Champion

Sau Final:

- Final Winner được xác định là Tournament Champion.
- Final Loser nhận Silver Medal.
- Hai Semifinal Losers nhận Bronze Medals.

Final Winner nhận:

**Gold Medal.**

---

### 7.5.8 Quy tắc Match Result

Tournament phải ghi nhận kết quả của các Match.

Match Results được sử dụng để:

- Tính điểm Group Stage.
- Xếp hạng Teams.
- Xác định Qualified Teams.
- Xác định đội thắng Knockout Match.
- Xác định Final Winner.
- Xác định Tournament Champion.

---

### 7.5.9 Quy tắc lưu trữ

Tournament phải hỗ trợ lưu kết quả Match vào Database.

Các dữ liệu liên quan có thể bao gồm:

- Teams.
- Groups.
- Matches.
- Players.
- Match Results.

Các thao tác lưu trữ và truy xuất được hỗ trợ bởi Database Management.

---

### 7.5.10 Quy tắc xuất kết quả

Tournament phải hỗ trợ:

**Export Tournament Results.**

Kết quả được xuất phải phản ánh kết quả của Tournament theo dữ liệu
đã được xử lý.

---

### 7.5.11 Luồng xử lý Tournament

Luồng tổng quát:

`32 Teams → 8 Groups → Group Stage → 16 Qualified Teams → Round of 16 → Quarterfinals → Semifinals → Final → Champion`

Các bước xử lý phải được thực hiện theo đúng thứ tự của Tournament.

---

### 7.5.12 Kiểm thử quy tắc Tournament

Các quy tắc Tournament được kiểm chứng thông qua:

`TournamentTest.java`

Các nội dung chính:

- Khởi tạo Tournament với 32 Teams.
- Tạo 8 Groups.
- Kiểm tra 4 Teams mỗi Group.
- Thực hiện Group Stage.
- Ghi nhận Group-stage Results.
- Xác định 16 Qualified Teams.
- Chuẩn bị Round of 16.
- Thực hiện Knockout Stage.
- Xác định Champion.
- Lưu Match Results.
- Export Tournament Results.

Các chức năng liên quan tiếp tục được kiểm chứng trong:

- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `DatabaseTest.java`

---

### 7.5.13 Kỹ thuật kiểm thử

Các quy tắc Tournament được kiểm chứng bằng:

- Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Database Testing.

Boundary Value Analysis được áp dụng đối với các giới hạn:

- 32 Teams.
- 8 Groups.
- 4 Teams mỗi Group.
- 16 Qualified Teams.
- Số lượng Team và Match trong từng Knockout Stage.

Decision-based Testing được sử dụng để kiểm tra các bước chuyển tiếp
giữa các giai đoạn của Tournament.

---

### 7.5.14 Tiêu chí hoàn thành

Quy tắc Tournament được xem là đáp ứng khi:

- Tournament được khởi tạo với chính xác 32 Teams.
- 8 Groups được tạo.
- Mỗi Group có 4 Teams.
- Group Stage được thực hiện.
- Group-stage Results được ghi nhận.
- 16 Qualified Teams được xác định.
- Round of 16 được chuẩn bị.
- Knockout Stage được thực hiện.
- Tournament Champion được xác định.
- Match Results được lưu vào Database.
- Tournament Results được export.
- Các test case liên quan thực thi thành công.

---

### 7.5.15 Traceability

Các quy tắc Tournament được ánh xạ tới:

| Thành phần | Ánh xạ |
|---|---|
| Functional Requirement | FR-06 — Tournament Management |
| Related Requirement | FR-01 — Team Management |
| Related Requirement | FR-03 — Match Management |
| Related Requirement | FR-04 — Group Stage Management |
| Related Requirement | FR-05 — Knockout Stage Management |
| Database Requirement | FR-08 — Database Management |
| Unit Test | `TournamentTest.java` |
| Group Stage Test | `GroupStageTest.java` |
| Knockout Stage Test | `KnockoutStageTest.java` |
| Database Test | `DatabaseTest.java` |

---

### 7.5.16 Trạng thái

**Status: Covered**

Các quy tắc Tournament được kiểm chứng bằng automated test suite.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 7.5.17 Kết luận

Tournament Management điều phối toàn bộ tiến trình của
World Cup Test Application từ 32 Teams, Group Stage, Qualification,
Knockout Stage cho đến Tournament Champion.

Tournament sử dụng kết quả của các giai đoạn trước để chuyển tiếp
Teams qua từng vòng và hỗ trợ lưu trữ, xuất kết quả Tournament.

**7.5 — Quy tắc Tournament: Covered.**

## 7.6 Quy tắc Top Scorer

### 7.6.1 Mục đích

Mục này đặc tả các quy tắc nghiệp vụ liên quan đến Top Scorer trong
World Cup Test Application.

Top Scorer Management được sử dụng để ghi nhận số bàn thắng của Player,
tính tổng số bàn thắng và xác định Player có số bàn thắng cao nhất
trong phạm vi dữ liệu được hệ thống quản lý.

---

### 7.6.2 Quy tắc ghi nhận bàn thắng

Hệ thống phải ghi nhận số bàn thắng của Player.

Bàn thắng được ghi nhận trong quá trình các Match được thực hiện.

Số bàn thắng của một Player phải được cộng dồn khi Player ghi bàn ở
nhiều Match.

Luồng tổng quát:

`Player → Goal Recorded → Goal Count Updated`

---

### 7.6.3 Quy tắc cộng dồn bàn thắng

Hệ thống phải hỗ trợ theo dõi bàn thắng của Player qua nhiều Match.

Khi Player ghi thêm bàn thắng, tổng số bàn thắng của Player phải được
cập nhật.

Ví dụ tổng quát:

`Goals in Match 1 + Goals in Match 2 + ... = Player Total Goals`

Kết quả Top Scorer phải được cập nhật dựa trên tổng số bàn thắng mới.

---

### 7.6.4 Quy tắc xác định Top Scorer

Player có số bàn thắng cao nhất được xác định là:

**Top Scorer.**

Hệ thống phải so sánh số bàn thắng của các Player để xác định giá trị
cao nhất.

Top Scorer phải được cập nhật khi có Player khác đạt số bàn thắng cao
hơn.

---

### 7.6.5 Quy tắc đồng hạng Top Scorer

Hệ thống phải hỗ trợ trường hợp nhiều Player có cùng số bàn thắng cao
nhất.

Khi đó, các Player có cùng số bàn thắng cao nhất được xác định là:

**Shared Top Scorers.**

Không Player nào trong nhóm đồng hạng được xác định là thấp hơn các
Player còn lại nếu số bàn thắng bằng nhau.

---

### 7.6.6 Quy tắc khi chưa có bàn thắng

Khi chưa có Player nào ghi bàn, hệ thống phải trả về trạng thái:

**No Top Scorer.**

Hệ thống không được xác định một Player bất kỳ là Top Scorer khi chưa
có dữ liệu bàn thắng.

---

### 7.6.7 Quy tắc xác định Shared Top Scorer

Hệ thống phải có khả năng xác định một Player có phải là Shared Top
Scorer hay không.

Một Player được xem là Shared Top Scorer khi:

- Player có số bàn thắng cao nhất.
- Có ít nhất một Player khác có cùng số bàn thắng cao nhất.

---

### 7.6.8 Quy tắc cập nhật Top Scorer

Khi một Player ghi thêm bàn thắng, hệ thống phải cập nhật kết quả
Top Scorer.

Các trường hợp có thể xảy ra:

- Player hiện tại tiếp tục giữ vị trí Top Scorer.
- Player khác vượt qua số bàn thắng cao nhất.
- Một hoặc nhiều Player trở thành Shared Top Scorers.

Kết quả phải phản ánh dữ liệu bàn thắng mới nhất.

---

### 7.6.9 Quan hệ với Player

Top Scorer Management sử dụng Player làm đối tượng chính.

Quan hệ tổng quát:

`Player → Goals → Total Goals → Top Scorer`

Dữ liệu Player được sử dụng để xác định Player tương ứng với số bàn
thắng được ghi nhận.

---

### 7.6.10 Quan hệ với Match

Bàn thắng được ghi nhận trong quá trình xử lý Match.

Do đó, Top Scorer Management có quan hệ với Match thông qua dữ liệu
bàn thắng.

Luồng tổng quát:

`Match → Player Goals → Top Scorer Calculation`

---

### 7.6.11 Kiểm thử quy tắc Top Scorer

Các quy tắc Top Scorer được kiểm chứng thông qua:

`TopScorerTest.java`

Các nội dung chính:

- Ghi nhận bàn thắng.
- Theo dõi bàn thắng qua nhiều Match.
- Xác định Player có số bàn thắng cao nhất.
- Trường hợp không có bàn thắng.
- Trường hợp nhiều Player đồng hạng.
- Xác định Shared Top Scorer.
- Cập nhật kết quả sau khi có thêm bàn thắng.

---

### 7.6.12 Kỹ thuật kiểm thử

Các quy tắc Top Scorer được kiểm chứng bằng:

- Unit Testing.
- Functional Testing.
- Decision-based Testing.
- Regression Testing.

Decision-based Testing được sử dụng để kiểm tra các trường hợp:

- Không có bàn thắng.
- Một Player có số bàn thắng cao nhất.
- Nhiều Player có cùng số bàn thắng cao nhất.
- Player khác vượt qua Top Scorer hiện tại.
- Kết quả thay đổi sau khi ghi thêm bàn thắng.

---

### 7.6.13 Tiêu chí hoàn thành

Quy tắc Top Scorer được xem là đáp ứng khi:

- Bàn thắng của Player có thể được ghi nhận.
- Bàn thắng qua nhiều Match được cộng dồn.
- Player có số bàn thắng cao nhất được xác định.
- Trường hợp không có bàn thắng trả về No Top Scorer.
- Nhiều Player đồng hạng được hỗ trợ.
- Shared Top Scorer được xác định đúng.
- Top Scorer được cập nhật khi có thêm bàn thắng.
- Các test case liên quan thực thi thành công.

---

### 7.6.14 Traceability

Các quy tắc Top Scorer được ánh xạ tới:

| Thành phần | Ánh xạ |
|---|---|
| Functional Requirement | FR-07 — Top Scorer Management |
| Related Requirement | FR-02 — Player Management |
| Related Requirement | FR-03 — Match Management |
| Unit Test | `TopScorerTest.java` |

Quan hệ tổng quát:

`Player + Match Goals → Top Scorer Management → Top Scorer Result`

---

### 7.6.15 Trạng thái

**Status: Covered**

Các quy tắc Top Scorer được kiểm chứng bằng
`TopScorerTest.java`.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 7.6.16 Kết luận

Top Scorer Management quản lý số bàn thắng của Player, cộng dồn bàn
thắng qua nhiều Match và xác định Player có số bàn thắng cao nhất.

Hệ thống hỗ trợ trường hợp không có bàn thắng, một Top Scorer và nhiều
Player đồng hạng Top Scorer, đồng thời cập nhật kết quả khi dữ liệu bàn
thắng thay đổi.

**7.6 — Quy tắc Top Scorer: Covered.**

## 8. Phạm vi kiểm thử

## 8.1 Unit Testing

### 8.1.1 Mục đích

Unit Testing được sử dụng để kiểm tra các thành phần và quy tắc nghiệp
vụ của World Cup Test Application ở mức đơn vị.

Mục tiêu là xác minh từng chức năng hoặc hành vi cụ thể của hệ thống
theo các yêu cầu đã được đặc tả.

---

### 8.1.2 Phạm vi Unit Testing

Unit Testing tập trung vào các thành phần nghiệp vụ chính:

- Team Management.
- Player Management.
- Match Management.
- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Top Scorer Management.
- Database Management.

Web Application được kiểm thử ở mức giao diện bằng Selenium WebDriver.

---

### 8.1.3 Framework kiểm thử

Project sử dụng:

**JUnit 5**

để xây dựng và thực thi các unit test.

JUnit 5 được tích hợp vào quá trình automated test execution thông qua
Maven.

Luồng tổng quát:

`Java Source Code → JUnit 5 Tests → Maven → Test Execution → Test Results`

---

### 8.1.4 Các Test Suite

Các test suite chính được sử dụng cho Unit Testing gồm:

| Test Suite | Phạm vi kiểm thử |
|---|---|
| `TeamTest.java` | Team Management |
| `PlayerTest.java` | Player Management |
| `MatchTest.java` | Match Management |
| `GroupStageTest.java` | Group Stage Management |
| `KnockoutStageTest.java` | Knockout Stage Management |
| `TournamentTest.java` | Tournament Management |
| `TopScorerTest.java` | Top Scorer Management |
| `DatabaseTest.java` | Database Management |

---

### 8.1.5 Team Unit Testing

`TeamTest.java` được sử dụng để kiểm tra các quy tắc liên quan đến
Team.

Phạm vi gồm:

- Assistant Coach.
- Số lượng Player.
- Starting Player.
- Substitute Player.
- Các giá trị hợp lệ.
- Các giá trị không hợp lệ.
- Các giới hạn số lượng.

---

### 8.1.6 Player Unit Testing

`PlayerTest.java` được sử dụng để kiểm tra chức năng Player.

Phạm vi gồm:

- Tạo Player.
- Lưu tên Player.
- Truy xuất tên Player.

---

### 8.1.7 Match Unit Testing

`MatchTest.java` được sử dụng để kiểm tra các quy tắc Match.

Phạm vi gồm:

- Match Duration.
- Half Duration.
- Half-time Break.
- Extra-time.
- Silver Goal.
- Penalty Kicks.
- Sudden Death.
- Yellow Cards.
- Red Cards.
- Minimum Players.
- Substitutions.
- Player Position.

---

### 8.1.8 Group Stage Unit Testing

`GroupStageTest.java` được sử dụng để kiểm tra các quy tắc Group Stage.

Phạm vi gồm:

- Số lượng Team.
- Số lượng Team trong Group.
- Số đối thủ.
- Điểm thắng.
- Điểm hòa.
- Điểm thua.
- Goal Difference.
- Cards.
- Head-to-head Result.
- Draw Lot.
- Qualification.

---

### 8.1.9 Knockout Stage Unit Testing

`KnockoutStageTest.java` được sử dụng để kiểm tra các quy tắc Knockout
Stage.

Phạm vi gồm:

- Round of 16.
- Quarterfinals.
- Semifinals.
- Final.
- Team progression.
- Tournament Champion.
- Medal assignment.

---

### 8.1.10 Tournament Unit Testing

`TournamentTest.java` được sử dụng để kiểm tra quá trình quản lý
Tournament.

Phạm vi gồm:

- Khởi tạo 32 Teams.
- Tạo Groups.
- Group Stage.
- Qualification.
- Round of 16.
- Knockout Stage.
- Tournament Champion.
- Match Results.
- Tournament Results.

---

### 8.1.11 Top Scorer Unit Testing

`TopScorerTest.java` được sử dụng để kiểm tra Top Scorer Management.

Phạm vi gồm:

- Ghi nhận bàn thắng.
- Cộng dồn bàn thắng.
- Xác định Top Scorer.
- Không có Top Scorer.
- Shared Top Scorer.
- Cập nhật Top Scorer.

---

### 8.1.12 Database Unit Testing

`DatabaseTest.java` được sử dụng để kiểm tra các thao tác với dữ liệu.

Phạm vi gồm:

- Lưu Team.
- Truy xuất Team.
- Lưu Group.
- Truy xuất Group.
- Lưu Match.
- Truy xuất Match.
- Lưu Player.
- Truy xuất Player.
- Lưu Match Result.
- Truy xuất Match Result.
- Nhiều bản ghi.
- Bản ghi không tồn tại.

---

### 8.1.13 Kỹ thuật kiểm thử

Unit Testing áp dụng các kỹ thuật:

- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Negative Testing.
- Regression Testing.

Các kỹ thuật được áp dụng tùy theo đặc điểm của từng chức năng.

---

### 8.1.14 Automated Execution

Unit tests được thực thi tự động thông qua Maven.

Luồng thực thi:

`JUnit 5 Test Suite → Maven Test Execution → Test Result`

Việc thực thi tự động giúp các test có thể được chạy lại sau khi source
code thay đổi.

---

### 8.1.15 Kết quả kiểm thử

Automated test suite hiện tại có:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Kết quả này thể hiện trạng thái của automated test suite tại thời
điểm kiểm thử được ghi nhận trong project.

---

### 8.1.16 Tiêu chí hoàn thành

Unit Testing được xem là đáp ứng khi:

- Các test suite có thể được thực thi.
- Các chức năng nghiệp vụ chính được kiểm thử.
- Các trường hợp hợp lệ được kiểm thử.
- Các trường hợp không hợp lệ được kiểm thử.
- Các giá trị biên quan trọng được kiểm thử.
- Các điều kiện quyết định được kiểm thử.
- Test results được tạo.
- Automated test execution không có Failed hoặc Error.

---

### 8.1.17 Traceability

Unit Testing được ánh xạ tới các Functional Requirements:

| Functional Requirement | Test Suite |
|---|---|
| FR-01 — Team Management | `TeamTest.java` |
| FR-02 — Player Management | `PlayerTest.java` |
| FR-03 — Match Management | `MatchTest.java` |
| FR-04 — Group Stage Management | `GroupStageTest.java` |
| FR-05 — Knockout Stage Management | `KnockoutStageTest.java` |
| FR-06 — Tournament Management | `TournamentTest.java` |
| FR-07 — Top Scorer Management | `TopScorerTest.java` |
| FR-08 — Database Management | `DatabaseTest.java` |

---

### 8.1.18 Trạng thái

**Status: Covered**

Unit Testing được triển khai bằng JUnit 5 và được thực thi tự động
thông qua Maven.

Kết quả hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

---

### 8.1.19 Kết luận

Unit Testing là thành phần chính trong phạm vi kiểm thử của
World Cup Test Application.

JUnit 5 được sử dụng để kiểm chứng các chức năng nghiệp vụ, các quy
tắc xử lý, các giá trị biên và các trường hợp không hợp lệ của hệ
thống.

**8.1 — Unit Testing: Covered.**

## 8.2 Functional Testing

### 8.2.1 Mục đích

Functional Testing được sử dụng để xác minh hệ thống thực hiện đúng
các chức năng được đặc tả trong Functional Requirements.

Mục tiêu là kiểm tra hành vi thực tế của hệ thống so với yêu cầu
nghiệp vụ đã được xác định trong SRS và FRS.

---

### 8.2.2 Phạm vi Functional Testing

Functional Testing bao phủ các nhóm chức năng chính:

- Team Management.
- Player Management.
- Match Management.
- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Top Scorer Management.
- Database Management.
- Web Application.
- Automated Testing.

Các chức năng được kiểm thử bằng unit test hoặc Selenium Web UI test
tùy theo đặc điểm của từng chức năng.

---

### 8.2.3 Functional Testing cho Team

Team Management được kiểm tra thông qua:

`TeamTest.java`

Các chức năng được kiểm tra gồm:

- Quản lý Team information.
- Quản lý Assistant Coaches.
- Quản lý Players.
- Quản lý Starting Players.
- Quản lý Substitute Players.
- Kiểm tra các giới hạn số lượng.

---

### 8.2.4 Functional Testing cho Player

Player Management được kiểm tra thông qua:

`PlayerTest.java`

Các chức năng được kiểm tra gồm:

- Tạo Player.
- Thiết lập Player name.
- Truy xuất Player name.

---

### 8.2.5 Functional Testing cho Match

Match Management được kiểm tra thông qua:

`MatchTest.java`

Các chức năng được kiểm tra gồm:

- Match Duration.
- Half Duration.
- Half-time Break.
- Extra-time.
- Silver Goal.
- Penalty Kicks.
- Sudden Death.
- Yellow Cards.
- Red Cards.
- Minimum Players.
- Substitutions.
- Player Position.

---

### 8.2.6 Functional Testing cho Group Stage

Group Stage Management được kiểm tra thông qua:

`GroupStageTest.java`

Các chức năng được kiểm tra gồm:

- Tournament size.
- Group size.
- Số đối thủ của Team.
- Point calculation.
- Ranking.
- Cards weighting.
- Head-to-head.
- Qualification.

---

### 8.2.7 Functional Testing cho Knockout Stage

Knockout Stage Management được kiểm tra thông qua:

`KnockoutStageTest.java`

Các chức năng được kiểm tra gồm:

- Round of 16.
- Quarterfinals.
- Semifinals.
- Final.
- Team progression.
- Tournament Champion.
- Medal assignment.

---

### 8.2.8 Functional Testing cho Tournament

Tournament Management được kiểm tra thông qua:

`TournamentTest.java`

Các chức năng được kiểm tra gồm:

- Khởi tạo 32 Teams.
- Tạo 8 Groups.
- Thực hiện Group Stage.
- Xác định 16 Qualified Teams.
- Chuẩn bị Round of 16.
- Thực hiện Knockout Stage.
- Xác định Tournament Champion.
- Lưu Match Results.
- Export Tournament Results.

---

### 8.2.9 Functional Testing cho Top Scorer

Top Scorer Management được kiểm tra thông qua:

`TopScorerTest.java`

Các chức năng được kiểm tra gồm:

- Ghi nhận Goals.
- Cộng dồn Goals.
- Xác định Top Scorer.
- Xử lý trường hợp không có Goals.
- Shared Top Scorer.
- Cập nhật Top Scorer.

---

### 8.2.10 Functional Testing cho Database

Database Management được kiểm tra thông qua:

`DatabaseTest.java`

Các chức năng được kiểm tra gồm:

- Store Team.
- Retrieve Team.
- Store Group.
- Retrieve Group.
- Store Match.
- Retrieve Match.
- Store Player.
- Retrieve Player.
- Store Match Result.
- Retrieve Match Result.
- Multiple records.
- Non-existing record.

---

### 8.2.11 Functional Testing cho Web Application

Web Application được kiểm tra bằng Selenium WebDriver thông qua:

`MatchWebTest.java`

Các chức năng được kiểm tra gồm:

- Homepage.
- Match Duration input.
- Valid Match Duration.
- Invalid Match Duration.
- Empty input.
- Non-numeric input.
- Validation message.

Các Web UI test case gồm:

| Test Case | Chức năng |
|---|---|
| TC_WEB_001 | Valid 90-minute match |
| TC_WEB_002 | Invalid 89-minute match |
| TC_WEB_003 | Invalid 91-minute match |
| TC_WEB_004 | Homepage UI verification |
| TC_WEB_005 | Empty match-duration input |
| TC_WEB_006 | Invalid non-numeric input |

---

### 8.2.12 Functional Testing cho Automated Testing

FR-10 được kiểm chứng thông qua toàn bộ automated testing
infrastructure của project.

Các thành phần gồm:

- JUnit 5.
- Selenium WebDriver.
- Maven.
- Allure Report.

Mục tiêu là xác minh automated test suite có thể được thực thi và tạo
ra test execution evidence.

---

### 8.2.13 Phương pháp thực hiện

Functional Testing được thực hiện theo quy trình:

1. Xác định Functional Requirement.
2. Xác định expected behavior.
3. Chuẩn bị test input.
4. Thực thi chức năng.
5. Thu thập actual result.
6. So sánh actual result với expected result.
7. Xác định Pass hoặc Fail.

---

### 8.2.14 Positive Testing

Positive Testing kiểm tra các trường hợp input và điều kiện hợp lệ.

Ví dụ:

- Team có số lượng Player hợp lệ.
- Player được tạo với tên hợp lệ.
- Match Duration bằng 90 phút.
- Win được tính 3 điểm.
- Draw được tính 1 điểm.
- Qualified Team được đưa vào Knockout Stage.
- Player có Goals được xác định là Top Scorer.

---

### 8.2.15 Negative Testing

Negative Testing kiểm tra các trường hợp không hợp lệ.

Ví dụ:

- Team vượt quá giới hạn Assistant Coaches.
- Team có số lượng Player ngoài giới hạn.
- Starting Players ngoài giới hạn.
- Substitute Players ngoài giới hạn.
- Match Duration không hợp lệ.
- Không đủ Player trên sân.
- Quá số lần thay người.
- Database record không tồn tại.
- Web input không phải số.

---

### 8.2.16 Kỹ thuật kiểm thử

Functional Testing sử dụng kết hợp:

- Positive Testing.
- Negative Testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Unit Testing.
- Selenium Web UI Testing.
- Database Testing.

Các kỹ thuật được áp dụng tùy theo yêu cầu của từng chức năng.

---

### 8.2.17 Automated Execution

Functional Tests được thực thi tự động thông qua:

`Maven → JUnit 5 / Selenium → Test Results`

Kết quả execution được sử dụng cho test reporting bằng Allure.

---

### 8.2.18 Kết quả kiểm thử

Automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Selenium Web UI suite:

| Metric | Result |
|---|---:|
| Total Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 8.2.19 Traceability

Functional Testing được ánh xạ tới các Functional Requirements:

| Functional Requirement | Main Test Suite |
|---|---|
| FR-01 — Team Management | `TeamTest.java` |
| FR-02 — Player Management | `PlayerTest.java` |
| FR-03 — Match Management | `MatchTest.java` |
| FR-04 — Group Stage Management | `GroupStageTest.java` |
| FR-05 — Knockout Stage Management | `KnockoutStageTest.java` |
| FR-06 — Tournament Management | `TournamentTest.java` |
| FR-07 — Top Scorer Management | `TopScorerTest.java` |
| FR-08 — Database Management | `DatabaseTest.java` |
| FR-09 — Web Application | `MatchWebTest.java` |
| FR-10 — Automated Testing | JUnit 5 / Selenium / Maven / Allure |

---

### 8.2.20 Tiêu chí hoàn thành

Functional Testing được xem là đáp ứng khi:

- Các Functional Requirements có test coverage tương ứng.
- Các chức năng hợp lệ được kiểm tra.
- Các trường hợp không hợp lệ được kiểm tra.
- Expected result được xác định.
- Actual result được xác định.
- Test results được ghi nhận.
- Automated test execution hoàn thành.
- Không có Failed hoặc Error trong kết quả kiểm thử hiện tại.

---

### 8.2.21 Trạng thái

**Status: Covered**

Functional Testing được triển khai thông qua JUnit 5, Selenium
WebDriver và Database Testing.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

Selenium Web UI:

**6 / 6 test cases passed — 100% pass rate.**

---

### 8.2.22 Kết luận

Functional Testing xác minh các chức năng của
World Cup Test Application theo các Functional Requirements.

Phạm vi kiểm thử bao gồm business logic, database operations,
Tournament processing và Web Application.

Các chức năng được kiểm chứng thông qua JUnit 5 và Selenium WebDriver,
với Maven hỗ trợ automated execution và Allure hỗ trợ reporting.

**8.2 — Functional Testing: Covered.**

## 8.3 Boundary Value Analysis

### 8.3.1 Mục đích

Boundary Value Analysis (BVA) được sử dụng để kiểm tra hành vi của
World Cup Test Application tại các giá trị biên của các quy tắc nghiệp
vụ.

Kỹ thuật này tập trung vào:

- Giá trị nhỏ nhất hợp lệ.
- Giá trị lớn nhất hợp lệ.
- Giá trị ngay bên ngoài giới hạn.
- Các giá trị đại diện xung quanh boundary.

---

### 8.3.2 Phạm vi áp dụng

BVA được áp dụng cho các yêu cầu có giới hạn về số lượng hoặc giá trị.

Các nhóm chức năng chính gồm:

- Team Management.
- Match Management.
- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Web Application.

---

### 8.3.3 Boundary của Team

Các giới hạn chính của Team gồm:

| Quy tắc | Boundary hợp lệ | Giá trị ngoài biên |
|---|---|---|
| Assistant Coaches | 0 đến 3 | > 3 |
| Players | 21 đến 22 | < 21 hoặc > 22 |
| Starting Players | 7 đến 11 | < 7 hoặc > 11 |
| Substitute Players | 4 đến 5 | < 4 hoặc > 5 |

Các test case phải xác minh rằng hệ thống chấp nhận các giá trị nằm
trong giới hạn và xử lý đúng các giá trị nằm ngoài giới hạn.

---

### 8.3.4 Boundary của Match

Các giới hạn chính của Match gồm:

| Quy tắc | Giá trị / giới hạn |
|---|---:|
| Match Duration | 90 phút |
| Half Duration | 45 phút |
| Half-time Break | Không quá 15 phút |
| Extra-time Halves | 0 đến 2 |
| Extra-time Half | 30 phút |
| Minimum Players on Field | 7 |
| Maximum Substitution Events | 3 |
| Players per Substitution Event | 1 đến 3 |

Các giá trị tại và xung quanh boundary được sử dụng để kiểm tra
business rules.

---

### 8.3.5 Boundary của Group Stage

Các giới hạn chính của Group Stage gồm:

| Quy tắc | Giá trị |
|---|---:|
| Total Teams | 32 |
| Total Groups | 8 |
| Teams per Group | 4 |
| Opponents per Team | 3 |
| Qualified Teams per Group | 2 |
| Total Qualified Teams | 16 |

BVA được sử dụng để kiểm tra các giới hạn liên quan đến cấu trúc
Tournament và Group Stage.

---

### 8.3.6 Boundary của Knockout Stage

Các giới hạn về số lượng Team và Match trong Knockout Stage:

| Giai đoạn | Teams | Matches |
|---|---:|---:|
| Round of 16 | 16 | 8 |
| Quarterfinals | 8 | 4 |
| Semifinals | 4 | 2 |
| Final | 2 | 1 |
| Champion | 1 | - |

Các giá trị này được sử dụng để xác minh rằng số lượng Team giảm đúng
sau mỗi vòng.

---

### 8.3.7 Boundary của Web Application

Web Application kiểm tra Match Duration với giá trị hợp lệ:

**90 phút.**

Các test case Selenium sử dụng:

- `89` — giá trị ngay trước boundary hợp lệ.
- `90` — giá trị hợp lệ.
- `91` — giá trị ngay sau boundary hợp lệ.

Các test case tương ứng:

| Test Case | Input | Expected |
|---|---:|---|
| TC_WEB_002 | 89 | Invalid |
| TC_WEB_001 | 90 | Valid |
| TC_WEB_003 | 91 | Invalid |

Đây là nhóm test BVA trực tiếp trên Web UI.

---

### 8.3.8 Boundary Testing cho Empty Input

Ngoài giá trị số, Web Application cũng kiểm tra trường hợp không có
giá trị đầu vào.

Test case:

`TC_WEB_005 — Empty match-duration input`

Test case này xác minh browser validation khi Match Duration bị bỏ
trống.

---

### 8.3.9 Boundary Testing cho Invalid Input

Web Application cũng kiểm tra dữ liệu không phải số.

Test case:

`TC_WEB_006 — Invalid non-numeric input`

Test case này xác minh hệ thống xử lý dữ liệu nằm ngoài miền input
được hỗ trợ.

Thông báo validation yêu cầu:

`INVALID: Minutes must be a number.`

---

### 8.3.10 Phương pháp thực hiện

Quy trình Boundary Value Analysis:

1. Xác định requirement có boundary.
2. Xác định giá trị tối thiểu.
3. Xác định giá trị tối đa.
4. Xác định giá trị ngay bên ngoài boundary.
5. Tạo test case.
6. Thực thi test case.
7. So sánh actual result với expected result.
8. Ghi nhận Pass hoặc Fail.

---

### 8.3.11 Boundary Value Analysis và JUnit 5

BVA được áp dụng trong các unit test của project.

Các test suite liên quan gồm:

- `TeamTest.java`
- `MatchTest.java`
- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `TournamentTest.java`

Các test này kiểm tra các giới hạn được định nghĩa trong business
logic.

---

### 8.3.12 Boundary Value Analysis và Selenium

Selenium WebDriver được sử dụng để kiểm tra boundary của
Match Duration trên Web Application.

Test suite:

`MatchWebTest.java`

Các test case:

- `TC_WEB_001`
- `TC_WEB_002`
- `TC_WEB_003`
- `TC_WEB_005`
- `TC_WEB_006`

Trong đó `TC_WEB_001`, `TC_WEB_002` và `TC_WEB_003` trực tiếp kiểm tra
giá trị xung quanh boundary 90 phút.

---

### 8.3.13 Kết quả kiểm thử

Automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Selenium Web UI suite:

| Metric | Result |
|---|---:|
| Total Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 8.3.14 Traceability

Boundary Value Analysis được ánh xạ tới:

| Requirement | Boundary chính | Test Suite |
|---|---|---|
| FR-01 — Team Management | Team limits | `TeamTest.java` |
| FR-03 — Match Management | Match rules | `MatchTest.java` |
| FR-04 — Group Stage Management | Group limits | `GroupStageTest.java` |
| FR-05 — Knockout Stage Management | Stage limits | `KnockoutStageTest.java` |
| FR-06 — Tournament Management | Tournament limits | `TournamentTest.java` |
| FR-09 — Web Application | Match Duration | `MatchWebTest.java` |

---

### 8.3.15 Tiêu chí hoàn thành

Boundary Value Analysis được xem là đáp ứng khi:

- Các boundary quan trọng được xác định.
- Giá trị tại boundary được kiểm tra.
- Giá trị ngoài boundary được kiểm tra.
- Expected result được xác định.
- Actual result được xác định.
- Các boundary test được thực thi tự động.
- Không có Failed hoặc Error trong kết quả kiểm thử hiện tại.

---

### 8.3.16 Trạng thái

**Status: Covered**

Boundary Value Analysis được sử dụng trong các unit test và Selenium
Web UI test của project.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

Selenium Web UI:

**6 / 6 test cases passed — 100% pass rate.**

---

### 8.3.17 Kết luận

Boundary Value Analysis giúp kiểm tra các giới hạn quan trọng của
World Cup Test Application, đặc biệt đối với Team, Match, Group Stage,
Knockout Stage, Tournament và Web Application.

Các giá trị biên được kiểm tra thông qua JUnit 5 và Selenium WebDriver,
giúp xác minh hệ thống xử lý đúng cả giá trị hợp lệ và giá trị nằm
ngoài giới hạn.

**8.3 — Boundary Value Analysis: Covered.**

## 8.4 Decision-based Testing

### 8.4.1 Mục đích

Decision-based Testing được sử dụng để kiểm tra các chức năng có nhiều
điều kiện và kết quả xử lý khác nhau trong World Cup Test Application.

Mục tiêu là xác minh rằng hệ thống đưa ra kết quả đúng khi các điều
kiện đầu vào thay đổi.

---

### 8.4.2 Phạm vi áp dụng

Decision-based Testing được áp dụng cho các nhóm chức năng:

- Team Management.
- Match Management.
- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Top Scorer Management.
- Database Management.
- Web Application.

---

### 8.4.3 Decision-based Testing cho Team

Team Management có các quyết định dựa trên giới hạn số lượng.

Các điều kiện được kiểm tra gồm:

- Assistant Coach có nằm trong giới hạn hay không.
- Số lượng Player có hợp lệ hay không.
- Số lượng Starting Player có hợp lệ hay không.
- Số lượng Substitute Player có hợp lệ hay không.

Kết quả xử lý phụ thuộc vào việc điều kiện tương ứng được thỏa mãn
hay không.

Test suite:

`TeamTest.java`

---

### 8.4.4 Decision-based Testing cho Match

Match Management có nhiều điều kiện quyết định kết quả của Match.

Các điều kiện gồm:

- Match Duration.
- Extra-time.
- Silver Goal.
- Penalty Kicks.
- Sudden Death.
- Yellow Cards.
- Red Cards.
- Minimum Players.
- Number of Substitutions.
- Players per Substitution Event.

Kết quả của Match phụ thuộc vào các điều kiện được kiểm tra.

Test suite:

`MatchTest.java`

---

### 8.4.5 Decision-based Testing cho Group Stage

Group Stage sử dụng nhiều tiêu chí để đưa ra quyết định xếp hạng.

Thứ tự quyết định:

1. Points.
2. Goal Difference.
3. Cards.
4. Head-to-head Result.
5. Draw Lot.

Hệ thống phải chuyển sang tiêu chí tiếp theo khi tiêu chí trước đó
không đủ để xác định thứ hạng.

Decision-based Testing được sử dụng để kiểm tra các trường hợp này.

Test suite:

`GroupStageTest.java`

---

### 8.4.6 Decision-based Testing cho Qualification

Sau khi xếp hạng Group Stage, hệ thống phải đưa ra quyết định
Qualification.

Điều kiện chính:

- Team đứng thứ nhất → Qualified.
- Team đứng thứ hai → Qualified.
- Team đứng dưới thứ hai → Không Qualified.

Kết quả Qualification được sử dụng để tạo danh sách 16 Teams cho
Round of 16.

Test suite:

`GroupStageTest.java`

---

### 8.4.7 Decision-based Testing cho Knockout Stage

Knockout Stage sử dụng kết quả Match để quyết định Team tiếp tục hay
bị loại.

Các quyết định gồm:

- Round-of-16 Winner.
- Quarterfinal Winner.
- Semifinal Winner.
- Final Winner.

Luồng quyết định:

`Match Result → Winner → Next Stage`

Test suite:

`KnockoutStageTest.java`

---

### 8.4.8 Decision-based Testing cho Tournament

Tournament sử dụng kết quả của từng giai đoạn để quyết định bước tiếp
theo.

Các quyết định chính:

- Đủ 32 Teams để khởi tạo Tournament.
- Tạo 8 Groups.
- Xác định 16 Qualified Teams.
- Chuyển Teams vào Round of 16.
- Xác định Winners qua từng vòng.
- Xác định Finalists.
- Xác định Tournament Champion.

Luồng tổng quát:

`Condition → Decision → Tournament Progression`

Test suite:

`TournamentTest.java`

---

### 8.4.9 Decision-based Testing cho Top Scorer

Top Scorer Management có các quyết định dựa trên số bàn thắng.

Các trường hợp gồm:

- Không có Goals → No Top Scorer.
- Một Player có số Goals cao nhất → Top Scorer.
- Nhiều Players có cùng số Goals cao nhất → Shared Top Scorers.
- Player khác vượt qua số Goals cao nhất → Top Scorer được cập nhật.

Test suite:

`TopScorerTest.java`

---

### 8.4.10 Decision-based Testing cho Database

Database Management có các quyết định dựa trên trạng thái của bản ghi.

Các trường hợp gồm:

- Record tồn tại → Trả về dữ liệu.
- Record không tồn tại → Trả về trạng thái không có dữ liệu.
- Có nhiều Records → Hỗ trợ truy xuất các Records tương ứng.

Test suite:

`DatabaseTest.java`

---

### 8.4.11 Decision-based Testing cho Web Application

Web Application đưa ra kết quả validation dựa trên giá trị người dùng
nhập.

Các trường hợp chính:

| Input | Decision | Expected Result |
|---|---|---|
| 90 | Valid duration | Valid |
| 89 | Invalid duration | Invalid |
| 91 | Invalid duration | Invalid |
| Empty | Empty input | Browser validation |
| Non-numeric | Invalid data type | Validation message |

Thông báo đối với dữ liệu không phải số:

`INVALID: Minutes must be a number.`

Test suite:

`MatchWebTest.java`

---

### 8.4.12 Decision Table

Các quyết định chính của hệ thống có thể được tổng hợp:

| Chức năng | Điều kiện | Kết quả |
|---|---|---|
| Team | Trong giới hạn | Hợp lệ |
| Team | Ngoài giới hạn | Không hợp lệ |
| Match | Duration = 90 | Valid |
| Match | Duration khác 90 | Invalid |
| Group | Win | 3 điểm |
| Group | Draw | 1 điểm |
| Group | Loss | 0 điểm |
| Qualification | Rank 1 hoặc 2 | Qualified |
| Qualification | Rank > 2 | Not Qualified |
| Top Scorer | Không có Goals | No Top Scorer |
| Top Scorer | Goals cao nhất | Top Scorer |
| Top Scorer | Cùng Goals cao nhất | Shared Top Scorers |
| Database | Record tồn tại | Trả về dữ liệu |
| Database | Record không tồn tại | No data |
| Web | Input là số hợp lệ | Validation result |
| Web | Input không phải số | Error message |

---

### 8.4.13 Kỹ thuật kiểm thử

Decision-based Testing được thực hiện kết hợp với:

- Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Database Testing.
- Selenium Web UI Testing.

Các kỹ thuật được kết hợp để kiểm tra cả điều kiện đầu vào và kết quả
được quyết định bởi hệ thống.

---

### 8.4.14 Automated Execution

Decision-based Tests được thực thi thông qua automated test suite.

Luồng tổng quát:

`Input Conditions → Business Logic → Decision → Actual Result`

Các test suite được thực thi thông qua Maven.

Kết quả execution được sử dụng cho test reporting bằng Allure.

---

### 8.4.15 Kết quả kiểm thử

Automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Selenium Web UI suite:

| Metric | Result |
|---|---:|
| Total Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 8.4.16 Traceability

Decision-based Testing được ánh xạ tới:

| Requirement | Decision Area | Test Suite |
|---|---|---|
| FR-01 — Team Management | Team validation | `TeamTest.java` |
| FR-03 — Match Management | Match rules | `MatchTest.java` |
| FR-04 — Group Stage Management | Ranking / Qualification | `GroupStageTest.java` |
| FR-05 — Knockout Stage Management | Winner progression | `KnockoutStageTest.java` |
| FR-06 — Tournament Management | Tournament progression | `TournamentTest.java` |
| FR-07 — Top Scorer Management | Top scorer determination | `TopScorerTest.java` |
| FR-08 — Database Management | Record handling | `DatabaseTest.java` |
| FR-09 — Web Application | Input validation | `MatchWebTest.java` |

---

### 8.4.17 Tiêu chí hoàn thành

Decision-based Testing được xem là đáp ứng khi:

- Các điều kiện quyết định quan trọng được xác định.
- Các nhánh xử lý chính được kiểm tra.
- Expected result được xác định cho từng điều kiện.
- Actual result được xác định.
- Các decision-based test được thực thi tự động.
- Không có Failed hoặc Error trong kết quả kiểm thử hiện tại.

---

### 8.4.18 Trạng thái

**Status: Covered**

Decision-based Testing được áp dụng trong các unit test, functional
test, database test và Selenium Web UI test của project.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

Selenium Web UI:

**6 / 6 test cases passed — 100% pass rate.**

---

### 8.4.19 Kết luận

Decision-based Testing giúp xác minh các quyết định được đưa ra bởi
business logic và Web Application dựa trên các điều kiện đầu vào.

Kỹ thuật này được áp dụng cho Team, Match, Group Stage, Knockout
Stage, Tournament, Top Scorer, Database và Web Application.

**8.4 — Decision-based Testing: Covered.**

## 8.5 Selenium Web UI Testing

### 8.5.1 Mục đích

Selenium Web UI Testing được sử dụng để kiểm tra Web Application từ
góc nhìn tương tác của người sử dụng.

Mục tiêu là xác minh giao diện Web có thể nhận dữ liệu đầu vào, xử lý
validation và hiển thị kết quả phù hợp với yêu cầu của hệ thống.

---

### 8.5.2 Phạm vi kiểm thử

Selenium Web UI Testing tập trung vào chức năng kiểm tra Match
Duration của Web Application.

Phạm vi gồm:

- Homepage.
- Match Duration input.
- Valid input.
- Invalid input.
- Empty input.
- Non-numeric input.
- Validation result.
- Validation message.

---

### 8.5.3 Công cụ kiểm thử

Project sử dụng:

**Selenium WebDriver**

để tự động hóa thao tác trên trình duyệt.

Test được viết bằng Java và được thực thi trong automated testing
process của project.

Test suite chính:

`MatchWebTest.java`

---

### 8.5.4 Homepage Testing

Selenium mở Web Application và kiểm tra homepage.

Mục tiêu:

- Web Application có thể được mở.
- Homepage hiển thị đúng.
- Các thành phần cần thiết cho chức năng Match Duration tồn tại.
- Người dùng có thể thực hiện thao tác kiểm tra.

Test case:

`TC_WEB_004 — Homepage UI verification`

---

### 8.5.5 Valid Input Testing

Selenium kiểm tra trường hợp Match Duration hợp lệ.

Input:

`90`

Expected result:

**Valid**

Test case:

`TC_WEB_001 — Valid 90-minute match`

---

### 8.5.6 Invalid Input Testing

Selenium kiểm tra các giá trị Match Duration không hợp lệ.

Các input:

- `89`
- `91`

Expected result:

**Invalid**

Test cases:

- `TC_WEB_002 — Invalid 89-minute match`
- `TC_WEB_003 — Invalid 91-minute match`

---

### 8.5.7 Empty Input Testing

Selenium kiểm tra trường hợp Match Duration không được nhập.

Input:

**Empty**

Expected behavior:

Browser validation được kích hoạt đối với trường dữ liệu bắt buộc.

Test case:

`TC_WEB_005 — Empty match-duration input`

---

### 8.5.8 Non-numeric Input Testing

Selenium kiểm tra trường hợp người dùng nhập dữ liệu không phải số.

Expected validation message:

`INVALID: Minutes must be a number.`

Test case:

`TC_WEB_006 — Invalid non-numeric input`

---

### 8.5.9 Test Case Matrix

Toàn bộ Selenium Web UI test cases:

| Test Case | Input | Expected Result |
|---|---|---|
| TC_WEB_001 | 90 | Valid |
| TC_WEB_002 | 89 | Invalid |
| TC_WEB_003 | 91 | Invalid |
| TC_WEB_004 | N/A | Homepage displayed correctly |
| TC_WEB_005 | Empty | Browser validation |
| TC_WEB_006 | Non-numeric | Validation message |

Tổng số:

**6 Selenium Web UI test cases.**

---

### 8.5.10 Boundary Value Analysis

Selenium Web UI Testing áp dụng Boundary Value Analysis cho
Match Duration.

Boundary chính:

**90 phút**

Các giá trị được kiểm tra:

- 89 — ngay trước boundary.
- 90 — boundary hợp lệ.
- 91 — ngay sau boundary.

Quan hệ:

`89 → Invalid | 90 → Valid | 91 → Invalid`

Các test case tương ứng:

- `TC_WEB_002`
- `TC_WEB_001`
- `TC_WEB_003`

---

### 8.5.11 Negative Testing

Selenium kiểm tra các trường hợp input không hợp lệ:

- Match Duration nhỏ hơn 90.
- Match Duration lớn hơn 90.
- Empty input.
- Non-numeric input.

Các trường hợp này giúp xác minh Web Application không chỉ xử lý
positive input mà còn xử lý các input không hợp lệ.

---

### 8.5.12 Automated Execution

Selenium test được thực thi tự động cùng automated testing process.

Luồng:

`MatchWebTest → Selenium WebDriver → Browser → Web Application → Result`

Maven được sử dụng để hỗ trợ quá trình automated test execution.

Kết quả test được sử dụng trong test reporting.

---

### 8.5.13 Kết quả kiểm thử

Selenium Web UI suite hiện tại:

| Metric | Result |
|---|---:|
| Total Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

Tất cả 6 Selenium test cases hiện tại đều Passed.

---

### 8.5.14 Traceability

Selenium Web UI Testing được ánh xạ tới:

| Requirement | Test Case / Test Suite |
|---|---|
| FR-03 — Match Management | `MatchTest.java` |
| FR-09 — Web Application | `MatchWebTest.java` |
| Match Duration | TC_WEB_001 |
| Invalid Duration | TC_WEB_002, TC_WEB_003 |
| Homepage | TC_WEB_004 |
| Empty Input | TC_WEB_005 |
| Non-numeric Input | TC_WEB_006 |

---

### 8.5.15 Tiêu chí hoàn thành

Selenium Web UI Testing được xem là đáp ứng khi:

- Web Application có thể được mở bằng Selenium.
- Homepage được kiểm tra.
- Match Duration có thể được nhập.
- Input 90 được xác nhận là hợp lệ.
- Input 89 được xác nhận là không hợp lệ.
- Input 91 được xác nhận là không hợp lệ.
- Empty input được kiểm tra.
- Non-numeric input được kiểm tra.
- Validation message được xác minh.
- Tất cả Selenium test cases thực thi thành công.

---

### 8.5.16 Trạng thái

**Status: Covered**

Selenium Web UI Testing được triển khai thông qua
`MatchWebTest.java`.

Kết quả hiện tại:

**6 / 6 Selenium test cases passed — 100% pass rate.**

---

### 8.5.17 Kết luận

Selenium Web UI Testing cung cấp khả năng kiểm thử Web Application
theo cách tương tác thực tế của người sử dụng.

Phạm vi kiểm thử bao gồm homepage, Match Duration, positive input,
negative input, empty input và non-numeric input.

**8.5 — Selenium Web UI Testing: Covered.**

## 8.6 Automated Regression Testing

### 8.6.1 Mục đích

Automated Regression Testing được sử dụng để xác minh rằng các chức
năng đã được kiểm thử trước đó vẫn hoạt động đúng sau khi source code
hoặc cấu hình của project được thay đổi.

Mục tiêu là phát hiện các regression defect có thể phát sinh trong quá
trình phát triển và bảo trì World Cup Test Application.

---

### 8.6.2 Phạm vi kiểm thử

Automated Regression Testing bao phủ các nhóm chức năng chính:

- Team Management.
- Player Management.
- Match Management.
- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Top Scorer Management.
- Database Management.
- Web Application.

Các test case đã được xây dựng có thể được thực thi lại sau mỗi lần
thay đổi source code.

---

### 8.6.3 Công cụ sử dụng

Quá trình Automated Regression Testing sử dụng:

- JUnit 5.
- Selenium WebDriver.
- Maven.
- Allure Report.

GitHub Actions có thể hỗ trợ tự động hóa quá trình regression testing
trong CI workflow theo cấu hình của repository.

---

### 8.6.4 Regression Testing cho Business Logic

Các JUnit 5 test suite được sử dụng để kiểm tra lại business logic
sau khi có thay đổi.

Các test suite chính:

| Test Suite | Phạm vi |
|---|---|
| `TeamTest.java` | Team Management |
| `PlayerTest.java` | Player Management |
| `MatchTest.java` | Match Management |
| `GroupStageTest.java` | Group Stage Management |
| `KnockoutStageTest.java` | Knockout Stage Management |
| `TournamentTest.java` | Tournament Management |
| `TopScorerTest.java` | Top Scorer Management |
| `DatabaseTest.java` | Database Management |

---

### 8.6.5 Regression Testing cho Web Application

Selenium WebDriver được sử dụng để kiểm tra lại Web Application sau
khi có thay đổi liên quan đến giao diện hoặc chức năng Web.

Test suite:

`MatchWebTest.java`

Các chức năng được kiểm tra lại gồm:

- Homepage.
- Match Duration.
- Valid input.
- Invalid input.
- Empty input.
- Non-numeric input.
- Validation result.

---

### 8.6.6 Quy trình Regression Testing

Quy trình tổng quát:

1. Thay đổi source code hoặc cấu hình project.
2. Build project.
3. Thực thi automated test suite.
4. Kiểm tra test results.
5. Xác định các test case bị ảnh hưởng.
6. Phân tích Failed hoặc Error nếu có.
7. Tạo test report.
8. Xác nhận trạng thái sau thay đổi.

Luồng tổng quát:

`Code Change → Maven Build → Automated Tests → Test Results → Allure Report`

---

### 8.6.7 Regression Testing và Maven

Maven được sử dụng để thực hiện automated test execution.

Luồng:

`Source Code Change → Maven → JUnit 5 / Selenium → Test Results`

Việc sử dụng Maven giúp regression test có thể được thực thi lại theo
cùng một quy trình build và test execution.

---

### 8.6.8 Regression Testing và Allure

Allure Report được sử dụng để ghi nhận kết quả của automated test
execution.

Sau mỗi lần regression test, test results có thể được sử dụng để tạo
report mới.

Luồng:

`Regression Test Execution → Test Results → Allure Report`

Report cung cấp bằng chứng về trạng thái của test suite tại thời điểm
thực thi.

---

### 8.6.9 Regression Testing và GitHub Actions

GitHub Actions có thể được sử dụng để thực hiện regression testing
trong CI environment.

Luồng tổng quát:

`GitHub Push → GitHub Actions → Maven → Automated Tests → Result`

Nếu workflow được cấu hình để chạy test sau mỗi thay đổi, regression
test có thể được thực hiện tự động mà không cần chạy thủ công từng
test suite.

---

### 8.6.10 Test Coverage

Regression Testing bao phủ các Functional Requirements chính:

| Functional Requirement | Regression Test |
|---|---|
| FR-01 — Team Management | `TeamTest.java` |
| FR-02 — Player Management | `PlayerTest.java` |
| FR-03 — Match Management | `MatchTest.java` |
| FR-04 — Group Stage Management | `GroupStageTest.java` |
| FR-05 — Knockout Stage Management | `KnockoutStageTest.java` |
| FR-06 — Tournament Management | `TournamentTest.java` |
| FR-07 — Top Scorer Management | `TopScorerTest.java` |
| FR-08 — Database Management | `DatabaseTest.java` |
| FR-09 — Web Application | `MatchWebTest.java` |
| FR-10 — Automated Testing | JUnit 5 / Selenium / Maven / Allure |

---

### 8.6.11 Kết quả kiểm thử

Automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Selenium Web UI suite:

| Metric | Result |
|---|---:|
| Total Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

Kết quả hiện tại cho thấy toàn bộ automated test suite đã thực thi
thành công tại thời điểm kiểm thử được ghi nhận.

---

### 8.6.12 Tiêu chí hoàn thành

Automated Regression Testing được xem là đáp ứng khi:

- Automated test suite có thể được chạy lại.
- Các chức năng đã kiểm thử trước đó tiếp tục được kiểm tra.
- JUnit 5 tests có thể được thực thi.
- Selenium Web UI tests có thể được thực thi.
- Maven hỗ trợ automated test execution.
- Test results được tạo.
- Allure Report có thể được tạo từ test results.
- Regression failure có thể được phát hiện thông qua test results.
- Không có Failed hoặc Error trong kết quả kiểm thử hiện tại.

---

### 8.6.13 Traceability

Automated Regression Testing được ánh xạ tới:

| Requirement | Test Suite |
|---|---|
| FR-01 — Team Management | `TeamTest.java` |
| FR-02 — Player Management | `PlayerTest.java` |
| FR-03 — Match Management | `MatchTest.java` |
| FR-04 — Group Stage Management | `GroupStageTest.java` |
| FR-05 — Knockout Stage Management | `KnockoutStageTest.java` |
| FR-06 — Tournament Management | `TournamentTest.java` |
| FR-07 — Top Scorer Management | `TopScorerTest.java` |
| FR-08 — Database Management | `DatabaseTest.java` |
| FR-09 — Web Application | `MatchWebTest.java` |
| FR-10 — Automated Testing | JUnit 5 / Selenium / Maven / Allure |

---

### 8.6.14 Trạng thái

**Status: Covered**

Automated Regression Testing được hỗ trợ bởi JUnit 5, Selenium
WebDriver và Maven.

Allure được sử dụng để tạo test report từ kết quả execution.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

Selenium Web UI:

**6 / 6 test cases passed — 100% pass rate.**

---

### 8.6.15 Kết luận

Automated Regression Testing giúp xác minh rằng các chức năng đã được
kiểm thử tiếp tục hoạt động đúng sau các thay đổi đối với project.

JUnit 5 và Selenium WebDriver cung cấp các test case, Maven hỗ trợ
automated execution và Allure cung cấp test execution evidence.

GitHub Actions có thể được sử dụng để tự động hóa regression testing
trong CI workflow theo cấu hình của repository.

**8.6 — Automated Regression Testing: Covered.**

## 9. Tiêu chí nghiệm thu

## 9.1 Tiêu chí chức năng

### 9.1.1 Mục đích

Mục này xác định các tiêu chí nghiệm thu đối với các chức năng của
World Cup Test Application.

Một chức năng được xem là đạt yêu cầu khi hành vi thực tế của hệ thống
phù hợp với Functional Requirements và các test case tương ứng.

---

### 9.1.2 Team Management

FR-01 được xem là đạt khi hệ thống:

- Hỗ trợ thông tin Team.
- Hỗ trợ Head Coach.
- Hỗ trợ Assistant Coaches.
- Kiểm tra tối đa 3 Assistant Coaches.
- Kiểm tra từ 21 đến 22 Players.
- Kiểm tra từ 7 đến 11 Starting Players.
- Kiểm tra từ 4 đến 5 Substitute Players.

Test chính:

`TeamTest.java`

---

### 9.1.3 Player Management

FR-02 được xem là đạt khi hệ thống:

- Cho phép tạo Player.
- Lưu Player name.
- Trả về Player name đã được lưu.

Test chính:

`PlayerTest.java`

---

### 9.1.4 Match Management

FR-03 được xem là đạt khi hệ thống kiểm tra được:

- Match Duration.
- Half Duration.
- Half-time Break.
- Extra-time.
- Silver Goal.
- Penalty Kicks.
- Sudden Death.
- Yellow Cards.
- Red Cards.
- Minimum Players.
- Substitutions.
- Player Position.

Test chính:

`MatchTest.java`

---

### 9.1.5 Group Stage Management

FR-04 được xem là đạt khi hệ thống:

- Hỗ trợ Tournament gồm 32 Teams.
- Tạo 8 Groups.
- Mỗi Group có 4 Teams.
- Mỗi Team thi đấu với 3 đối thủ.
- Tính điểm Win, Draw và Loss.
- Hỗ trợ các tiêu chí xếp hạng.
- Áp dụng quy tắc Red Card tương đương 2 Yellow Cards.
- Xác định 2 Teams đứng đầu mỗi Group.
- Xác định tổng cộng 16 Qualified Teams.

Test chính:

`GroupStageTest.java`

---

### 9.1.6 Knockout Stage Management

FR-05 được xem là đạt khi hệ thống:

- Hỗ trợ 16 Teams ở Round of 16.
- Hỗ trợ 8 Round-of-16 Matches.
- Xác định 8 Winners.
- Hỗ trợ 4 Quarterfinal Matches.
- Xác định 4 Semifinalists.
- Hỗ trợ 2 Semifinal Matches.
- Xác định 2 Finalists.
- Hỗ trợ Final.
- Xác định Tournament Champion.
- Phân bổ Gold, Silver và Bronze Medals.

Test chính:

`KnockoutStageTest.java`

---

### 9.1.7 Tournament Management

FR-06 được xem là đạt khi hệ thống:

- Khởi tạo Tournament với chính xác 32 Teams.
- Tạo 8 Groups.
- Thực hiện Group Stage.
- Ghi nhận Group-stage Results.
- Xác định 16 Qualified Teams.
- Chuẩn bị Round of 16.
- Thực hiện Knockout Stage.
- Xác định Tournament Champion.
- Lưu Match Results.
- Export Tournament Results.

Test chính:

`TournamentTest.java`

---

### 9.1.8 Top Scorer Management

FR-07 được xem là đạt khi hệ thống:

- Ghi nhận Goals của Player.
- Theo dõi Goals qua nhiều Matches.
- Xác định Player có số Goals cao nhất.
- Hỗ trợ Shared Top Scorers.
- Trả về No Top Scorer khi chưa có Goals.
- Xác định Shared Top Scorer.
- Cập nhật Top Scorer khi có thêm Goals.

Test chính:

`TopScorerTest.java`

---

### 9.1.9 Database Management

FR-08 được xem là đạt khi hệ thống hỗ trợ lưu trữ và truy xuất:

- Team.
- Group.
- Match.
- Player.
- Match Result.

Hệ thống phải:

- Lưu được dữ liệu.
- Truy xuất được dữ liệu đã lưu.
- Hỗ trợ nhiều Records.
- Xử lý đúng trường hợp Record không tồn tại.

Test chính:

`DatabaseTest.java`

---

### 9.1.10 Web Application

FR-09 được xem là đạt khi Web Application:

- Cung cấp Homepage.
- Cho phép nhập Match Duration.
- Xác nhận 90 phút là hợp lệ.
- Xác nhận 89 phút là không hợp lệ.
- Xác nhận 91 phút là không hợp lệ.
- Xử lý Empty Input.
- Xử lý Non-numeric Input.
- Hiển thị thông báo validation phù hợp.

Đối với Non-numeric Input, thông báo yêu cầu là:

`INVALID: Minutes must be a number.`

Test chính:

`MatchWebTest.java`

---

### 9.1.11 Automated Testing

FR-10 được xem là đạt khi project cung cấp:

- JUnit 5 Automated Testing.
- Selenium WebDriver Testing.
- Maven Test Execution.
- Allure Test Reporting.

Các thành phần này phải hoạt động như một phần của automated testing
process của project.

---

### 9.1.12 Tổng hợp tiêu chí chức năng

| Requirement | Tiêu chí nghiệm thu | Test chính |
|---|---|---|
| FR-01 | Team Management hoạt động đúng các quy tắc | `TeamTest.java` |
| FR-02 | Player có thể được tạo và truy xuất tên | `PlayerTest.java` |
| FR-03 | Match rules được kiểm tra đúng | `MatchTest.java` |
| FR-04 | Group Stage và Qualification hoạt động đúng | `GroupStageTest.java` |
| FR-05 | Knockout Stage và Champion được xác định đúng | `KnockoutStageTest.java` |
| FR-06 | Tournament progression hoạt động đúng | `TournamentTest.java` |
| FR-07 | Top Scorer được xác định và cập nhật đúng | `TopScorerTest.java` |
| FR-08 | Database Store / Retrieve hoạt động đúng | `DatabaseTest.java` |
| FR-09 | Web Application validation hoạt động đúng | `MatchWebTest.java` |
| FR-10 | Automated Testing infrastructure hoạt động | JUnit 5 / Selenium / Maven / Allure |

---

### 9.1.13 Tiêu chí Pass

Một Functional Requirement được xác định là **Pass** khi:

- Chức năng được triển khai trong project.
- Test case tương ứng được thực thi.
- Actual Result phù hợp với Expected Result.
- Không phát sinh Failed hoặc Error đối với chức năng được kiểm tra.

---

### 9.1.14 Trạng thái

Các Functional Requirements hiện tại được kiểm chứng thông qua
automated test suite.

Kết quả được ghi nhận:

**257 / 257 test cases passed — 100% pass rate.**

Selenium Web UI:

**6 / 6 test cases passed — 100% pass rate.**

---

### 9.1.15 Kết luận

Tiêu chí chức năng xác định các điều kiện cần thiết để nghiệm thu
10 Functional Requirements của World Cup Test Application.

Các chức năng được ánh xạ với automated test suite tương ứng và được
kiểm chứng thông qua JUnit 5, Selenium WebDriver và Database Testing.

**9.1 — Tiêu chí chức năng: Covered.**

## 9.2 Tiêu chí kiểm thử

### 9.2.1 Mục đích

Mục này xác định các tiêu chí được sử dụng để đánh giá quá trình kiểm
thử World Cup Test Application.

Một test case được xem là đạt khi kết quả thực tế phù hợp với kết quả
mong đợi được xác định trong test case.

---

### 9.2.2 Phạm vi

Tiêu chí kiểm thử áp dụng cho:

- Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Selenium Web UI Testing.
- Database Testing.
- Automated Regression Testing.

Các tiêu chí được áp dụng cho các Functional Requirements từ FR-01
đến FR-10.

---

### 9.2.3 Tiêu chí Test Case

Mỗi test case phải xác định được:

- Test Case ID.
- Requirement hoặc chức năng được kiểm tra.
- Input hoặc điều kiện kiểm thử.
- Expected Result.
- Actual Result.
- Test Status.

Test case được xác định:

- **Pass** khi Actual Result phù hợp với Expected Result.
- **Fail** khi Actual Result không phù hợp với Expected Result.
- **Error** khi test không thể hoàn thành do lỗi trong quá trình
  execution.
- **Skipped** khi test không được thực thi theo cấu hình hoặc điều
  kiện của test environment.

---

### 9.2.4 Tiêu chí Unit Testing

Unit Test phải:

- Có thể được compile.
- Có thể được thực thi bằng JUnit 5.
- Kiểm tra business logic tương ứng.
- Kiểm tra các trường hợp hợp lệ.
- Kiểm tra các trường hợp không hợp lệ khi được yêu cầu.
- Kiểm tra các boundary quan trọng khi được áp dụng.
- Trả về kết quả Pass hoặc Fail rõ ràng.

Test suite chính:

- `TeamTest.java`
- `PlayerTest.java`
- `MatchTest.java`
- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `TournamentTest.java`
- `TopScorerTest.java`
- `DatabaseTest.java`

---

### 9.2.5 Tiêu chí Functional Testing

Functional Test phải xác minh rằng chức năng thực tế phù hợp với
Functional Requirement tương ứng.

Test phải kiểm tra:

- Input.
- Processing.
- Expected behavior.
- Actual result.

Functional Test được xem là đạt khi chức năng thực hiện đúng hành vi
được đặc tả.

---

### 9.2.6 Tiêu chí Boundary Value Analysis

Đối với các chức năng có boundary, test phải kiểm tra các giá trị
quan trọng tại và xung quanh boundary.

Ví dụ:

- Team limits.
- Player limits.
- Match limits.
- Group limits.
- Tournament limits.
- Match Duration trên Web.

Đối với Web Application, boundary chính của Match Duration là:

**90 phút.**

Các giá trị:

- 89 → Invalid.
- 90 → Valid.
- 91 → Invalid.

---

### 9.2.7 Tiêu chí Decision-based Testing

Đối với các chức năng có nhiều điều kiện quyết định, test phải xác
minh các nhánh xử lý chính.

Các decision được kiểm tra gồm:

- Team validation.
- Match result.
- Group ranking.
- Qualification.
- Knockout progression.
- Tournament Champion.
- Top Scorer.
- Database record handling.
- Web input validation.

---

### 9.2.8 Tiêu chí Database Testing

Database Test phải xác minh:

- Record có thể được lưu.
- Record đã lưu có thể được truy xuất.
- Nhiều Record được hỗ trợ.
- Record không tồn tại được xử lý đúng.
- Dữ liệu truy xuất phù hợp với dữ liệu đã lưu.

Test chính:

`DatabaseTest.java`

---

### 9.2.9 Tiêu chí Selenium Web UI Testing

Selenium Test phải xác minh Web Application có thể:

- Mở Homepage.
- Nhập Match Duration.
- Xử lý giá trị 90.
- Xử lý giá trị 89.
- Xử lý giá trị 91.
- Xử lý Empty Input.
- Xử lý Non-numeric Input.
- Hiển thị Validation Result.
- Hiển thị Validation Message phù hợp.

Test suite:

`MatchWebTest.java`

---

### 9.2.10 Tiêu chí Automated Regression Testing

Regression Test phải có khả năng được thực thi lại sau khi source code
thay đổi.

Kết quả regression test phải cho phép xác định:

- Test Passed.
- Test Failed.
- Test Error.
- Test Skipped.

Mục tiêu là xác minh các chức năng đã được kiểm thử trước đó không bị
ảnh hưởng bởi các thay đổi mới.

---

### 9.2.11 Tiêu chí Test Execution

Automated Test Execution được thực hiện thông qua Maven.

Luồng:

`Source Code → Maven → Test Execution → Test Results`

Test Results phải được tạo sau quá trình execution và có thể được sử
dụng cho quá trình reporting.

---

### 9.2.12 Tiêu chí Test Reporting

Kết quả automated testing phải có khả năng được sử dụng để tạo
Allure Report.

Report phải phản ánh kết quả test execution, bao gồm trạng thái của
các test case.

Luồng:

`Test Execution → Test Results → Allure Report`

---

### 9.2.13 Tiêu chí Pass của Test Suite

Test Suite được xem là đạt khi:

- Các test case được thực thi.
- Không có Failed test.
- Không có Error.
- Không có test case bị bỏ qua ngoài phạm vi được xác định.
- Test results được tạo.
- Kết quả có thể được sử dụng cho test reporting.

---

### 9.2.14 Kết quả kiểm thử hiện tại

Automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Selenium Web UI suite:

| Metric | Result |
|---|---:|
| Total Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 9.2.15 Traceability

Tiêu chí kiểm thử được áp dụng cho toàn bộ Functional Requirements:

| Requirement | Kiểm thử chính |
|---|---|
| FR-01 | `TeamTest.java` |
| FR-02 | `PlayerTest.java` |
| FR-03 | `MatchTest.java` |
| FR-04 | `GroupStageTest.java` |
| FR-05 | `KnockoutStageTest.java` |
| FR-06 | `TournamentTest.java` |
| FR-07 | `TopScorerTest.java` |
| FR-08 | `DatabaseTest.java` |
| FR-09 | `MatchWebTest.java` |
| FR-10 | JUnit 5 / Selenium / Maven / Allure |

---

### 9.2.16 Tiêu chí hoàn thành

Tiêu chí kiểm thử được xem là đáp ứng khi:

- Các Functional Requirements có test coverage tương ứng.
- Các test case được thực thi thành công.
- Expected Result được xác định.
- Actual Result được ghi nhận.
- Test Status được xác định.
- Boundary và decision conditions quan trọng được kiểm tra.
- Database operations được kiểm tra.
- Web UI được kiểm tra bằng Selenium.
- Automated test results được tạo.
- Allure Report có thể được tạo.
- Không có Failed hoặc Error trong kết quả kiểm thử hiện tại.

---

### 9.2.17 Trạng thái

**Status: Covered**

Các tiêu chí kiểm thử đã được áp dụng cho automated testing của
project.

Kết quả hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

Selenium Web UI:

**6 / 6 test cases passed — 100% pass rate.**

---

### 9.2.18 Kết luận

Tiêu chí kiểm thử xác định cách đánh giá Pass, Fail, Error và Skipped
đối với các test case của World Cup Test Application.

Các tiêu chí bao phủ unit testing, functional testing, boundary value
analysis, decision-based testing, database testing, Selenium Web UI
testing và automated regression testing.

**9.2 — Tiêu chí kiểm thử: Covered.**

## 9.3 Tiêu chí kết quả kiểm thử

### 9.3.1 Mục đích

Mục này xác định các tiêu chí dùng để đánh giá kết quả thực thi
automated test của World Cup Test Application.

Kết quả kiểm thử được sử dụng để xác định mức độ đáp ứng của các
Functional Requirements và trạng thái cuối cùng của hệ thống.

---

### 9.3.2 Phân loại kết quả

Mỗi test case có thể có một trong các trạng thái:

- **Passed** — Actual Result phù hợp với Expected Result.
- **Failed** — Actual Result không phù hợp với Expected Result.
- **Error** — Test không thể hoàn thành do lỗi trong quá trình
  execution.
- **Skipped** — Test không được thực thi theo cấu hình hoặc điều kiện
  của test environment.

---

### 9.3.3 Tiêu chí Passed

Một test case được xác định là **Passed** khi:

- Test được thực thi thành công.
- Actual Result phù hợp với Expected Result.
- Không phát sinh assertion failure.
- Không phát sinh execution error.

---

### 9.3.4 Tiêu chí Failed

Một test case được xác định là **Failed** khi:

- Test được thực thi nhưng Actual Result không phù hợp với Expected
  Result.
- Assertion hoặc validation tương ứng không đạt.

Failed test phải được phân tích để xác định nguyên nhân trước khi kết
luận về trạng thái của Functional Requirement.

---

### 9.3.5 Tiêu chí Error

Một test case được xác định là **Error** khi test không thể hoàn thành
quá trình execution do lỗi môi trường hoặc lỗi runtime.

Ví dụ có thể bao gồm:

- Application không thể khởi động.
- WebDriver không thể khởi tạo.
- Database không thể kết nối.
- Test environment không sẵn sàng.

Error khác với Failed vì test không hoàn thành được bước kiểm tra theo
expected flow.

---

### 9.3.6 Tiêu chí Skipped

Một test case được xác định là **Skipped** khi test không được thực
thi.

Skipped test phải được xem xét để xác định nguyên nhân và phạm vi
ảnh hưởng.

Trong kết quả kiểm thử cuối cùng của project, không có test case nào
bị Skipped.

---

### 9.3.7 Kết quả Unit và Functional Testing

Automated test suite bao phủ các nhóm chức năng:

- Team Management.
- Player Management.
- Match Management.
- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Top Scorer Management.
- Database Management.

Kết quả hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

---

### 9.3.8 Kết quả Selenium Web UI Testing

Selenium Web UI suite bao gồm 6 test cases:

- `TC_WEB_001` — Valid 90-minute match.
- `TC_WEB_002` — Invalid 89-minute match.
- `TC_WEB_003` — Invalid 91-minute match.
- `TC_WEB_004` — Homepage UI verification.
- `TC_WEB_005` — Empty match-duration input.
- `TC_WEB_006` — Invalid non-numeric input.

Kết quả:

| Metric | Result |
|---|---:|
| Total Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 9.3.9 Tiêu chí Pass của Test Suite

Automated Test Suite được xem là đạt khi:

- Tất cả test cases được thực thi.
- Không có Failed test cases.
- Không có Error.
- Không có Skipped test cases ngoài phạm vi được chấp nhận.
- Pass rate đạt 100%.

Đối với kết quả kiểm thử cuối cùng của project:

**257 / 257 test cases passed — 100% pass rate.**

---

### 9.3.10 Tiêu chí Pass của Selenium Suite

Selenium Web UI Suite được xem là đạt khi:

- Tất cả 6 test cases được thực thi.
- Homepage test Passed.
- Valid input test Passed.
- Invalid input tests Passed.
- Empty input test Passed.
- Non-numeric input test Passed.
- Không có Failed test.
- Không có execution Error.

Kết quả:

**6 / 6 Selenium test cases passed — 100% pass rate.**

---

### 9.3.11 Test Execution Evidence

Kết quả kiểm thử phải được lưu giữ dưới dạng execution evidence.

Các nguồn evidence chính gồm:

- JUnit 5 test results.
- Selenium WebDriver test results.
- Maven test execution results.
- Allure Report.

Các evidence này được sử dụng để chứng minh trạng thái thực thi của
automated test suite.

---

### 9.3.12 Allure Report

Allure Report được sử dụng để trình bày kết quả automated testing.

Report có thể được sử dụng để theo dõi:

- Tổng số test cases.
- Passed tests.
- Failed tests.
- Test execution status.
- Test execution evidence.

Luồng tổng quát:

`Automated Test Execution → Test Results → Allure Report`

---

### 9.3.13 Traceability

Kết quả kiểm thử được ánh xạ tới Functional Requirements:

| Requirement | Main Test | Kết quả |
|---|---|---|
| FR-01 | `TeamTest.java` | Covered |
| FR-02 | `PlayerTest.java` | Covered |
| FR-03 | `MatchTest.java` | Covered |
| FR-04 | `GroupStageTest.java` | Covered |
| FR-05 | `KnockoutStageTest.java` | Covered |
| FR-06 | `TournamentTest.java` | Covered |
| FR-07 | `TopScorerTest.java` | Covered |
| FR-08 | `DatabaseTest.java` | Covered |
| FR-09 | `MatchWebTest.java` | Covered |
| FR-10 | JUnit 5 / Selenium / Maven / Allure | Covered |

---

### 9.3.14 Tiêu chí hoàn thành

Tiêu chí kết quả kiểm thử được xem là đáp ứng khi:

- Automated test suite hoàn thành execution.
- Tất cả test cases có trạng thái rõ ràng.
- Không có Failed test case.
- Không có Error.
- Không có Skipped test case trong kết quả cuối cùng.
- Pass rate đạt 100%.
- Selenium Web UI suite đạt 100% pass rate.
- Test execution evidence được tạo.
- Kết quả có thể được sử dụng cho Allure Report.

---

### 9.3.15 Trạng thái

**Status: Passed**

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

Selenium Web UI:

**6 / 6 test cases passed — 100% pass rate.**

Không có:

- Failed test.
- Error.
- Skipped test.

---

### 9.3.16 Kết luận

Kết quả kiểm thử hiện tại đáp ứng các tiêu chí nghiệm thu được xác
định cho automated testing.

Toàn bộ 257 test cases của automated test suite đã Passed và Selenium
Web UI suite có 6/6 test cases Passed.

Kết quả này cung cấp bằng chứng kiểm thử cho các Functional
Requirements của World Cup Test Application.

**9.3 — Tiêu chí kết quả kiểm thử: Passed.**

## 9.4 Tiêu chí hoàn thành hệ thống

### 9.4.1 Mục đích

Mục này xác định các tiêu chí tổng thể để đánh giá World Cup Test
Application đã hoàn thành theo phạm vi và yêu cầu được đặc tả.

Hệ thống được xem là hoàn thành khi các Functional Requirements,
automated testing và test execution evidence đáp ứng các tiêu chí
được xác định.

---

### 9.4.2 Tiêu chí Functional Requirements

Hệ thống phải đáp ứng đầy đủ các Functional Requirements:

- FR-01 — Team Management.
- FR-02 — Player Management.
- FR-03 — Match Management.
- FR-04 — Group Stage Management.
- FR-05 — Knockout Stage Management.
- FR-06 — Tournament Management.
- FR-07 — Top Scorer Management.
- FR-08 — Database Management.
- FR-09 — Web Application.
- FR-10 — Automated Testing.

Mỗi Functional Requirement phải có test coverage tương ứng.

---

### 9.4.3 Tiêu chí Business Logic

Các business rules chính phải được triển khai và kiểm thử, bao gồm:

- Team rules.
- Match rules.
- Group Stage rules.
- Knockout Stage rules.
- Tournament rules.
- Top Scorer rules.

Các rules phải được kiểm chứng thông qua automated test suite tương
ứng.

---

### 9.4.4 Tiêu chí Database

Database Management phải đáp ứng:

- Lưu được Team.
- Lưu được Group.
- Lưu được Match.
- Lưu được Player.
- Lưu được Match Result.
- Truy xuất được dữ liệu đã lưu.
- Hỗ trợ nhiều Records.
- Xử lý Record không tồn tại.

Test chính:

`DatabaseTest.java`

---

### 9.4.5 Tiêu chí Web Application

Web Application phải:

- Hiển thị Homepage.
- Cho phép nhập Match Duration.
- Xác nhận 90 phút là hợp lệ.
- Xử lý 89 phút là không hợp lệ.
- Xử lý 91 phút là không hợp lệ.
- Xử lý Empty Input.
- Xử lý Non-numeric Input.
- Hiển thị Validation Message phù hợp.

Validation message đối với Non-numeric Input:

`INVALID: Minutes must be a number.`

Test chính:

`MatchWebTest.java`

---

### 9.4.6 Tiêu chí Automated Testing

Project phải cung cấp:

- JUnit 5 Unit Tests.
- Selenium WebDriver Tests.
- Maven Test Execution.
- Allure Reporting.

Automated testing phải có khả năng được thực thi và tạo Test Results.

---

### 9.4.7 Tiêu chí Test Coverage

Toàn bộ Functional Requirements từ FR-01 đến FR-10 phải có test
coverage tương ứng.

| Requirement | Coverage |
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

Tổng coverage:

**10 / 10 Functional Requirements covered.**

---

### 9.4.8 Tiêu chí Test Execution

Automated test execution phải:

- Hoàn thành execution.
- Tạo test results.
- Xác định trạng thái của từng test case.
- Không có Failed test.
- Không có Error.
- Không có Skipped test trong kết quả cuối cùng.

---

### 9.4.9 Tiêu chí kết quả kiểm thử

Kết quả automated test cuối cùng phải đạt:

- Total test cases: **257**
- Passed: **257**
- Failed: **0**
- Errors: **0**
- Skipped: **0**
- Pass rate: **100%**

Selenium Web UI suite phải đạt:

- Total Selenium test cases: **6**
- Passed: **6**
- Failed: **0**
- Pass rate: **100%**

---

### 9.4.10 Tiêu chí Test Reporting

Test execution phải cung cấp evidence thông qua:

- JUnit 5 test results.
- Selenium WebDriver test results.
- Maven test execution.
- Allure Report.

Allure Report phải có khả năng phản ánh kết quả của automated test
execution.

---

### 9.4.11 Tiêu chí Regression

Các test suite phải có khả năng được thực thi lại sau khi source code
thay đổi.

Regression Testing phải giúp xác định liệu các chức năng đã được
kiểm thử trước đó có tiếp tục hoạt động đúng hay không.

Các test suite chính gồm:

- `TeamTest.java`
- `PlayerTest.java`
- `MatchTest.java`
- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `TournamentTest.java`
- `TopScorerTest.java`
- `DatabaseTest.java`
- `MatchWebTest.java`

---

### 9.4.12 Tiêu chí CI/CD

Nếu project sử dụng GitHub Actions cho automated testing, workflow
phải có khả năng:

- Build project.
- Execute automated tests.
- Xác định Test Result.
- Xác định trạng thái workflow.

Quá trình cụ thể phụ thuộc vào workflow được cấu hình trong
repository.

---

### 9.4.13 Tiêu chí Documentation

Các tài liệu của project phải phản ánh:

- Software Requirements.
- Functional Requirements.
- Business Rules.
- Testing Scope.
- Acceptance Criteria.
- Traceability.
- Test Execution Evidence.

Các tài liệu phải sử dụng nhất quán các Requirement ID từ FR-01 đến
FR-10.

---

### 9.4.14 Tiêu chí nghiệm thu cuối cùng

Hệ thống được xem là hoàn thành khi tất cả các điều kiện sau được
thỏa mãn:

1. 10 / 10 Functional Requirements được covered.
2. Business logic chính được triển khai và kiểm thử.
3. Database operations được kiểm thử.
4. Web Application được kiểm thử bằng Selenium.
5. Automated test suite thực thi thành công.
6. 257 / 257 test cases Passed.
7. Selenium đạt 6 / 6 test cases Passed.
8. Không có Failed test.
9. Không có Error.
10. Không có Skipped test trong kết quả cuối cùng.
11. Pass rate đạt 100%.
12. Test execution evidence được tạo.
13. Allure Report có thể được tạo.
14. Regression testing có thể được thực hiện lại.
15. Documentation phản ánh đúng phạm vi của hệ thống.

---

### 9.4.15 Trạng thái

**Status: Completed**

Kết quả hiện tại:

**10 / 10 Functional Requirements covered.**

**257 / 257 automated test cases passed — 100% pass rate.**

**6 / 6 Selenium Web UI test cases passed — 100% pass rate.**

Không có:

- Failed test.
- Error.
- Skipped test.

---

### 9.4.16 Kết luận

World Cup Test Application được xem là hoàn thành khi các Functional
Requirements, Business Rules, Database Operations, Web Application và
Automated Testing đều đáp ứng các tiêu chí nghiệm thu đã xác định.

Kết quả kiểm thử hiện tại đáp ứng các tiêu chí:

**257 / 257 test cases passed — 100% pass rate.**

**10 / 10 Functional Requirements covered.**

**9.4 — Tiêu chí hoàn thành hệ thống: Completed.**

## 10. Traceability

## 10.1 Requirements Traceability

### 10.1.1 Mục đích

Mục này xác định mối liên hệ giữa các Software Requirements,
Functional Requirements, các chức năng của hệ thống và các thành phần
kiểm thử tương ứng.

Requirements Traceability được sử dụng để đảm bảo rằng mỗi Functional
Requirement trong SRS đều có thành phần kiểm thử tương ứng trong
project.

---

### 10.1.2 Phạm vi Traceability

Traceability bao phủ toàn bộ Functional Requirements:

- FR-01 — Team Management.
- FR-02 — Player Management.
- FR-03 — Match Management.
- FR-04 — Group Stage Management.
- FR-05 — Knockout Stage Management.
- FR-06 — Tournament Management.
- FR-07 — Top Scorer Management.
- FR-08 — Database Management.
- FR-09 — Web Application.
- FR-10 — Automated Testing.

---

### 10.1.3 Requirements Traceability Matrix

| Requirement ID | Functional Requirement | Main Test / Evidence | Status |
|---|---|---|---|
| FR-01 | Team Management | `TeamTest.java` | Covered |
| FR-02 | Player Management | `PlayerTest.java` | Covered |
| FR-03 | Match Management | `MatchTest.java` | Covered |
| FR-04 | Group Stage Management | `GroupStageTest.java` | Covered |
| FR-05 | Knockout Stage Management | `KnockoutStageTest.java` | Covered |
| FR-06 | Tournament Management | `TournamentTest.java` | Covered |
| FR-07 | Top Scorer Management | `TopScorerTest.java` | Covered |
| FR-08 | Database Management | `DatabaseTest.java` | Covered |
| FR-09 | Web Application | `MatchWebTest.java` | Covered |
| FR-10 | Automated Testing | JUnit 5 / Selenium / Maven / Allure | Covered |

---

### 10.1.4 FR-01 Traceability

**FR-01 — Team Management**

Requirement được kiểm chứng thông qua:

`TeamTest.java`

Các phạm vi liên quan:

- Assistant Coaches.
- Players.
- Starting Players.
- Substitute Players.
- Team information.

FR-01 cũng có quan hệ với:

- FR-04 — Group Stage Management.
- FR-05 — Knockout Stage Management.
- FR-06 — Tournament Management.
- FR-08 — Database Management.

---

### 10.1.5 FR-02 Traceability

**FR-02 — Player Management**

Requirement được kiểm chứng thông qua:

`PlayerTest.java`

Các phạm vi liên quan:

- Player creation.
- Player name.
- Player information.

FR-02 cũng có quan hệ với:

- FR-03 — Match Management.
- FR-07 — Top Scorer Management.
- FR-08 — Database Management.

---

### 10.1.6 FR-03 Traceability

**FR-03 — Match Management**

Requirement được kiểm chứng thông qua:

`MatchTest.java`

Các phạm vi liên quan:

- Match Duration.
- Half Duration.
- Half-time Break.
- Extra-time.
- Silver Goal.
- Penalty Kicks.
- Sudden Death.
- Yellow Cards.
- Red Cards.
- Minimum Players.
- Substitutions.

FR-03 cũng có quan hệ với:

- FR-04 — Group Stage Management.
- FR-05 — Knockout Stage Management.
- FR-06 — Tournament Management.
- FR-09 — Web Application.

---

### 10.1.7 FR-04 Traceability

**FR-04 — Group Stage Management**

Requirement được kiểm chứng thông qua:

`GroupStageTest.java`

Các phạm vi liên quan:

- 32 Teams.
- 8 Groups.
- 4 Teams mỗi Group.
- 3 đối thủ mỗi Team.
- Point calculation.
- Ranking.
- Cards.
- Head-to-head.
- Draw Lot.
- Qualification.

FR-04 cũng có quan hệ với:

- FR-03 — Match Management.
- FR-05 — Knockout Stage Management.
- FR-06 — Tournament Management.

---

### 10.1.8 FR-05 Traceability

**FR-05 — Knockout Stage Management**

Requirement được kiểm chứng thông qua:

`KnockoutStageTest.java`

Các phạm vi liên quan:

- Round of 16.
- Quarterfinals.
- Semifinals.
- Final.
- Team progression.
- Tournament Champion.
- Medal assignment.

FR-05 cũng có quan hệ với:

- FR-03 — Match Management.
- FR-04 — Group Stage Management.
- FR-06 — Tournament Management.

---

### 10.1.9 FR-06 Traceability

**FR-06 — Tournament Management**

Requirement được kiểm chứng thông qua:

`TournamentTest.java`

Các phạm vi liên quan:

- Tournament initialization.
- 32 Teams.
- 8 Groups.
- Group Stage.
- Qualification.
- Round of 16.
- Knockout Stage.
- Tournament Champion.
- Match Results.
- Tournament Results.

FR-06 cũng có quan hệ với:

- FR-01 — Team Management.
- FR-03 — Match Management.
- FR-04 — Group Stage Management.
- FR-05 — Knockout Stage Management.
- FR-08 — Database Management.

---

### 10.1.10 FR-07 Traceability

**FR-07 — Top Scorer Management**

Requirement được kiểm chứng thông qua:

`TopScorerTest.java`

Các phạm vi liên quan:

- Goal recording.
- Goal accumulation.
- Top Scorer.
- Shared Top Scorer.
- No Top Scorer.
- Top Scorer update.

FR-07 cũng có quan hệ với:

- FR-02 — Player Management.
- FR-03 — Match Management.

---

### 10.1.11 FR-08 Traceability

**FR-08 — Database Management**

Requirement được kiểm chứng thông qua:

`DatabaseTest.java`

Các phạm vi liên quan:

- Team storage.
- Group storage.
- Match storage.
- Player storage.
- Match Result storage.
- Data retrieval.
- Multiple records.
- Non-existing records.

FR-08 cũng có quan hệ với:

- FR-01 — Team Management.
- FR-02 — Player Management.
- FR-03 — Match Management.
- FR-06 — Tournament Management.

---

### 10.1.12 FR-09 Traceability

**FR-09 — Web Application**

Requirement được kiểm chứng thông qua:

`MatchWebTest.java`

Selenium Web UI Test Cases:

- `TC_WEB_001` — Valid 90-minute match.
- `TC_WEB_002` — Invalid 89-minute match.
- `TC_WEB_003` — Invalid 91-minute match.
- `TC_WEB_004` — Homepage UI verification.
- `TC_WEB_005` — Empty match-duration input.
- `TC_WEB_006` — Invalid non-numeric input.

FR-09 có quan hệ trực tiếp với:

- FR-03 — Match Management.

---

### 10.1.13 FR-10 Traceability

**FR-10 — Automated Testing**

Requirement được kiểm chứng thông qua toàn bộ testing infrastructure:

- JUnit 5.
- Selenium WebDriver.
- Maven.
- Allure Report.

FR-10 cung cấp cơ sở để thực thi và ghi nhận kết quả kiểm thử của
các Functional Requirements khác.

---

### 10.1.14 Traceability giữa Requirements và Test Suites

| Requirement | Unit Test | Web UI Test | Database | Reporting |
|---|---|---|---|---|
| FR-01 | `TeamTest.java` | - | - | Allure |
| FR-02 | `PlayerTest.java` | - | - | Allure |
| FR-03 | `MatchTest.java` | `MatchWebTest.java` | - | Allure |
| FR-04 | `GroupStageTest.java` | - | - | Allure |
| FR-05 | `KnockoutStageTest.java` | - | - | Allure |
| FR-06 | `TournamentTest.java` | - | `DatabaseTest.java` | Allure |
| FR-07 | `TopScorerTest.java` | - | - | Allure |
| FR-08 | `DatabaseTest.java` | - | Database operations | Allure |
| FR-09 | - | `MatchWebTest.java` | - | Allure |
| FR-10 | JUnit 5 | Selenium | Maven | Allure |

---

### 10.1.15 Traceability với Testing Techniques

Các Functional Requirements được kiểm chứng bằng nhiều kỹ thuật:

| Requirement | Functional | BVA | Decision-based | Selenium |
|---|---|---|---|---|
| FR-01 | ✓ | ✓ | ✓ | - |
| FR-02 | ✓ | - | - | - |
| FR-03 | ✓ | ✓ | ✓ | ✓ |
| FR-04 | ✓ | ✓ | ✓ | - |
| FR-05 | ✓ | ✓ | ✓ | - |
| FR-06 | ✓ | ✓ | ✓ | - |
| FR-07 | ✓ | - | ✓ | - |
| FR-08 | ✓ | - | ✓ | - |
| FR-09 | ✓ | ✓ | ✓ | ✓ |
| FR-10 | ✓ | - | - | ✓ |

---

### 10.1.16 Coverage Summary

Tổng số Functional Requirements:

**10**

Functional Requirements có test coverage:

**10**

Tỷ lệ coverage:

**10 / 10 = 100%**

---

### 10.1.17 Tiêu chí hoàn thành

Requirements Traceability được xem là hoàn thành khi:

- Mỗi Functional Requirement có Requirement ID rõ ràng.
- Mỗi Functional Requirement có test coverage tương ứng.
- Test Suite được xác định cho từng Requirement.
- Web Requirement có Selenium test tương ứng.
- Database Requirement có Database test tương ứng.
- Automated Testing Requirement được ánh xạ tới testing infrastructure.
- Test execution evidence có thể được truy xuất.
- Không có Functional Requirement không được ánh xạ.

---

### 10.1.18 Trạng thái

**Status: Covered**

Requirements Traceability hiện tại:

**10 / 10 Functional Requirements covered — 100%.**

Automated test execution:

**257 / 257 test cases passed — 100% pass rate.**

Selenium Web UI:

**6 / 6 test cases passed — 100% pass rate.**

---

### 10.1.19 Kết luận

Requirements Traceability cung cấp mối liên hệ giữa SRS, Functional
Requirements, Test Suites và Test Execution Evidence.

Tất cả 10 Functional Requirements từ FR-01 đến FR-10 đều được ánh xạ
tới các thành phần kiểm thử tương ứng.

**10.1 — Requirements Traceability: Covered.**

## 10.2 Functional Requirements và Test Cases

### 10.2.1 Mục đích

Mục này ánh xạ các Functional Requirements từ FR-01 đến FR-10 với các
Test Case và Test Suite tương ứng.

Mục tiêu là xác định rõ mỗi yêu cầu chức năng được kiểm chứng bằng
những bài kiểm thử nào.

---

### 10.2.2 FR-01 — Team Management

Functional Requirement:

**FR-01 — Team Management**

Test Suite chính:

`TeamTest.java`

Phạm vi kiểm thử:

- Assistant Coaches.
- Players.
- Starting Players.
- Substitute Players.
- Team information.
- Các giới hạn số lượng.

Traceability:

`FR-01 → TeamTest.java`

---

### 10.2.3 FR-02 — Player Management

Functional Requirement:

**FR-02 — Player Management**

Test Suite chính:

`PlayerTest.java`

Phạm vi kiểm thử:

- Player creation.
- Player name.
- Stored Player name.

Traceability:

`FR-02 → PlayerTest.java`

---

### 10.2.4 FR-03 — Match Management

Functional Requirement:

**FR-03 — Match Management**

Test Suite chính:

`MatchTest.java`

Phạm vi kiểm thử:

- Match Duration.
- Half Duration.
- Half-time Break.
- Extra-time.
- Silver Goal.
- Penalty Kicks.
- Sudden Death.
- Yellow Cards.
- Red Cards.
- Minimum Players.
- Substitutions.
- Player Position.

Web UI liên quan:

`MatchWebTest.java`

Traceability:

`FR-03 → MatchTest.java`

`FR-03 → MatchWebTest.java`

---

### 10.2.5 FR-04 — Group Stage Management

Functional Requirement:

**FR-04 — Group Stage Management**

Test Suite chính:

`GroupStageTest.java`

Phạm vi kiểm thử:

- 32 Teams.
- 8 Groups.
- 4 Teams mỗi Group.
- 3 đối thủ mỗi Team.
- Win = 3 points.
- Draw = 1 point.
- Loss = 0 points.
- Goal Difference.
- Cards.
- Head-to-head Result.
- Draw Lot.
- Qualification.

Traceability:

`FR-04 → GroupStageTest.java`

---

### 10.2.6 FR-05 — Knockout Stage Management

Functional Requirement:

**FR-05 — Knockout Stage Management**

Test Suite chính:

`KnockoutStageTest.java`

Phạm vi kiểm thử:

- Round of 16.
- Quarterfinals.
- Semifinals.
- Final.
- Team progression.
- Tournament Champion.
- Gold Medal.
- Silver Medal.
- Bronze Medals.

Traceability:

`FR-05 → KnockoutStageTest.java`

---

### 10.2.7 FR-06 — Tournament Management

Functional Requirement:

**FR-06 — Tournament Management**

Test Suite chính:

`TournamentTest.java`

Phạm vi kiểm thử:

- Tournament initialization.
- 32 Teams.
- 8 Groups.
- Group Stage.
- 16 Qualified Teams.
- Round of 16.
- Knockout Stage.
- Tournament Champion.
- Match Results.
- Tournament Results.

Các Test Suite liên quan:

- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `DatabaseTest.java`

Traceability:

`FR-06 → TournamentTest.java`

---

### 10.2.8 FR-07 — Top Scorer Management

Functional Requirement:

**FR-07 — Top Scorer Management**

Test Suite chính:

`TopScorerTest.java`

Phạm vi kiểm thử:

- Goal recording.
- Goal accumulation.
- Highest goal scorer.
- No Top Scorer.
- Shared Top Scorers.
- Shared Top Scorer identification.
- Top Scorer update.

Traceability:

`FR-07 → TopScorerTest.java`

---

### 10.2.9 FR-08 — Database Management

Functional Requirement:

**FR-08 — Database Management**

Test Suite chính:

`DatabaseTest.java`

Phạm vi kiểm thử:

- Team storage.
- Group storage.
- Match storage.
- Player storage.
- Match Result storage.
- Data retrieval.
- Multiple records.
- Non-existing records.

Traceability:

`FR-08 → DatabaseTest.java`

---

### 10.2.10 FR-09 — Web Application

Functional Requirement:

**FR-09 — Web Application**

Test Suite chính:

`MatchWebTest.java`

Các Test Case:

| Test Case ID | Test Case | Requirement |
|---|---|---|
| TC_WEB_001 | Valid 90-minute match | FR-09 |
| TC_WEB_002 | Invalid 89-minute match | FR-09 |
| TC_WEB_003 | Invalid 91-minute match | FR-09 |
| TC_WEB_004 | Homepage UI verification | FR-09 |
| TC_WEB_005 | Empty match-duration input | FR-09 |
| TC_WEB_006 | Invalid non-numeric input | FR-09 |

Traceability:

`FR-09 → MatchWebTest.java → TC_WEB_001 ... TC_WEB_006`

---

### 10.2.11 FR-10 — Automated Testing

Functional Requirement:

**FR-10 — Automated Testing**

Các thành phần kiểm thử:

- JUnit 5.
- Selenium WebDriver.
- Maven.
- Allure Report.

FR-10 liên quan đến toàn bộ automated testing infrastructure của
project.

Traceability:

`FR-10 → JUnit 5 / Selenium / Maven / Allure`

---

### 10.2.12 Functional Requirements và Test Suites

| Requirement ID | Functional Requirement | Main Test Suite |
|---|---|---|
| FR-01 | Team Management | `TeamTest.java` |
| FR-02 | Player Management | `PlayerTest.java` |
| FR-03 | Match Management | `MatchTest.java` |
| FR-04 | Group Stage Management | `GroupStageTest.java` |
| FR-05 | Knockout Stage Management | `KnockoutStageTest.java` |
| FR-06 | Tournament Management | `TournamentTest.java` |
| FR-07 | Top Scorer Management | `TopScorerTest.java` |
| FR-08 | Database Management | `DatabaseTest.java` |
| FR-09 | Web Application | `MatchWebTest.java` |
| FR-10 | Automated Testing | JUnit 5 / Selenium / Maven / Allure |

---

### 10.2.13 Web Test Case Mapping

Các Web Test Case được ánh xạ chi tiết:

| Test Case ID | Input / Action | Expected Result |
|---|---|---|
| TC_WEB_001 | Enter 90 minutes | Valid |
| TC_WEB_002 | Enter 89 minutes | Invalid |
| TC_WEB_003 | Enter 91 minutes | Invalid |
| TC_WEB_004 | Open Homepage | Homepage displayed correctly |
| TC_WEB_005 | Leave duration empty | Browser validation |
| TC_WEB_006 | Enter non-numeric value | `INVALID: Minutes must be a number.` |

---

### 10.2.14 Testing Technique Mapping

Các Functional Requirements được kiểm chứng bằng các kỹ thuật:

| Requirement | Functional | BVA | Decision-based | Selenium |
|---|---|---|---|---|
| FR-01 | ✓ | ✓ | ✓ | - |
| FR-02 | ✓ | - | - | - |
| FR-03 | ✓ | ✓ | ✓ | ✓ |
| FR-04 | ✓ | ✓ | ✓ | - |
| FR-05 | ✓ | ✓ | ✓ | - |
| FR-06 | ✓ | ✓ | ✓ | - |
| FR-07 | ✓ | - | ✓ | - |
| FR-08 | ✓ | - | ✓ | - |
| FR-09 | ✓ | ✓ | ✓ | ✓ |
| FR-10 | ✓ | - | - | ✓ |

---

### 10.2.15 Test Execution Summary

Automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Selenium Web UI suite:

| Metric | Result |
|---|---:|
| Total Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 10.2.16 Coverage Summary

Tổng số Functional Requirements:

**10**

Functional Requirements có Test Suite tương ứng:

**10**

Requirements coverage:

**10 / 10 = 100%**

Web Application coverage:

**6 / 6 Selenium Test Cases passed = 100%**

---

### 10.2.17 Tiêu chí hoàn thành

Mục này được xem là hoàn thành khi:

- FR-01 đến FR-10 được ánh xạ tới Test Suite tương ứng.
- Các Web Test Case được ánh xạ tới FR-09.
- Testing techniques được xác định.
- Test execution results được ghi nhận.
- Không có Functional Requirement không được ánh xạ.
- Test coverage đạt 100%.

---

### 10.2.18 Trạng thái

**Status: Covered**

Kết quả traceability:

**10 / 10 Functional Requirements covered — 100%.**

Automated test execution:

**257 / 257 test cases passed — 100% pass rate.**

Selenium Web UI:

**6 / 6 test cases passed — 100% pass rate.**

---

### 10.2.19 Kết luận

Mỗi Functional Requirement trong World Cup Test Application đều được
ánh xạ tới Test Suite hoặc testing infrastructure tương ứng.

Đặc biệt, FR-09 được ánh xạ trực tiếp tới 6 Selenium Web UI Test Cases,
trong khi FR-10 được ánh xạ tới toàn bộ automated testing
infrastructure.

**10.2 — Functional Requirements và Test Cases: Covered.**

## 10.3 Test Execution Evidence

### 10.3.1 Mục đích

Mục này đặc tả các bằng chứng được sử dụng để chứng minh quá trình
thực thi automated testing của World Cup Test Application.

Test Execution Evidence được sử dụng để xác minh rằng các test case
được thực thi và kết quả kiểm thử có thể được kiểm tra, lưu trữ và
báo cáo.

---

### 10.3.2 Phạm vi Evidence

Test Execution Evidence bao gồm kết quả từ:

- JUnit 5 Unit Tests.
- Functional Tests.
- Boundary Value Analysis.
- Decision-based Testing.
- Selenium WebDriver Tests.
- Database Tests.
- Automated Regression Tests.
- Maven Test Execution.
- Allure Report.

---

### 10.3.3 JUnit 5 Test Evidence

JUnit 5 cung cấp execution result cho các unit test của project.

Các test suite chính:

- `TeamTest.java`
- `PlayerTest.java`
- `MatchTest.java`
- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `TournamentTest.java`
- `TopScorerTest.java`
- `DatabaseTest.java`

JUnit test results được sử dụng để chứng minh trạng thái của business
logic và database-related tests.

---

### 10.3.4 Selenium Web UI Evidence

Selenium WebDriver cung cấp execution evidence cho Web Application.

Test suite:

`MatchWebTest.java`

Các Test Case:

- `TC_WEB_001` — Valid 90-minute match.
- `TC_WEB_002` — Invalid 89-minute match.
- `TC_WEB_003` — Invalid 91-minute match.
- `TC_WEB_004` — Homepage UI verification.
- `TC_WEB_005` — Empty match-duration input.
- `TC_WEB_006` — Invalid non-numeric input.

Kết quả hiện tại:

**6 / 6 Selenium test cases passed — 100% pass rate.**

---

### 10.3.5 Maven Test Execution Evidence

Maven được sử dụng để thực hiện automated test execution.

Luồng tổng quát:

`Maven → Test Execution → Test Results`

Maven cung cấp cơ chế thực thi test theo cấu hình của project và hỗ trợ
việc chạy lại toàn bộ automated test suite.

Test results sau execution được sử dụng cho việc đánh giá trạng thái
của test suite và tạo report.

---

### 10.3.6 Tổng hợp Test Execution Result

Kết quả automated test suite hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Kết quả này được sử dụng làm execution evidence cho trạng thái kiểm
thử hiện tại của project.

---

### 10.3.7 Selenium Execution Result

Selenium Web UI suite có:

| Metric | Result |
|---|---:|
| Total Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

Các test case bao phủ:

- Valid input.
- Invalid input.
- Boundary values.
- Homepage.
- Empty input.
- Non-numeric input.

---

### 10.3.8 Test Result Evidence

Test Result Evidence phải cho phép xác định:

- Test Case đã được thực thi.
- Test Case Passed hoặc Failed.
- Số lượng Test Case.
- Tổng số Passed.
- Tổng số Failed.
- Errors.
- Skipped tests.
- Pass rate.

Các thông tin này được sử dụng để đánh giá chất lượng của automated
test execution.

---

### 10.3.9 Allure Evidence

Allure Report được sử dụng để trình bày Test Execution Evidence.

Luồng tổng quát:

`Test Execution → Test Results → Allure Report`

Allure Report cung cấp giao diện để xem kết quả kiểm thử và trạng thái
của các test case.

Report có thể được sử dụng làm bằng chứng cho:

- Test execution.
- Test status.
- Test count.
- Passed tests.
- Failed tests.
- Regression testing.

---

### 10.3.10 Evidence cho Requirements Traceability

Test Execution Evidence được liên kết với Requirements Traceability.

Luồng:

`Requirement → Test Case → Test Execution → Test Result → Evidence`

Ví dụ:

`FR-09 → TC_WEB_001 → Selenium Execution → Passed → Test Evidence`

Tương tự, các Functional Requirements khác được ánh xạ tới Test
Suite tương ứng.

---

### 10.3.11 Evidence cho Acceptance Criteria

Test Execution Evidence được sử dụng để chứng minh các Acceptance
Criteria.

Các kết quả hiện tại:

- **10 / 10 Functional Requirements covered.**
- **257 / 257 automated test cases passed.**
- **6 / 6 Selenium test cases passed.**
- **100% automated test pass rate.**
- **100% Selenium Web UI pass rate.**
- **0 Failed tests.**
- **0 Errors.**
- **0 Skipped tests.**

---

### 10.3.12 Regression Test Evidence

Khi regression testing được thực hiện, kết quả execution phải được
ghi nhận để có thể so sánh với các lần test trước.

Regression evidence có thể được sử dụng để xác định:

- Chức năng tiếp tục hoạt động.
- Test case tiếp tục Passed.
- Có regression failure hay không.
- Có thay đổi về test result hay không.

---

### 10.3.13 CI Evidence

Nếu automated testing được thực thi thông qua GitHub Actions, workflow
execution có thể cung cấp thêm evidence về:

- Build status.
- Test execution status.
- Workflow status.
- Test result.

Luồng tổng quát:

`GitHub Push → GitHub Actions → Maven → Automated Tests → Execution Result`

Việc sử dụng CI evidence phụ thuộc vào workflow được cấu hình trong
repository.

---

### 10.3.14 Evidence Matrix

| Evidence Source | Mục đích | Phạm vi |
|---|---|---|
| JUnit 5 Results | Unit / Business Logic Testing | FR-01 đến FR-08 |
| Selenium Results | Web UI Testing | FR-09 |
| Maven Execution | Automated Test Execution | FR-10 |
| Allure Report | Test Reporting | Automated Test Suite |
| GitHub Actions | CI Test Execution | Theo workflow project |

---

### 10.3.15 Tiêu chí hoàn thành

Test Execution Evidence được xem là đáp ứng khi:

- Automated tests được thực thi.
- Test results được tạo.
- Test status được xác định.
- Tổng số test cases được ghi nhận.
- Passed, Failed, Error và Skipped được xác định.
- Selenium test results được ghi nhận.
- Maven execution được hoàn thành.
- Test results có thể được sử dụng để tạo Allure Report.
- Evidence có thể được sử dụng cho Requirements Traceability.
- Evidence có thể được sử dụng cho Acceptance Criteria.

---

### 10.3.16 Trạng thái

**Status: Covered**

Execution evidence hiện tại:

**257 / 257 automated test cases passed — 100% pass rate.**

Selenium Web UI:

**6 / 6 test cases passed — 100% pass rate.**

Không có:

- Failed test.
- Error.
- Skipped test.

---

### 10.3.17 Kết luận

Test Execution Evidence cung cấp bằng chứng cho quá trình thực thi và
kết quả của automated testing trong World Cup Test Application.

JUnit 5, Selenium WebDriver và Maven cung cấp execution results, trong
khi Allure Report được sử dụng để trình bày và báo cáo các kết quả
này.

Các evidence được sử dụng để hỗ trợ Requirements Traceability và
Acceptance Criteria của project.

**10.3 — Test Execution Evidence: Covered.**

## 10.4 Allure Report

### 10.4.1 Mục đích

Allure Report được sử dụng để tạo báo cáo từ kết quả thực thi
automated testing của World Cup Test Application.

Mục tiêu là cung cấp Test Execution Evidence dưới dạng báo cáo trực
quan, giúp theo dõi trạng thái và kết quả của các test case.

---

### 10.4.2 Vai trò của Allure

Allure đóng vai trò là thành phần reporting trong testing process.

Allure không thực hiện business logic và không thay thế các framework
kiểm thử.

Luồng tổng quát:

`Test Execution → Test Results → Allure Report`

---

### 10.4.3 Nguồn dữ liệu

Allure Report sử dụng test results được tạo trong quá trình automated
test execution.

Các nguồn test execution chính gồm:

- JUnit 5.
- Selenium WebDriver.

Maven được sử dụng để hỗ trợ quá trình thực thi test.

---

### 10.4.4 Nội dung báo cáo

Allure Report được sử dụng để thể hiện các thông tin liên quan đến
test execution, bao gồm:

- Tổng số test cases.
- Test cases Passed.
- Test cases Failed.
- Test execution status.
- Test execution results.

Các thông tin này được sử dụng làm evidence cho quá trình kiểm thử.

---

### 10.4.5 Allure và Unit Testing

Kết quả của các JUnit 5 test suite có thể được sử dụng để tạo Allure
Report.

Các test suite chính:

- `TeamTest.java`
- `PlayerTest.java`
- `MatchTest.java`
- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `TournamentTest.java`
- `TopScorerTest.java`
- `DatabaseTest.java`

Luồng:

`JUnit 5 → Test Execution → Test Results → Allure Report`

---

### 10.4.6 Allure và Selenium Testing

Kết quả của Selenium Web UI Testing cũng được sử dụng làm test
execution evidence.

Test suite:

`MatchWebTest.java`

Các Test Case:

- `TC_WEB_001`
- `TC_WEB_002`
- `TC_WEB_003`
- `TC_WEB_004`
- `TC_WEB_005`
- `TC_WEB_006`

Luồng:

`Selenium WebDriver → Test Results → Allure Report`

---

### 10.4.7 Allure và Maven

Maven hỗ trợ quá trình automated test execution và tạo test results
được sử dụng cho reporting.

Luồng tổng quát:

`Maven → JUnit 5 / Selenium → Test Results → Allure Report`

Allure sử dụng kết quả của quá trình test execution để tạo báo cáo.

---

### 10.4.8 Allure và Requirements Traceability

Allure Report hỗ trợ việc cung cấp execution evidence cho
Requirements Traceability.

Luồng:

`Functional Requirement → Test Case → Test Execution → Allure Report`

Ví dụ:

`FR-09 → TC_WEB_001 → Selenium Execution → Allure Report`

Các Functional Requirements khác cũng được liên kết với Test Suite
tương ứng trong Requirements Traceability.

---

### 10.4.9 Allure và Acceptance Criteria

Allure Report cung cấp evidence hỗ trợ đánh giá Acceptance Criteria.

Các kết quả kiểm thử hiện tại:

| Metric | Result |
|---|---:|
| Total automated test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Selenium Web UI:

| Metric | Result |
|---|---:|
| Total Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 10.4.10 Allure và Regression Testing

Allure Report có thể được sử dụng để ghi nhận kết quả của các lần
Automated Regression Testing.

Sau mỗi lần regression test, kết quả execution có thể được sử dụng để
tạo report tương ứng.

Mục đích:

- Theo dõi trạng thái test.
- Phát hiện Failed test.
- So sánh kết quả execution.
- Cung cấp execution evidence.

---

### 10.4.11 Allure trong Testing Process

Allure nằm ở bước reporting trong testing process:

1. Functional Requirement được xác định.
2. Test Case được xây dựng.
3. Automated Test được thực thi.
4. Test Results được tạo.
5. Allure Report được tạo.
6. Test Execution Evidence được sử dụng cho Traceability và
   Acceptance Criteria.

Luồng:

`Requirement → Test Case → Test Execution → Test Results → Allure Report`

---

### 10.4.12 Evidence Matrix

| Thành phần | Vai trò |
|---|---|
| JUnit 5 | Unit Test Execution |
| Selenium WebDriver | Web UI Test Execution |
| Maven | Automated Test Execution |
| Allure | Test Reporting |
| GitHub Actions | CI Test Execution theo workflow |

Allure là thành phần reporting và không trực tiếp thực hiện các
automated test.

---

### 10.4.13 Tiêu chí hoàn thành

Allure Reporting được xem là đáp ứng khi:

- Automated test execution tạo được test results.
- Test results có thể được sử dụng để tạo Allure Report.
- Report thể hiện trạng thái của test cases.
- Report cung cấp execution evidence.
- Report có thể được sử dụng để hỗ trợ Requirements Traceability.
- Report có thể được sử dụng để hỗ trợ Acceptance Criteria.

---

### 10.4.14 Trạng thái

**Status: Covered**

Allure được xác định là công cụ reporting trong automated testing
process của project.

Kết quả automated test hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

Selenium Web UI:

**6 / 6 test cases passed — 100% pass rate.**

---

### 10.4.15 Kết luận

Allure Report cung cấp lớp reporting cho automated testing của
World Cup Test Application.

Kết quả từ JUnit 5 và Selenium WebDriver được sử dụng làm test
execution data, Maven hỗ trợ automated execution và Allure cung cấp
báo cáo kết quả.

Allure Report đóng vai trò quan trọng trong việc cung cấp
Test Execution Evidence, Requirements Traceability và Acceptance
Evidence.

**10.4 — Allure Report: Covered.**

## 11. Kết luận

## 11.1 Tổng quan

### 11.1.1 Mục đích

Mục này tổng kết phạm vi, chức năng và kết quả kiểm thử của
World Cup Test Application dựa trên các yêu cầu và nội dung đã được
đặc tả trong tài liệu.

---

### 11.1.2 Tổng quan hệ thống

World Cup Test Application là hệ thống được phát triển bằng Java và
áp dụng phương pháp Test-Driven Development (TDD).

Hệ thống mô hình hóa và kiểm tra các chức năng liên quan đến một giải
đấu World Cup, bao gồm:

- Team Management.
- Player Management.
- Match Management.
- Group Stage Management.
- Knockout Stage Management.
- Tournament Management.
- Top Scorer Management.
- Database Management.
- Web Application.
- Automated Testing.

---

### 11.1.3 Tổng quan các Functional Requirements

Hệ thống được đặc tả với 10 Functional Requirements:

| Requirement | Chức năng |
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

Các Functional Requirements được sử dụng làm cơ sở để xây dựng
Functional Requirements Specification, Test Cases và
Requirements Traceability.

---

### 11.1.4 Tổng quan Testing

Testing được thực hiện thông qua nhiều kỹ thuật và công cụ:

- Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Selenium Web UI Testing.
- Database Testing.
- Automated Regression Testing.

JUnit 5 được sử dụng cho các automated unit tests.

Selenium WebDriver được sử dụng để kiểm thử Web Application.

Maven hỗ trợ quá trình automated test execution.

Allure được sử dụng để tạo test reports.

---

### 11.1.5 Tổng quan Test Suites

Các test suite chính của project gồm:

- `TeamTest.java`
- `PlayerTest.java`
- `MatchTest.java`
- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `TournamentTest.java`
- `TopScorerTest.java`
- `DatabaseTest.java`
- `MatchWebTest.java`

Các test suite này bao phủ các Functional Requirements tương ứng.

---

### 11.1.6 Tổng quan Web UI Testing

Web Application được kiểm thử bằng Selenium WebDriver.

Selenium Web UI suite gồm 6 Test Cases:

- `TC_WEB_001` — Valid 90-minute match.
- `TC_WEB_002` — Invalid 89-minute match.
- `TC_WEB_003` — Invalid 91-minute match.
- `TC_WEB_004` — Homepage UI verification.
- `TC_WEB_005` — Empty match-duration input.
- `TC_WEB_006` — Invalid non-numeric input.

Kết quả:

**6 / 6 Selenium test cases passed — 100% pass rate.**

---

### 11.1.7 Tổng quan Test Execution

Kết quả automated test execution hiện tại:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Kết quả này là bằng chứng cho trạng thái kiểm thử được ghi nhận
trong project.

---

### 11.1.8 Tổng quan Requirements Traceability

Các Functional Requirements từ FR-01 đến FR-10 đều được ánh xạ tới
Test Suite hoặc testing infrastructure tương ứng.

Tổng coverage:

**10 / 10 Functional Requirements covered — 100%.**

Traceability được duy trì giữa:

`Requirement → Test Case → Test Execution → Test Result → Evidence`

---

### 11.1.9 Tổng quan Test Reporting

Test execution results được sử dụng để tạo Test Execution Evidence.

Allure Report được sử dụng làm reporting layer cho automated testing.

Luồng tổng quát:

`Automated Test Execution → Test Results → Allure Report`

Các test results cũng được sử dụng để hỗ trợ Requirements Traceability
và Acceptance Criteria.

---

### 11.1.10 Kết luận

World Cup Test Application đã xác định đầy đủ phạm vi chức năng chính
của hệ thống và xây dựng automated testing tương ứng.

10 Functional Requirements được ánh xạ tới các test suite và testing
infrastructure.

Kết quả kiểm thử hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

**10 / 10 Functional Requirements covered — 100%.**

**11.1 — Tổng quan: Completed.**

## 11.2 Mức độ đáp ứng yêu cầu

### 11.2.1 Mục đích

Mục này tổng kết mức độ đáp ứng của World Cup Test Application đối với
các Functional Requirements đã được đặc tả.

Mức độ đáp ứng được đánh giá dựa trên Requirements Traceability và
kết quả automated test execution.

---

### 11.2.2 Tổng quan mức độ đáp ứng

Hệ thống có tổng cộng:

**10 Functional Requirements.**

Các Functional Requirements đều có Test Suite hoặc testing
infrastructure tương ứng.

| Requirement ID | Functional Requirement | Test Coverage | Status |
|---|---|---|---|
| FR-01 | Team Management | `TeamTest.java` | Covered |
| FR-02 | Player Management | `PlayerTest.java` | Covered |
| FR-03 | Match Management | `MatchTest.java` | Covered |
| FR-04 | Group Stage Management | `GroupStageTest.java` | Covered |
| FR-05 | Knockout Stage Management | `KnockoutStageTest.java` | Covered |
| FR-06 | Tournament Management | `TournamentTest.java` | Covered |
| FR-07 | Top Scorer Management | `TopScorerTest.java` | Covered |
| FR-08 | Database Management | `DatabaseTest.java` | Covered |
| FR-09 | Web Application | `MatchWebTest.java` | Covered |
| FR-10 | Automated Testing | JUnit 5 / Selenium / Maven / Allure | Covered |

---

### 11.2.3 FR-01 — Team Management

FR-01 được xem là đáp ứng thông qua `TeamTest.java`.

Các nội dung chính được kiểm thử:

- Team information.
- Assistant Coaches.
- Players.
- Starting Players.
- Substitute Players.
- Các giới hạn số lượng.

**Status: Covered**

---

### 11.2.4 FR-02 — Player Management

FR-02 được xem là đáp ứng thông qua `PlayerTest.java`.

Các nội dung chính:

- Player creation.
- Player name.
- Stored Player name.

**Status: Covered**

---

### 11.2.5 FR-03 — Match Management

FR-03 được xem là đáp ứng thông qua `MatchTest.java`.

Các nội dung chính:

- Match Duration.
- Half Duration.
- Half-time Break.
- Extra-time.
- Silver Goal.
- Penalty Kicks.
- Sudden Death.
- Yellow Cards.
- Red Cards.
- Minimum Players.
- Substitutions.
- Player Position.

Match Duration trên Web được kiểm thử thêm thông qua
`MatchWebTest.java`.

**Status: Covered**

---

### 11.2.6 FR-04 — Group Stage Management

FR-04 được xem là đáp ứng thông qua `GroupStageTest.java`.

Các nội dung chính:

- 32 Teams.
- 8 Groups.
- 4 Teams mỗi Group.
- 3 đối thủ mỗi Team.
- Point calculation.
- Ranking.
- Cards.
- Head-to-head.
- Draw Lot.
- Qualification.

**Status: Covered**

---

### 11.2.7 FR-05 — Knockout Stage Management

FR-05 được xem là đáp ứng thông qua `KnockoutStageTest.java`.

Các nội dung chính:

- Round of 16.
- Quarterfinals.
- Semifinals.
- Final.
- Team progression.
- Tournament Champion.
- Medal assignment.

**Status: Covered**

---

### 11.2.8 FR-06 — Tournament Management

FR-06 được xem là đáp ứng thông qua `TournamentTest.java`.

Các nội dung chính:

- Tournament initialization.
- 32 Teams.
- 8 Groups.
- Group Stage.
- 16 Qualified Teams.
- Round of 16.
- Knockout Stage.
- Tournament Champion.
- Match Results.
- Tournament Results.

Các chức năng liên quan được hỗ trợ thêm bởi:

- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `DatabaseTest.java`

**Status: Covered**

---

### 11.2.9 FR-07 — Top Scorer Management

FR-07 được xem là đáp ứng thông qua `TopScorerTest.java`.

Các nội dung chính:

- Goal recording.
- Goal accumulation.
- Top Scorer.
- No Top Scorer.
- Shared Top Scorers.
- Top Scorer update.

**Status: Covered**

---

### 11.2.10 FR-08 — Database Management

FR-08 được xem là đáp ứng thông qua `DatabaseTest.java`.

Các nội dung chính:

- Team storage.
- Group storage.
- Match storage.
- Player storage.
- Match Result storage.
- Data retrieval.
- Multiple records.
- Non-existing records.

**Status: Covered**

---

### 11.2.11 FR-09 — Web Application

FR-09 được xem là đáp ứng thông qua `MatchWebTest.java`.

6 Selenium Web UI Test Cases:

- `TC_WEB_001` — Valid 90-minute match.
- `TC_WEB_002` — Invalid 89-minute match.
- `TC_WEB_003` — Invalid 91-minute match.
- `TC_WEB_004` — Homepage UI verification.
- `TC_WEB_005` — Empty match-duration input.
- `TC_WEB_006` — Invalid non-numeric input.

Kết quả:

**6 / 6 Selenium test cases passed — 100% pass rate.**

**Status: Covered**

---

### 11.2.12 FR-10 — Automated Testing

FR-10 được đáp ứng thông qua testing infrastructure của project:

- JUnit 5.
- Selenium WebDriver.
- Maven.
- Allure Report.

Các thành phần này hỗ trợ quá trình automated test execution và
reporting.

**Status: Covered**

---

### 11.2.13 Requirements Coverage

Tổng hợp mức độ đáp ứng:

| Metric | Result |
|---|---:|
| Total Functional Requirements | 10 |
| Covered Requirements | 10 |
| Uncovered Requirements | 0 |
| Requirements Coverage | 100% |

Kết quả:

**10 / 10 Functional Requirements covered — 100%.**

---

### 11.2.14 Test Execution Support

Mức độ đáp ứng yêu cầu được hỗ trợ bởi kết quả automated testing:

| Metric | Result |
|---|---:|
| Total automated test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Selenium Web UI:

| Metric | Result |
|---|---:|
| Total Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 11.2.15 Traceability

Mức độ đáp ứng được xác minh thông qua chuỗi:

`Requirement → Test Suite → Test Execution → Test Result → Evidence`

Mỗi Functional Requirement từ FR-01 đến FR-10 đều có mapping tương
ứng.

---

### 11.2.16 Tiêu chí đánh giá

Một Functional Requirement được xác định là **Covered** khi:

- Requirement được định nghĩa rõ ràng.
- Có Test Suite hoặc testing infrastructure tương ứng.
- Test execution được thực hiện.
- Test result được ghi nhận.
- Không có Failed hoặc Error liên quan trong kết quả hiện tại.

---

### 11.2.17 Trạng thái tổng thể

**Status: Fully Covered**

Mức độ đáp ứng hiện tại:

**10 / 10 Functional Requirements covered — 100%.**

Kết quả automated testing:

**257 / 257 test cases passed — 100% pass rate.**

Selenium Web UI:

**6 / 6 test cases passed — 100% pass rate.**

---

### 11.2.18 Kết luận

World Cup Test Application đáp ứng toàn bộ 10 Functional Requirements
được xác định trong SRS.

Mỗi requirement đều được ánh xạ tới Test Suite hoặc testing
infrastructure tương ứng và có execution evidence.

Kết quả hiện tại cho thấy:

**10 / 10 Functional Requirements covered — 100%.**

**257 / 257 automated test cases passed — 100% pass rate.**

**11.2 — Mức độ đáp ứng yêu cầu: Fully Covered.**

## 11.3 Trạng thái kiểm thử cuối cùng

### 11.3.1 Mục đích

Mục này tổng kết trạng thái kiểm thử cuối cùng của World Cup Test
Application dựa trên kết quả automated test execution và
Requirements Traceability.

---

### 11.3.2 Tổng số Functional Requirements

Project có:

**10 Functional Requirements**

Bao gồm:

- FR-01 — Team Management.
- FR-02 — Player Management.
- FR-03 — Match Management.
- FR-04 — Group Stage Management.
- FR-05 — Knockout Stage Management.
- FR-06 — Tournament Management.
- FR-07 — Top Scorer Management.
- FR-08 — Database Management.
- FR-09 — Web Application.
- FR-10 — Automated Testing.

---

### 11.3.3 Functional Requirements Coverage

Kết quả Requirements Traceability:

| Metric | Result |
|---|---:|
| Total Functional Requirements | 10 |
| Covered Requirements | 10 |
| Uncovered Requirements | 0 |
| Coverage | 100% |

Kết quả:

**10 / 10 Functional Requirements covered — 100%.**

---

### 11.3.4 Automated Test Execution

Kết quả automated test suite cuối cùng:

| Metric | Result |
|---|---:|
| Total test cases | 257 |
| Passed | 257 |
| Failed | 0 |
| Errors | 0 |
| Skipped | 0 |
| Pass rate | 100% |

Kết quả cho thấy toàn bộ 257 automated test cases đã Passed tại thời
điểm kiểm thử được ghi nhận.

---

### 11.3.5 Selenium Web UI Testing

Selenium Web UI suite gồm 6 test cases:

- `TC_WEB_001` — Valid 90-minute match.
- `TC_WEB_002` — Invalid 89-minute match.
- `TC_WEB_003` — Invalid 91-minute match.
- `TC_WEB_004` — Homepage UI verification.
- `TC_WEB_005` — Empty match-duration input.
- `TC_WEB_006` — Invalid non-numeric input.

Kết quả:

| Metric | Result |
|---|---:|
| Total Selenium test cases | 6 |
| Passed | 6 |
| Failed | 0 |
| Pass rate | 100% |

---

### 11.3.6 Testing Techniques

Các kỹ thuật kiểm thử được áp dụng trong project:

- Unit Testing.
- Functional Testing.
- Boundary Value Analysis.
- Decision-based Testing.
- Selenium Web UI Testing.
- Database Testing.
- Automated Regression Testing.

Các kỹ thuật này được sử dụng để kiểm chứng các Functional
Requirements và business rules tương ứng.

---

### 11.3.7 Test Execution Evidence

Test execution evidence được cung cấp thông qua:

- JUnit 5 Test Results.
- Selenium WebDriver Test Results.
- Maven Test Execution.
- Allure Report.

Chuỗi evidence:

`Requirement → Test Case → Test Execution → Test Result → Evidence`

---

### 11.3.8 Allure Report

Allure được sử dụng làm reporting layer cho automated testing.

Luồng:

`Automated Test Execution → Test Results → Allure Report`

Allure Report được sử dụng để trình bày trạng thái và kết quả của
automated test execution.

---

### 11.3.9 Regression Testing

Automated Regression Testing cho phép các test suite được thực thi
lại sau khi source code hoặc configuration thay đổi.

Các test suite chính:

- `TeamTest.java`
- `PlayerTest.java`
- `MatchTest.java`
- `GroupStageTest.java`
- `KnockoutStageTest.java`
- `TournamentTest.java`
- `TopScorerTest.java`
- `DatabaseTest.java`
- `MatchWebTest.java`

Mục tiêu là phát hiện regression defect và xác minh rằng các chức năng
đã kiểm thử tiếp tục hoạt động đúng.

---

### 11.3.10 Final Acceptance Status

Dựa trên các tiêu chí nghiệm thu đã xác định:

| Acceptance Criteria | Status |
|---|---|
| Functional Requirements covered | Passed |
| Test Cases executed | Passed |
| Automated Test Execution | Passed |
| Unit Testing | Passed |
| Selenium Web UI Testing | Passed |
| Database Testing | Passed |
| Boundary Value Analysis | Covered |
| Decision-based Testing | Covered |
| Regression Testing | Covered |
| Test Execution Evidence | Available |
| Allure Reporting | Covered |

---

### 11.3.11 Final Test Status

Trạng thái kiểm thử cuối cùng:

**PASSED**

Kết quả:

**257 / 257 automated test cases passed — 100% pass rate.**

**6 / 6 Selenium Web UI test cases passed — 100% pass rate.**

**10 / 10 Functional Requirements covered — 100%.**

Không có:

- Failed test.
- Error.
- Skipped test.

---

### 11.3.12 Tiêu chí hoàn thành

FRS được xem là hoàn thành khi:

- Toàn bộ Functional Requirements được trace.
- Các Test Suite tương ứng được xác định.
- Automated Tests được thực thi.
- Selenium Web UI Tests được thực thi.
- Test Results được ghi nhận.
- Requirements Coverage đạt 100%.
- Automated Test Pass Rate đạt 100%.
- Selenium Pass Rate đạt 100%.
- Test Execution Evidence được cung cấp.
- Final Testing Status được xác định.

Các tiêu chí trên đã được đáp ứng theo kết quả kiểm thử hiện tại.

---

### 11.3.13 Kết luận cuối cùng

World Cup Test Application đã hoàn thành quá trình đặc tả, kiểm thử và
traceability theo phạm vi được xác định trong tài liệu.

Kết quả cuối cùng:

**10 / 10 Functional Requirements covered — 100%.**

**257 / 257 automated test cases passed — 100% pass rate.**

**6 / 6 Selenium Web UI test cases passed — 100% pass rate.**

**Final Testing Status: PASSED**

**11.3 — Trạng thái kiểm thử cuối cùng: PASSED.**