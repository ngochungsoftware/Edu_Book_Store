/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.TaiKhoan;

/**
 *
 * @author pc
 */
public class DangNhapDAO {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;


    public DangNhapDAO() {
        try {
            con = DBConnect1111.getConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi kết nối database taikhoan");
        }
    }

    public List<TaiKhoan> docTK() {
        List<TaiKhoan> taikhoan = new ArrayList<>();
        try {
            con = DBConnect1111.getConnection();
            ps = con.prepareStatement("select TenTaiKhoan, MaNV, MaTK, MatKhau, Quyen, TrangThai from TaiKhoan");
            rs = ps.executeQuery();

            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan();
                tk.setTenTK(rs.getString("TenTaiKhoan"));
                tk.setMaNV(rs.getString("MaNV"));
                tk.setMaTK(rs.getString("MaTK"));
                tk.setMk(rs.getString("MatKhau"));
                tk.setQuyen(rs.getString("Quyen"));
                tk.setStatus(rs.getString("TrangThai"));
                taikhoan.add(tk);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể đọc dữ liệu từ database");
        }
        return taikhoan;
    }
}
