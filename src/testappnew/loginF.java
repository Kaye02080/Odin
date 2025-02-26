/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testappnew;

import admin.dashboard;

import config.PassWordH;
import config.Session;

import config.dbConnector;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import register.registF;
import user.userDash;


/**
 *
 * @author User
 */
public class loginF extends javax.swing.JFrame {

    /**
     * Creates new form loginF
     */
    public loginF() {
        initComponents();
    }
    
    static String status;
    static String type;
   
    
    public static boolean loginAcc(String username, String password){
        
        
        dbConnector connector = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + username + "'";
            ResultSet resultSet = connector.getData(query);
           if(resultSet.next()){
               
          
               String hashedPass = resultSet.getString("u_password");
               String rehashedPass = PassWordH.hashPassword(password);
               
             
               if(hashedPass.equals(rehashedPass)){
                 status = resultSet.getString("u_status");
                 type = resultSet.getString("u_type");
                 Session sess = Session.getInstance();
                 sess.setUid(resultSet.getInt("u_id"));
                 sess.setFname(resultSet.getString("u_fname"));
                 sess.setLname(resultSet.getString("u_lname"));
                 sess.setEmail(resultSet.getString("u_email"));
                 sess.setUsername(resultSet.getString("u_username"));
                 sess.setType(resultSet.getString("u_type"));
                 sess.setStatus(resultSet.getString("u_status"));
                 
                 return true;  
                 }else{
                   return false;
               }
          
                 }else{
                 return false;
             }
           }catch (SQLException | NoSuchAlgorithmException ex) {
            return false;
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

        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        check = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pw = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 350));
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(51, 255, 51));
        jPanel4.setLayout(null);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("REGISTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(0, 0, 100, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("LOG-IN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(100, 0, 80, 20);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(230, 210, 180, 20);

        check.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check.setText("Show");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        getContentPane().add(check);
        check.setBounds(330, 180, 70, 20);

        jPanel5.setBackground(new java.awt.Color(255, 204, 204));
        jPanel5.setLayout(null);
        getContentPane().add(jPanel5);
        jPanel5.setBounds(330, 180, 70, 20);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PassWord");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 0, 60, 30);

        pw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        jPanel3.add(pw);
        pw.setBounds(90, 0, 150, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(160, 140, 250, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("UserName");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 0, 59, 30);

        un.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(un);
        un.setBounds(90, 0, 150, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(160, 110, 250, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MONEY REMITTANCE");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register/YU.png"))); // NOI18N
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 80));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        jLabel12.setText("Zero Transaction Fee");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 360, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testappnew/hh.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 90, 70));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 320);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        registF ads = new registF();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(loginAcc(un.getText(), pw.getText())){
            if(!status.equals("Active")){
                JOptionPane.showMessageDialog(null, "in active");
            }else{
                if(type.equals("Admin")){
                    JOptionPane.showMessageDialog(null, "login");
                    dashboard ads = new dashboard();
                    ads.setVisible(true);
                    this.dispose();
                }else if(type.equals("User")){
                    JOptionPane.showMessageDialog(null, "login");
                    userDash uds = new userDash();
                    uds.setVisible(true);
                    this.dispose();
                }else if(type.equals("Frontd")){
                  
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null, "No account");
                }
            }

        }else{
            JOptionPane.showMessageDialog(null, "Invalid Account");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        boolean isSelected = check.isSelected();

        if (isSelected) {
            pw.setEchoChar((char)0);
        } else {
            pw.setEchoChar('*');
        }
    }//GEN-LAST:event_checkActionPerformed

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
            java.util.logging.Logger.getLogger(loginF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
