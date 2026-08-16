# ĐẶC TẢ YÊU CẦU CHỨC NĂNG (FRS)

## World Cup Test Application

### 1. Tổng quan

Tài liệu này mô tả chi tiết các yêu cầu chức năng của World Cup Test
Application dựa trên các yêu cầu được xác định trong SRS.

Các yêu cầu được đánh mã từ FR-01 đến FR-10 và được kiểm chứng thông qua
các bài kiểm thử tự động bằng JUnit 5 và Selenium WebDriver.

---

## 2. Yêu cầu chức năng

### FR-01 — Quản lý đội tuyển

Hệ thống phải hỗ trợ quản lý thông tin đội tuyển bao gồm:

- Tên quốc gia.
- Huấn luyện viên trưởng.
- Trợ lý huấn luyện viên.
- Danh sách cầu thủ.
- Danh sách cầu thủ đá chính.
- Danh sách cầu thủ dự bị.
- Thành viên ban huấn luyện / nhân viên.

Hệ thống phải kiểm tra các giới hạn:

| Thành phần | Quy tắc |
|---|---|
| Trợ lý huấn luyện viên | Tối đa 3 |
| Cầu thủ | Từ 21 đến 22 |
| Cầu thủ đá chính | Từ 7 đến 11 |
| Cầu thủ dự bị | Từ 4 đến 5 |

Các test case liên quan:

- TC-T001 – TC-T020.

---

### FR-02 — Quản lý cầu thủ

Hệ thống phải cho phép:

- Tạo cầu thủ bằng tên cầu thủ.
- Lưu tên cầu thủ.
- Trả về tên cầu thủ đã lưu.

Test case liên quan:

- TC-P001.

---

### FR-03 — Quản lý trận đấu

Hệ thống phải kiểm tra các quy tắc trận đấu.

#### Thời lượng trận đấu

- Trận đấu vòng bảng kéo dài 90 phút.
- Mỗi hiệp kéo dài 45 phút.
- Thời gian nghỉ giữa hiệp không vượt quá 15 phút.

#### Hiệp phụ

- Có thể có từ 0 đến 2 hiệp phụ.
- Mỗi hiệp phụ kéo dài 30 phút.

#### Luật kết thúc trận đấu

Hệ thống phải hỗ trợ:

- Luật bàn thắng bạc.
- Xác định đội thắng sau năm lượt sút penalty khi tỷ số khác nhau.
- Sudden death khi tỷ số penalty vẫn bằng nhau sau năm lượt.

#### Thẻ phạt

- Cầu thủ phải rời sân khi nhận từ hai thẻ vàng trở lên.
- Cầu thủ phải rời sân khi nhận thẻ đỏ.

#### Số lượng cầu thủ

- Đội phải có ít nhất 7 cầu thủ trên sân để tiếp tục thi đấu.

#### Thay người

- Một đội được tối đa 3 lần thay người.
- Mỗi sự kiện thay người có thể thay từ 1 đến 3 cầu thủ.
- Vị trí cầu thủ không hạn chế việc thay người.

Các test case liên quan:

- TC-T025 – TC-T071.
- TC-T192 – TC-T216.
- TC-T249.

Các kỹ thuật Boundary Value Analysis và Equivalence Partitioning được
áp dụng cho các giá trị giới hạn của luật trận đấu.

---

### FR-04 — Quản lý vòng bảng

Hệ thống phải hỗ trợ:

- Giải đấu có 32 đội.
- Mỗi bảng có 4 đội.
- Mỗi đội thi đấu với 3 đối thủ.
- Thắng được 3 điểm.
- Hòa được 1 điểm.
- Thua được 0 điểm.

#### Tiêu chí xếp hạng

Các đội được xếp hạng theo thứ tự:

1. Điểm số.
2. Hiệu số bàn thắng.
3. Thẻ phạt.
4. Kết quả đối đầu trực tiếp.
5. Bốc thăm.

Một thẻ đỏ được tính tương đương với hai thẻ vàng khi tính trọng số
thẻ phạt.

Hai đội đứng đầu mỗi bảng được vào Vòng 16 đội.

Các test case liên quan:

- TC-T072 – TC-T103.

Decision Table Testing được áp dụng cho logic xếp hạng.

---

### FR-05 — Quản lý vòng loại trực tiếp

Hệ thống phải hỗ trợ:

#### Vòng 16 đội

- 16 đội.
- Kiểm tra các cặp đấu.
- 8 đội thắng.

#### Tứ kết

- 4 trận.
- 8 đội thắng từ Vòng 16 đội.

#### Bán kết

