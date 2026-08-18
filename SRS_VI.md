# ĐẶC TẢ YÊU CẦU PHẦN MỀM (SRS)

## World Cup Test Application

---

## 1. Giới thiệu

### 1.1 Mục đích

Tài liệu này đặc tả các yêu cầu phần mềm của **World Cup Test Application**.

Dự án được phát triển bằng Java và áp dụng phương pháp **Test-Driven Development (TDD)**. Hệ thống mô hình hóa và kiểm tra các luật liên quan đến một giải đấu World Cup, bao gồm đội tuyển, cầu thủ, các trận đấu vòng bảng, các trận đấu vòng loại trực tiếp, kết quả giải đấu, cầu thủ ghi bàn hàng đầu, các thao tác với cơ sở dữ liệu và kiểm tra giao diện Web.

Mục đích của tài liệu là xác định các yêu cầu chức năng được triển khai và kiểm chứng thông qua các bài kiểm thử tự động.

---

### 1.2 Phạm vi

World Cup Test Application cung cấp các chức năng:

- Quản lý đội tuyển và cầu thủ.
- Quản lý nhân viên và huấn luyện viên của đội.
- Kiểm tra thời lượng trận đấu và các luật thi đấu.
- Quản lý các luật của vòng bảng.
- Quản lý các luật của vòng loại trực tiếp.
- Quản lý quá trình diễn tiến của giải đấu.
- Theo dõi các cầu thủ ghi nhiều bàn thắng nhất.
- Lưu trữ và truy xuất dữ liệu giải đấu.
- Kiểm thử giao diện Web bằng Selenium WebDriver.
- Tạo báo cáo kiểm thử tự động.

---

### 1.3 Công nghệ

Dự án sử dụng các công nghệ sau:

- Java
- JUnit 5
- Maven
- Selenium WebDriver
- Apache NetBeans
- Allure Report
- Git / GitHub

---

### 1.4 Phương pháp kiểm thử

Dự án áp dụng phương pháp **Test-Driven Development (TDD)**.

Quy trình chính:

1. Xác định một yêu cầu nghiệp vụ.
2. Xác định các test case cho yêu cầu.
3. Triển khai chức năng cần thiết.
4. Thực thi các bài kiểm thử tự động.
5. Kiểm tra kết quả kiểm thử.
6. Tạo báo cáo kiểm thử.

Dự án bao gồm các unit test cho các lớp nghiệp vụ chính và các bài kiểm thử Selenium WebDriver cho giao diện Web.

Bộ kiểm thử áp dụng nhiều kỹ thuật kiểm thử, bao gồm:

- Functional Testing.
- Equivalence Partitioning.
- Boundary Value Analysis.
- Decision-based Testing.
- White-box Testing.
- Unit Testing.
- Web UI Testing.

---

# 2. Yêu cầu chức năng

## FR-01: Quản lý đội tuyển

Hệ thống phải hỗ trợ thông tin đội tuyển bao gồm:

- Tên quốc gia.
- Huấn luyện viên trưởng.
- Các trợ lý huấn luyện viên.
- Cầu thủ.
- Cầu thủ đá chính.
- Cầu thủ dự bị.
- Thành viên ban huấn luyện.

Hệ thống phải kiểm tra:

- Một đội có tối đa 3 trợ lý huấn luyện viên.
- Một đội có từ 21 đến 22 cầu thủ.
- Đội hình xuất phát phải có từ 7 đến 11 cầu thủ.
- Một đội có từ 4 đến 5 cầu thủ dự bị.

---

## FR-02: Quản lý cầu thủ

Hệ thống cho phép tạo một cầu thủ với tên cầu thủ.

Hệ thống phải trả về tên cầu thủ đã được lưu.

---

## FR-03: Quản lý trận đấu

Hệ thống phải kiểm tra các luật thi đấu World Cup bao gồm:

