package entity;

import java.time.LocalDate;

public class BangGia {
    private String    maBangGia;
    private String    tenBangGia;
    private LocalDate ngayBatDau;
    private LocalDate ngayKetThuc;
    private int       mucUuTien;
    private boolean   trangThai;

    public BangGia() {}

    public boolean kiemTraHieuLuc(LocalDate ngay) {
        return trangThai
            && !ngay.isBefore(ngayBatDau)
            && !ngay.isAfter(ngayKetThuc);
    }

    public String    getMaBangGia()              { return maBangGia; }
    public void      setMaBangGia(String v)      { this.maBangGia = v; }
    public String    getTenBangGia()             { return tenBangGia; }
    public void      setTenBangGia(String v)     { this.tenBangGia = v; }
    public LocalDate getNgayBatDau()             { return ngayBatDau; }
    public void      setNgayBatDau(LocalDate v)  { this.ngayBatDau = v; }
    public LocalDate getNgayKetThuc()            { return ngayKetThuc; }
    public void      setNgayKetThuc(LocalDate v) { this.ngayKetThuc = v; }
    public int       getMucUuTien()              { return mucUuTien; }
    public void      setMucUuTien(int v)         { this.mucUuTien = v; }
    public boolean   isTrangThai()               { return trangThai; }
    public void      setTrangThai(boolean v)     { this.trangThai = v; }

    @Override public String toString() { return tenBangGia; }
}
