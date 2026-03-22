package entity;

public class ChiTietPhieuNhap {
    private String     maCTPN;
    private double     soLuong;
    private double     donGia;
    private PhieuNhap  phieuNhap;
    private NguyenLieu nguyenLieu;

    public ChiTietPhieuNhap() {}

    public double tinhThanhTien() { return donGia * soLuong; }

    public String     getMaCTPN()              { return maCTPN; }
    public void       setMaCTPN(String v)      { this.maCTPN = v; }
    public double     getSoLuong()             { return soLuong; }
    public void       setSoLuong(double v)     { this.soLuong = v; }
    public double     getDonGia()              { return donGia; }
    public void       setDonGia(double v)      { this.donGia = v; }
    public PhieuNhap  getPhieuNhap()           { return phieuNhap; }
    public void       setPhieuNhap(PhieuNhap v){ this.phieuNhap = v; }
    public NguyenLieu getNguyenLieu()          { return nguyenLieu; }
    public void       setNguyenLieu(NguyenLieu v){ this.nguyenLieu = v; }
}
