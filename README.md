# Hướng dẫn Chạy Dự án Demo Seminar
---

## 1. Yêu cầu hệ thống

### JDK 17
* Yêu cầu cài đặt **Java Development Kit (JDK) 17**.
* Kiểm tra phiên bản bằng lệnh: `java -version` trong Terminal/CMD.

### IDE (Công cụ lập trình)
* Sử dụng **IntelliJ IDEA** (Bản Ultimate hỗ trợ Jakarta EE tốt nhất).
* Hoặc các IDE khác như **Eclipse**, **NetBeans**, hoặc **VS Code**.

### Server WildFly
* Tải bản **WildFly 31.0.0.Final** hoặc mới hơn (để tương thích chuẩn Jakarta EE 11).
* Giải nén vào một thư mục cố định trên ổ đĩa của bạn.

---

## 2. Các bước triển khai (Deployment)

Thực hiện theo đúng 3 bước dưới đây để build và chạy dự án:

### Bước 1: Build dự án bằng Maven
Mở terminal tại thư mục gốc của dự án (nơi có file pom.xml) và gõ lệnh:
`mvn clean package`

* Sau khi chạy thành công (BUILD SUCCESS), bạn sẽ thấy thư mục **/target** xuất hiện.
* File kết quả là: **demo-seminar.war**.

### Bước 2: Copy file triển khai
1. Tìm đến thư mục cài đặt **WildFly** trên máy.
2. Truy cập vào đường dẫn: `standalone\deployments`.
3. **Copy** file `demo-seminar.war` từ thư mục `/target` của dự án.
4. **Paste** trực tiếp vào thư mục `deployments` của WildFly.

### Bước 3: Khởi động Server
1. Truy cập vào thư mục **bin** bên trong thư mục cài đặt WildFly.
2. Tìm và chạy file: **standalone.bat** (đối với Windows) hoặc `./standalone.sh` (đối với Linux/Mac).
3. Đợi cho đến khi màn hình console báo dòng `WildFly Full ... started` là hoàn tất.

---

## 3. Truy cập ứng dụng

Sau khi Server đã khởi động xong, bạn mở trình duyệt và truy cập vào địa chỉ:
* **URL:** `http://localhost:8080/demo-seminar`
