package entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PhieuNhap {
    private String     maPN;
    private LocalDateTime ngayNhap;
    private NhanVien   nhanVien;
    private NhaCungCap nhaCungCap;
    private Kho        kho;
    private List<ChiTietPhieuNhap> chiTietList = new ArrayList<>();

    public PhieuNhap() {}

    public double tinhTongTien() {
        return chiTietList.stream()
            .mapToDouble(ChiTietPhieuNhap::tinhThanhTien)
            .sum();
    }

    public String     getMaPN()                  { return maPN; }
    public void       setMaPN(String v)          { this.maPN = v; }
    public LocalDateTime getNgayNhap()           { return ngayNhap; }
    public void       setNgayNhap(LocalDateTime v){ this.ngayNhap = v; }
    public NhanVien   getNhanVien()              { return nhanVien; }
    public void       setNhanVien(NhanVien v)    { this.nhanVien = v; }
    public NhaCungCap getNhaCungCap()            { return nhaCungCap; }
    public void       setNhaCungCap(NhaCungCap v){ this.nhaCungCap = v; }
    public Kho        getKho()                   { return kho; }
    public void       setKho(Kho v)              { this.kho = v; }
    public List<ChiTietPhieuNhap> getChiTietList()              { return chiTietList; }
    public void setChiTietList(List<ChiTietPhieuNhap> v)        { this.chiTietList = v; }
}
