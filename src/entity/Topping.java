package entity;

public class Topping {
    private String  maTopping;
    private String  tenTopping;
    private double  giaTopping;
    private boolean trangThai;

    public Topping() {}

    public boolean coSanBan() { return trangThai; }

    public String  getMaTopping()            { return maTopping; }
    public void    setMaTopping(String v)    { this.maTopping = v; }
    public String  getTenTopping()           { return tenTopping; }
    public void    setTenTopping(String v)   { this.tenTopping = v; }
    public double  getGiaTopping()           { return giaTopping; }
    public void    setGiaTopping(double v)   { this.giaTopping = v; }
    public boolean isTrangThai()             { return trangThai; }
    public void    setTrangThai(boolean v)   { this.trangThai = v; }

    @Override public String toString() { return tenTopping; }
}
