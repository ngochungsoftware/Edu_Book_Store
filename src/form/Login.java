/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.EventQueue;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author HiHi
 */
public class Login extends javax.swing.JFrame {

    private JPanel contentPane;
    private JTextField textUsername;
    private JPasswordField textPassword;
    static Login frame = new Login();
    JLabel lbLogin = new JLabel("Login ");
    StringBuilder error = new StringBuilder();
    ArrayList<Users> listUser = new ArrayList<Users>();
    boolean login = false;
    static String vaiTro;

    public static void mainLogin() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    frame.setVisible(true);
                    frame.setTitle("Login");
                    frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        txtUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        lbExit = new javax.swing.JLabel();
        lbMinimize = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbLogin = new javax.swing.JLabel();
        jlbThongbao = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPassword.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(94, 92, 91));
        txtPassword.setText("jPasswordField1");
        txtPassword.setBorder(null);
        txtPassword.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtPassword.setDoubleBuffered(true);
        txtPassword.setSelectionColor(new java.awt.Color(102, 102, 102));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 300, 40));

        jSeparator2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 208, 300, 40));

        txtUsername.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(94, 92, 91));
        txtUsername.setText("Username");
        txtUsername.setBorder(null);
        txtUsername.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtUsername.setDoubleBuffered(true);
        txtUsername.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        txtUsername.setSelectionColor(new java.awt.Color(102, 102, 102));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 300, 40));
        txtUsername.setBackground(new java.awt.Color(0,0,0,0));

        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 300, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(56, 53, 47));
        jLabel1.setText("Password");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 320, 30));

        lbExit.setBackground(new java.awt.Color(255, 255, 255));
        lbExit.setForeground(new java.awt.Color(255, 255, 255));
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/multiply_30px.png"))); // NOI18N
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });
        jPanel1.add(lbExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 40, 40));

        lbMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlch/Image/GiaoDien/minus_math_30px.png"))); // NOI18N
        lbMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizeMouseClicked(evt);
            }
        });
        jPanel1.add(lbMinimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 40, 40));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(56, 53, 47));
        jLabel3.setText("Username");
        jLabel3.setToolTipText("");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 320, 30));

        lbLogin.setBackground(new java.awt.Color(255, 255, 255));
        lbLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(51, 51, 0));
        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogin.setText("Login");
        lbLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLoginMouseClicked(evt);
            }
        });
        jPanel1.add(lbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 190, 60));

        jlbThongbao.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jlbThongbao.setForeground(new java.awt.Color(255, 51, 51));
        jPanel1.add(jlbThongbao, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 300, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/nenlogin1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, 6, 850, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 850, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizeMouseClicked
        // TODO add your handling code here:
          
    }//GEN-LAST:event_lbMinimizeMouseClicked

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lbExitMouseClicked

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void lbLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLoginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbLoginMouseClicked
    public void loadUser() {
        try {
            listUser = UserDao.loadUser();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public void login() {
        boolean showMessage = false;
        login = false;
        String username = textUsername.getText();
        @SuppressWarnings("deprecation")
        String password = textPassword.getText();

        for (Users user : listUser) {
            if (user.username.equals(username) && user.password.equals(password)) {
                login = true;
                vaiTro = user.vaiTro;
                showMessage = true;
                break;
            }
        }

        if (showMessage) {
            JOptionPane.showMessageDialog(this, "Login successfully!");
            QLNV qlnv = new QLNV();
            qlnv.mainQLNV();
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed!");
        }
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jlbThongbao;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbMinimize;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
