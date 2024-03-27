/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entity.NhanVien;
import configDB_mac.jdbcHelper;
import java.security.Timestamp;
/**
 *
 * @author ADMIN
 */
public class NhanVienDAO {
    @SuppressWarnings("unlikely-arg-type")
    public static ArrayList<NhanVien> loadNV() throws ClassNotFoundException, SQLException{
                ArrayList<NhanVien> listNV  = new ArrayList<NhanVien>();
                Connection connection = jdbcHelper.getConnection();
                Statement statement = connection.createStatement();
                ResultSet tbNhanVien = statement.executeQuery("SELECT * FROM NhanVien");
                while(tbNhanVien.next()){
                    listNV.remove(listNV);
                    Integer MaNV = tbNhanVien.getInt(1);
                    String HoTen = tbNhanVien.getString(2);
                    String TaiKhoan = tbNhanVien.getString(3);
                    String MatKhau = tbNhanVien.getString(4);
                    String Email = tbNhanVien.getString(5);
                    String DiaChi = tbNhanVien.getString(6);
                    String DienThoai = tbNhanVien.getString(7);
                    java.sql.Timestamp NgaySinh = tbNhanVien.getTimestamp(8);
                    String Vaitro = tbNhanVien.getString(9);

                }
                connection.close();
        return listNV;
                
    }
}
