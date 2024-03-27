package dao;

import entity.Coupon;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import dao.jdbcHelper;

public class CouponDao extends EduSysDAO<Coupon, String> {

    final String INSERT_SQL = "INSERT INTO Coupon (MaCoupon, TenCoupon, NgayBatDau, NgayKetThuc,Quatang, DieuKien) values (?, ?, ?, ?, ?, ?)";
    final String UPDATE_SQL = "UPDATE Coupon SET MaCoupon = ?, TenCoupon = ?, NgayBatDau = ?, NgayKetThuc = ?, Quatang = ?, DieuKien = ? WHERE MaCoupon = ?";
    final String DELETE_SQL = "DELETE FROM Coupon WHERE MaCoupon= ?";
    final String SELECT_ALL_SQL = "SELECT * FROM Coupon";
    final String SELECT_BY_ID_SQL = "SELECT * FROM Coupon WHERE MaCoupon = ?";

     @Override
    public void insert(Coupon entity) {
        jdbcHelper.update(INSERT_SQL, entity.getMaCoupon(), entity.getTenCoupon(), entity.getNgayBatDau(), entity.getNgayKetThuc(), entity.getQuaTang(), entity.getDieuKien());
    }

    @Override
    public void update(Coupon entity) {
        jdbcHelper.update(UPDATE_SQL,entity.getMaCoupon(), entity.getTenCoupon(), entity.getNgayBatDau(), entity.getNgayKetThuc(), entity.getQuaTang(), entity.getDieuKien());
    }

    @Override
    public void delete(String id) {
        jdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<Coupon> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public Coupon selectById(String id) {
        List<Coupon> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<Coupon> selectBySql(String sql, Object... args) {
        List<Coupon> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                Coupon entity = new Coupon();
                entity.setMaCoupon(rs.getString("MaCoupon"));
                entity.setTenCoupon(rs.getString("TenCoupon"));
                entity.setNgayBatDau(rs.getDate("NgayBatDau"));
                entity.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                entity.setQuaTang(rs.getString("Quatang"));
                entity.setDieuKien(rs.getString("DieuKien"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