- Một trận đấu vòng bảng kéo dài 90 phút.
- Mỗi hiệp kéo dài 45 phút.
- Thời gian nghỉ giữa hai hiệp không quá 15 phút.
- Một trận đấu loại trực tiếp có thể có từ 0 đến 2 hiệp phụ.
- Mỗi hiệp phụ kéo dài 30 phút.
- Bàn thắng bạc có thể kết thúc trận đấu khi tỷ số giữa hai đội khác nhau.
- Đội thắng có thể được xác định sau năm lượt sút luân lưu khi tỷ số khác nhau.
- Nếu tỷ số sút luân lưu bằng nhau sau năm lượt, trận đấu tiếp tục theo hình thức sudden death.
- Cầu thủ phải rời sân sau khi nhận từ hai thẻ vàng trở lên.
- Cầu thủ phải rời sân sau khi nhận thẻ đỏ.
- Một đội phải có ít nhất 7 cầu thủ trên sân để tiếp tục thi đấu.
- Một đội được thực hiện tối đa 3 lần thay người.
- Mỗi lần thay người có thể thay từ 1 đến 3 cầu thủ.
- Vị trí của cầu thủ không hạn chế việc thay người.

---

## FR-04: Quản lý vòng bảng

Hệ thống phải hỗ trợ các luật của vòng bảng bao gồm:

- Giải đấu chính thức có 32 đội.
- Mỗi bảng có 4 đội.
- Mỗi đội thi đấu với 3 đối thủ.
- Thắng được 3 điểm.
- Hòa được 1 điểm.
- Thua được 0 điểm.

Hệ thống phải hỗ trợ các tiêu chí xếp hạng theo thứ tự:

1. Điểm số.
2. Hiệu số bàn thắng.
3. Thẻ phạt.
4. Kết quả đối đầu trực tiếp.
5. Bốc thăm.

Hệ thống phải xem một thẻ đỏ tương đương với hai thẻ vàng khi tính trọng số thẻ phạt.

Hệ thống phải cho phép các đội đứng thứ nhất và thứ hai được vào Vòng 16 đội.

---

## FR-05: Quản lý vòng loại trực tiếp

Hệ thống phải hỗ trợ Vòng 16 đội với 16 đội.

Hệ thống phải kiểm tra các cặp đấu của Vòng 16 đội.

Hệ thống phải hỗ trợ:

- 8 đội thắng ở Vòng 16 đội.
- 4 trận tứ kết.
- 4 đội vào bán kết.
- 2 trận bán kết.
- 2 đội vào chung kết.
- 1 trận chung kết.
- 1 đội vô địch giải đấu.

Hệ thống phải hỗ trợ việc trao huy chương:

- Đội thắng trận chung kết nhận huy chương vàng.
- Đội thua trận chung kết nhận huy chương bạc.
- Hai đội thua ở bán kết nhận huy chương đồng.

---

## FR-06: Quản lý giải đấu

Hệ thống phải hỗ trợ khởi tạo giải đấu với chính xác 32 đội.

Hệ thống phải:

- Tạo 8 bảng.
- Kiểm tra mỗi bảng có 4 đội.
- Thực hiện vòng bảng.
- Ghi nhận kết quả vòng bảng.
- Chuẩn bị Vòng 16 đội.
- Đưa 16 đội đủ điều kiện vào Vòng 16 đội.
- Thực hiện vòng loại trực tiếp.
- Xác định đội vô địch.
- Lưu kết quả trận đấu vào cơ sở dữ liệu.
- Xuất kết quả giải đấu.

---

## FR-07: Quản lý cầu thủ ghi bàn hàng đầu

Hệ thống phải ghi nhận số bàn thắng của các cầu thủ.

Hệ thống phải:

- Theo dõi bàn thắng qua nhiều trận đấu.
- Xác định cầu thủ có số bàn thắng cao nhất.
- Hỗ trợ nhiều cầu thủ đồng hạng cầu thủ ghi bàn hàng đầu.
- Trả về không có cầu thủ ghi bàn hàng đầu khi chưa có bàn thắng nào được ghi nhận.
- Xác định một cầu thủ có phải là cầu thủ đồng hạng ghi bàn hàng đầu hay không.
- Cập nhật kết quả cầu thủ ghi bàn hàng đầu khi có thêm bàn thắng được ghi nhận.

---

## FR-08: Quản lý cơ sở dữ liệu

Hệ thống phải hỗ trợ lưu trữ và truy xuất:

- Đội tuyển.
- Bảng đấu.
- Trận đấu.
- Cầu thủ.
- Kết quả trận đấu.

Hệ thống phải:

- Lưu trữ bản ghi thành công.
- Truy xuất các bản ghi đã tồn tại.
- Hỗ trợ nhiều bản ghi được lưu trữ.
- Trả về không có dữ liệu khi bản ghi được yêu cầu không tồn tại.

---

## FR-09: Ứng dụng Web

