use master
create database Edu_Book_Store

use Edu_Book_Store

-- Add table

if OBJECT_ID('KhachHang') is not null
drop table KhachHang
go
CREATE table KhachHang 
(
	MaKH varchar(5) primary key,
	HoTen nvarchar(60),
	Email varchar(100),
	DiaChi nvarchar(200),
	DienThoai varchar(50),
	GioiTinh nvarchar(3),
	NgaySinh date,
)


if OBJECT_ID('NhanVien') is not null
drop table NhanVien
go
CREATE table NhanVien 
(
	MaNV varchar(5) primary key,
	HoTen nvarchar(60),
	Email varchar(100),
	DiaChi nvarchar(200),
	DienThoai varchar(50),
	GioiTinh nvarchar(3),
	NgaySinh date,
	Vaitro nvarchar(50),
	Luong float
)

if OBJECT_ID('Voucher') is not null
drop table Voucher
go
create table Voucher
(
	MaVoucher varchar(5) primary key,
	TenVoucher nvarchar(100),
	NgayBatDau date,
	NgayKetThuc date,
	LoaiVoucher nvarchar(50),
	DieuKien nvarchar(100)
)

if OBJECT_ID('ChiTietVoucher') is not null
drop table ChiTietVoucher
go
create table ChiTietVoucher(
	MaVoucher varchar(5) not null,
	MaSach varchar(5) not null,
	GiamGia float
)

if OBJECT_ID('Coupon') is not null
drop table Coupon
go
create table Coupon
(
	MaCoupon varchar(5) primary key,
	TenCoupon nvarchar(100),
	NgayBatDau date,
	NgayKetThuc date,
	Quatang nvarchar(100),
	DieuKien nvarchar(100)
)

if OBJECT_ID('TheLoai') is not null
drop table TheLoai
go
CREATE  table TheLoai
(
MaTheLoai varchar(50) primary key,
TenTheLoai nvarchar(50),
)

if OBJECT_ID('NhaXuatBan') is not null
drop table NhaXuatBan
go
CREATE table NhaXuatBan 
(
	MaNXB varchar(50) primary key,
	TenNXB nvarchar(50),
	DiaChi nvarchar(200),
	SoDienThoai varchar(50)
)

if OBJECT_ID('TacGia') is not null
drop table TacGia
go
CREATE table TacGia 
(
	MaTacGia varchar(50) primary key,
	TenTacGia nvarchar(50),
	DiaChi nvarchar(200),
	DienThoai varchar(50)
)

if OBJECT_ID('Sach') is not null
drop table Sach
go
CREATE table Sach 
(
	MaSach varchar(5) primary key,
	TenSach nvarchar(50),
	NamXuatBan int,
	DonGia float,
	Anh varchar(50),
	SoLuong int,
	MaNXB varchar(50) not null,
	MaCoupon varchar(5) not null,
	MaTheLoai varchar(50) not null,
	MaTacGia varchar(50) not null
)

if OBJECT_ID('HoaDon') is not null
drop table HoaDon
go
create table HoaDon
(
	MaHoaDon varchar(5) primary key,
	MaNV varchar(5) not null,
	MaVoucher varchar(5) not null,
	MaKH varchar(5) not null,
	NgayLapHoaDon date,
	TongTien float,
	GiamGia float,
	ThanhTien float
)

if OBJECT_ID('LichSuGia') is not null
drop table LichSuGia
go
create table LichSuGia
(
	MaLSG varchar(5) primary key,
	MaSach varchar(5) not null,
	NgayBatDau date,
	NgayKetThuc date,
	GiaBan float,
	GhiChu nvarchar(100)
)

if OBJECT_ID('ChiTietHoaDon') is not null
drop table ChiTietHoaDon
go
create table ChiTietHoaDon
(
	MaLSG varchar(5) not null,
	MaHoaDon varchar(5) not null,
	MaSach varchar(5) not null,
	TenSach nvarchar(50),
	SoLuong int,
	DonGia float,
	GiamGia int,
	ThanhTien float
)

