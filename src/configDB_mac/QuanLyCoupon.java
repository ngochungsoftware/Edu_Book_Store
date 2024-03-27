package user;

import dao.CouponDao;
import entity.Coupon;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QuanLyCoupon extends javax.swing.JFrame {

    JFileChooser fileChoser = new JFileChooser();
    CouponDao dao = new CouponDao();
    int row = 0;

    public QuanLyCoupon() {
        initComponents();
        init();
    }

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblBang.getModel();
        model.setRowCount(0);
        try {
            List<Coupon> list = dao.selectAll();
            for (Coupon cp : list) {
                Object[] row = {
                    cp.getMaCoupon(),
                    cp.getTenCoupon(),
                    cp.getNgayBatDau(),
                    cp.getNgayKetThuc(),
                    cp.getQuaTang(),
                    cp.getDieuKien(),};
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    void init() {
//        setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        setTitle("Edusys - Quản Lý Chuyên Đề");
        fillTable();
//        updateStatus();
    }

    void setForm(Coupon model) {
        txtMa.setText(model.getMaCoupon());
        txtTen.setText(model.getTenCoupon());
        txtNgaybd.setText(model.getNgayBatDau().toString());
        txtNgaykt.setText(model.getNgayKetThuc().toString());
        txtQt.setText(model.getQuaTang());
        txtDK.setText(model.getDieuKien());
    }

    Coupon getForm() {
        Coupon vc = new Coupon();
        vc.setMaCoupon(txtMa.getText());
        vc.setTenCoupon(txtTen.getText());
        String dateFormat = "yyyy-MM-dd";
        DateFormat dateFormatter = new SimpleDateFormat(dateFormat);

        try {
            Date ngayBatDau = dateFormatter.parse(txtNgaybd.getText());
            Date ngayKetThuc = dateFormatter.parse(txtNgaykt.getText());
            vc.setNgayBatDau(ngayBatDau);
            vc.setNgayKetThuc(ngayKetThuc);
        } catch (ParseException e) {
            e.printStackTrace();
            // Hoặc thông báo lỗi nhập liệu
        }

        vc.setQuaTang(txtQt.getText());
        vc.setDieuKien(txtDK.getText());
        return vc;
    }

    void edit() {
        try {
            String MaCD = (String) tblBang.getValueAt(this.row, 0);
            Coupon model = dao.selectById(MaCD);
            if (model != null) {
                setForm(model);
                updateStatus();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void updateStatus() {
        boolean edit = this.row >= 0;
        boolean first = this.row == 0;
        boolean last = this.row == tblBang.getRowCount() - 1;
//    txt_maCD.setEditable(edit);

        // Tắt nút "Thêm" khi đã chọn một dòng trong bảng
        btnThem.setEnabled(!edit);

        // Cho phép sử dụng nút "Sửa" và "Xóa" khi đã chọn một dòng
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

        // Cho phép sử dụng nút "Mới" trong mọi trường hợp
        btnUpdate.setEnabled(true);

    }

    void clearForm() {
        this.setForm(new Coupon());
        this.updateStatus();
        row = -1;
//        updateStatus();
    }

    void insert() {
        Coupon model = getForm();
        try {
            dao.insert(model);
            this.fillTable();
            this.clearForm();
            JOptionPane.showMessageDialog(this, "thất bại");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "thành công");
        }
    }

    void update() {
        Coupon model = getForm();
        try {
            dao.update(model);
            this.fillTable();
            JOptionPane.showMessageDialog(this, " thất bại");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " thành công");
        }
    }

    void delete() {
        String macp = txtMa.getText();
        try {
            dao.delete(macp);
            this.fillTable();
            this.clearForm();
            JOptionPane.showMessageDialog(this, " thất bại");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " thành công");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtNgaybd = new javax.swing.JTextField();
        txtNgaykt = new javax.swing.JTextField();
        txtQt = new javax.swing.JTextField();
        txtDK = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Quản Lý Coupon");

        jLabel2.setText("Mã Coupon");

        jLabel3.setText("Tên Coupon");

        jLabel4.setText("Ngày Bắt Đầu");

        jLabel5.setText("Ngày Kết Thúc");

        jLabel6.setText("Quà Tặng");

        jLabel7.setText("Điều Kiện");

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Coupon", "Tên Coupon", "Ngày Bắt Đầu", "Ngày Kết Thúc", "Quà Tặng", "Điều Kiện"
            }
        ));
        jScrollPane1.setViewportView(tblBang);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtQt)
                            .addComponent(txtNgaykt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgaybd)
                            .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDK, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem)
                            .addComponent(btnXoa)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSua)
                    .addComponent(btnUpdate))
                .addGap(7, 7, 7))
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNgaybd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa)
                            .addComponent(btnUpdate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNgaykt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtQt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(btnThem)
                            .addComponent(btnSua))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        clearForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        String maCoupon = txtMa.getText();
        if (maCoupon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập mã Coupon.");
            return; // Không thực hiện xóa nếu mã chuyên đề chưa được nhập
        }

        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyCoupon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyCoupon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyCoupon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyCoupon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyCoupon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtDK;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNgaybd;
    private javax.swing.JTextField txtNgaykt;
    private javax.swing.JTextField txtQt;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