- 4 đội.
- 2 trận.

#### Chung kết

- 2 đội vào chung kết.
- Xác định đội vô địch.

#### Huy chương

- Đội vô địch nhận huy chương vàng.
- Đội thua chung kết nhận huy chương bạc.
- Hai đội thua bán kết nhận huy chương đồng.

Các test case liên quan:

- TC-T104 – TC-T153.

---

### FR-06 — Quản lý giải đấu

Hệ thống phải cho phép khởi tạo giải đấu với chính xác 32 đội.

Sau khi khởi tạo, hệ thống phải:

1. Tạo 8 bảng.
2. Kiểm tra mỗi bảng có 4 đội.
3. Chạy vòng bảng.
4. Ghi nhận kết quả vòng bảng.
5. Xác định 16 đội đủ điều kiện.
6. Chuẩn bị Vòng 16 đội.
7. Chạy vòng loại trực tiếp.
8. Xác định đội vô địch.
9. Lưu kết quả trận đấu vào cơ sở dữ liệu.
10. Xuất kết quả giải đấu.

Các test case liên quan:

- TC-T176 – TC-T191.

---

### FR-07 — Quản lý cầu thủ ghi bàn hàng đầu

Hệ thống phải:

- Ghi nhận bàn thắng.
- Cộng dồn bàn thắng qua nhiều trận.
- Xác định cầu thủ có nhiều bàn thắng nhất.
- Hỗ trợ nhiều cầu thủ đồng hạng.
- Trả về không có cầu thủ ghi bàn hàng đầu khi chưa có bàn thắng.
- Xác định cầu thủ có phải là cầu thủ đồng hạng hay không.
- Cập nhật thứ hạng khi số bàn thắng thay đổi.

Các test case liên quan:

- TC-T154 – TC-T165.
- TC-T237 – TC-T243.

---

### FR-08 — Quản lý cơ sở dữ liệu

Hệ thống phải hỗ trợ lưu và truy xuất:

- Đội tuyển.
- Bảng đấu.
- Trận đấu.
- Cầu thủ.
- Kết quả trận đấu.

Hệ thống phải xử lý trường hợp bản ghi không tồn tại bằng cách trả về
không có dữ liệu.

Các test case liên quan:

- TC-T166 – TC-T175.
- TC-T232 – TC-T236.
- TC-T244 – TC-T248.

---

### FR-09 — Ứng dụng Web

Ứng dụng web phải cung cấp:

- Trang chủ.
- Trường nhập thời lượng trận đấu.
- Chức năng kiểm tra thời lượng.
- Kết quả hợp lệ khi nhập 90 phút.
- Kết quả không hợp lệ khi nhập giá trị khác 90 phút.
- Kiểm tra dữ liệu nhập rỗng.
- Xử lý dữ liệu không phải số.

Các Selenium test case:

- TC_WEB_001 — 90 phút hợp lệ.
- TC_WEB_002 — 89 phút không hợp lệ.
- TC_WEB_003 — 91 phút không hợp lệ.
- TC_WEB_004 — Kiểm tra giao diện trang chủ.
- TC_WEB_005 — Kiểm tra dữ liệu rỗng.
- TC_WEB_006 — Kiểm tra dữ liệu không phải số.

Thông báo khi nhập dữ liệu không phải số:

`INVALID: Minutes must be a number.`

---

### FR-10 — Kiểm thử tự động

Dự án phải cung cấp:

- JUnit 5 automated tests.
- Selenium WebDriver tests.
- Maven test execution.
- Allure test reporting.

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
- MatchWebTest.

Kết quả thực thi hiện tại:

**257 / 257 test cases passed — 100%.**

---

## 3. Tổng quan kiểm thử chức năng

| Requirement | Test Suite | Coverage |
|---|---|---|
| FR-01 | TeamTest | Covered |
| FR-02 | PlayerTest | Covered |
| FR-03 | MatchTest | Covered |
| FR-04 | GroupStageTest | Covered |
| FR-05 | KnockoutStageTest | Covered |
| FR-06 | TournamentTest | Covered |
| FR-07 | TopScorerTest | Covered |
| FR-08 | DatabaseTest | Covered |
| FR-09 | MatchWebTest | Covered |
| FR-10 | JUnit / Selenium / Maven / Allure | Covered |

---

## 4. Kết luận

Tất cả 10 yêu cầu chức năng từ FR-01 đến FR-10 đều được kiểm chứng
bằng các bài kiểm thử tự động tương ứng.

Kết quả thực thi hiện tại:

**257 / 257 test cases passed — 100% pass rate.**

**10 / 10 functional requirements covered.**
