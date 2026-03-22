package entity;

import java.util.ArrayList;
import java.util.List;

public class ChiTietHoaDon {
    private String  maCTHD;
    private int     soLuong;
    private double  donGia;
    private String  ghiChu;
    private HoaDon  hoaDon;
    private Mon     mon;
    private Size    size;
    private List<ChiTietHoaDonTopping> toppingList = new ArrayList<>();

    public ChiTietHoaDon() {}

    public double tinhThanhTien() {
        double tienTopping = toppingList.stream()
            .mapToDouble(ChiTietHoaDonTopping::tinhTien)
            .sum();
        return (donGia + tienTopping) * soLuong;
    }

    public void capNhatSoLuong(int sl) { this.soLuong = sl; }
    public void capNhatGhiChu(String gc) { this.ghiChu = gc; }

    public String  getMaCTHD()             { return maCTHD; }
    public void    setMaCTHD(String v)     { this.maCTHD = v; }
    public int     getSoLuong()            { return soLuong; }
    public void    setSoLuong(int v)       { this.soLuong = v; }
    public double  getDonGia()             { return donGia; }
    public void    setDonGia(double v)     { this.donGia = v; }
    public String  getGhiChu()             { return ghiChu; }
    public void    setGhiChu(String v)     { this.ghiChu = v; }
    public HoaDon  getHoaDon()             { return hoaDon; }
    public void    setHoaDon(HoaDon v)     { this.hoaDon = v; }
    public Mon     getMon()                { return mon; }
    public void    setMon(Mon v)           { this.mon = v; }
    public Size    getSize()               { return size; }
    public void    setSize(Size v)         { this.size = v; }
    public List<ChiTietHoaDonTopping> getToppingList()              { return toppingList; }
    public void setToppingList(List<ChiTietHoaDonTopping> v)        { this.toppingList = v; }
}
