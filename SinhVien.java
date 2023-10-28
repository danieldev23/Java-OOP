

class SinhVien {
    private int maSV;
    private String ten;
    private int tuoi;
    private String diaChi;
    private double diemTB;

    public SinhVien(int maSV, String ten, int tuoi, String diaChi, double diemTB) {
        this.maSV = maSV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.diemTB = diemTB;
    }

    public SinhVien() {

    }
    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diaChi='" + diaChi + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }
    // các phương thức getter và setter khác
}