/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import quanlycuahangbansach.DLL.DataHelper;
import quanlycuahangbansach.Models.SalePerson;

public class SalesPersonDAO {
    
    public static ArrayList<SalePerson> getAll() {
        ArrayList<SalePerson> ListSalePerson = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet resultSet = pstmt.executeQuery()) {
            while (resultSet.next()) {
                SalePerson s = new SalePerson();
                s.setMaNhanVien(resultSet.getString("MaNhanVien"));
                s.setTenNhanVien(resultSet.getString("TenNV"));
                s.setGioiTinh(resultSet.getString("GioiTinh"));
                s.setNgaySinh(resultSet.getDate("NgaySinh").toLocalDate().plusDays(2).toString());
                s.setNgayVaoLam(resultSet.getDate("NgayVaoLam").toLocalDate().plusDays(2).toString());
                s.setDiaChi(resultSet.getString("DiaChi"));
                s.setSdt(resultSet.getString("SDT"));
                s.setMaChucVu(resultSet.getString("MaChucVu"));
                s.setTenDangNhap(resultSet.getString("TenDangNhap"));
                s.setHinhAnh(resultSet.getString("HinhAnh"));
                s.setMatKhau(resultSet.getString("MatKhau"));
                s.setLoaiTaiKhoan(resultSet.getString("LoaiTaiKhoan"));
                s.setCanCuocCongDan(resultSet.getString("CCCD"));
                ListSalePerson.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesPersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ListSalePerson;
    }
    
    public static ArrayList<SalePerson> getListSalesPersonByCategory(String maChucVu) {
        ArrayList<SalePerson> ListSalePerson = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien WHERE MaChucVu=?";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, maChucVu);
            try (ResultSet resultSet = pstmt.executeQuery()) {
                while (resultSet.next()) {
                    SalePerson s = new SalePerson();
                    s.setMaNhanVien(resultSet.getString("MaNhanVien"));
                    s.setTenNhanVien(resultSet.getString("TenNV"));
                    s.setGioiTinh(resultSet.getString("GioiTinh"));
                    s.setNgaySinh(resultSet.getDate("NgaySinh").toLocalDate().plusDays(2).toString());
                    s.setNgayVaoLam(resultSet.getDate("NgayVaoLam").toLocalDate().plusDays(2).toString());
                    s.setDiaChi(resultSet.getString("DiaChi"));
                    s.setSdt(resultSet.getString("SDT"));
                    s.setMaChucVu(resultSet.getString("MaChucVu"));
                    s.setTenDangNhap(resultSet.getString("TenDangNhap"));
                    s.setHinhAnh(resultSet.getString("HinhAnh"));
                    s.setMatKhau(resultSet.getString("MatKhau"));
                    s.setLoaiTaiKhoan(resultSet.getString("LoaiTaiKhoan"));
                    s.setCanCuocCongDan(resultSet.getString("CCCD"));
                    ListSalePerson.add(s);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesPersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ListSalePerson;
    }
    
    public static SalePerson getOneSalePersonByUsername(String UserName) {
        String sql = "SELECT * FROM NhanVien WHERE TenDangNhap=?";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, UserName);
            try (ResultSet resultSet = pstmt.executeQuery()) {
                if (resultSet.next()) {
                    SalePerson s = new SalePerson();
                    s.setMaNhanVien(resultSet.getString("MaNhanVien"));
                    s.setTenNhanVien(resultSet.getString("TenNV"));
                    s.setGioiTinh(resultSet.getString("GioiTinh"));
                    s.setNgaySinh(resultSet.getDate("NgaySinh").toLocalDate().plusDays(2).toString());
                    s.setNgayVaoLam(resultSet.getDate("NgayVaoLam").toLocalDate().plusDays(2).toString());
                    s.setDiaChi(resultSet.getString("DiaChi"));
                    s.setSdt(resultSet.getString("SDT"));
                    s.setMaChucVu(resultSet.getString("MaChucVu"));
                    s.setTenDangNhap(resultSet.getString("TenDangNhap"));
                    s.setHinhAnh(resultSet.getString("HinhAnh"));
                    s.setMatKhau(resultSet.getString("MatKhau"));
                    s.setLoaiTaiKhoan(resultSet.getString("LoaiTaiKhoan"));
                    s.setCanCuocCongDan(resultSet.getString("CCCD"));
                    return s;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesPersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static SalePerson getOneSalePersonByIDSalePerson(String maNhanVien) {
        String sql = "SELECT * FROM NhanVien WHERE MaNhanVien=?";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, maNhanVien);
            try (ResultSet resultSet = pstmt.executeQuery()) {
                if (resultSet.next()) {
                    SalePerson s = new SalePerson();
                    s.setMaNhanVien(resultSet.getString("MaNhanVien"));
                    s.setTenNhanVien(resultSet.getString("TenNV"));
                    s.setGioiTinh(resultSet.getString("GioiTinh"));
                    s.setNgaySinh(resultSet.getDate("NgaySinh").toLocalDate().plusDays(2).toString());
                    s.setNgayVaoLam(resultSet.getDate("NgayVaoLam").toLocalDate().plusDays(2).toString());
                    s.setDiaChi(resultSet.getString("DiaChi"));
                    s.setSdt(resultSet.getString("SDT"));
                    s.setMaChucVu(resultSet.getString("MaChucVu"));
                    s.setTenDangNhap(resultSet.getString("TenDangNhap"));
                    s.setHinhAnh(resultSet.getString("HinhAnh"));
                    s.setMatKhau(resultSet.getString("MatKhau"));
                    s.setLoaiTaiKhoan(resultSet.getString("LoaiTaiKhoan"));
                    s.setCanCuocCongDan(resultSet.getString("CCCD"));
                    return s;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesPersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static SalePerson checkLogIn(String Username , String Password) {
        String sql = "SELECT * FROM NhanVien
                WHERE TenDangNhap=? AND MatKhau=?";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, Username);
            pstmt.setString(2, Password);
            try (ResultSet resultSet = pstmt.executeQuery()) {
                if (resultSet.next()) {
                    SalePerson s = new SalePerson();
                    s.setMaNhanVien(resultSet.getString("MaNhanVien"));
                    s.setTenNhanVien(resultSet.getString("TenNV"));
                    s.setGioiTinh(resultSet.getString("GioiTinh"));
                    s.setNgaySinh(resultSet.getDate("NgaySinh").toLocalDate().plusDays(2).toString());
                    s.setNgayVaoLam(resultSet.getDate("NgayVaoLam").toLocalDate().plusDays(2).toString());
                    s.setDiaChi(resultSet.getString("DiaChi"));
                    s.setSdt(resultSet.getString("SDT"));
                    s.setMaChucVu(resultSet.getString("MaChucVu"));
                    s.setTenDangNhap(resultSet.getString("TenDangNhap"));
                    s.setHinhAnh(resultSet.getString("HinhAnh"));
                    s.setMatKhau(resultSet.getString("MatKhau"));
                    s.setLoaiTaiKhoan(resultSet.getString("LoaiTaiKhoan"));
                    s.setCanCuocCongDan(resultSet.getString("CCCD"));
                    return s;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesPersonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static int UpdateProfie(SalePerson acc) {
        String sql = "UPDATE NhanVien SET TenNV=?, GioiTinh=?, NgaySinh=?, NgayVaoLam=?, DiaChi=?, SDT=?, MaChucVu=?, TenDangNhap=?, HinhAnh=?, MatKhau=?, LoaiTaiKhoan=?, CCCD=? WHERE MaNhanVien=?";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, acc.getTenNhanVien());
            pstmt.setString(2, acc.getGioiTinh());
            pstmt.setDate(3, java.sql.Date.valueOf(LocalDate.parse(acc.getNgaySinh())));
            pstmt.setDate(4, java.sql.Date.valueOf(LocalDate.parse(acc.getNgayVaoLam())));
            pstmt.setString(5, acc.getDiaChi());
            pstmt.setString(6, acc.getSdt());
            pstmt.setString(7, acc.getMaChucVu());
            pstmt.setString(8, acc.getTenDangNhap());
            pstmt.setString(9, acc.getHinhAnh());
            pstmt.setString(10, acc.getMatKhau());
            pstmt.setString(11, acc.getLoaiTaiKhoan());
            pstmt.setString(12, acc.getCanCuocCongDan());
            pstmt.setString(13, acc.getMaNhanVien());
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SalesPersonDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public static int UpdateProfie_Block(String maNhanVien) {
        String sql = "UPDATE NhanVien SET TrangThai=0 WHERE MaNhanVien=?";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, maNhanVien);
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SalesPersonDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public static int insertOneProfie(SalePerson acc) {
        String sql = "EXEC SP_InsertOneSalePerson ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, acc.getTenNhanVien());
            pstmt.setString(2, acc.getGioiTinh());
            pstmt.setDate(3, java.sql.Date.valueOf(LocalDate.parse(acc.getNgaySinh())));
            pstmt.setDate(4, java.sql.Date.valueOf(LocalDate.parse(acc.getNgayVaoLam())));
            pstmt.setString(5, acc.getDiaChi());
            pstmt.setString(6, acc.getSdt());
            pstmt.setString(7, acc.getMaChucVu());
            pstmt.setString(8, acc.getTenDangNhap());
            pstmt.setString(9, acc.getHinhAnh());
            pstmt.setString(10, acc.getMatKhau());
            pstmt.setString(11, acc.getLoaiTaiKhoan());
            pstmt.setString(12, acc.getCanCuocCongDan());
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SalesPersonDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
