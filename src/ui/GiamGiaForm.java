/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import com.toedter.calendar.JDateChooser;
import dao.ChiTietVoucherDAO;
import dao.VoucherDAO;
import entity.ChiTietVoucher;
import entity.Voucher;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.Auth;
import utils.MsgBox;

/**
 *
 * @author pc
 */
public class GiamGiaForm extends javax.swing.JFrame {

    JDateChooser dateChooser = new JDateChooser();

    ChiTietVoucherDAO dao1 = new ChiTietVoucherDAO();
    VoucherDAO dao = new VoucherDAO();
    int row = 0;

    /**
     * Creates new form GiamGiaForm
     */
    public GiamGiaForm() {
        initComponents();
        init();
    }

    void init() {

        setLocationRelativeTo(null);
        setTitle("Edusys - Quản lý nhân viên quản trị");
        fillTableVoucher();
        fillTableChiTietVoucher();
    }

    void fillTableVoucher() {
        DefaultTableModel model = (DefaultTableModel) tblVoucher.getModel();
        model.setRowCount(0);
        try {
            List<Voucher> list = dao.selectAll(); //đọc dữ lịu từ sql         
            for (Voucher vc : list) {
                Object[] row = {
                    vc.getMaVoucher(),
                    vc.getTenChuongTrinh(),
                    vc.getLoai(),
                    vc.getNgayBD(),
                    vc.getNgayKT()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alter(this, "Lỗi truy vấn sql");
        }
    }

    void fillTableChiTietVoucher() {
        DefaultTableModel model = (DefaultTableModel) tblChiTietVoucher.getModel();
        model.setRowCount(0);
        try {
            List<ChiTietVoucher> listCT = dao1.selectAll(); //đọc dữ lịu từ sql         
            for (ChiTietVoucher ct : listCT) {
                Object[] row1 = {
                    ct.getMaVoucher(),
                    ct.getGiamGia(),
                    ct.getMaSach(),};
                model.addRow(row1);
            }
        } catch (Exception e) {
            MsgBox.alter(this, "Lỗi truy vấn sql");
        }
    }

    Voucher getFormVoucher() {
        Voucher model = new Voucher();
        model.setMaVoucher(txtMaGG.getText());
        model.setTenChuongTrinh(txtTen.getText());
        model.setLoai(txtLoai.getText());
        model.setNgayBD(dcrNgayBD.getDate());
        model.setNgayKT(dcrNgayKT.getDate());
        return model;
    }

    ChiTietVoucher getFormChiTietVoucher() {
        ChiTietVoucher model = new ChiTietVoucher();
        model.setMaVoucher(txtMaGG.getText());
        model.setGiamGia(Float.valueOf(txtGiam.getText()));
        model.setMaSach(txtSach.getText());
        return model;
    }

    void setFormVoucher(Voucher model) {
        txtMaGG.setText(model.getMaVoucher());
        txtTen.setText(model.getTenChuongTrinh());
        txtLoai.setText(model.getLoai());
        dcrNgayBD.setDate(model.getNgayBD()); // Sử dụng setDate thay vì setDateFormatString
        dcrNgayKT.setDate(model.getNgayKT()); // Sử dụng setDate thay vì setDateFormatString

    }

    void setFormChiTietVoucher(ChiTietVoucher model) {
        txtMaGG.setText(model.getMaVoucher());
        txtSach.setText(model.getMaSach());
        txtGiam.setText(String.valueOf(model.getGiamGia()));

    }

    void clearFormVoucher() {
        Voucher vc = new Voucher();
        this.setFormVoucher(vc);
        this.row = -1;

    }

    void clearFormChiTietVoucher() {
        ChiTietVoucher ct = new ChiTietVoucher();
        this.setFormChiTietVoucher(ct);
        this.row = -1;

    }

    void editVoucher() {
        try {
            String MaVoucher = (String) tblVoucher.getValueAt(this.row, 0);
            Voucher model = dao.selectById(MaVoucher);
            if (model != null) {
                setFormVoucher(model);

            }
        } catch (Exception e) {
            MsgBox.alter(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void editChiTietVoucher() {
        try {
            String MaVoucher = (String) tblChiTietVoucher.getValueAt(this.row, 0);
            ChiTietVoucher model = dao1.selectById(MaVoucher);
            if (model != null) {
                setFormChiTietVoucher(model);

            }
        } catch (Exception e) {
            MsgBox.alter(this, "Lỗi truy vấn dữ liệu");
        }
    }

    private boolean validateForm() {
        boolean valid = true;
        StringBuilder errorMessage = new StringBuilder();

        if (txtMaGG.getText().isEmpty()) {
            errorMessage.append("Vui lòng nhập mã giảm giá.\n");
            valid = false;
        }

        if (txtTen.getText().isEmpty()) {
            errorMessage.append("Vui lòng nhập tên chương trình.\n");
            valid = false;

        }

        if (txtLoai.getText().isEmpty()) {
            errorMessage.append("Vui lòng nhập loại chương trình.\n");
            valid = false;
        }

        if (dcrNgayBD.getDate() == null) {
            errorMessage.append("Vui lòng chọn ngày bắt đầu.\n");
            valid = false;
        }

        if (dcrNgayBD.getDate() == null) {
            errorMessage.append("Vui lòng chọn ngày kết thúc.\n");
            valid = false;
        }

        if (!valid) {
            JOptionPane.showMessageDialog(this, errorMessage.toString());
        }

        return valid;
    }

    private boolean validateFormChiTietVoucher() {
        boolean valid = true;
        StringBuilder errorMessage = new StringBuilder();

        if (txtSach.getText().isEmpty()) {
            errorMessage.append("Vui lòng nhập mã sách.\n");
            valid = false;
        }

        if (txtGiam.getText().isEmpty()) {
            errorMessage.append("Vui lòng nhập phần trăm giảm.\n");
            valid = false;
        }

        if (!valid) {
            JOptionPane.showMessageDialog(this, errorMessage.toString());
        }

        return valid;
    }

    void insert() {
        Voucher model = getFormVoucher();
        try {
            dao.insert(model);
            this.fillTableVoucher();
            this.clearFormVoucher();
            MsgBox.alter(this, "Thêm mới thành công");
        } catch (Exception e) {
            MsgBox.alter(this, "Thêm mới thất bại!");
        }
    }

    void insertChiTietVoucher() {
        ChiTietVoucher model = getFormChiTietVoucher();
        try {
            dao1.insert(model);
            this.fillTableChiTietVoucher();
            this.clearFormChiTietVoucher();
            MsgBox.alter(this, "Thêm mới thành công");
        } catch (Exception e) {
            MsgBox.alter(this, "Thêm mới thất bại!");
        }
    }

    void update() {
        Voucher model = getFormVoucher();
        try {
            dao.update(model);
            this.fillTableVoucher();
            MsgBox.alter(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alter(this, "Cập nhật thất bại!");
        }
    }

    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alter(this, "Bạn không có quyền xóa chuyên đề !");
        } else {
            if (MsgBox.confirm(this, "Bạn thực sự muốn xóa chuyên đề này ?")) {
                String magg = txtMaGG.getText();
                try {
                    dao.delete(magg);
                    this.fillTableVoucher();
                    this.clearFormVoucher();
                    MsgBox.alter(this, "Xóa thành công !");
                } catch (Exception e) {
                    MsgBox.alter(this, "Xóa thất bại !");
                }
            }
        }

    }

    void deleteChiTietVoucher() {
        if (!Auth.isManager()) {
            MsgBox.alter(this, "Bạn không có quyền xóa chuyên đề !");
        } else {
            if (MsgBox.confirm(this, "Bạn thực sự muốn xóa chuyên đề này ?")) {
                String magg = txtMaGG.getText();
                try {
                    dao1.delete(magg);
                    this.fillTableChiTietVoucher();
                    this.clearFormChiTietVoucher();
                    MsgBox.alter(this, "Xóa thành công !");
                } catch (Exception e) {
                    MsgBox.alter(this, "Xóa thất bại !");
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVoucher = new javax.swing.JTable();
        btnSua = new javax.swing.JButton();
        btnXoact = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtMaGG = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLoai = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dcrNgayBD = new com.toedter.calendar.JDateChooser();
        dcrNgayKT = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblChiTietVoucher = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        txtGiam = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtSach = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnThemct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CHƯƠNG TRÌNH GIẢM GIÁ");

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPane1MousePressed(evt);
            }
        });

        tblVoucher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên", "Loại", "Ngày BĐ", "Ngày KT"
            }
        ));
        tblVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblVoucherMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblVoucher);

        btnSua.setBackground(new java.awt.Color(102, 102, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("SỬA");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoact.setBackground(new java.awt.Color(255, 51, 51));
        btnXoact.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoact.setForeground(new java.awt.Color(255, 255, 255));
        btnXoact.setText("XÓA");

        btnXoa.setBackground(new java.awt.Color(255, 51, 51));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("XÓA");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(102, 102, 102));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("TẤT CẢ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Mã Giảm Giá: ");

        txtMaGG.setBackground(new java.awt.Color(242, 242, 242));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Tên Chương Trình:");

        txtTen.setBackground(new java.awt.Color(242, 242, 242));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Loại Chương Trình:");

        txtLoai.setBackground(new java.awt.Color(242, 242, 242));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Ngày Bắt Đầu:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Ngày Kết Thúc:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMaGG, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(50, 50, 50)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(43, 43, 43)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLoai, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(dcrNgayBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dcrNgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtMaGG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(dcrNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(dcrNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Ngày Bắt Đầu:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Ngày Kết Thúc:");

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton1)
                .addGap(77, 77, 77))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jButton1))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("CHI TIẾT CHƯƠNG TRÌNH GIẢM GIÁ");

        tblChiTietVoucher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã GG", "%Giảm giá", "Mã sách"
            }
        ));
        tblChiTietVoucher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblChiTietVoucherMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblChiTietVoucher);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Sách:");

        txtGiam.setBackground(new java.awt.Color(242, 242, 242));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("% Giảm");

        txtSach.setBackground(new java.awt.Color(242, 242, 242));

        btnThem.setBackground(new java.awt.Color(51, 255, 51));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("THÊM");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnThemct.setBackground(new java.awt.Color(51, 255, 51));
        btnThemct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemct.setForeground(new java.awt.Color(255, 255, 255));
        btnThemct.setText("THÊM");
        btnThemct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemctActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton12)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSach, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btnThemct)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnXoact)
                                        .addGap(32, 32, 32)))
                                .addGap(0, 72, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(263, 263, 263))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSua)
                            .addComponent(btnXoa)
                            .addComponent(jButton12)
                            .addComponent(btnThem))))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoact)
                            .addComponent(btnThemct)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (validateForm()) {
            insert();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (validateForm()) {
            update();
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void jScrollPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MousePressed

    }//GEN-LAST:event_jScrollPane1MousePressed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked


    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tblChiTietVoucherMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietVoucherMousePressed
        if (evt.getClickCount() == 1) {
            this.row = tblChiTietVoucher.getSelectedRow();
            this.editChiTietVoucher();
        }
    }//GEN-LAST:event_tblChiTietVoucherMousePressed

    private void btnThemctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemctActionPerformed
        if (validateForm()) {
            insertChiTietVoucher();
        }
    }//GEN-LAST:event_btnThemctActionPerformed

    private void tblVoucherMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVoucherMousePressed
        if (evt.getClickCount() == 1) {
            this.row = tblVoucher.getSelectedRow();
            this.editVoucher();
        }
    }//GEN-LAST:event_tblVoucherMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Date selectedDate = dateChooser.getDate();
        DefaultTableModel model = (DefaultTableModel) tblVoucher.getModel();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GiamGiaForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GiamGiaForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GiamGiaForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GiamGiaForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiamGiaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThemct;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoact;
    private com.toedter.calendar.JDateChooser dcrNgayBD;
    private com.toedter.calendar.JDateChooser dcrNgayKT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblChiTietVoucher;
    private javax.swing.JTable tblVoucher;
    private javax.swing.JTextField txtGiam;
    private javax.swing.JTextField txtLoai;
    private javax.swing.JTextField txtMaGG;
    private javax.swing.JTextField txtSach;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
