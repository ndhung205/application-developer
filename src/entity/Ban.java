package entity;

import enums.TrangThaiBan;

public class Ban {
    private String      maBan;
    private String      soBan;
    private KhuVuc      khuVuc;
    private int         sucChua;
    private TrangThaiBan trangThai;

    public Ban() {}

    public void chuyenTrangThai(TrangThaiBan tt) { this.trangThai = tt; }
    public boolean isTrong()      { return trangThai == TrangThaiBan.TRONG; }
    public boolean isDaDatTruoc() { return trangThai == TrangThaiBan.DA_DAT_TRUOC; }
    public boolean isCoKhach()    { return trangThai == TrangThaiBan.CO_KHACH; }
    public boolean kiemTraDuSucChua(int soNguoi) { return soNguoi <= sucChua; }

    public String       getMaBan()                  { return maBan; }
    public void         setMaBan(String v)           { this.maBan = v; }
    public String       getSoBan()                   { return soBan; }
    public void         setSoBan(String v)           { this.soBan = v; }
    public KhuVuc       getKhuVuc()                  { return khuVuc; }
    public void         setKhuVuc(KhuVuc v)          { this.khuVuc = v; }
    public int          getSucChua()                 { return sucChua; }
    public void         setSucChua(int v)            { this.sucChua = v; }
    public TrangThaiBan getTrangThai()               { return trangThai; }
    public void         setTrangThai(TrangThaiBan v) { this.trangThai = v; }

    @Override public String toString() { return soBan; }
}
