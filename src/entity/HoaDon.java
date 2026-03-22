package entity;

import enums.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private String             maHD;
    private LocalDateTime      thoiGianMo;
    private LocalDateTime      thoiGianThanhToan;
    private String             ghiChu;
    private TrangThaiHoaDon    trangThai;
    private LoaiDon            loaiDon;
    private HinhThucThanhToan  hinhThucThanhToan;
    private Ban                ban;
    private DatBan             datBan;
    private CaLamViec          caLamViec;
    private NhanVien           nhanVien;
    private List<ChiTietHoaDon> chiTietList = new ArrayList<>();

    public HoaDon() {}

    public double tinhTongTien() {
        return chiTietList.stream()
            .mapToDouble(ChiTietHoaDon::tinhThanhTien)
            .sum();
    }

    public void thanhToan(HinhThucThanhToan hinhThuc) {
        this.hinhThucThanhToan = hinhThuc;
        this.trangThai         = TrangThaiHoaDon.DA_THANH_TOAN;
        this.thoiGianThanhToan = LocalDateTime.now();
    }

    public void huy() {
        this.trangThai = TrangThaiHoaDon.DA_HUY;
    }

    public void chuyenBan(Ban banMoi) {
        this.ban = banMoi;
    }

    public boolean kiemTraDaThanhToan() {
        return trangThai == TrangThaiHoaDon.DA_THANH_TOAN;
    }

    public void chuyenTrangThai(TrangThaiHoaDon tt) { this.trangThai = tt; }

    public String             getMaHD()                      { return maHD; }
    public void               setMaHD(String v)              { this.maHD = v; }
    public LocalDateTime      getThoiGianMo()                { return thoiGianMo; }
    public void               setThoiGianMo(LocalDateTime v) { this.thoiGianMo = v; }
    public LocalDateTime      getThoiGianThanhToan()                { return thoiGianThanhToan; }
    public void               setThoiGianThanhToan(LocalDateTime v) { this.thoiGianThanhToan = v; }
    public String             getGhiChu()                    { return ghiChu; }
    public void               setGhiChu(String v)            { this.ghiChu = v; }
    public TrangThaiHoaDon    getTrangThai()                  { return trangThai; }
    public void               setTrangThai(TrangThaiHoaDon v){ this.trangThai = v; }
    public LoaiDon            getLoaiDon()                    { return loaiDon; }
    public void               setLoaiDon(LoaiDon v)           { this.loaiDon = v; }
    public HinhThucThanhToan  getHinhThucThanhToan()                  { return hinhThucThanhToan; }
    public void               setHinhThucThanhToan(HinhThucThanhToan v){ this.hinhThucThanhToan = v; }
    public Ban                getBan()                        { return ban; }
    public void               setBan(Ban v)                   { this.ban = v; }
    public DatBan             getDatBan()                     { return datBan; }
    public void               setDatBan(DatBan v)             { this.datBan = v; }
    public CaLamViec          getCaLamViec()                  { return caLamViec; }
    public void               setCaLamViec(CaLamViec v)       { this.caLamViec = v; }
    public NhanVien           getNhanVien()                   { return nhanVien; }
    public void               setNhanVien(NhanVien v)         { this.nhanVien = v; }
    public List<ChiTietHoaDon> getChiTietList()               { return chiTietList; }
    public void                setChiTietList(List<ChiTietHoaDon> v) { this.chiTietList = v; }
}
