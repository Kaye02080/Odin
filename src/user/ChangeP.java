/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;



import config.Session;
import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import testappnew.loginF;
import java.sql.Connection;
import java.sql.PreparedStatement;


/**
 *
 * @author User
 */
public class ChangeP extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public ChangeP() {
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
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        acc_lname = new javax.swing.JLabel();
        acc_fname = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        check = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        Cpassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        newPassword = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        oldpass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        idd = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/VVT.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 80));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("LOG-OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        acc_lname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acc_lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_lname.setText("USER");
        jPanel1.add(acc_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 150, 20));

        acc_fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acc_fname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_fname.setText("ACC_USERNAME");
        jPanel1.add(acc_fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 20));

        acc_id.setText("ID");
        jPanel1.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(204, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setLayout(null);

        check.setBackground(new java.awt.Color(255, 255, 255));
        check.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check.setText("show");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel8.add(check);
        check.setBounds(0, 0, 70, 20);

        jPanel10.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 70, 20));

        jPanel7.setBackground(new java.awt.Color(255, 204, 153));
        jPanel7.setLayout(null);
        jPanel7.add(Cpassword);
        Cpassword.setBounds(160, 0, 190, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("CONFIRM PASSWORD");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(20, 0, 132, 30);

        jPanel10.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 360, 30));

        jPanel6.setBackground(new java.awt.Color(255, 204, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NEW PASSWORD");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, -5, 130, 40));
        jPanel6.add(newPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 190, 30));

        jPanel10.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 360, 30));

        jPanel5.setBackground(new java.awt.Color(255, 204, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("OLD PASSWORD");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 5, 140, 20));

        oldpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oldpassActionPerformed(evt);
            }
        });
        jPanel5.add(oldpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 190, 30));

        jPanel10.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 360, 30));

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, 30));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 380, 250));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CHANGE PASSWORD");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 260, 40));

        idd.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        idd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idd.setText("(UID)");
        jPanel2.add(idd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 120, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setText("Back");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 50, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 610, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        loginF ads = new loginF();
        JOptionPane.showMessageDialog(null, "log-out Success! ");
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      Session sess = Session.getInstance();
        if (sess.getUid() == 0) {

            loginF l = new loginF();
            l.setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "No Account, Login FIrst");
        } else {
        
            acc_fname.setText("Username: " + sess.getFname());
            acc_lname.setText("Usertype: " + sess.getLname());
            acc_id.setText("User ID: " + sess.getUid());
        }
    }//GEN-LAST:event_formWindowActivated

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
      boolean isSelected = check.isSelected();

    if (isSelected) {      
        Cpassword.setEchoChar((char)0);
    } else {      
        Cpassword.setEchoChar('*'); 
    }
    }//GEN-LAST:event_checkActionPerformed

    private void oldpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oldpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oldpassActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
     accountD ds = new accountD();
     ds.setVisible(true);
     this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   String passw = new String(newPassword.getPassword()).trim();
   String Cpassw = new String(Cpassword.getPassword()).trim();
   String oldPassInput = oldpass.getText().trim();
 // Use this for JPasswordField


if (passw.isEmpty() || Cpassw.isEmpty() || oldPassInput.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Please fill all fields");
} else if (passw.length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long");
} else if (!passw.equals(Cpassw)) {
    JOptionPane.showMessageDialog(null, "New password does not match confirmation password");
} else {
    try {
        dbConnector dbc = new dbConnector();
        Session sess = Session.getInstance();

        String query = "SELECT u_password FROM tbl_users WHERE u_id = ?";
        try (Connection conn = dbc.getConnection();
             PreparedStatement pst = conn.prepareStatement(query)) {

            pst.setInt(1, sess.getUid());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String olddbPassword = rs.getString("u_password");
                String oldhash = passwordHasher.hashPassword(oldPassInput);
                String newhash = passwordHasher.hashPassword(passw);

                // Check if the old password matches the stored one
                if (!olddbPassword.equals(oldhash)) {
                    JOptionPane.showMessageDialog(null, "Old password is incorrect");
                    return;
                }

                // Prevent user from reusing the old password
                if (olddbPassword.equals(newhash)) {
                    JOptionPane.showMessageDialog(null, "New password must be different from the old password");
                    return;
                }

                // Update the password
                String updateQuery = "UPDATE tbl_users SET u_password = ? WHERE u_id = ?";
                try (PreparedStatement updatePst = conn.prepareStatement(updateQuery)) {
                    updatePst.setString(1, newhash);
                    updatePst.setInt(2, sess.getUid());

                    int updated = updatePst.executeUpdate();
                    if (updated > 0) {
                        JOptionPane.showMessageDialog(null, "Password updated successfully");
                        new UserDashboard().setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Password update failed");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "User not found");
            }
        }
    } catch (SQLException | NoSuchAlgorithmException ex) {
        JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
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
            java.util.logging.Logger.getLogger(ChangeP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Cpassword;
    public javax.swing.JLabel acc_fname;
    private javax.swing.JLabel acc_id;
    public javax.swing.JLabel acc_lname;
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel idd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JTextField oldpass;
    // End of variables declaration//GEN-END:variables
}
