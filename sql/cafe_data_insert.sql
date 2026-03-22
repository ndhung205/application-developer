-- ================================================================
-- DU LIEU MAU: QuanLyQuanCafe
-- Thu tu insert: bang cha truoc, bang con sau
-- ================================================================

USE QuanLyQuanCafe;
GO

-- ================================================================
-- 1. KhuVuc
-- ================================================================
INSERT INTO KhuVuc (maKhuVuc, tenKhuVuc, moTa, trangThai) VALUES
('KV001', N'Tầng 1',   N'Khu vực tầng 1, gần cửa ra vào', 1),
('KV002', N'Tầng 2',   N'Khu vực tầng 2, view đẹp',       1),
('KV003', N'Mang về',  N'Khu vực phục vụ đơn mang về',    1);
GO

-- ================================================================
-- 2. NhanVien
-- passwordHash: BCrypt của "123456"
-- ================================================================
INSERT INTO NhanVien (maNV, tenNV, ngaySinh, soDienThoai, diaChi, username, passwordHash, trangThai, vaiTro) VALUES
('NV001', N'Nguyễn Văn An',   '1990-05-15', '0901111111', N'Q.1, TP.HCM',  'admin',   '$2a$10$hashedpassword001', 'DANG_LAM_VIEC', 'QUAN_LY'),
('NV002', N'Trần Thị Bình',   '1998-03-20', '0902222222', N'Q.3, TP.HCM',  'binhtran', '$2a$10$hashedpassword002', 'DANG_LAM_VIEC', 'NHAN_VIEN'),
('NV003', N'Lê Minh Cường',   '1999-07-10', '0903333333', N'Q.5, TP.HCM',  'cuongle',  '$2a$10$hashedpassword003', 'DANG_LAM_VIEC', 'NHAN_VIEN'),
('NV004', N'Phạm Thị Dung',   '2000-11-25', '0904444444', N'Q.10, TP.HCM', 'dungpham', '$2a$10$hashedpassword004', 'DANG_LAM_VIEC', 'NHAN_VIEN'),
('NV005', N'Hoàng Văn Em',    '1997-08-30', '0905555555', N'Q.Bình Thạnh', 'emhoang',  '$2a$10$hashedpassword005', 'DA_NGHI',       'NHAN_VIEN');
GO

-- ================================================================
-- 3. CaLamViec
-- ================================================================
INSERT INTO CaLamViec (maCa, ngayLam, gioBatDau, gioKetThuc, trangThai, maNV, maKhuVuc) VALUES
('CA001', '2026-03-22', '06:00', '14:00', 'DA_DONG',  'NV002', 'KV001'),
('CA002', '2026-03-22', '06:00', '14:00', 'DA_DONG',  'NV003', 'KV002'),
('CA003', '2026-03-22', '14:00', '22:00', 'DA_DONG',  'NV004', 'KV001'),
('CA004', '2026-03-23', '06:00',  NULL,   'DANG_LAM', 'NV002', 'KV001'),
('CA005', '2026-03-23', '06:00',  NULL,   'DANG_LAM', 'NV003', 'KV002');
GO

-- ================================================================
-- 4. Mon
-- ================================================================
INSERT INTO Mon (maMon, tenMon, moTa, loaiMon, trangThai) VALUES
('MON001', N'Trà sữa truyền thống',  N'Trà sữa đài loan truyền thống',      'DO_UONG', 1),
('MON002', N'Cà phê sữa đá',         N'Cà phê phin pha với sữa đặc',        'DO_UONG', 1),
('MON003', N'Matcha latte',           N'Matcha Nhật kết hợp sữa tươi',       'DO_UONG', 1),
('MON004', N'Trà đào cam sả',         N'Trà thơm vị đào, cam, sả tươi',      'DO_UONG', 1),
('MON005', N'Cà phê đen',             N'Cà phê đen đậm đà',                  'DO_UONG', 1),
('MON006', N'Bánh mì trứng',          N'Bánh mì trứng ốp la nóng giòn',      'DO_AN',   1),
('MON007', N'Bánh croissant',         N'Bánh sừng bò bơ thơm',               'DO_AN',   1),
('MON008', N'Trà oolong sữa',         N'Trà oolong thơm kết hợp sữa tươi',   'DO_UONG', 1),
('MON009', N'Sinh tố bơ',             N'Sinh tố bơ sữa nguyên chất',         'DO_UONG', 1),
('MON010', N'Nước ép cam',            N'Cam tươi vắt nguyên chất',           'DO_UONG', 1);
GO

