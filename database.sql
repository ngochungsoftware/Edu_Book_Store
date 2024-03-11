use master
go
create database Edu_Book_Store
go
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



	INSERT INTO KhachHang (HoTen, TaiKhoan, MatKhau, Email, DiaChi, DienThoai, GioiTinh, NgaySinh)
VALUES   (N'Nguyễn Văn A', 'nguyenvana', 'password1', 'nguyenvana@fpt.edu.vn', N'123 Đường A, Quận 1, TP.HCM', '1234567890', N'Nam', '1990-01-01'),
    (N'Nguyễn Thị B', 'nguyenthib', 'password2', 'nguyenthib@fpt.edu.vn', N'456 Đường B, Quận 2, TP.HCM', '9876543210', N'Nữ', '1995-05-10'),
    (N'Trần Văn C', 'tranvanc', 'password3', 'tranvanc@fpt.edu.vn', N'789 Đường C, Quận 3, TP.HCM', '5551234567', N'Nam', '1985-09-15'),
    (N'Lê Thị D', 'lethid', 'password4', 'lethid@fpt.edu.vn', N'321 Đường D, Quận 4, TP.HCM', '8889876543', N'Nữ', '1992-07-20'),
    (N'Phạm Văn E', 'phamvane', 'password5', 'phamvane@fpt.edu.vn', N'567 Đường E, Quận 5, TP.HCM', '1112223333', N'Nam', '1988-03-05'),
    (N'Huỳnh Thị F', 'huynhthif', 'password6', 'huynhthif@fpt.edu.vn', N'654 Đường F, Quận 6, TP.HCM', '9998887777', N'Nữ', '1997-11-25'),
    (N'Võ Văn G', 'vovang', 'password7', 'vovang@fpt.edu.vn', N'876 Đường G, Quận 7, TP.HCM', '4445556666', N'Nam', '1991-04-12'),
    (N'Dương Thị H', 'duongthih', 'password8', 'duongthih@fpt.edu.vn', N'987 Đường H, Quận 8, TP.HCM', '7778889999', N'Nữ', '1987-08-30'),
    (N'Hoàng Văn I', 'hoangvani', 'password9', 'hoangvani@fpt.edu.vn', N'234 Đường I, Quận 9, TP.HCM', '2223334444', N'Nam', '1994-02-18'),
    (N'Nguyễn Thị K', 'nguyenthik', 'password10', 'nguyenthik@fpt.edu.vn', N'543 Đường J, Quận 10, TP.HCM', '6667778888', N'Nữ', '1999-06-08');

	select * from KhachHang

INSERT INTO NhanVien (HoTen, TaiKhoan, MatKhau, Email, DiaChi, DienThoai, GioiTinh, NgaySinh, Vaitro)
VALUES 
    (N'Tên nhân viên 1', 'taiKhoan1', N'matKhau1', 'email1@example.com', N'Địa chỉ 1', '1234567890', N'Nam', '2000-01-01', N'Vai tro 1'),
    (N'Tên nhân viên 2', 'taiKhoan2', N'matKhau2', 'email2@example.com', N'Địa chỉ 2', '0987654321', N'Nữ', '1995-05-10', N'Vai tro 2'),
    (N'Tên nhân viên 3', 'taiKhoan3', N'matKhau3', 'email3@example.com', N'Địa chỉ 3', '9876543210', N'Nam', '1998-12-25', N'Vai tro 3'),
    (N'Tên nhân viên 4', 'taiKhoan4', N'matKhau4', 'email4@example.com', N'Địa chỉ 4', '0123456789', N'Nữ', '1990-06-15', N'Vai tro 4'),
    (N'Tên nhân viên 5', 'taiKhoan5', N'matKhau5', 'email5@example.com', N'Địa chỉ 5', '1111111111', N'Nam', '1985-03-20', N'Vai tro 5'),
    (N'Tên nhân viên 6', 'taiKhoan6', N'matKhau6', 'email6@example.com', N'Địa chỉ 6', '2222222222', N'Nữ', '1992-09-08', N'Vai tro 6'),
    (N'Tên nhân viên 7', 'taiKhoan7', N'matKhau7', 'email7@example.com', N'Địa chỉ 7', '3333333333', N'Nam', '1997-07-05', N'Vai tro 7'),
    (N'Tên nhân viên 8', 'taiKhoan8', N'matKhau8', 'email8@example.com', N'Địa chỉ 8', '4444444444', N'Nữ', '1993-11-12', N'Vai tro 8'),
    (N'Tên nhân viên 9', 'taiKhoan9', N'matKhau9', 'email9@example.com', N'Địa chỉ 9', '5555555555', N'Nam', '1996-04-30', N'Vai tro 9'),
    (N'Tên nhân viên 10', 'taiKhoan10', N'matKhau10', 'email10@example.com', N'Địa chỉ 10', '6666666666', N'Nữ', '1994-08-18', N'Vai tro 10');

