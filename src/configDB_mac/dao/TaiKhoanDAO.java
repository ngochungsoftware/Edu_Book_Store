/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.jdbcHelper;
import java.util.List;
import model.TaiKhoan;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class TaiKhoanDAO {

    final String INSERT_SQL = "INSERT INTO TaiKhoan(MaTK, MaNV, TenTaiKhoan, MatKhau, Quyen, TrangThai) values (?, ?, ? ,?, ?, ?)";
    final String UPDATE_SQL = "UPDATE TaiKhoan SET MatKhau = ?, Quyen = ?, TrangThai = ? WHERE TenTaiKhoan = ?";
    final String DELETE_SQL = "DELETE FROM TaiKhoan WHERE TenTaiKhoan = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM TaiKhoan";
    final String SELECT_BY_ID_SQL = "SELECT * FROM TaiKhoan WHERE TenTaiKhoan = ?";

    public void insert(TaiKhoan model) {
        jdbcHelper.update(INSERT_SQL,
                model.getMaTK(),
                model.getMaNV(), model.getTenTaiKhoan(),
                model.getMatKhau(),
                model.getQuyen(),
                model.getTrangThai()
        );
    }

    public void update(TaiKhoan model) {
        jdbcHelper.update(INSERT_SQL,
                model.getMatKhau(),
                model.getQuyen(),
                model.getTrangThai()
        );
    }
    
    public void delele(String id){
        jdbcHelper.update(DELETE_SQL, id);
    }
    
    public List<TaiKhoan> selectAll(){
        return selectBySql(SELECT_ALL_SQL);
    }
    
    public TaiKhoan selectById(String id){
        List<TaiKhoan> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public List<TaiKhoan> selectBySql(String sql, Object... args){
        List<TaiKhoan> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {                
                TaiKhoan model = new TaiKhoan();
                model.setTenTaiKhoan(rs.getString("TenTaiKhoan"));
                model.setMaNV(rs.getString("MaNV"));
                model.setMaTK(rs.getString("MaTK"));
                model.setMatKhau(rs.getString("MatKhau"));
                model.setQuyen(rs.getString("Quyen"));
                model.setTrangThai(rs.getString("TrangThai"));
                list.add(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }
}
