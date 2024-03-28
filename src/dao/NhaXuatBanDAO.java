package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import configDB_mac.jdbcHelper;
import entity.NhaXuatBan;

public class NhaXuatBanDAO {

    public static ArrayList<NhaXuatBan> getAll() {
        ArrayList<NhaXuatBan> ds = new ArrayList<>();
        String sql = "SELECT * FROM NhaXuatBan";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet resultSet = pstmt.executeQuery()) {
            while (resultSet.next()) {
                NhaXuatBan nxb = new NhaXuatBan();
                nxb.setMaNXB(resultSet.getInt(1));
                nxb.setTenNXB(resultSet.getString(2));
                nxb.setDiaChi(resultSet.getString(3));
                nxb.setDienThoai(resultSet.getString(4));
                ds.add(nxb);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhaXuatBan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ds;
    }

    public static NhaXuatBan getOneById(String value) {
        NhaXuatBan nhaXuatBan = new NhaXuatBan();
        String sql = "SELECT * FROM NhaXuatBan WHERE MaNXB=?";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, value);
            try (ResultSet resultSet = pstmt.executeQuery()) {
                while (resultSet.next()) {
                    nhaXuatBan.setMaNXB(resultSet.getInt("MaNXB"));
                    nhaXuatBan.setTenNXB(resultSet.getString("TenNXB"));
                    nhaXuatBan.setDiaChi(resultSet.getString(3));
                    nhaXuatBan.setDienThoai(resultSet.getString(4));

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChuDeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nhaXuatBan;
    }

    public static int insert(String tenNhaXuatBan) {
        String sql = "EXEC SP_InsertOnePublisher ?";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, tenNhaXuatBan);
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhaXuatBan.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static int upDate(String maNhaXuatBan, String tenNhaXuatBan) {
        String sql = "UPDATE NhaXuatBan SET TenNXB=? WHERE MaNXB=?";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, tenNhaXuatBan);
            pstmt.setString(2, maNhaXuatBan);
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhaXuatBan.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public static int deleteOneById(String maNhaXuatBan) {
        String sql = "DELETE FROM NhaXuatBan WHERE MaNXB=?";
        try (Connection conn = jdbcHelper.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, maNhaXuatBan);
            return pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(NhaXuatBan.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