INSERT INTO Voucher (TenVoucher, NgayBatDau, NgayKetThuc, Giamgia, DieuKien)
VALUES
    (N'Voucher 1', '2024-03-01', '2024-03-31', 10.5, N'Áp dụng cho đơn hàng trên 500.000 đồng'),
    (N'Voucher 2', '2024-04-01', '2024-04-30', 15.2, N'Áp dụng cho sản phẩm danh mục A'),
    (N'Voucher 3', '2024-05-01', '2024-05-31', 20.7, N'Áp dụng cho thành viên VIP'),
    (N'Voucher 4', '2024-06-01', '2024-06-30', 12.8, N'Áp dụng cho đơn hàng trên 1.000.000 đồng'),
    (N'Voucher 5', '2024-07-01', '2024-07-31', 18.6, N'Áp dụng cho sản phẩm danh mục B'),
    (N'Voucher 6', '2024-08-01', '2024-08-31', 25.3, N'Áp dụng cho đơn hàng trên 800.000 đồng'),
    (N'Voucher 7', '2024-09-01', '2024-09-30', 14.9, N'Áp dụng cho sản phẩm danh mục C'),
    (N'Voucher 8', '2024-10-01', '2024-10-31', 21.4, N'Áp dụng cho đơn hàng trên 700.000 đồng'),
    (N'Voucher 9', '2024-11-01', '2024-11-30', 17.2, N'Áp dụng cho sản phẩm danh mục D'),
    (N'Voucher 10', '2024-12-01', '2024-12-31', 23.8, N'Áp dụng cho đơn hàng trên 900.000 đồng');

INSERT INTO Coupon (TenCoupon, NgayBatDau, NgayKetThuc, Quatang, DieuKien)
VALUES
    (N'Coupon 1', '2024-03-01', '2024-03-31', N'Quà tặng A', N'Áp dụng cho đơn hàng trên 500.000 đồng'),
    (N'Coupon 2', '2024-04-01', '2024-04-30', N'Quà tặng B', N'Áp dụng cho sản phẩm danh mục X'),
    (N'Coupon 3', '2024-05-01', '2024-05-31', N'Quà tặng C', N'Áp dụng cho thành viên VIP'),
    (N'Coupon 4', '2024-06-01', '2024-06-30', N'Quà tặng D', N'Áp dụng cho đơn hàng trên 1.000.000 đồng'),
    (N'Coupon 5', '2024-07-01', '2024-07-31', N'Quà tặng E', N'Áp dụng cho sản phẩm danh mục Y'),
    (N'Coupon 6', '2024-08-01', '2024-08-31', N'Quà tặng F', N'Áp dụng cho đơn hàng trên 800.000 đồng'),
    (N'Coupon 7', '2024-09-01', '2024-09-30', N'Quà tặng G', N'Áp dụng cho sản phẩm danh mục Z'),
    (N'Coupon 8', '2024-10-01', '2024-10-31', N'Quà tặng H', N'Áp dụng cho đơn hàng trên 700.000 đồng'),
    (N'Coupon 9', '2024-11-01', '2024-11-30', N'Quà tặng I', N'Áp dụng cho sản phẩm danh mục W'),
    (N'Coupon 10', '2024-12-01', '2024-12-31', N'Quà tặng J', N'Áp dụng cho đơn hàng trên 900.000 đồng');

