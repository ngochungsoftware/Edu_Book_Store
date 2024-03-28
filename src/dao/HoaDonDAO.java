/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;


import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import entity.HoaDon;
import utils.jdbcHelper;

/**
 *
 * @author pc
 */
public class HoaDonDAO extends EduSysDAO<HoaDon, String>{

    final String INSERT_SQL = "INSERT INTO hoadon (MaHoaDon, MaNV, MaVoucher, MaKH, NgayLapHoaDon, TongTien, GiamGia, ThanhTien) VALUES (?, ?, ?, ?, ?, ?, ?, ?) ";
    final String UPDATE_SQL = "update HoaDon set MaNV = ?, MaVoucher =?, MaKH = ?, NgayLapHoaDon = ?, TongTien = ?, GiamGia = ?, ThanhTien = ? where MaHoaDon =?";
    final String DELETE_SQL = "DELETE FROM hoadon WHERE MaHoaDon = ?";
    final String SELECT_ALL_SQL = "select * from HoaDon";
    final String SELECT_BY_ID_SQL = "select * from HoaDon where MaHoaDon = ?";

    @Override
    public void insert(HoaDon entity) {
        jdbcHelper.update(INSERT_SQL, entity.getMaHD(),  entity.getMaNV(),entity.getMaVoucher(), entity.getMaKH(), entity.getNgayLap(), entity.getTongTien(), entity.getGiamGia(), entity.getThanhTien());
    }

    @Override
    public void update(HoaDon entity) {
        jdbcHelper.update(UPDATE_SQL, entity.getMaNV(), entity.getMaVoucher(), entity.getMaKH(), entity.getNgayLap(), entity.getTongTien(), entity.getGiamGia(), entity.getThanhTien(), entity.getMaHD());
    }

    @Override
    public void delete(String id) {
        jdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<HoaDon> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDon selectById(String id) {
        List<HoaDon> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                HoaDon entity = new HoaDon();
                entity.setMaHD(rs.getString("MaHD"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setMaVoucher(rs.getString("MaVoucher"));
                entity.setMaKH(rs.getString("MaKH"));
                entity.setNgayLap(rs.getString("NgayLap"));
                entity.setTongTien(rs.getFloat("TongTien"));
                entity.setGiamGia(rs.getFloat("GiamGia"));
                entity.setThanhTien(rs.getFloat("ThanhTien"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
