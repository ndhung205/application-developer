package entity;

public class ChiTietHoaDonTopping {
    private String        maID;
    private int           soLuong;
    private ChiTietHoaDon chiTiet;
    private Topping       topping;

    public ChiTietHoaDonTopping() {}

    public double tinhTien() {
        return topping != null ? topping.getGiaTopping() * soLuong : 0;
    }

    public String        getMaID()              { return maID; }
    public void          setMaID(String v)      { this.maID = v; }
    public int           getSoLuong()           { return soLuong; }
    public void          setSoLuong(int v)      { this.soLuong = v; }
    public ChiTietHoaDon getChiTiet()           { return chiTiet; }
    public void          setChiTiet(ChiTietHoaDon v) { this.chiTiet = v; }
    public Topping       getTopping()           { return topping; }
    public void          setTopping(Topping v)  { this.topping = v; }
}
