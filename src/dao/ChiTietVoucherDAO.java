/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.ChiTietVoucher;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.jdbcHelper;

/**
 *
 * @author pc
 */
public class ChiTietVoucherDAO extends EduSysDAO<ChiTietVoucher, String> {

    final String INSERT_SQL = "INSERT INTO ChiTietVoucher (MaVoucher, GiamGia, MaSach) VALUES (?, ?, ?)";
    final String DELETE_SQL = "DELETE FROM ChiTietVoucher WHERE MaVoucher = ?";
    final String SELECT_ALL_SQL = "select MaVoucher, GiamGia, MaSach from ChiTietVoucher";
    final String SELECT_BY_ID_SQL = "select MaVoucher, GiamGia, MaSach from ChiTietVoucher where MaVoucher = ?";
    final String UPDATE_SQL = "update ChiTietVoucher set GiamGia = ?, MaSach = ?  where MaVoucher =?";

    @Override
    public void insert(ChiTietVoucher entity) {
        jdbcHelper.update(INSERT_SQL, entity.getMaVoucher(), entity.getGiamGia(), entity.getMaSach());
    }

    @Override
    public void delete(String id) {
        jdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public void update(ChiTietVoucher entity) {
        jdbcHelper.update(UPDATE_SQL, entity.getGiamGia(), entity.getMaSach(), entity.getMaVoucher());
    }

    @Override
    public List<ChiTietVoucher> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChiTietVoucher selectById(String id) {
        List<ChiTietVoucher> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<ChiTietVoucher> selectBySql(String sql, Object... args) {
        List<ChiTietVoucher> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                ChiTietVoucher entity = new ChiTietVoucher();
                entity.setMaVoucher(rs.getString("MaVoucher"));
                entity.setGiamGia(rs.getFloat("GiamGia"));
                entity.setMaSach(rs.getString("MaSach"));
                list.add(entity);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

}