if OBJECT_ID('PhieuNhap') is not null
drop table PhieuNhap
go
create table PhieuNhap(
	MaPN varchar(5) primary key,
	MaNV varchar(5) not null,
	MaNCC varchar(5) not null,
	TrangThai nvarchar(20),
	TongTien float,
	NgayNhap date
)

if OBJECT_ID('ChiTietPhieuNhap') is not null
drop table ChiTietPhieuNhap
go
create table ChiTietPhieuNhap(
	MaCTPN varchar(5) primary key,
	MaPN varchar(5) not null,
	MaSach varchar(5) not null,
	DonGia int,
	SoLuong int,
	ThanhTien int
)

if OBJECT_ID('NhaCungCap') is not null
drop table NhaCungCap
go
create table NhaCungCap(
	MaNCC varchar(5) primary key,
	TenNCC nvarchar(255),
	DIaChi nvarchar(255)
)

if OBJECT_ID('TaiKhoan') is not null
drop table TaiKhoan
go
create table TaiKhoan(
	TenTaiKhoan varchar(255) primary key,
	MaNV varchar(5) not null,
	MaTK varchar(5) not null,
	MatKhau varchar(50),
	Quyen nvarchar(30),
	TrangThai nvarchar(50)
)

-- Insert table

INSERT INTO NhaXuatBan (MaNXB, TenNXB, DiaChi, SoDienThoai)
VALUES
    ('NXB1',N'Nhà xuất bản A', N'Địa chỉ A', '0123456789'),
    ('NXB2',N'Nhà xuất bản B', N'Địa chỉ B', '0987654321'),
    ('NXB3',N'Nhà xuất bản C', N'Địa chỉ C', '0123987654');

INSERT INTO TheLoai(MaTheLoai, TenTheLoai)
VALUES
    ('TL1',N'Chủ đề 1'),
    ('TL2',N'Chủ đề 2'),
    ('TL3',N'Chủ đề 3');

INSERT INTO TacGia (MaTacGia, TenTacGia, DiaChi, DienThoai)
VALUES
    ('TG1',N'Tác giả A', N'Địa chỉ A', '0123456789'),
    ('TG2',N'Tác giả B', N'Địa chỉ B', '0987654321'),
    ('TG3',N'Tác giả C', N'Địa chỉ C', '0123987654');


INSERT INTO KhachHang (MaKH, HoTen, Email, DiaChi, DienThoai, GioiTinh, NgaySinh)
VALUES   ('KH1',N'Nguyễn Văn A', 'nguyenvana@fpt.edu.vn', N'123 Đường A, Quận 1, TP.HCM', '1234567890', N'Nam', '1990-01-01'),
    ('KH2',N'Nguyễn Thị B', 'nguyenthib@fpt.edu.vn', N'456 Đường B, Quận 2, TP.HCM', '9876543210', N'Nữ', '1995-05-10'),
    ('KH3',N'Trần Văn C', 'tranvanc@fpt.edu.vn', N'789 Đường C, Quận 3, TP.HCM', '5551234567', N'Nam', '1985-09-15');

INSERT INTO NhaCungCap (MaNCC, TenNCC, DIaChi)
VALUES
	('NCC1',N'Nhà cung cấp 1', 'Địa chỉ 1'),
	('NCC2',N'Nhà cung cấp 2', 'Địa chỉ 2'),
	('NCC3',N'Nhà cung cấp 3', 'Địa chỉ 3');

INSERT INTO NhanVien (MaNV, HoTen, Email, DiaChi, DienThoai, GioiTinh, NgaySinh, Vaitro, Luong)
VALUES 
    ('NV1',N'Tên nhân viên 1', 'email1@example.com', N'Địa chỉ 1', '1234567890', N'Nam', '2000-01-01', N'Quản trị viên', 25000),
	('NV2',N'Tên nhân viên 2', 'email1@example.com', N'Địa chỉ 2', '1234567891', N'Nữ', '1991-01-01', N'Quản lý', 35000),
    ('NV3',N'Tên nhân viên 3', 'email1@example.com', N'Địa chỉ 3', '1234567892', N'Nam', '2001-01-01', N'Nhân viên', 45000);

