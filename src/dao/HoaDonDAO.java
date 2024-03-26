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
import model.HoaDon;

/**
 *
 * @author pc
 */
public class HoaDonDAO {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    private List<HoaDon> listHD;

    public List<HoaDon> getAll() {
        listHD = new ArrayList<>();
        try {

            con = DBConnect1111.getConnection();
            sql = "select MaHoaDon, MaNV, MaVoucher, MaKH, NgayLapHoaDon, TongTien, GiamGia, ThanhTien from HoaDon";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String MaHD = rs.getString("MaHoaDon");
                String MaNV = rs.getString("MaNV");
                String MaVoucher = rs.getString("MaVoucher");
                String MaKH = rs.getString("MaKH");
                String NgayLap = rs.getDate("NgayLapHD").toString();
                float TongTien = Float.parseFloat(rs.getString("TongTien"));
                float GiamGia = Float.parseFloat(rs.getString("GiamGia"));
                float ThanhTien = Float.parseFloat(rs.getString("ThanhTien"));
                HoaDon hd = new HoaDon(MaHD, MaNV, MaVoucher, MaKH, NgayLap, TongTien, GiamGia, ThanhTien);
                listHD.add(hd);
            }

        } catch (Exception ex) {
            System.out.print("Không thể truy vấn dữ liệu từ cơ sở dữ liệu SQL Server");
            ex.printStackTrace();

        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                System.out.print("Lỗi khi đóng kết nối cơ sở dữ liệu");
                ex.printStackTrace();
            }
        }
        return listHD;
    }

    public void Sua(HoaDon hd) {
        try {
            con = DBConnect1111.getConnection();
            String MaVoucher = hd.getMaVoucher().equals("") ? null : "'" + hd.getMaVoucher() + "'";

            sql = "UPDATE hoadon SET "
                    + "MaHoaDon = ?, "
                    + "MaNV = ?, "
                    + "MaVoucher = " + MaVoucher + ", "
                    + "MaKH = ?, "
                    + "NgayLapHoaDon = ?, "
                    + "TongTien = ?, "
                    + "GiamGia = ?, "
                    + "ThanhTien = ? "
                    + "WHERE MaHoaDon = ?";

            ps = con.prepareStatement(sql);
            ps.setString(1, hd.getMaHD());
            ps.setString(2, hd.getMaNV());         
            ps.setString(3, hd.getMaKH());
            ps.setString(4, hd.getNgayLap().toString());            
            ps.setFloat(5, hd.getTongTien());
            ps.setFloat(6, hd.getGiamGia());
            ps.setFloat(7, hd.getThanhTien());
            ps.setString(8, hd.getMaHD());
//            ps.setString(1, hd.getMaHD());
//            ps.setString(2, hd.getMaNV());
//            ps.setString(3, hd.getMaVoucher());
//            ps.setString(4, hd.getMaKH());
//            ps.setString(5, hd.getNgayLap().toString());
//            ps.setFloat(6, hd.getTongTien());
//            ps.setFloat(7, hd.getGiamGia());
//            ps.setFloat(8, hd.getThanhTien());
//            ps.setString(9, hd.getMaHD());
        } catch (Exception ex) {
            System.out.print("Không thể cập nhật dữ liệu vào cơ sở dữ liệu SQL Server");
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                System.out.print("Lỗi khi đóng kết nối cơ sở dữ liệu");
                ex.printStackTrace();
            }
        }
    }

    public void Xoa(String MaHD) {
        try {
            con = DBConnect1111.getConnection();
            sql = "DELETE FROM hoadon WHERE MaHoaDon = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, MaHD);
            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.print("Không thể xóa dữ liệu từ cơ sở dữ liệu SQL Server");
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                System.out.print("Lỗi khi đóng kết nối cơ sở dữ liệu");
                ex.printStackTrace();
            }
        }
        System.out.println(sql);
    }

    public void Them(HoaDon hd) {
        try {
            con = DBConnect1111.getConnection();
            String MaVoucher = hd.getMaVoucher().equals("") ? null : "'" + hd.getMaVoucher() + "'";
            sql = "INSERT INTO hoadon (MaHoaDon, MaNV, MaVoucher, MaKH, NgayLapHoaDon, TongTien, GiamGia, ThanhTien) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, hd.getMaHD());
            ps.setString(2, hd.getMaNV());
            ps.setString(3, MaVoucher);
            ps.setString(4, hd.getMaKH());
            ps.setString(5, hd.getNgayLap().toString());
            ps.setFloat(6, hd.getTongTien());
            ps.setFloat(7, hd.getGiamGia());
            ps.setFloat(8, hd.getThanhTien());

            ps.executeUpdate();
        } catch (Exception ex) {
            System.out.print("Không thể thêm dữ liệu vào cơ sở dữ liệu SQL Server");
            ex.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception ex) {
                System.out.print("Lỗi khi đóng kết nối cơ sở dữ liệu");
                ex.printStackTrace();
            }
        }
        System.out.println(sql);
    }

}