-- ================================================================
-- 5. Size
-- ================================================================
INSERT INTO Size (maSize, tenSize, maMon) VALUES
-- Tra sua truyen thong
('SZ001', 'S', 'MON001'), ('SZ002', 'M', 'MON001'), ('SZ003', 'L', 'MON001'),
-- Ca phe sua da
('SZ004', 'S', 'MON002'), ('SZ005', 'M', 'MON002'), ('SZ006', 'L', 'MON002'),
-- Matcha latte
('SZ007', 'S', 'MON003'), ('SZ008', 'M', 'MON003'), ('SZ009', 'L', 'MON003'),
-- Tra dao cam sa
('SZ010', 'S', 'MON004'), ('SZ011', 'M', 'MON004'), ('SZ012', 'L', 'MON004'),
-- Ca phe den
('SZ013', 'S', 'MON005'), ('SZ014', 'M', 'MON005'), ('SZ015', 'L', 'MON005'),
-- Banh mi trung (chi co 1 size)
('SZ016', 'Thường', 'MON006'),
-- Banh croissant (chi co 1 size)
('SZ017', 'Thường', 'MON007'),
-- Tra oolong sua
('SZ018', 'S', 'MON008'), ('SZ019', 'M', 'MON008'), ('SZ020', 'L', 'MON008'),
-- Sinh to bo
('SZ021', 'S', 'MON009'), ('SZ022', 'M', 'MON009'), ('SZ023', 'L', 'MON009'),
-- Nuoc ep cam
('SZ024', 'S', 'MON010'), ('SZ025', 'M', 'MON010'), ('SZ026', 'L', 'MON010');
GO

-- ================================================================
-- 6. Topping
-- ================================================================
INSERT INTO Topping (maTopping, tenTopping, giaTopping, trangThai) VALUES
('TOP001', N'Trân châu đen',     5000,  1),
('TOP002', N'Trân châu trắng',   5000,  1),
('TOP003', N'Thạch cà phê',      5000,  1),
('TOP004', N'Thạch trái cây',    5000,  1),
('TOP005', N'Kem cheese',        10000, 1),
('TOP006', N'Pudding trứng',     8000,  1),
('TOP007', N'Hạt chia',          5000,  1),
('TOP008', N'Nata de coco',      5000,  1);
GO

-- ================================================================
-- 7. BangGia
-- ================================================================
INSERT INTO BangGia (maBangGia, tenBangGia, ngayBatDau, ngayKetThuc, mucUuTien, trangThai) VALUES
('BG001', N'Bảng giá thường ngày',     '2026-01-01', '2026-12-31', 0, 1),
('BG002', N'Bảng giá cuối tuần',       '2026-01-01', '2026-12-31', 1, 1),
('BG003', N'Bảng giá ngày lễ Tết',    '2026-04-29', '2026-05-01', 2, 1);
GO

-- ================================================================
-- 8. BangGiaMon
--    Gia theo tung Size trong tung BangGia
-- ================================================================
INSERT INTO BangGiaMon (maBGM, giaBan, maSize, maBangGia) VALUES
-- Tra sua truyen thong - gia thuong
('BGM001', 35000, 'SZ001', 'BG001'),
('BGM002', 42000, 'SZ002', 'BG001'),
('BGM003', 49000, 'SZ003', 'BG001'),
-- Tra sua truyen thong - gia cuoi tuan
('BGM004', 38000, 'SZ001', 'BG002'),
('BGM005', 45000, 'SZ002', 'BG002'),
('BGM006', 52000, 'SZ003', 'BG002'),
-- Ca phe sua da - gia thuong
('BGM007', 30000, 'SZ004', 'BG001'),
('BGM008', 35000, 'SZ005', 'BG001'),
('BGM009', 40000, 'SZ006', 'BG001'),
-- Matcha latte - gia thuong
('BGM010', 38000, 'SZ007', 'BG001'),
('BGM011', 45000, 'SZ008', 'BG001'),
('BGM012', 52000, 'SZ009', 'BG001'),
-- Tra dao cam sa - gia thuong
('BGM013', 35000, 'SZ010', 'BG001'),
('BGM014', 42000, 'SZ011', 'BG001'),
('BGM015', 49000, 'SZ012', 'BG001'),
-- Ca phe den - gia thuong
('BGM016', 25000, 'SZ013', 'BG001'),
('BGM017', 29000, 'SZ014', 'BG001'),
('BGM018', 33000, 'SZ015', 'BG001'),
-- Banh mi trung - gia thuong
('BGM019', 25000, 'SZ016', 'BG001'),
-- Banh croissant - gia thuong
('BGM020', 35000, 'SZ017', 'BG001'),
-- Tra oolong sua - gia thuong
('BGM021', 35000, 'SZ018', 'BG001'),
('BGM022', 42000, 'SZ019', 'BG001'),
('BGM023', 49000, 'SZ020', 'BG001'),
-- Sinh to bo - gia thuong
('BGM024', 40000, 'SZ021', 'BG001'),
('BGM025', 50000, 'SZ022', 'BG001'),
('BGM026', 60000, 'SZ023', 'BG001'),
-- Nuoc ep cam - gia thuong
('BGM027', 30000, 'SZ024', 'BG001'),
('BGM028', 38000, 'SZ025', 'BG001'),
('BGM029', 45000, 'SZ026', 'BG001');
GO

