package entity;

public class DinhMucNguyenLieu {
    private String     maDinhMuc;
    private double     soLuong;
    private Mon        mon;
    private NguyenLieu nguyenLieu;

    public DinhMucNguyenLieu() {}

    public double tinhTieuHao(int soLuongBan) {
        return soLuong * soLuongBan;
    }

    public String     getMaDinhMuc()              { return maDinhMuc; }
    public void       setMaDinhMuc(String v)      { this.maDinhMuc = v; }
    public double     getSoLuong()                { return soLuong; }
    public void       setSoLuong(double v)        { this.soLuong = v; }
    public Mon        getMon()                    { return mon; }
    public void       setMon(Mon v)               { this.mon = v; }
    public NguyenLieu getNguyenLieu()             { return nguyenLieu; }
    public void       setNguyenLieu(NguyenLieu v) { this.nguyenLieu = v; }
}
