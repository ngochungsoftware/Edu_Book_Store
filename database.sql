use master
create database Edu_Book_Store

use Edu_Book_Store

if OBJECT_ID('KhachHang') is not null
drop table KhachHang
go
CREATE table KhachHang 
(
	MaKH int identity not null primary key,
	HoTen nvarchar(50),
	TaiKhoan varchar(50),
	MatKhau nvarchar(50),
	Email nvarchar(100),
	DiaChi nvarchar(200),
	DienThoai varchar(50),
	GioiTinh nvarchar(3),
	NgaySinh datetime,
)


if OBJECT_ID('NhanVien') is not null
drop table NhanVien
go
CREATE table NhanVien 
(
	MaNV int identity not null primary key,
	HoTen nvarchar(50),
	TaiKhoan varchar(50),
	MatKhau nvarchar(50),
	Email nvarchar(100),
	DiaChi nvarchar(200),
	DienThoai varchar(50),
	GioiTinh nvarchar(3),
	NgaySinh datetime,
	Vaitro nvarchar(50)
)

if OBJECT_ID('Voucher') is not null
drop table Voucher
go
create table Voucher
(
	MaVoucher int identity primary key,
	TenVoucher nvarchar(100),
	NgayBatDau date,
	NgayKetThuc date,
	Giamgia float,
	DieuKien nvarchar(100)
)

if OBJECT_ID('Coupon') is not null
drop table Coupon
go
create table Coupon
(
	MaCoupon int identity primary key,
	TenCoupon nvarchar(100),
	NgayBatDau date,
	NgayKetThuc date,
	Quatang nvarchar(100),
	DieuKien nvarchar(100)
)

if OBJECT_ID('ChuDe') is not null
drop table ChuDe
go
CREATE  table ChuDe
(
MaChuDe int identity primary key not null,
TenChuDe nvarchar(50),
)

if OBJECT_ID('NhaXuatBan') is not null
drop table NhaXuatBan
go
CREATE table NhaXuatBan 
(
	MaNXB int identity primary key,
	TenNXB nvarchar(50),
	DiaChi nvarchar(200),
	DienThoai varchar(50)
)

if OBJECT_ID('TacGia') is not null
drop table TacGia
go
CREATE table TacGia 
(
	MaTacGia int identity primary key,
	TenTacGia nvarchar(50),
	DiaChi nvarchar(200),
	TieuSu nvarchar(Max),
	DienThoai varchar(50)
)

if OBJECT_ID('Sach') is not null
drop table Sach
go
CREATE table Sach 
(
	MaSach int identity primary key,
	TenSach nvarchar(50),
	GiaBan decimal(18,0),
	MoTa nvarchar(Max),
	AnhBia nvarchar(50),
	NgayCapNhat datetime,
	SoLuongTon int,
	MaNXB int,
	MaCoupon int,
	foreign key (MaCoupon) references Coupon(MaCoupon),
	MaChuDe int, -- nhieu tac gia viet 1 sach 1 sach nhieu tac gia => tao bang tham gia
)

if OBJECT_ID('ThamGia') is not null
drop table ThamGia
go
CREATE TABLE ThamGia
(
    MaSach INT,
    MaTacGia INT,
    VaiTro NVARCHAR(50),
    ViTri NVARCHAR(50),
    PRIMARY KEY (MaSach, MaTacGia)
);


if OBJECT_ID('DonHang') is not null
drop table DonHang
go
create table DonHang
(
	MaDonHang int identity primary key,
	MaNV int,
	foreign key (MaNV) references NhanVien(MaNV),
	MaVoucher int,
	foreign key (MaVoucher) references Voucher(MaVoucher),
	ThanhToan int ,
	TinhTrangGiaoHang int,
	NgayDat datetime,
	NgayGiao datetime,
	MaKH int,
)

if OBJECT_ID('LichSuGia') is not null
drop table LichSuGia
go
create table LichSuGia
(
	MaLSG int identity primary key,
	MaSach int,
	foreign key (MaSach) references Sach(MaSach),
	NgayBatDau date,
	NgayKetThuc date,
	GiaBan decimal(18,0),
	GhiChu nvarchar(100)
)

if OBJECT_ID('ChiTietDonHang') is not null
drop table ChiTietDonHang
go
create table ChiTietDonHang
(
	MaLSG int,
	foreign key (MaLSG) references LichSuGia(MaLSG),
	MaDonHang int,
	MaSach int,
	SoLuong int,
	DonGia varchar(max),
	primary key (MaDonHang, MaSach)
)

ALTER TABLE Sach
ADD CONSTRAINT FK_NhaXB_Sach FOREIGN KEY (MaNXB) REFERENCES NhaXuatBan(MaNXB);

ALTER TABLE Sach
ADD CONSTRAINT FK_ChuDe_Sach FOREIGN KEY (MaChuDe) REFERENCES ChuDe(MaChude);

ALTER TABLE ChiTietDonHang 
ADD CONSTRAINT FK_Sach_ChiTietDonHang FOREIGN KEY (MaSach) REFERENCES Sach(MaSach);

ALTER TABLE ChiTietDonHang 
ADD CONSTRAINT FK_DonHang_ChiTietDonHang FOREIGN KEY (MaDonHang) REFERENCES DonHang(MaDonHang);

ALTER TABLE DonHang
ADD CONSTRAINT FK_KhachHang_DonHang FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH);

ALTER TABLE ThamGia
ADD CONSTRAINT FK_Sach_ThamGia FOREIGN KEY (MaSach) REFERENCES Sach(MaSach),
    CONSTRAINT FK_TacGia_ThamGia FOREIGN KEY (MaTacGia) REFERENCES TacGia(MaTacGia);
