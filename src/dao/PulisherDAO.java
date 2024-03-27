package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import quanlycuahangbansach.DLL.DataHelper;
import quanlycuahangbansach.Models.Publisher;

public class PublisherDAO {
    public static ArrayList<Publisher> getAll() {
        ArrayList<Publisher> ds = new ArrayList<>();
        String sql = "SELECT * FROM NhaXuatBan";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet resultSet = pstmt.executeQuery()) {
            while (resultSet.next()) {
                Publisher nxb = new Publisher();
                nxb.setMaNhaXuatBan(resultSet.getString(1));
                nxb.setTenNhaXuatBan(resultSet.getString(2));
                ds.add(nxb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds;
    }
    
    public static Publisher getOneById(String value) {
        Publisher nhaXuatBan = new Publisher();
        String sql = "SELECT * FROM NhaXuatBan WHERE MaNXB=?";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, value);
            try (ResultSet resultSet = pstmt.executeQuery()) {
                while (resultSet.next()) {
                    nhaXuatBan.setMaNhaXuatBan(resultSet.getString("MaNXB"));
                    nhaXuatBan.setTenNhaXuatBan(resultSet.getString("TenNXB"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nhaXuatBan;
    }
    
    public static int insert(String tenNhaXuatBan) {
        String sql = "EXEC SP_InsertOnePublisher ?";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, tenNhaXuatBan);
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public static int upDate(String maNhaXuatBan, String tenNhaXuatBan) {
        String sql = "UPDATE NhaXuatBan SET TenNXB=? WHERE MaNXB=?";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, tenNhaXuatBan);
            pstmt.setString(2, maNhaXuatBan);
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public static int deleteOneById(String maNhaXuatBan) {
        String sql = "DELETE FROM NhaXuatBan WHERE MaNXB=?";
        try (Connection conn = DataHelper.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, maNhaXuatBan);
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Publisher.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
