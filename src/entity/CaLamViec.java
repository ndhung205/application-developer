package entity;

import enums.TrangThaiCa;
import java.time.LocalDate;
import java.time.LocalTime;

public class CaLamViec {
    private String      maCa;
    private LocalDate   ngayLam;
    private LocalTime   gioBatDau;
    private LocalTime   gioKetThuc;
    private TrangThaiCa trangThai;
    private NhanVien    nhanVien;
    private KhuVuc      khuVuc;

    public CaLamViec() {}

    public void moCa()   { this.trangThai = TrangThaiCa.DANG_LAM; }
    public void dongCa() {
        this.trangThai  = TrangThaiCa.DA_DONG;
        this.gioKetThuc = LocalTime.now();
    }

    public double tinhSoGio() {
        if (gioBatDau == null || gioKetThuc == null) return 0;
        return java.time.Duration.between(gioBatDau, gioKetThuc).toMinutes() / 60.0;
    }

    public boolean kiemTraHopLe() {
        return nhanVien != null && khuVuc != null && ngayLam != null && gioBatDau != null;
    }

    public String     getMaCa()                    { return maCa; }
    public void       setMaCa(String v)            { this.maCa = v; }
    public LocalDate  getNgayLam()                 { return ngayLam; }
    public void       setNgayLam(LocalDate v)      { this.ngayLam = v; }
    public LocalTime  getGioBatDau()               { return gioBatDau; }
    public void       setGioBatDau(LocalTime v)    { this.gioBatDau = v; }
    public LocalTime  getGioKetThuc()              { return gioKetThuc; }
    public void       setGioKetThuc(LocalTime v)   { this.gioKetThuc = v; }
    public TrangThaiCa getTrangThai()              { return trangThai; }
    public void        setTrangThai(TrangThaiCa v) { this.trangThai = v; }
    public NhanVien   getNhanVien()                { return nhanVien; }
    public void       setNhanVien(NhanVien v)      { this.nhanVien = v; }
    public KhuVuc     getKhuVuc()                  { return khuVuc; }
    public void       setKhuVuc(KhuVuc v)          { this.khuVuc = v; }
}
