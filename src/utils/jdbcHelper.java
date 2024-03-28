/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dino
 */
public class jdbcHelper {
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=Edu_Book_Store;encrypt=true;trustServerCertificate=true";
    private static String user ="sa";
    private static String pass ="admin";
    
    
    //nạp driver
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
           throw new RuntimeException(ex);
        }
    }
    
    //xây dựng PreparedStatement
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException{
        Connection connection = DriverManager.getConnection(dburl, user, pass);
        PreparedStatement pstmt = null;
        if(sql.trim().startsWith("{")){
            pstmt = connection.prepareCall(sql);
        }else{
            pstmt = connection.prepareStatement(sql);
        }
        for (int i =0; i< args.length; i++){
            pstmt.setObject(i+1, args[i]);
        }
        return pstmt;
    }
    
    /* phương thức update 
    thực hiệncác thao tác update insert or delte hoặc cácthủ tục lưu trữ SP.
    */
    public static int update(String sql,  Object... args){
        try {
            PreparedStatement stmt = getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally{
                stmt.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    /* thuẹc hiện câu lệnh SQL, truy vấn (Select) hoặc thủ tục lưu trữ  truy vấn dữ liệu
    */
  
    public static ResultSet query(String sql, Object...args){
        try {
            PreparedStatement stmt = getStmt(sql, args);
            return stmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    /* Object */
    //trả về đối tượng bất kì (chung chung)
    public static Object value(String sql, Object... args){
        try {
            ResultSet rs = query(sql, args);
            if(rs.next()){
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Bước 1: Đăng ký trình điều khiển
            Class.forName(driver);

            // Bước 2: Thiết lập kết nối
            connection = DriverManager.getConnection(dburl, user, pass);

            // Bước 3: Kiểm tra trạng thái kết nối
            if (connection != null && !connection.isClosed()) {
                System.out.println("Kết nối thành công đến cơ sở dữ liệu.");
                // Thực hiện các thao tác khác trên cơ sở dữ liệu ở đây
            } else {
                System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi: Không tìm thấy trình điều khiển.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Lỗi: Không thể kết nối đến cơ sở dữ liệu.");
            e.printStackTrace();
        } finally {
            // Bước 4: Đóng kết nối
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Lỗi: Không thể đóng kết nối.");
                    e.printStackTrace();
                }
            }
        }
    }
    
}
