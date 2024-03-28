/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Voucher;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import configDB_mac.jdbcHelper;


/**
 *
 * @author pc
 */
public class VoucherDAO extends EduSysDAO<Voucher, String> {

    final String INSERT_SQL = "INSERT INTO Voucher (MaVoucher, TenVoucher, LoaiVoucher, NgayBatDau, NgayKetThuc) VALUES (?, ?, ?, ?, ?) ";
    final String UPDATE_SQL = "update Voucher set TenVoucher = ?, LoaiVoucher = ?, NgayBatDau =?, NgayKetThuc = ?  where MaVoucher =?";
    final String DELETE_SQL = "DELETE FROM Voucher WHERE MaVoucher = ?";
    final String SELECT_ALL_SQL = "select MaVoucher, TenVoucher, LoaiVoucher, NgayBatDau, NgayKetThuc from Voucher";
    final String SELECT_BY_ID_SQL = "select MaVoucher, TenVoucher, LoaiVoucher, NgayBatDau, NgayKetThuc from Voucher where MaVoucher = ?";
    final String DATE_SQL = "SELECT MaVoucher, TenVoucher, LoaiVoucher, NgayBatDau, NgayKetThuc FROM Voucher WHERE NgayBatDau >= ? AND NgayKetThuc <= ?";

    @Override
    public void insert(Voucher entity) {
        jdbcHelper.update(INSERT_SQL, entity.getMaVoucher(), entity.getTenChuongTrinh(), entity.getLoai(), entity.getNgayBD(), entity.getNgayKT());
    }

    @Override
    public void update(Voucher entity) {
        jdbcHelper.update(UPDATE_SQL, entity.getTenChuongTrinh(), entity.getLoai(), entity.getNgayBD(), entity.getNgayKT(), entity.getMaVoucher());
    }

    @Override
    public void delete(String id) {
        jdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<Voucher> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public Voucher selectById(String id) {
        List<Voucher> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Voucher> selectBySql(String sql, Object... args) {
        List<Voucher> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                Voucher entity = new Voucher();
                entity.setMaVoucher(rs.getString("MaVoucher"));
                entity.setTenChuongTrinh(rs.getString("TenVoucher"));
                entity.setLoai(rs.getString("LoaiVoucher"));
                entity.setNgayBD(rs.getDate("NgayBatDau"));
                entity.setNgayKT(rs.getDate("NgayKetThuc"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;

    }

    public List<Voucher> find(Date startDate, Date endDate) {
        List<Voucher> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(DATE_SQL, new java.sql.Date(startDate.getTime()), new java.sql.Date(endDate.getTime()));
            while (rs.next()) {
                Voucher entity = new Voucher();
                entity.setMaVoucher(rs.getString("MaVoucher"));
                entity.setTenChuongTrinh(rs.getString("TenVoucher"));
                entity.setLoai(rs.getString("LoaiVoucher"));
                entity.setNgayBD(rs.getDate("NgayBatDau"));
                entity.setNgayKT(rs.getDate("NgayKetThuc"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    public List<Voucher> selectByDateRange(Date startDate, Date endDate) {
    List<Voucher> vouchers = new ArrayList<>();
    try (Connection conn = JdbcUtils.getConnection();
         PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM Voucher WHERE NgayBD >= ? AND NgayKT <= ?")) {
        pstmt.setDate(1, new java.sql.Date(startDate.getTime()));
        pstmt.setDate(2, new java.sql.Date(endDate.getTime()));
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Voucher voucher = new Voucher();
            voucher.setMaVoucher(rs.getString("MaVoucher"));
            voucher.setTenChuongTrinh(rs.getString("TenChuongTrinh"));
            voucher.setLoai(rs.getString("Loai"));
            voucher.setNgayBD(rs.getDate("NgayBD"));
            voucher.setNgayKT(rs.getDate("NgayKT"));
            vouchers.add(voucher);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return vouchers;
}

    
    

}