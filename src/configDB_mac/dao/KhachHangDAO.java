/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.jdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import model.KhachHang;

/**
 *
 * @author ADMIN
 */
public class KhachHangDAO {
    final String INSERT_SQL = "INSERT INTO KhachHang(MaKH, HoTen, Email, DiaChi, DienThoai, GioiTinh, NgaySinh) values (?, ?, ?, ?, ?, ? ,?)";
    final String UPDATE_SQL = "UPDATE KhachHang SET HoTen = ?, Email = ?, DiaChi = ?, DienThoai = ?, GioiTinh = ?, NgaySinh = ? WHERE MaKH = ?";
    final String DELETE_SQL = "DELETE FROM KhachHang WHERE MaKH = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM KhachHang";
    final String SELECT_BY_ID_SQL = "SELECT * FROM KhachHang WHERE MaKH = ?";
    
    public void insert(KhachHang model){
        jdbcHelper.update(INSERT_SQL, model.getMaKH(),model.getHoTen(),model.getEmail(),model.getDiaChi(),model.getDienThoai(),model.getGioiTinh(),model.getNgaySinh());
    }
    
    public void update(KhachHang model){
        jdbcHelper.update(UPDATE_SQL, model.getHoTen(),model.getEmail(),model.getDiaChi(),model.getDienThoai(),model.getGioiTinh(),model.getNgaySinh(),model.getMaKH());
    }
    
    public void delete(String id){
        jdbcHelper.update(DELETE_SQL, id);
    }
    
    public List<KhachHang> selectAll(){
        return selectBySql(SELECT_ALL_SQL);
    }
    
    public KhachHang selectById(String id){
        List<KhachHang> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<KhachHang> selectBySql (String sql, Object... args){
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {                
                KhachHang model = new KhachHang();
                model.setMaKH(rs.getString("MaKH"));
                model.setHoTen(rs.getString("HoTen"));
                model.setEmail(rs.getString("Email"));
                model.setDiaChi(rs.getString("DiaChi"));
                model.setDienThoai(rs.getString("DienThoai"));
                model.setGioiTinh(rs.getString("GioiTinh"));
                model.setNgaySinh(rs.getString("NgaySinh"));
                list.add(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }
}