Hệ thống phải cung cấp giao diện Web để kiểm tra thời lượng trận đấu.

Ứng dụng Web phải:

- Cung cấp trang chủ.
- Cho phép người dùng nhập thời lượng trận đấu.
- Kiểm tra thời lượng đã nhập.
- Hiển thị kết quả hợp lệ khi thời lượng là 90 phút.
- Hiển thị kết quả không hợp lệ khi thời lượng khác 90 phút.
- Xử lý dữ liệu nhập rỗng bằng cơ chế validation của trình duyệt.
- Xử lý dữ liệu nhập không phải số.
- Hiển thị thông báo validation phù hợp đối với dữ liệu không phải số.

Đối với dữ liệu không phải số, ứng dụng phải hiển thị:

`INVALID: Minutes must be a number.`

---

## FR-10: Kiểm thử tự động

Dự án phải cung cấp các bài kiểm thử tự động sử dụng JUnit 5.

Dự án cũng phải cung cấp các bài kiểm thử Selenium WebDriver cho giao diện Web.

Dự án phải sử dụng Maven để thực thi kiểm thử tự động.

Dự án phải tạo báo cáo kiểm thử Allure cho quá trình thực thi kiểm thử tự động.

Bộ kiểm thử tự động phải cung cấp bằng chứng về quá trình thực thi thông qua:

- JUnit 5 unit tests.
- Selenium WebDriver tests.
- Maven test execution.
- Allure reporting.

---

# 3. Tổng quan yêu cầu và kiểm thử

Các yêu cầu chức năng được kiểm chứng thông qua các bộ kiểm thử tự động của project.

| Requirement ID | Requirement | Main Test Coverage |
|---|---|---|
| FR-01 | Quản lý đội tuyển | TeamTest |
| FR-02 | Quản lý cầu thủ | PlayerTest |
| FR-03 | Quản lý trận đấu | MatchTest |
| FR-04 | Quản lý vòng bảng | GroupStageTest |
| FR-05 | Quản lý vòng loại trực tiếp | KnockoutStageTest |
| FR-06 | Quản lý giải đấu | TournamentTest |
| FR-07 | Quản lý cầu thủ ghi bàn hàng đầu | TopScorerTest |
| FR-08 | Quản lý cơ sở dữ liệu | DatabaseTest |
| FR-09 | Ứng dụng Web | MatchWebTest |
| FR-10 | Kiểm thử tự động | JUnit 5 / Selenium / Maven / Allure |

---

# 4. Truy xuất yêu cầu

Các yêu cầu được định nghĩa trong SRS được liên kết với các automated test case thông qua Requirements Traceability Matrix.

Bộ kiểm thử tự động hiện tại có:

- 257 automated test cases.
- 257 test case passed.
- 0 test case failed.
- 0 errors.
- 0 skipped tests.
- Tỷ lệ pass: 100%.

Bộ kiểm thử Selenium Web UI có 6 automated test cases:

- TC_WEB_001 — Kiểm tra trận đấu hợp lệ 90 phút.
- TC_WEB_002 — Kiểm tra trận đấu không hợp lệ 89 phút.
- TC_WEB_003 — Kiểm tra trận đấu không hợp lệ 91 phút.
- TC_WEB_004 — Kiểm tra giao diện trang chủ.
- TC_WEB_005 — Kiểm tra dữ liệu thời lượng trận đấu để trống.
- TC_WEB_006 — Kiểm tra dữ liệu thời lượng không phải số.

Tất cả các yêu cầu chức năng được định nghĩa trong SRS đều được bao phủ bởi bộ kiểm thử tự động hiện tại.

---

# 5. Kết luận

World Cup Test Application xác định các yêu cầu chức năng cho việc quản lý đội tuyển, quản lý cầu thủ, quản lý trận đấu, quản lý vòng bảng, quản lý vòng loại trực tiếp, quản lý giải đấu, quản lý cầu thủ ghi bàn hàng đầu, quản lý cơ sở dữ liệu, kiểm tra ứng dụng Web và kiểm thử tự động.

Các yêu cầu được kiểm chứng thông qua JUnit 5 unit tests và Selenium WebDriver tests.

Kết quả thực thi kiểm thử tự động gần nhất:

**257 / 257 test cases passed — tỷ lệ pass 100%.**

Mức độ bao phủ yêu cầu cuối cùng:

**10 / 10 functional requirements covered.**