INSERT INTO TaiKhoan (TenTaiKhoan, MaNV, MaTK, MatKhau, Quyen, TrangThai)
VALUES
	('Admin', 'NV1', '1','1234',N'Quản trị viên','Đang hoạt động'),
	('quanly', 'NV2','2','qlch',N'Quản lý','Đang hoạt động'),
	('mailanhanvien', 'NV3','3','mmlnv',N'Nhân viên','Tạm dừng hoạt động');

INSERT INTO Voucher (MaVoucher,TenVoucher, NgayBatDau, NgayKetThuc, LoaiVoucher, DieuKien)
VALUES
    ('VC1',N'Voucher 1', '2024-03-01', '2024-03-31', N'Loai 1', N'Áp dụng cho đơn hàng trên 500.000 đồng'),
    ('VC2',N'Voucher 2', '2024-04-01', '2024-04-30', N'Loai 2', N'Áp dụng cho sản phẩm danh mục A'),
    ('VC3',N'Voucher 3', '2024-05-01', '2024-05-31', N'Loai 3', N'Áp dụng cho thành viên VIP');

INSERT INTO Sach (MaSach,TenSach, NamXuatBan, DonGia, Anh, SoLuong, MaNXB, MaCoupon, MaTheLoai, MaTacGia)
VALUES
    ('S1',N'Tên sách 1', 2004, 150.0, 'anh1', 10, 'NXB1', 'C1', 'TL1', 'TG1'),
    ('S2',N'Tên sách 2', 2003, 345.0, 'anh2', 20, 'NXB2', 'C2', 'TL2', 'TG2'),
	('S3',N'Tên sách 3', 2002, 350.0, 'anh3', 30, 'NXB3', 'C3', 'TL3', 'TG3');

INSERT INTO ChiTietVoucher (MaVoucher, MaSach, GiamGia)
VALUES
	('VC1','S1',12.0),
	('VC2','S2',24.0),
	('VC3','S3',67.0);

INSERT INTO Coupon (MaCoupon, TenCoupon, NgayBatDau, NgayKetThuc, Quatang, DieuKien)
VALUES
    ('C1',N'Coupon 1', '2024-03-01', '2024-03-31', N'Quà tặng A', N'Áp dụng cho đơn hàng trên 500.000 đồng'),
    ('C2',N'Coupon 2', '2024-04-01', '2024-04-30', N'Quà tặng B', N'Áp dụng cho sản phẩm danh mục X'),
    ('C3',N'Coupon 3', '2024-05-01', '2024-05-31', N'Quà tặng C', N'Áp dụng cho thành viên VIP');

INSERT INTO PhieuNhap (MaPN, MaNV, MaNCC, TrangThai, TongTien, NgayNhap)
VALUES	
	('PN1', 'NV1', 'NCC1', N'Hoàn Thành',1000000.0, '2024-03-20'),
	('PN2', 'NV3', 'NCC2', N'Chưa hoàn thành',500000.0, '2024-03-10'),
	('PN3', 'NV2', 'NCC3', N'Hoàn Thành',1500000.0, '2024-03-15');

INSERT INTO ChiTietPhieuNhap (MaCTPN, MaPN, MaSach, DonGia, SoLuong, ThanhTien)
VALUES
	('CTPN1','PN1','S1',100000.0, 10, 1000000.0),
	('CTPN2','PN3','S2',150000.0, 5, 750000.0),
	('CTPN3','PN3','S3',150000.0, 5, 750000.0);

INSERT INTO HoaDon (MaHoaDon, MaNV, MaVoucher, MaKH, NgayLapHoaDon, TongTien, GiamGia, ThanhTien)
VALUES
    ('HD1', 'NV1', 'VC1', 'KH1', '2022-01-01', 150.0, 50.0, 100),
    ('HD2', 'NV2', 'VC2', 'KH2', '2022-01-02', 270.0, 20.0, 250.0),
	('HD3', 'NV3', 'VC3', 'KH3', '2022-01-03', 50.0, 25.0, 25.0);

