/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package register;


import config.dbConnector;
import config.passwordHasher;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import testappnew.loginF;


/**
 *
 * @author User
 */
public class registF1 extends javax.swing.JFrame {

    /**
     * Creates new form registF
     */
    public registF1() {
        initComponents();
    }
    
    public static String email,username;
    
 
            
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_users  WHERE u_username = '" + us.getText() + "' OR u_email = '" + mail.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
                email = resultSet.getString("u_email");
                if(email.equals(mail.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      mail.setText("");
                }
                username = resultSet.getString("u_username");
                if(username.equals(us.getText())){
                      JOptionPane.showMessageDialog(null, "Email is Already Used!");
                      us.setText("");
            }
            return true;
            }else{
                return false;
            }
          
        }catch (SQLException ex) {
            System.out.println(""+ex);
            return false;
        }
    }
    
      public void logEvent(int userId, String username, String userType) {
    dbConnector dbc = new dbConnector();
    Connection con = dbc.getConnection();
    PreparedStatement pstmt = null;

    try {
        String sql = "INSERT INTO tbl_log (u_id, u_username, login_time, u_type) VALUES (?, ?, ?, ?)";
        pstmt = con.prepareStatement(sql);

        pstmt.setInt(1, userId);
        pstmt.setString(2, username);
        pstmt.setTimestamp(3, new Timestamp(new Date().getTime()));
        pstmt.setString(4, userType);

        pstmt.executeUpdate();
        System.out.println("Login log recorded successfully.");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error recording log: " + e.getMessage());
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
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

        jLabel9 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        us = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        pw = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        mail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fn = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        ut = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        check = new javax.swing.JCheckBox();
        sq = new javax.swing.JComboBox<>();
        ans = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register/zz3-removebg-preview.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 0, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register/YU.png"))); // NOI18N
        jPanel12.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 80));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRATION ");
        jPanel12.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 230, 40));

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Username");
        jPanel7.add(jLabel5);
        jLabel5.setBounds(10, 0, 90, 30);

        us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel7.add(us);
        us.setBounds(90, 0, 180, 30);

        jPanel12.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 280, 30));

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        jPanel8.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 180, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jPanel12.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 280, -1));

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        jPanel5.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 180, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        jPanel12.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 280, -1));

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Last Name");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel6.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 180, 30));

        jPanel12.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 280, -1));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("First Name");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 0, 70, 30);

        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(fn);
        fn.setBounds(90, 0, 180, 30);

        jPanel12.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, 30));

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        jPanel9.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 180, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("User Type");
        jPanel9.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 20));

        jPanel12.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 270, 20));

        jPanel10.setBackground(new java.awt.Color(255, 51, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 20));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Register");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, 20));

        jPanel12.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 180, 20));

        check.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check.setText("show");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel12.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, 20));

        sq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What's the name of your first pet?", "What's the lastname of your Mother?", "What's your favorite food?", "What's your favorite Color?", "What's your birth month?" }));
        jPanel12.add(sq, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 250, -1));
        jPanel12.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 180, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register/zz4-removebg-preview.png"))); // NOI18N
        jPanel12.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 490));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
    if(fn.getText().isEmpty() || ln.getText().isEmpty() || mail.getText().isEmpty() || us.getText().isEmpty() || 
   pw.getText().isEmpty() || ans.getText().isEmpty()) {  // Check if answer is empty
    JOptionPane.showMessageDialog(null, "All fields are required!");   
} else if(pw.getText().length() < 8) {
    JOptionPane.showMessageDialog(null, "Password must be at least 8 characters.");
    pw.setText("");
} else if(duplicateCheck()) {
    System.out.println("Duplicate Exists!");
} else {
    dbConnector dbc = new dbConnector();
    try {
        String pass = passwordHasher.hashPassword(pw.getText()); // Hash password
        String secQuestion = sq.getSelectedItem().toString();
        String secAnswer = ans.getText();

        // Use PreparedStatement to prevent SQL Injection
        String query = "INSERT INTO tbl_users (u_fname, u_lname, u_email, u_username, u_password, security_question, security_answer, u_type, u_image, u_status) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, 'Null', 'Pending')";

        try (Connection con = dbc.getConnection();
             PreparedStatement stmt = con.prepareStatement(query)) {
            stmt.setString(1, fn.getText());
            stmt.setString(2, ln.getText());
            stmt.setString(3, mail.getText());
            stmt.setString(4, us.getText());
            stmt.setString(5, pass);
            stmt.setString(6, secQuestion);
            stmt.setString(7, secAnswer);
            stmt.setString(8, ut.getSelectedItem().toString());

            int rowsInserted = stmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Registration Successful!");
                loginF lfr = new loginF();
                lfr.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Registration Failed. Try again!");      
            }
        }
    } catch (SQLException | NoSuchAlgorithmException ex) {
        System.out.println("Error: " + ex.getMessage());
    }
}


        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       loginF ads = new loginF();
       ads.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
       
    boolean isSelected = check.isSelected();

    if (isSelected) {      
        pw.setEchoChar((char)0);
    } else {      
        pw.setEchoChar('*'); 
    }
  
    }//GEN-LAST:event_checkActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

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
            java.util.logging.Logger.getLogger(registF1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registF1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registF1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registF1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registF1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ans;
    private javax.swing.JCheckBox check;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField mail;
    private javax.swing.JPasswordField pw;
    private javax.swing.JComboBox<String> sq;
    private javax.swing.JTextField us;
    private javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
