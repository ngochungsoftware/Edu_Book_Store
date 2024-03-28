/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.jdbcHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import model.NhanVien;

/**
 *
 * @author ADMIN
 */
public class NhanVienDAO {

    final String INSERT_SQL = "INSERT INTO NhanVien(MaNV, HoTen, Email, DiaChi, DienThoai, GioiTinh, NgaySinh, Vaitro, Luong) values (?, ?, ?, ?, ?, ? ,?, ?, ?)";
    final String UPDATE_SQL = "UPDATE NhanVien SET HoTen = ?, Email = ?, DiaChi = ?, DienThoai = ?, GioiTinh = ?, NgaySinh = ?, VaiTro = ? Luong = ? WHERE MaNV = ?";
    final String DELETE_SQL = "DELETE FROM NhanVien WHERE MaNV = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    final String SELECT_BY_ID_SQL = "SELECT * FROM NhanVien WHERE MaNV = ?";

    public void insert(NhanVien model) {
        jdbcHelper.update(INSERT_SQL, model.getMaNV(),
                model.getHoTen(), model.getEmail(),
                model.getDiaChi(), model.getDienThoai(),
                model.getGioiTinh(), model.getNgaySinh(),
                model.getVaiTro(), model.getLuong());
    }

    public void update(NhanVien model) {
        jdbcHelper.update(UPDATE_SQL, model.getHoTen(),
                model.getEmail(),
                model.getDiaChi(), model.getDienThoai(),
                model.getGioiTinh(), model.getNgaySinh(),
                model.getVaiTro(), model.getLuong());
    }

    public void delete(String id) {
        jdbcHelper.update(DELETE_SQL, id);
    }

    public List<NhanVien> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    public NhanVien selectById(String id) {
        List<NhanVien> list = selectBySql(SELECT_BY_ID_SQL, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                NhanVien model = new NhanVien();
                model.setMaNV(rs.getString("MaNV"));
                model.setHoTen(rs.getString("HoTen"));
                model.setEmail(rs.getString("Email"));
                model.setDiaChi(rs.getString("DiaChi"));
                model.setDienThoai(rs.getString("DienThoai"));
                model.setGioiTinh(rs.getString("GioiTinh"));
                model.setNgaySinh(rs.getString("NgaySinh"));
                model.setVaiTro(rs.getString("VaiTro"));
                model.setLuong(rs.getString("Luong"));
                list.add(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }
}
