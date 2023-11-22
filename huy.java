import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

interface Printable {
    void print();
}

class Nguoi implements Printable {
    String hoTen;
    String soDienThoai;
    String soCMT;

    Nguoi(String hoTen, String soDienThoai, String soCMT) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.soCMT = soCMT;
    }

    @Override
    public void print() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Số CMT: " + soCMT);
    }
}

class Xe implements Printable {
    String tenXe;
    String maSoXe;
    String maSoThue;
    double giaTien;
    Date ngayNhap;
    boolean trangThai;

    Xe(String tenXe, String maSoXe, String maSoThue, double giaTien, Date ngayNhap, boolean trangThai) {
        this.tenXe = tenXe;
        this.maSoXe = maSoXe;
        this.maSoThue = maSoThue;
        this.giaTien = giaTien;
        this.ngayNhap = ngayNhap;
        this.trangThai = trangThai;
    }

    @Override
    public void print() {
        System.out.println("Tên xe: " + tenXe);
        System.out.println("Mã số xe: " + maSoXe);
        System.out.println("Mã số thuế: " + maSoThue);
        System.out.println("Giá tiền: " + giaTien);
        System.out.println("Ngày nhập: " + ngayNhap);
        System.out.println("Trạng thái: " + (trangThai ? "Đã bán" : "Còn lại"));
    }
}

class QuanLyXe {
    List<Nguoi> danhSachNguoiMua;
    List<Xe> danhSachXe;

    QuanLyXe() {
        danhSachNguoiMua = new ArrayList<>();
        danhSachXe = new ArrayList<>();
        // Khởi tạo danh sách xe với ít nhất 5 xe
        danhSachXe.add(new Xe("Honda Civic", "H123", "T456", 10000, new Date(), false));
        danhSachXe.add(new Xe("Honda Accord", "H456", "T789", 15000, new Date(), false));
        danhSachXe.add(new Xe("Honda CR-V", "H789", "T012", 20000, new Date(), false));
        danhSachXe.add(new Xe("Honda Pilot", "H012", "T345", 25000, new Date(), false));
        danhSachXe.add(new Xe("Honda Odyssey", "H345", "T678", 30000, new Date(), false));
    }

    void nhapNguoiMua(Nguoi nguoiMua) {
        danhSachNguoiMua.add(nguoiMua);
        // Đánh dấu xe đã bán
        danhSachXe.get(danhSachNguoiMua.size() - 1).trangThai = true;
        // Tăng điểm tích lũy của người mua
        danhSachNguoiMua.get(danhSachNguoiMua.size() - 1).soTichDiem++;
    }

    void timNguoiMuaTheoNgay(Date ngayMua) {
        for (Ng
        uoi nguoiMua : danhSachNguoiMua) {
            if (nguoiMua.ngayMua.equals(ngayMua)) {
                nguoiMua.print();
            }
        }
    }

    void tinhTienMuaXe(Nguoi nguoiMua) {
        int index = danhSachNguoiMua.indexOf(nguoiMua);
        if (index != -1) {
            double tien = (danhSachXe.get(index).giaTien - (nguoiMua.soTichDiem * 10) * danhSachXe.get(index).giaTien / 100);
            double tongTien = tien + tien * 10 / 100;
            System.out.println("Tiền mua xe: " + tien);
            System.out.println("Tổng tiền: " + tongTien);
        } else {
            System.out.println("Người mua không tồn tại trong danh sách.");
        }
    }

    void sapXepDanhSach(String tieuChi) {
        if (tieuChi.equals("ngayMua")) {
            Collections.sort(danhSachNguoiMua, Comparator.comparing(nguoi -> nguoi.ngayMua));
        } else if (tieuChi.equals("soTichDiem")) {
            Collections.sort(danhSachNguoiMua, Comparator.comparingInt(nguoi -> nguoi.soTichDiem));
        }
    }