INSERT INTO ChuDe (TenChuDe)
VALUES
    (N'Chủ đề 1'),
    (N'Chủ đề 2'),
    (N'Chủ đề 3'),
    (N'Chủ đề 4'),
    (N'Chủ đề 5'),
    (N'Chủ đề 6'),
    (N'Chủ đề 7'),
    (N'Chủ đề 8'),
    (N'Chủ đề 9'),
    (N'Chủ đề 10');

	select * from ChuDe

INSERT INTO NhaXuatBan (TenNXB, DiaChi, DienThoai)
VALUES
    (N'Nhà xuất bản A', N'Địa chỉ A', '0123456789'),
    (N'Nhà xuất bản B', N'Địa chỉ B', '0987654321'),
    (N'Nhà xuất bản C', N'Địa chỉ C', '0123987654'),
    (N'Nhà xuất bản D', N'Địa chỉ D', '0987123456'),
    (N'Nhà xuất bản E', N'Địa chỉ E', '0123456798'),
    (N'Nhà xuất bản F', N'Địa chỉ F', '0987654390'),
    (N'Nhà xuất bản G', N'Địa chỉ G', '0123456821'),
    (N'Nhà xuất bản H', N'Địa chỉ H', '0987603214'),
    (N'Nhà xuất bản I', N'Địa chỉ I', '0123456876'),
    (N'Nhà xuất bản J', N'Địa chỉ J', '0987654320');


INSERT INTO TacGia (TenTacGia, DiaChi, TieuSu, DienThoai)
VALUES
    (N'Tác giả A', N'Địa chỉ A', N'Tiểu sử A', '0123456789'),
    (N'Tác giả B', N'Địa chỉ B', N'Tiểu sử B', '0987654321'),
    (N'Tác giả C', N'Địa chỉ C', N'Tiểu sử C', '0123987654'),
    (N'Tác giả D', N'Địa chỉ D', N'Tiểu sử D', '0987123456'),
    (N'Tác giả E', N'Địa chỉ E', N'Tiểu sử E', '0123456798'),
    (N'Tác giả F', N'Địa chỉ F', N'Tiểu sử F', '0987654390'),
    (N'Tác giả G', N'Địa chỉ G', N'Tiểu sử G', '0123456821'),
    (N'Tác giả H', N'Địa chỉ H', N'Tiểu sử H', '0987603214'),
    (N'Tác giả I', N'Địa chỉ I', N'Tiểu sử I', '0123456876'),
    (N'Tác giả J', N'Địa chỉ J', N'Tiểu sử J', '0987654320');

INSERT INTO Sach (TenSach, GiaBan, MoTa, AnhBia, NgayCapNhat, SoLuongTon, MaNXB, MaCoupon, MaChuDe)
VALUES
    (N'Tên sách 1', 100000, N'Mô tả sách 1', N'anhbia1.jpg', '2022-01-01', 50, 1, 1, 1),
    (N'Tên sách 2', 150000, N'Mô tả sách 2', N'anhbia2.jpg', '2022-01-02', 30, 2, 2, 2),
    (N'Tên sách 3', 200000, N'Mô tả sách 3', N'anhbia3.jpg', '2022-01-03', 20, 3, 3, 3),
    (N'Tên sách 4', 120000, N'Mô tả sách 4', N'anhbia4.jpg', '2022-01-04', 40, 4, 4, 4),
    (N'Tên sách 5', 180000, N'Mô tả sách 5', N'anhbia5.jpg', '2022-01-05', 25, 5, 5, 5),
    (N'Tên sách 6', 90000, N'Mô tả sách 6', N'anhbia6.jpg', '2022-01-06', 35, 6, 6, 6),
    (N'Tên sách 7', 160000, N'Mô tả sách 7', N'anhbia7.jpg', '2022-01-07', 15, 7, 7, 7),
    (N'Tên sách 8', 140000, N'Mô tả sách 8', N'anhbia8.jpg', '2022-01-08', 55, 8, 8, 8),
    (N'Tên sách 9', 110000, N'Mô tả sách 9', N'anhbia9.jpg', '2022-01-09', 45, 9, 9, 9),
    (N'Tên sách 10', 130000, N'Mô tả sách 10', N'anhbia10.jpg', '2022-01-10', 60, 10, 10, 10);