-- ================================================================
-- 9. NguyenLieu
-- ================================================================
INSERT INTO NguyenLieu (maNL, tenNL, donViTinh, donGiaNhap, ngayHetHan) VALUES
('NL001', N'Trà đen',          'gram',  150,   NULL),
('NL002', N'Sữa tươi',         'ml',    25,    '2026-04-01'),
('NL003', N'Sữa đặc',          'gram',  50,    '2026-06-01'),
('NL004', N'Đường',            'gram',  20,    NULL),
('NL005', N'Trân châu đen',    'gram',  200,   '2026-03-30'),
('NL006', N'Trân châu trắng',  'gram',  200,   '2026-03-30'),
('NL007', N'Bột matcha',       'gram',  800,   '2026-12-31'),
('NL008', N'Cà phê rang xay',  'gram',  300,   NULL),
('NL009', N'Trà oolong',       'gram',  200,   NULL),
('NL010', N'Thạch cà phê',     'gram',  150,   '2026-04-15'),
('NL011', N'Đá viên',          'gram',  5,     NULL),
('NL012', N'Kem cheese',       'gram',  500,   '2026-03-28'),
('NL013', N'Trà đào',          'gram',  180,   NULL),
('NL014', N'Bột pha sinh tố',  'gram',  400,   '2026-06-30'),
('NL015', N'Cam tươi',         'gram',  30,    '2026-03-26');
GO

-- ================================================================
-- 10. DinhMucNguyenLieu
--     So luong tinh theo 1 ly size M (don vi chuan)
-- ================================================================
INSERT INTO DinhMucNguyenLieu (maDinhMuc, soLuong, maMon, maNL) VALUES
-- Tra sua truyen thong: tra + sua tuoi + duong + da
('DM001', 5,   'MON001', 'NL001'),
('DM002', 150, 'MON001', 'NL002'),
('DM003', 15,  'MON001', 'NL004'),
('DM004', 100, 'MON001', 'NL011'),
-- Ca phe sua da: ca phe + sua dac + da
('DM005', 20,  'MON002', 'NL008'),
('DM006', 30,  'MON002', 'NL003'),
('DM007', 150, 'MON002', 'NL011'),
-- Matcha latte: bot matcha + sua tuoi + duong
('DM008', 8,   'MON003', 'NL007'),
('DM009', 200, 'MON003', 'NL002'),
('DM010', 10,  'MON003', 'NL004'),
-- Tra dao cam sa: tra dao + duong + da
('DM011', 5,   'MON004', 'NL013'),
('DM012', 10,  'MON004', 'NL004'),
('DM013', 150, 'MON004', 'NL011'),
-- Ca phe den: ca phe
('DM014', 20,  'MON005', 'NL008'),
-- Tra oolong sua: tra oolong + sua tuoi
('DM015', 5,   'MON008', 'NL009'),
('DM016', 150, 'MON008', 'NL002'),
-- Sinh to bo: bot pha sinh to + sua tuoi
('DM017', 50,  'MON009', 'NL014'),
('DM018', 100, 'MON009', 'NL002'),
-- Nuoc ep cam: cam tuoi
('DM019', 200, 'MON010', 'NL015');
GO

-- ================================================================
-- 11. Ban
-- ================================================================
INSERT INTO Ban (maBan, soBan, maKhuVuc, sucChua, trangThai) VALUES
-- Tang 1: 8 ban
('BAN001', N'Bàn 01', 'KV001', 4, 'TRONG'),
('BAN002', N'Bàn 02', 'KV001', 4, 'TRONG'),
('BAN003', N'Bàn 03', 'KV001', 4, 'TRONG'),
('BAN004', N'Bàn 04', 'KV001', 6, 'TRONG'),
('BAN005', N'Bàn 05', 'KV001', 6, 'TRONG'),
('BAN006', N'Bàn 06', 'KV001', 2, 'TRONG'),
('BAN007', N'Bàn 07', 'KV001', 2, 'TRONG'),
('BAN008', N'Bàn 08', 'KV001', 8, 'TRONG'),
-- Tang 2: 6 ban
('BAN009', N'Bàn 09', 'KV002', 4, 'TRONG'),
('BAN010', N'Bàn 10', 'KV002', 4, 'TRONG'),
('BAN011', N'Bàn 11', 'KV002', 4, 'TRONG'),
('BAN012', N'Bàn 12', 'KV002', 6, 'TRONG'),
('BAN013', N'Bàn 13', 'KV002', 6, 'TRONG'),
('BAN014', N'Bàn 14', 'KV002', 8, 'TRONG');
GO

