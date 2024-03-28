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
import configDB_mac.jdbcHelper;
import entity.NhanVien;

public class NhanVienDAO {

    public static ArrayList<NhanVien> getAll() {
        ArrayList<NhanVien> listNV = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet resultSet = pstmt.executeQuery()) {
            while (resultSet.next()) {
                NhanVien s = new NhanVien();
                s.setMaNV(resultSet.getInt("MaNhanVien"));
                s.setHoTen(resultSet.getString("TenNV"));
                s.setTaiKhoan(resultSet.getString("TaiKhoan"));
                s.setMatKhau(resultSet.getString("MatKhau"));
                s.setEmail(resultSet.getString("Email"));
                s.setDiaChi(resultSet.getString("DiaChi"));
                s.setDienThoai(resultSet.getString("SDT"));
                s.setGioiTinh(resultSet.getString("GioiTinh"));
                s.setNgaySinh(resultSet.getDate("NgaySinh").toLocalDate().plusDays(2).toString());
                s.setVaitro(resultSet.getString("VaiTro"));
                listNV.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNV;
    }

    public static ArrayList<NhanVien> getListSalesPersonByCategory(String vaiTro) {
        ArrayList<NhanVien> listNV = new ArrayList<>();
        String sql = "SELECT * FROM NhanVien WHERE VaiTro=?";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, vaiTro);
            try (ResultSet resultSet = pstmt.executeQuery()) {
                while (resultSet.next()) {
                    NhanVien s = new NhanVien();
                    s.setMaNV(resultSet.getInt("MaNhanVien"));
                    s.setHoTen(resultSet.getString("TenNV"));
                    s.setTaiKhoan(resultSet.getString("TaiKhoan"));
                    s.setMatKhau(resultSet.getString("MatKhau"));
                    s.setEmail(resultSet.getString("Email"));
                    s.setDiaChi(resultSet.getString("DiaChi"));
                    s.setDienThoai(resultSet.getString("SDT"));
                    s.setGioiTinh(resultSet.getString("GioiTinh"));
                    s.setNgaySinh(resultSet.getDate("NgaySinh").toLocalDate().plusDays(2).toString());
                    s.setVaitro(resultSet.getString("VaiTro"));
                    listNV.add(s);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNV;
    }

    public static NhanVien getOneSalePersonByUsername(String UserName) {
        String sql = "SELECT * FROM NhanVien WHERE TaiKhoan=?";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, UserName);
            try (ResultSet resultSet = pstmt.executeQuery()) {
                if (resultSet.next()) {
                    NhanVien s = new NhanVien();
                    s.setMaNV(resultSet.getInt("MaNhanVien"));
                    s.setHoTen(resultSet.getString("TenNV"));
                    s.setTaiKhoan(resultSet.getString("TaiKhoan"));
                    s.setMatKhau(resultSet.getString("MatKhau"));
                    s.setEmail(resultSet.getString("Email"));
                    s.setDiaChi(resultSet.getString("DiaChi"));
                    s.setDienThoai(resultSet.getString("SDT"));
                    s.setGioiTinh(resultSet.getString("GioiTinh"));
                    s.setNgaySinh(resultSet.getDate("NgaySinh").toLocalDate().plusDays(2).toString());
                    s.setVaitro(resultSet.getString("VaiTro"));
                    return s;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static NhanVien getOneSalePersonByIDSalePerson(String maNhanVien) {
        String sql = "SELECT * FROM NhanVien WHERE MaNV=?";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, maNhanVien);
            try (ResultSet resultSet = pstmt.executeQuery()) {
                if (resultSet.next()) {
                    NhanVien s = new NhanVien();
                    s.setMaNV(resultSet.getInt("MaNhanVien"));
                    s.setHoTen(resultSet.getString("TenNV"));
                    s.setTaiKhoan(resultSet.getString("TaiKhoan"));
                    s.setMatKhau(resultSet.getString("MatKhau"));
                    s.setEmail(resultSet.getString("Email"));
                    s.setDiaChi(resultSet.getString("DiaChi"));
                    s.setDienThoai(resultSet.getString("SDT"));
                    s.setGioiTinh(resultSet.getString("GioiTinh"));
                    s.setNgaySinh(resultSet.getDate("NgaySinh").toLocalDate().plusDays(2).toString());
                    s.setVaitro(resultSet.getString("VaiTro"));
                    return s;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static NhanVien checkLogIn(String Username, String Password) {
        String sql = "SELECT * FROM NhanVien WHERE TaiKhoan =  ? AND  MatKhau =  ?";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, Username);
            pstmt.setString(2, Password);
            try (ResultSet resultSet = pstmt.executeQuery()) {
                if (resultSet.next()) {
                    NhanVien s = new NhanVien();
                    s.setMaNV(resultSet.getInt("MaNhanVien"));
                    s.setHoTen(resultSet.getString("TenNV"));
                    s.setTaiKhoan(resultSet.getString("TaiKhoan"));
                    s.setMatKhau(resultSet.getString("MatKhau"));
                    s.setEmail(resultSet.getString("Email"));
                    s.setDiaChi(resultSet.getString("DiaChi"));
                    s.setDienThoai(resultSet.getString("SDT"));
                    s.setGioiTinh(resultSet.getString("GioiTinh"));
                    s.setNgaySinh(resultSet.getDate("NgaySinh").toLocalDate().plusDays(2).toString());
                    s.setVaitro(resultSet.getString("VaiTro"));
                    return s;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static String checkLoginAndGetRole(String username, String password) {
        String role = null;
        String sql = "SELECT VaiTro FROM NhanVien WHERE TaiKhoan = ? AND MatKhau = ?";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            try (ResultSet resultSet = pstmt.executeQuery()) {
                if (resultSet.next()) {
                    role = resultSet.getString("VaiTro");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return role;
    }
    public static ArrayList<NhanVien> getEmployeesForLogin() {
        ArrayList<NhanVien> employeesForLogin = new ArrayList<>();
        String sql = "SELECT TaiKhoan, MatKhau, VaiTro FROM NhanVien";
        try (Connection conn = jdbcHelper.getConnection(); 
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet resultSet = pstmt.executeQuery()) {
            while (resultSet.next()) {
                NhanVien employee = new NhanVien();
                employee.setTaiKhoan(resultSet.getString("TaiKhoan"));
                employee.setMatKhau(resultSet.getString("MatKhau"));
                employee.setVaitro(resultSet.getString("VaiTro"));
                employeesForLogin.add(employee);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employeesForLogin;
    }
    public static int UpdateProfie(NhanVien acc) {
        String sql = "UPDATE NhanVien SET HoTen=?, TaiKhoan=?, MatKhau=?, Email=?, DiaChi=?, DienThoai=?, GioiTinh=?, NgaySinh=?, Vaitro=? WHERE MaNhanVien=?";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, acc.getHoTen());
            pstmt.setString(2, acc.getTaiKhoan());
            pstmt.setString(3, acc.getMatKhau());
            pstmt.setString(4, acc.getEmail());
            pstmt.setString(5, acc.getDiaChi());
            pstmt.setString(6, acc.getDienThoai());
            pstmt.setString(7, acc.getGioiTinh());
            pstmt.setDate(8, java.sql.Date.valueOf(LocalDate.parse(acc.getNgaySinh())));
            pstmt.setString(9, acc.getVaitro());
            pstmt.setInt(10,acc.getMaNV());
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static int UpdateProfie_Block(String maNhanVien) {
        String sql = "UPDATE NhanVien SET TrangThai=0 WHERE MaNV=?";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, maNhanVien);
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static int insertOneProfie(NhanVien acc) {
        String sql = "EXEC SP_InsertOneSalePerson ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, acc.getHoTen());
            pstmt.setString(2, acc.getTaiKhoan());
            pstmt.setString(3, acc.getMatKhau());
            pstmt.setString(4, acc.getEmail());
            pstmt.setString(5, acc.getDiaChi());
            pstmt.setString(6, acc.getDienThoai());
            pstmt.setString(7, acc.getGioiTinh());
            pstmt.setDate(8, java.sql.Date.valueOf(LocalDate.parse(acc.getNgaySinh())));
            pstmt.setString(9, acc.getVaitro());
            pstmt.setInt(10, acc.getMaNV());
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