INSERT INTO ThamGia (MaSach, MaTacGia, VaiTro, ViTri)
VALUES
    (1, 1, N'Tác giả chính', N'Viết chính'),
    (1, 2, N'Tác giả phụ', N'Dịch thuật'),
    (2, 3, N'Tác giả chính', N'Viết chính'),
    (2, 4, N'Tác giả phụ', N'Viết phụ'),
    (3, 5, N'Tác giả chính', N'Viết chính'),
    (3, 6, N'Tác giả phụ', N'Viết phụ'),
    (4, 7, N'Tác giả chính', N'Viết chính'),
    (4, 8, N'Tác giả phụ', N'Viết phụ'),
    (5, 9, N'Tác giả chính', N'Viết chính'),
    (5, 10, N'Tác giả phụ', N'Viết phụ');

INSERT INTO DonHang (MaNV, MaVoucher, ThanhToan, TinhTrangGiaoHang, NgayDat, NgayGiao, MaKH)
VALUES
    (1, 1, 1, 1, '2022-01-01', '2022-01-02', 1),
    (2, 2, 1, 0, '2022-01-02', '2022-01-03', 2),
    (3, 3, 0, 1, '2022-01-03', '2022-01-04', 3),
    (4, 4, 1, 1, '2022-01-04', '2022-01-05', 4),
    (5, 5, 1, 0, '2022-01-05', '2022-01-06', 5),
    (6, 6, 0, 1, '2022-01-06', '2022-01-07', 6),
    (7, 7, 1, 1, '2022-01-07', '2022-01-08', 7),
    (8, 8, 1, 0, '2022-01-08', '2022-01-09', 8),
    (9, 9, 0, 1, '2022-01-09', '2022-01-10', 9),
    (10, 10, 1, 1, '2022-01-10', '2022-01-11', 10);

INSERT INTO LichSuGia (MaSach, NgayBatDau, NgayKetThuc, GiaBan, GhiChu)
VALUES
    (1, '2022-01-01', '2022-01-31', 100000, N'Giá ban đầu'),
    (1, '2022-02-01', '2022-02-28', 90000, N'Giảm giá'),
    (1, '2022-03-01', '2022-03-31', 95000, N'Tăng giá'),
    (2, '2022-01-01', '2022-01-31', 80000, N'Giá ban đầu'),
    (2, '2022-02-01', '2022-02-28', 75000, N'Giảm giá'),
    (2, '2022-03-01', '2022-03-31', 78000, N'Tăng giá'),
    (3, '2022-01-01', '2022-01-31', 120000, N'Giá ban đầu'),
    (3, '2022-02-01', '2022-02-28', 115000, N'Giảm giá'),
    (3, '2022-03-01', '2022-03-31', 118000, N'Tăng giá'),
    (4, '2022-01-01', '2022-01-31', 75000, N'Giá ban đầu');

INSERT INTO ChiTietDonHang (MaLSG, MaDonHang, MaSach, SoLuong, DonGia)
VALUES
    (1, 1, 1, 2, '100000'),
    (2, 1, 2, 1, '90000'),
    (3, 1, 3, 3, '95000'),
    (4, 2, 1, 1, '80000'),
    (5, 2, 2, 2, '75000'),
    (6, 2, 3, 1, '78000'),
    (7, 3, 1, 2, '120000'),
    (8, 3, 2, 3, '115000'),
    (9, 3, 3, 1, '118000'),
    (10, 4, 1, 1, '75000');

