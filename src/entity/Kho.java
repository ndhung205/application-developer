package entity;

public class Kho {
    private String   maKho;
    private String   tenKho;
    private String   diaChi;
    private NhanVien nhanVien;

    public Kho() {}

    public String   getMaKho()             { return maKho; }
    public void     setMaKho(String v)     { this.maKho = v; }
    public String   getTenKho()            { return tenKho; }
    public void     setTenKho(String v)    { this.tenKho = v; }
    public String   getDiaChi()            { return diaChi; }
    public void     setDiaChi(String v)    { this.diaChi = v; }
    public NhanVien getNhanVien()          { return nhanVien; }
    public void     setNhanVien(NhanVien v){ this.nhanVien = v; }

    @Override public String toString() { return tenKho; }
}
