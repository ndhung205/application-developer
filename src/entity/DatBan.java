package entity;

import enums.TrangThaiDatBan;
import java.time.LocalDateTime;
import java.time.Duration;

public class DatBan {
    private String          maDatBan;
    private String          tenKhach;
    private String          soDienThoai;
    private int             soLuongNguoi;
    private TrangThaiDatBan trangThai;
    private LocalDateTime   thoiGianDen;
    private LocalDateTime   thoiGianDat;
    private Ban             ban;
    private HoaDon          hoaDon;

    // Thoi gian giu ban mac dinh: 15 phut
    private static final int THOI_GIAN_GIU_BAN = 15;

    public DatBan() {}

    public boolean kiemTraQuaHan() {
        if (thoiGianDen == null) return false;
        return LocalDateTime.now().isAfter(thoiGianDen.plusMinutes(THOI_GIAN_GIU_BAN));
    }

    public void xacNhan()        { this.trangThai = TrangThaiDatBan.DA_XAC_NHAN; }
    public void huy()            { this.trangThai = TrangThaiDatBan.DA_HUY; }
    public void tiepNhanKhach()  { this.trangThai = TrangThaiDatBan.DA_DEN; }

    public String          getMaDatBan()                  { return maDatBan; }
    public void            setMaDatBan(String v)          { this.maDatBan = v; }
    public String          getTenKhach()                  { return tenKhach; }
    public void            setTenKhach(String v)          { this.tenKhach = v; }
    public String          getSoDienThoai()               { return soDienThoai; }
    public void            setSoDienThoai(String v)       { this.soDienThoai = v; }
    public int             getSoLuongNguoi()              { return soLuongNguoi; }
    public void            setSoLuongNguoi(int v)         { this.soLuongNguoi = v; }
    public TrangThaiDatBan getTrangThai()                 { return trangThai; }
    public void            setTrangThai(TrangThaiDatBan v){ this.trangThai = v; }
    public LocalDateTime   getThoiGianDen()               { return thoiGianDen; }
    public void            setThoiGianDen(LocalDateTime v){ this.thoiGianDen = v; }
    public LocalDateTime   getThoiGianDat()               { return thoiGianDat; }
    public void            setThoiGianDat(LocalDateTime v){ this.thoiGianDat = v; }
    public Ban             getBan()                       { return ban; }
    public void            setBan(Ban v)                  { this.ban = v; }
    public HoaDon          getHoaDon()                    { return hoaDon; }
    public void            setHoaDon(HoaDon v)            { this.hoaDon = v; }
}
