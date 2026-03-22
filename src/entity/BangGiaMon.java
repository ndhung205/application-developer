package entity;

public class BangGiaMon {
    private String  maBGM;
    private double  giaBan;
    private Size    size;
    private BangGia bangGia;

    public BangGiaMon() {}

    public double layGia() { return giaBan; }

    public String  getMaBGM()            { return maBGM; }
    public void    setMaBGM(String v)    { this.maBGM = v; }
    public double  getGiaBan()           { return giaBan; }
    public void    setGiaBan(double v)   { this.giaBan = v; }
    public Size    getSize()             { return size; }
    public void    setSize(Size v)       { this.size = v; }
    public BangGia getBangGia()          { return bangGia; }
    public void    setBangGia(BangGia v) { this.bangGia = v; }
}
