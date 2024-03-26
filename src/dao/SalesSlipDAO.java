/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import quanlycuahangbansach.DLL.DataHelper;
import quanlycuahangbansach.Models.SalesSlip;

public class SalesSlipDAO {
    public static ArrayList<SalesSlip> getAll() {
        ArrayList<SalesSlip> listSalesSlip = new ArrayList<>();
        String sql = "SELECT * FROM PhieuBanHang";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet resultSet = pstmt.executeQuery()) {
            while (resultSet.next()) {
                SalesSlip s = new SalesSlip();
                s.setMaNhanVien(resultSet.getString("MaNhanVien"));
                s.setMaPhieuBanHang(resultSet.getString("MaPhieuBan"));
                s.setSoDienThoaiKhachHang(resultSet.getString("SDT_KH"));
                s.setTongTien(resultSet.getFloat("TongTien"));
                s.setNgayMua(resultSet.getString("NgayMua"));
                s.setGiamGia(resultSet.getFloat("GiamGia"));
                s.setSoTienPhiaTra(resultSet.getFloat("SoTienPhaiTra"));
                s.setTrangThai(resultSet.getString("TrangThai"));
                listSalesSlip.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesSlipDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listSalesSlip;
    }
    
    public static int insertOneSalesSlip(SalesSlip s) {
        String sql = "EXEC SP_InsertOneQuittance ?, ?";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, s.getSoDienThoaiKhachHang());
            pstmt.setString(2, s.getMaNhanVien());
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SalesSlipDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public static int updateOneSalesSlip(SalesSlip s) {
        String sql = "UPDATE PhieuBanHang SET GiamGia=?, SoTienPhaiTra=?, TrangThai=1 WHERE MaPhieuBan=?";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setFloat(1, s.getGiamGia());
            pstmt.setFloat(2, s.getSoTienPhiaTra());
            pstmt.setString(3, s.getMaPhieuBanHang());
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SalesSlipDAO.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public static ArrayList<SalesSlip> getListSalesSlipByPhoneNumberValue(String phoneNumber) {
        ArrayList<SalesSlip> ds = new ArrayList<>();
        String sql = "SELECT * FROM PhieuBanHang WHERE SDT_KH = ?";
        DataHelper helper = new DataHelper();
        try {
            helper.connect();
            helper.preparedStatement = helper.connection.prepareStatement(sql);
            helper.preparedStatement.setString(1, phoneNumber);
            ResultSet resultSet = helper.preparedStatement.executeQuery();
            while (resultSet.next()) {
                SalesSlip s = new SalesSlip();
                s.setMaNhanVien(resultSet.getString("MaNhanVien"));
                s.setMaPhieuBanHang(resultSet.getString("MaPhieuBan"));
                s.setSoDienThoaiKhachHang(resultSet.getString("SDT_KH"));
                s.setTongTien(resultSet.getFloat("TongTien"));
                s.setNgayMua(resultSet.getString("NgayMua"));
                s.setGiamGia(resultSet.getFloat("GiamGia"));
                s.setSoTienPhiaTra(resultSet.getFloat("SoTienPhaiTra"));
                s.setTrangThai(resultSet.getString("TrangThai"));
                ds.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesSlipDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            helper.close();
        }
        return ds;
    }
}

