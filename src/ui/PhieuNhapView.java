/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.text.DateFormat;
import java.util.Date;


/**
 *
 * @author macbook
 */
public class PhieuNhapView extends javax.swing.JFrame {

    /**
     * Creates new form PhieuNhapView
     */
    public PhieuNhapView() {
        initComponents();
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
        jpTimkiem1 = new javax.swing.JPanel();
        jxTungay = new org.jdesktop.swingx.JXDatePicker();
        jpTimkiem2 = new javax.swing.JPanel();
        jxDenngay = new org.jdesktop.swingx.JXDatePicker();
        btnRefresh = new javax.swing.JButton();
        btnXemchitiet = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePhieuNhap = new javax.swing.JTable();
        jpTimkiem6 = new javax.swing.JPanel();
        lbNgaynhap = new javax.swing.JLabel();
        jpTimkiem4 = new javax.swing.JPanel();
        lbTennhanvien = new javax.swing.JLabel();
        jpTimkiem3 = new javax.swing.JPanel();
        lbMapn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jcTimkiem.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jcTimkiem.setForeground(new java.awt.Color(0, 0, 0));
        jcTimkiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất Cả", "Mã Phiếu Nhập", "Mã Nhân Viên" }));
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
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTimkiemLayout.setVerticalGroup(
            jpTimkiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpTimkiem1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Từ Ngày", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem1.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem1.setToolTipText("");
        jpTimkiem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jxTungay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxTungayActionPerformed(evt);
            }
        });
        jxTungay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jxTungayKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jpTimkiem1Layout = new javax.swing.GroupLayout(jpTimkiem1);
        jpTimkiem1.setLayout(jpTimkiem1Layout);
        jpTimkiem1Layout.setHorizontalGroup(
            jpTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTimkiem1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jxTungay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpTimkiem1Layout.setVerticalGroup(
            jpTimkiem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jxTungay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpTimkiem2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Đến Ngày", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem2.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem2.setToolTipText("");
        jpTimkiem2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jxDenngay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jxDenngayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpTimkiem2Layout = new javax.swing.GroupLayout(jpTimkiem2);
        jpTimkiem2.setLayout(jpTimkiem2Layout);
        jpTimkiem2Layout.setHorizontalGroup(
            jpTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTimkiem2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jxDenngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpTimkiem2Layout.setVerticalGroup(
            jpTimkiem2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jxDenngay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRefresh.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/recurring_appointment_32px.png"))); // NOI18N
        btnRefresh.setText("Làm Mới");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnXemchitiet.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnXemchitiet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/kho.png"))); // NOI18N
        btnXemchitiet.setText("Xem Chi Tiết");
        btnXemchitiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemchitietActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jcTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jpTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jpTimkiem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jpTimkiem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXemchitiet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpTimkiem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTimkiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTimkiem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnXemchitiet, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jcTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        TablePhieuNhap.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        TablePhieuNhap.setForeground(new java.awt.Color(0, 0, 0));
        TablePhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablePhieuNhap.setFocusable(false);
        TablePhieuNhap.setGridColor(new java.awt.Color(255, 255, 255));
        TablePhieuNhap.setRowHeight(40);
        TablePhieuNhap.setSelectionBackground(new java.awt.Color(51, 51, 51));
        TablePhieuNhap.setSelectionForeground(new java.awt.Color(204, 204, 204));
        TablePhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablePhieuNhapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablePhieuNhap);

        jpTimkiem6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ngày Nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem6.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem6.setToolTipText("");
        jpTimkiem6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbNgaynhap.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbNgaynhap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpTimkiem6Layout = new javax.swing.GroupLayout(jpTimkiem6);
        jpTimkiem6.setLayout(jpTimkiem6Layout);
        jpTimkiem6Layout.setHorizontalGroup(
            jpTimkiem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNgaynhap, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTimkiem6Layout.setVerticalGroup(
            jpTimkiem6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem6Layout.createSequentialGroup()
                .addComponent(lbNgaynhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpTimkiem4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tên Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem4.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem4.setToolTipText("");
        jpTimkiem4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbTennhanvien.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbTennhanvien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpTimkiem4Layout = new javax.swing.GroupLayout(jpTimkiem4);
        jpTimkiem4.setLayout(jpTimkiem4Layout);
        jpTimkiem4Layout.setHorizontalGroup(
            jpTimkiem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTennhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTimkiem4Layout.setVerticalGroup(
            jpTimkiem4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem4Layout.createSequentialGroup()
                .addComponent(lbTennhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpTimkiem3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mã Phiếu Nhập", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jpTimkiem3.setForeground(new java.awt.Color(0, 0, 0));
        jpTimkiem3.setToolTipText("");
        jpTimkiem3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        lbMapn.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbMapn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpTimkiem3Layout = new javax.swing.GroupLayout(jpTimkiem3);
        jpTimkiem3.setLayout(jpTimkiem3Layout);
        jpTimkiem3Layout.setHorizontalGroup(
            jpTimkiem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMapn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpTimkiem3Layout.setVerticalGroup(
            jpTimkiem3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTimkiem3Layout.createSequentialGroup()
                .addComponent(lbMapn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpTimkiem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jpTimkiem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jpTimkiem6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(383, 383, 383))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1139, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 538, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpTimkiem4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTimkiem6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpTimkiem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(206, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTimkiemActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jcTimkiemActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

     
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jxTungayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxTungayActionPerformed
        // TODO add your handling code here:
//        Date tn = jxTungay.getDate();
//
//        DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        if(tn !=null){
//            tungay = oDateFormat.format(tn);
//        }
//        try {
//            setDataToTable(db.searchTable(tencot,query,tungay,denngay),table);
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
//        sort();

    }//GEN-LAST:event_jxTungayActionPerformed

    private void jxTungayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jxTungayKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jxTungayKeyReleased

    private void jxDenngayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jxDenngayActionPerformed
        // TODO add your handling code here:
//        Date dn = jxDenngay.getDate();
//        DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        if(dn !=null){
//            denngay = oDateFormat.format(dn);
//        }
//        try {
//            setDataToTable(db.searchTable(tencot,query,tungay,denngay),table);
//        } catch (SQLException ex) {
//            System.out.println(ex);
//        }
//        sort();
    }//GEN-LAST:event_jxDenngayActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnXemchitietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemchitietActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnXemchitietActionPerformed

    private void TablePhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablePhieuNhapMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_TablePhieuNhapMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhieuNhapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhieuNhapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhieuNhapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhieuNhapView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhieuNhapView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablePhieuNhap;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnXemchitiet;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcTimkiem;
    private javax.swing.JPanel jpTimkiem;
    private javax.swing.JPanel jpTimkiem1;
    private javax.swing.JPanel jpTimkiem2;
    private javax.swing.JPanel jpTimkiem3;
    private javax.swing.JPanel jpTimkiem4;
    private javax.swing.JPanel jpTimkiem6;
    private org.jdesktop.swingx.JXDatePicker jxDenngay;
    private org.jdesktop.swingx.JXDatePicker jxTungay;
    private javax.swing.JLabel lbMapn;
    private javax.swing.JLabel lbNgaynhap;
    private javax.swing.JLabel lbTennhanvien;
    // End of variables declaration//GEN-END:variables
}