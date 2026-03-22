package entity;

import enums.VaiTro;
import enums.TrangThaiNhanVien;
import java.time.LocalDate;

/**
 * Entity NhanVien - anh xa bang NhanVien trong database
 */
public class NhanVien {

    private String maNV;
    private String tenNV;
    private LocalDate ngaySinh;
    private String soDienThoai;
    private String diaChi;
    private String username;
    private String passwordHash;
    private TrangThaiNhanVien trangThai;
    private VaiTro vaiTro;

    public NhanVien() {}

    public NhanVien(String maNV, String tenNV, LocalDate ngaySinh,
                    String soDienThoai, String diaChi, String username,
                    String passwordHash, TrangThaiNhanVien trangThai, VaiTro vaiTro) {
        this.maNV        = maNV;
        this.tenNV       = tenNV;
        this.ngaySinh    = ngaySinh;
        this.soDienThoai = soDienThoai;
        this.diaChi      = diaChi;
        this.username    = username;
        this.passwordHash = passwordHash;
        this.trangThai   = trangThai;
        this.vaiTro      = vaiTro;
    }

    // ===== Business methods =====

    /**
     * Kiem tra dang nhap bang cach so sanh passwordHash
     * Viec hash password thuc hien o AuthService
     */
    public boolean dangNhap(String username, String passwordHash) {
        return this.username.equals(username)
            && this.passwordHash.equals(passwordHash)
            && this.trangThai == TrangThaiNhanVien.DANG_LAM_VIEC;
    }

    public void khoa() {
        this.trangThai = TrangThaiNhanVien.DA_NGHI;
    }

    public void moKhoa() {
        this.trangThai = TrangThaiNhanVien.DANG_LAM_VIEC;
    }

    public boolean isQuanLy() {
        return this.vaiTro == VaiTro.QUAN_LY;
    }

    public boolean isDangLamViec() {
        return this.trangThai == TrangThaiNhanVien.DANG_LAM_VIEC;
    }

    // ===== Getters & Setters =====

    public String getMaNV()                          { return maNV; }
    public void   setMaNV(String maNV)               { this.maNV = maNV; }

    public String getTenNV()                         { return tenNV; }
    public void   setTenNV(String tenNV)             { this.tenNV = tenNV; }

    public LocalDate getNgaySinh()                   { return ngaySinh; }
    public void      setNgaySinh(LocalDate ngaySinh) { this.ngaySinh = ngaySinh; }

    public String getSoDienThoai()                         { return soDienThoai; }
    public void   setSoDienThoai(String soDienThoai)       { this.soDienThoai = soDienThoai; }

    public String getDiaChi()                        { return diaChi; }
    public void   setDiaChi(String diaChi)           { this.diaChi = diaChi; }

    public String getUsername()                      { return username; }
    public void   setUsername(String username)       { this.username = username; }

    public String getPasswordHash()                        { return passwordHash; }
    public void   setPasswordHash(String passwordHash)     { this.passwordHash = passwordHash; }

    public TrangThaiNhanVien getTrangThai()                       { return trangThai; }
    public void              setTrangThai(TrangThaiNhanVien tt)   { this.trangThai = tt; }

    public VaiTro getVaiTro()                        { return vaiTro; }
    public void   setVaiTro(VaiTro vaiTro)           { this.vaiTro = vaiTro; }

    @Override
    public String toString() {
        return tenNV + " (" + vaiTro + ")";
    }
}
