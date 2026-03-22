package entity;

import java.time.LocalDate;

public class NguyenLieu {
    private String    maNL;
    private String    tenNL;
    private String    donViTinh;
    private double    donGiaNhap;
    private LocalDate ngayHetHan;

    public NguyenLieu() {}

    public boolean sapHetHan() {
        if (ngayHetHan == null) return false;
        return !LocalDate.now().isAfter(ngayHetHan.minusDays(7));
    }

    public String    getMaNL()               { return maNL; }
    public void      setMaNL(String v)       { this.maNL = v; }
    public String    getTenNL()              { return tenNL; }
    public void      setTenNL(String v)      { this.tenNL = v; }
    public String    getDonViTinh()          { return donViTinh; }
    public void      setDonViTinh(String v)  { this.donViTinh = v; }
    public double    getDonGiaNhap()         { return donGiaNhap; }
    public void      setDonGiaNhap(double v) { this.donGiaNhap = v; }
    public LocalDate getNgayHetHan()         { return ngayHetHan; }
    public void      setNgayHetHan(LocalDate v) { this.ngayHetHan = v; }

    @Override public String toString() { return tenNL + " (" + donViTinh + ")"; }
}
