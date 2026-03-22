package entity;

import java.time.LocalDateTime;

public class TonKho {
    private String        maTonKho;
    private double        soLuongTon;
    private double        mucToiThieu;
    private LocalDateTime ngayCapNhat;
    private Kho           kho;
    private NguyenLieu    nguyenLieu;

    public TonKho() {}

    public void capNhatSoLuong(double delta) {
        this.soLuongTon += delta;
        this.ngayCapNhat = LocalDateTime.now();
    }

    public boolean isSapHet()                        { return soLuongTon <= mucToiThieu; }
    public boolean kiemTraDuSoLuong(double canDung)  { return soLuongTon >= canDung; }

    public String        getMaTonKho()               { return maTonKho; }
    public void          setMaTonKho(String v)       { this.maTonKho = v; }
    public double        getSoLuongTon()             { return soLuongTon; }
    public void          setSoLuongTon(double v)     { this.soLuongTon = v; }
    public double        getMucToiThieu()            { return mucToiThieu; }
    public void          setMucToiThieu(double v)    { this.mucToiThieu = v; }
    public LocalDateTime getNgayCapNhat()            { return ngayCapNhat; }
    public void          setNgayCapNhat(LocalDateTime v) { this.ngayCapNhat = v; }
    public Kho           getKho()                    { return kho; }
    public void          setKho(Kho v)               { this.kho = v; }
    public NguyenLieu    getNguyenLieu()             { return nguyenLieu; }
    public void          setNguyenLieu(NguyenLieu v) { this.nguyenLieu = v; }
}
