/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class ChuongTrinhGiamGiaDAO {
    TungSqlConnect conn = new TungSqlConnect("localhost", "root", "", "bookstore");
    
    public ChuongTrinhGiamGiaDAO(){
        try{
            conn.testDriver();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Lỗi kết nối database");
        }
    }
    
    public ArrayList<ChuongTrinhGiamGiaDTO> docDSCT(){
        ArrayList<ChuongTrinhGiamGiaDTO> dsCT = new ArrayList<>();
        try{
            String sql = "select * from chuongtrinhgiamgia";
            ResultSet rs = conn.executeQuery(sql);
            while(rs.next()){
                ChuongTrinhGiamGiaDTO cTrinh = new ChuongTrinhGiamGiaDTO(
                        rs.getString(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getString(4), 
                        rs.getString(5));
                dsCT.add(cTrinh);
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Không thể đọc dữ liệu từ database");
        }
        return dsCT;
    }
    
    public void them(ChuongTrinhGiamGiaDTO cTrinh){
        String sql = String.format("insert into chuongtrinhgiamgia values('%s', '%s', '%s', '%s', '%s')",
                cTrinh.getId(), cTrinh.getTenChuongTrinh(), cTrinh.getLoai(), cTrinh.sqlNgayBD(), cTrinh.sqlNgayKT());
        try{
            conn.executeUpdate(sql);
        }catch (Exception ex){
            System.out.println("DAO.ChuongTrinhGiamGiaDAO.them()");
        }
    }
    
    public void sua(ChuongTrinhGiamGiaDTO cTrinh){
        String sql = String.format("update chuongtrinhgiamgia set TenChuongTrinh = '%s', LoaiChuongTrinh = '%s', NgayBD = '%s', NgayKT = '%s' where MaGG = '%s'",
                cTrinh.getTenChuongTrinh(), cTrinh.getLoai(), cTrinh.sqlNgayBD(), cTrinh.sqlNgayKT(), cTrinh.getId());
        try{
            conn.executeUpdate(sql);
        }catch (Exception ex){
            System.out.println("DAO.ChuongTrinhGiamGiaDAO.them()");
        }
    }
    
    public void xoa(ChuongTrinhGiamGiaDTO cTrinh){
        String query1 = String.format("delete from chuongtrinhgiamgia where MaGG = '%s'", cTrinh.getId());
        String query2 = String.format("delete from chitietchuongtrinhgiamgia where MaGG = '%s'", cTrinh.getId());
        try {
             conn.executeUpdate(query2);
            conn.executeUpdate(query1);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể xóa dữ liệu");
        }
    }
}
