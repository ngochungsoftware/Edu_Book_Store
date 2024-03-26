package supplier;

import com.sun.source.util.JavacTask;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import dao.KhachHang;

public class KhachHangDao {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    private List<KhachHang> listKH;

    public List<KhachHang> getAll() {
        try {
            listKH = new ArrayList<>();
            con = DBConnect1.getConnection();
            ps = con.prepareStatement("select maKH,hoTen,email,diaChi,dienThoai,gioiTinh,ngaySinh from KhachHang");
            rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                listKH.add(kh);

            }
            return listKH;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public int addKH(KhachHang kh) {
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement("insert into KhachHang(maKH,hoTen,email,diaChi,dienThoai,gioiTinh,ngaySinh) values (?,?,?,?,?,?,?) ");
            ps.setObject(1, kh.getMaKH());
            ps.setObject(2, kh.getHoTen());
            ps.setObject(3, kh.getEmail());
            ps.setObject(4, kh.getDiaChi());
            ps.setObject(5, kh.getDienThoai());
            ps.setObject(6, kh.getGioiTinh());
            ps.setObject(7, kh.getNgaySinh());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int updatekh(KhachHang kh, String maKH) {
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement("update KhachHang set hoTen = ?, email = ?, diaChi = ?, dienThoai = ? ,gioiTinh = ?,ngaySinh = ? where maKH like ?");
            ps.setObject(1, kh.getHoTen());
            ps.setObject(2, kh.getEmail());
            ps.setObject(3, kh.getDiaChi());
            ps.setObject(4, kh.getDienThoai());
            ps.setObject(5, kh.getGioiTinh());
            ps.setObject(6, kh.getNgaySinh());
            ps.setObject(7, kh.getMaKH());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int deleteKH(String maKH) {
        try {
            con = DBConnect1.getConnection();
            ps = con.prepareStatement("delete from KhachHang where maKH = ?");
            ps.setObject(1, maKH);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

}