INSERT INTO LichSuGia (MaLSG, MaSach, NgayBatDau, NgayKetThuc, GiaBan, GhiChu)
VALUES
    ('LSG1', 'S1', '2022-01-01', '2022-01-31', 100.0, N'Giá không đổi'),
    ('LSG2', 'S1', '2022-02-01', '2022-02-28', 150.0, N'Giá có tăng đôi phần'),
	('LSG3', 'S2', '2022-02-01', '2022-02-28', 345.0, N'Giá không đổi');

INSERT INTO ChiTietHoaDon (MaLSG, MaHoaDon, MaSach, TenSach, SoLuong, DonGia, GiamGia, ThanhTien)
VALUES
    ('LSG1', 'HD1', 'S1', N'Tên Sách 1', 1, 100.0, 50.0, 50.0),
    ('LSG2', 'HD2', 'S1', N'Tên Sách 1', 1, 150.0, 20.0, 130.0),
    ('LSG3', 'HD3', 'S2', N'Tên Sách 2', 1, 345.0, 25.0, 325.0);


-- Add constraint

ALTER TABLE Sach
ADD CONSTRAINT FK_NhaXB_Sach FOREIGN KEY (MaNXB) REFERENCES NhaXuatBan(MaNXB);

ALTER TABLE Sach
ADD CONSTRAINT FK_TheLoai_Sach FOREIGN KEY (MaTheLoai) REFERENCES TheLoai(MaTheLoai);

ALTER TABLE Sach
ADD CONSTRAINT FK_TacGia_Sach FOREIGN KEY (MaTacGia) REFERENCES TacGia(MaTacGia);

ALTER TABLE Sach
ADD CONSTRAINT FK_Coupon_Sach FOREIGN KEY (MaCoupon) REFERENCES Coupon(MaCoupon);

ALTER TABLE LichSuGia
ADD CONSTRAINT FK_Sach_LichSuGia FOREIGN KEY (MaSach) REFERENCES Sach(MaSach);

ALTER TABLE ChiTietVoucher
ADD CONSTRAINT FK_Sach_CTVoucher FOREIGN KEY (MaSach) REFERENCES Sach(MaSach);

ALTER TABLE ChiTietVoucher
ADD CONSTRAINT FK_MaVoucher_CTVoucher FOREIGN KEY (MaVoucher) REFERENCES Voucher(MaVoucher);

ALTER TABLE ChiTietHoaDon 
ADD CONSTRAINT FK_Sach_ChiTietHoaDon FOREIGN KEY (MaSach) REFERENCES Sach(MaSach);

ALTER TABLE ChiTietHoaDon 
ADD CONSTRAINT FK_HoaDon_ChiTietHoaDon FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon);

ALTER TABLE ChiTietHoaDon 
ADD CONSTRAINT FK_LichSuGia_ChiTietHoaDon FOREIGN KEY (MaLSG) REFERENCES LichSuGia(MaLSG);

ALTER TABLE HoaDon
ADD CONSTRAINT FK_KhachHang_HoaDon FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH);

ALTER TABLE HoaDon
ADD CONSTRAINT FK_Voucher_HoaDon FOREIGN KEY (MaVoucher) REFERENCES Voucher(MaVoucher);

ALTER TABLE HoaDon
ADD CONSTRAINT FK_NhanVien_HoaDon FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV);

ALTER TABLE ChiTietPhieuNhap
ADD CONSTRAINT FK_Sach_CTPN FOREIGN KEY (MaSach) REFERENCES Sach(MaSach);

ALTER TABLE ChiTietPhieuNhap
ADD CONSTRAINT FK_PN_CTPN FOREIGN KEY (MaPN) REFERENCES PhieuNhap(MaPN);

ALTER TABLE PhieuNhap
ADD CONSTRAINT FK_NhanVien_PN FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV);

ALTER TABLE PhieuNhap
ADD CONSTRAINT FK_NhaCungCap_PN FOREIGN KEY (MaNCC) REFERENCES NhaCungCap(MaNCC);

ALTER TABLE TaiKhoan
ADD CONSTRAINT FK_NhanVien_TaiKhoan FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV);
