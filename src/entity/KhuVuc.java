package entity;

/**
 * Entity KhuVuc - anh xa bang KhuVuc
 */
public class KhuVuc {
    private String maKhuVuc;
    private String tenKhuVuc;
    private String moTa;
    private boolean trangThai;

    public KhuVuc() {}

    public KhuVuc(String maKhuVuc, String tenKhuVuc, String moTa, boolean trangThai) {
        this.maKhuVuc  = maKhuVuc;
        this.tenKhuVuc = tenKhuVuc;
        this.moTa      = moTa;
        this.trangThai = trangThai;
    }

    public void setActive()   { this.trangThai = true; }
    public void setInactive() { this.trangThai = false; }

    public String  getMaKhuVuc()               { return maKhuVuc; }
    public void    setMaKhuVuc(String v)       { this.maKhuVuc = v; }
    public String  getTenKhuVuc()              { return tenKhuVuc; }
    public void    setTenKhuVuc(String v)      { this.tenKhuVuc = v; }
    public String  getMoTa()                   { return moTa; }
    public void    setMoTa(String v)           { this.moTa = v; }
    public boolean isTrangThai()               { return trangThai; }
    public void    setTrangThai(boolean v)     { this.trangThai = v; }

    @Override public String toString() { return tenKhuVuc; }
}
