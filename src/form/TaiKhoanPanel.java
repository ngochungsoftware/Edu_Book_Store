/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlch.View;

import java.awt.Font;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import qlch.Model.Sach.Sach;
import qlch.Model.Sach.SachDB;
import qlch.Model.TaiKhoan.DoiMatKhau;
import qlch.Model.TaiKhoan.SuaTaiKhoan;
import qlch.Model.TaiKhoan.TaiKhoan;
import qlch.Model.TaiKhoan.TaiKhoanDB;
import qlch.Model.TaiKhoan.ThemTaiKhoan;

/**
 *
 * @author HiHi
 */
public class TaiKhoanPanel extends javax.swing.JPanel {
    
    /**
     * Creates new form TaiKhoanPanel
     */
    int row  = -1;
    DefaultTableModel table;
    ResultSet result = null;
    public TaiKhoanPanel() throws SQLException {
        initComponents();
        CreateColumsTable();
        TableTaiKhoan.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        Populate();
        sort();
    }
    // Tạo tên cho cột
    private void CreateColumsTable(){
        table = (DefaultTableModel) TableTaiKhoan.getModel();
        table.addColumn("Mã Nhân Viên");
        table.addColumn("Tên Nhân Viên");
        table.addColumn("Giới Tính");
        table.addColumn("Ngày Sinh");
        table.addColumn("Địa Chỉ");
        table.addColumn("Số Điện Thoại");
        table.addColumn("Tài Khoản");
    }
    //Đổ Data cho bảng 
    private void Populate() throws SQLException{   
        TaiKhoanDB db =new TaiKhoanDB();
          setDataToTable(db.getAllTaiKhoan(),table);
    }
    //Đổ data từ arraylist vào row data
    private void setDataToTable(ArrayList<TaiKhoan> data,DefaultTableModel table){
        table.setRowCount(0);
        for(TaiKhoan s :data){
            table.addRow(new String[]{
             s.getManv(),s.getTennv(),s.getGioitinh(),s.getNgaysinh(),s.getDiachi(),s.getSdt(),s.getTaikhoan()
            });
        }
    }
    //Sắp xếp theo cột
    private  void sort(){
        TableRowSorter<DefaultTableModel> sorter    = new TableRowSorter<DefaultTableModel>(table);
        TableTaiKhoan.setRowSorter(sorter);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jcTimkiem = new javax.swing.JComboBox<>();
        jpTimkiem = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jbXoa = new javax.swing.JButton();
        jbThem = new javax.swing.JButton();
        jbSua = new javax.swing.JButton();
        jbDoimatkhau = new javax.swing.JButton();
        ScrollTaiKhoan = new javax.swing.JScrollPane();
        TableTaiKhoan = new javax.swing.JTable();

        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1075, 690));

        jPanel1.setPreferredSize(new java.awt.Dimension(1075, 101));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jcTimkiem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jcTimkiem.setForeground(new java.awt.Color(0, 0, 0));
        jcTimkiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Mã Nhân Viên", "Tên Nhân Viên", "Địa Chỉ", "Số Điện Thoại", "Tài Khoản" }));
        jcTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTimkiemActionPerformed(evt);
            }
        });

        jpTimkiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tất Cả", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem.setToolTipText("");
        jpTimkiem.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setAutoscrolls(false);
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpTimkiemLayout = new javax.swing.GroupLayout(jpTimkiem);
        jpTimkiem.setLayout(jpTimkiemLayout);
        jpTimkiemLayout.setHorizontalGroup(
            jpTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTimkiemLayout.setVerticalGroup(
            jpTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jcTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jcTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jpTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(501, 501, 501))
        );

        jbXoa.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jbXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/delete_forever_30px.png"))); // NOI18N
        jbXoa.setText("Xóa");
        jbXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbXoaActionPerformed(evt);
            }
        });

        jbThem.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jbThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/add_30px.png"))); // NOI18N
        jbThem.setText("Thêm");
        jbThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbThemActionPerformed(evt);
            }
        });

        jbSua.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jbSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/maintenance_30px.png"))); // NOI18N
        jbSua.setText("Sửa");
        jbSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSuaActionPerformed(evt);
            }
        });

        jbDoimatkhau.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jbDoimatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/password1_30px.png"))); // NOI18N
        jbDoimatkhau.setText("Đổi Mật Khẩu");
        jbDoimatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDoimatkhauActionPerformed(evt);
            }
        });

        TableTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));
        TableTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TableTaiKhoan.setForeground(new java.awt.Color(0, 0, 0));
        TableTaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TableTaiKhoan.setGridColor(new java.awt.Color(255, 255, 255));
        TableTaiKhoan.setRowHeight(40);
        TableTaiKhoan.setSelectionBackground(new java.awt.Color(51, 51, 51));
        TableTaiKhoan.setSelectionForeground(new java.awt.Color(204, 204, 204));
        TableTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableTaiKhoanMouseClicked(evt);
            }
        });
        ScrollTaiKhoan.setViewportView(TableTaiKhoan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jbXoa)
                .addGap(18, 18, 18)
                .addComponent(jbThem)
                .addGap(18, 18, 18)
                .addComponent(jbSua)
                .addGap(18, 18, 18)
                .addComponent(jbDoimatkhau)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(ScrollTaiKhoan)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbDoimatkhau, jbSua, jbThem, jbXoa});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDoimatkhau)
                    .addComponent(jbSua)
                    .addComponent(jbThem)
                    .addComponent(jbXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ScrollTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbDoimatkhau, jbSua, jbThem, jbXoa});

    }// </editor-fold>//GEN-END:initComponents

    private void jcTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTimkiemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jcTimkiemActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
    }//GEN-LAST:event_jTextField1KeyReleased
    
        
    
    private void jbXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbXoaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbXoaActionPerformed

    private void jbThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbThemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbThemActionPerformed

    private void jbSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSuaActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jbSuaActionPerformed

    private void jbDoimatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDoimatkhauActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbDoimatkhauActionPerformed

    private void TableTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableTaiKhoanMouseClicked
        // TODO add your handling code here:
      
     
    }//GEN-LAST:event_TableTaiKhoanMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollTaiKhoan;
    private javax.swing.JTable TableTaiKhoan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbDoimatkhau;
    private javax.swing.JButton jbSua;
    private javax.swing.JButton jbThem;
    private javax.swing.JButton jbXoa;
    private javax.swing.JComboBox<String> jcTimkiem;
    private javax.swing.JPanel jpTimkiem;
    // End of variables declaration//GEN-END:variables
}