-- ================================================================
-- 12. NhaCungCap
-- ================================================================
INSERT INTO NhaCungCap (maNCC, tenNCC, diaChi, soDienThoai, email) VALUES
('NCC001', N'Công ty Trà Cao Nguyên',    N'Đà Lạt, Lâm Đồng',      '02633123456', 'contact@tracaonguyen.vn'),
('NCC002', N'Cà phê Buôn Ma Thuột',      N'Buôn Ma Thuột, Đắk Lắk', '02623456789', 'info@caphebuonmathuot.vn'),
('NCC003', N'Công ty Sữa Tươi Sạch',    N'Củ Chi, TP.HCM',         '02838123456', 'sales@suatuoisach.vn'),
('NCC004', N'Nhà cung cấp Topping ABC',  N'Q.Bình Tân, TP.HCM',     '02838654321', 'order@toppingabc.vn');
GO

-- ================================================================
-- 13. Kho
-- ================================================================
INSERT INTO Kho (maKho, tenKho, diaChi, maNV) VALUES
('KHO001', N'Kho nguyên liệu chính', N'Tầng trệt, khu bếp', 'NV001');
GO

-- ================================================================
-- 14. TonKho
--     So luong ton kho ban dau
-- ================================================================
INSERT INTO TonKho (maTonKho, soLuongTon, mucToiThieu, ngayCapNhat, maKho, maNL) VALUES
('TK001',  2000,  500,  GETDATE(), 'KHO001', 'NL001'),  -- Tra den
('TK002',  10000, 2000, GETDATE(), 'KHO001', 'NL002'),  -- Sua tuoi
('TK003',  3000,  500,  GETDATE(), 'KHO001', 'NL003'),  -- Sua dac
('TK004',  5000,  1000, GETDATE(), 'KHO001', 'NL004'),  -- Duong
('TK005',  2000,  300,  GETDATE(), 'KHO001', 'NL005'),  -- Tran chau den
('TK006',  2000,  300,  GETDATE(), 'KHO001', 'NL006'),  -- Tran chau trang
('TK007',  500,   100,  GETDATE(), 'KHO001', 'NL007'),  -- Bot matcha
('TK008',  3000,  500,  GETDATE(), 'KHO001', 'NL008'),  -- Ca phe rang xay
('TK009',  1000,  200,  GETDATE(), 'KHO001', 'NL009'),  -- Tra oolong
('TK010',  1500,  300,  GETDATE(), 'KHO001', 'NL010'),  -- Thach ca phe
('TK011',  50000, 5000, GETDATE(), 'KHO001', 'NL011'),  -- Da vien
('TK012',  500,   100,  GETDATE(), 'KHO001', 'NL012'),  -- Kem cheese
('TK013',  1000,  200,  GETDATE(), 'KHO001', 'NL013'),  -- Tra dao
('TK014',  2000,  500,  GETDATE(), 'KHO001', 'NL014'),  -- Bot pha sinh to
('TK015',  5000,  1000, GETDATE(), 'KHO001', 'NL015');  -- Cam tuoi
GO

PRINT '================================================';
PRINT 'Insert du lieu mau thanh cong!';
PRINT 'KhuVuc:             3 ban ghi';
PRINT 'NhanVien:           5 ban ghi';
PRINT 'CaLamViec:          5 ban ghi';
PRINT 'Mon:               10 ban ghi';
PRINT 'Size:              26 ban ghi';
PRINT 'Topping:            8 ban ghi';
PRINT 'BangGia:            3 ban ghi';
PRINT 'BangGiaMon:        29 ban ghi';
PRINT 'NguyenLieu:        15 ban ghi';
PRINT 'DinhMucNguyenLieu: 19 ban ghi';
PRINT 'Ban:               14 ban ghi';
PRINT 'NhaCungCap:         4 ban ghi';
PRINT 'Kho:                1 ban ghi';
PRINT 'TonKho:            15 ban ghi';
PRINT '================================================';
