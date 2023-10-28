import java.util.*;

public class Main {
    static List<SinhVien> danhSach = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();  // Đọc ký tự Enter sau lựa chọn

            switch (choice) {
                case 1:
                    themSinhVien();
                    break;
                case 2:
                    capNhatThongTin();
                    break;
                case 3:
                    xoaSinhVien();
                    break;
                case 4:
                    hienThiSinhVien();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 5);
    }

    private static void showMenu() {
        System.out.println("----- Quản lý Sinh viên -----");
        System.out.println("1. Thêm sinh viên");
        System.out.println("2. Cập nhật thông tin sinh viên");
        System.out.println("3. Xóa sinh viên");
        System.out.println("4. Hiển thị danh sách sinh viên");
        System.out.println("5. Thoát");
        System.out.print("Chọn tùy chọn (1-5): ");
    }

    private static void themSinhVien() {
        SinhVien sv = new SinhVien();

        System.out.print("Nhập mã sinh viên: ");
        int maSV = scanner.nextInt();
        sv.setMaSV(maSV);
        scanner.nextLine();  // Đọc ký tự Enter sau lựa chọn

        System.out.print("Nhập tên sinh viên: ");
        String tenSV = scanner.nextLine();
        sv.setTen(tenSV);

        System.out.print("Nhập tuổi sinh viên: ");
        int tuoiSV = scanner.nextInt();
        sv.setTuoi(tuoiSV);
        scanner.nextLine();

        System.out.print("Nhập địa chỉ sinh viên: ");
        String diaChiSV = scanner.nextLine();
        sv.setDiaChi(diaChiSV);

        System.out.print("Nhập điểm trung bình: ");
        double diemTB = scanner.nextDouble();
        sv.setDiemTB(diemTB);

        danhSach.add(sv);

        System.out.println("Đã thêm sinh viên thành công!");
    }

    private static void capNhatThongTin() {
        System.out.print("Nhập mã sinh viên cần sửa: ");
        int ma = scanner.nextInt();
        scanner.nextLine();

        SinhVien sv = timSinhVienTheoMa(ma);

        if (sv == null) {
            System.out.println("Không tìm thấy sinh viên có mã " + ma);
            return;
        }

        // Nhập và cập nhật các trường dữ liệu mới cho sv
        System.out.print("Nhập tên mới: ");
        String tenMoi = scanner.nextLine();
        sv.setTen(tenMoi);

        System.out.print("Nhập tuổi mới: ");
        int tuoiMoi = scanner.nextInt();
        sv.setTuoi(tuoiMoi);
        scanner.nextLine();

        System.out.print("Nhập địa chỉ mới: ");
        String diaChiMoi = scanner.nextLine();
        sv.setDiaChi(diaChiMoi);

        System.out.print("Nhập điểm trung bình mới: ");
        double diemTBMoi = scanner.nextDouble();
        sv.setDiemTB(diemTBMoi);

        System.out.println("Đã cập nhật thông tin cho sinh viên có mã " + ma);
    }

    private static SinhVien timSinhVienTheoMa(int ma) {
        for (SinhVien sv : danhSach) {
            if (sv.getMaSV() == ma) {
                return sv;
            }
        }
        return null;
    }

    private static void xoaSinhVien() {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        int ma = scanner.nextInt();

        SinhVien sv = timSinhVienTheoMa(ma);

        if (sv == null) {
            System.out.println("Không tìm thấy sinh viên có mã " + ma);
            return;
        }

        danhSach.remove(sv);

        System.out.println("Đã xóa sinh viên có mã " + ma);
    }

    private static void hienThiSinhVien() {
        for (SinhVien sv : danhSach) {
            System.out.println("Mã SV: " + sv.getMaSV());
            System.out.println("Tên: " + sv.getTen());
            System.out.println("Tuổi: " + sv.getTuoi());
            System.out.println("Địa chỉ: " + sv.getDiaChi());
            System.out.println("Điểm trung bình: " + sv.getDiemTB());
            System.out.println("--------------------------");
        }
    }
}
