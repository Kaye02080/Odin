/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;



import admin.dashboard;
import javax.swing.JOptionPane;
import testappnew.loginF;

/**
 *
 * @author User
 */
public class accountD extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public accountD() {
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
        acc_ln = new javax.swing.JLabel();
        acc_fn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        idd = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ln = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        us = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        ut = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 450));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 90));

        jButton2.setText("LOG-OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        acc_ln.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acc_ln.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_ln.setText("USER");
        jPanel1.add(acc_ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 140, 30));

        acc_fn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acc_fn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_fn.setText("ACC_FN");
        jPanel1.add(acc_fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 140, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CHANGE PASS");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ACCOUNT INFROMATION");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 330, 34));

        idd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idd.setText("(UID)");
        jPanel2.add(idd, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 90, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 620, 80));

        jPanel4.setBackground(new java.awt.Color(51, 255, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 190, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 270, 30));

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Email");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));
        jPanel5.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 190, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 270, 30));

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 190, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Username");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 270, 30));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin", " " }));
        jPanel7.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 190, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("User Type");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 270, 30));

        jPanel3.setBackground(new java.awt.Color(51, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("First Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 270, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Back");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 50, 30));

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
       
      
       
    }//GEN-LAST:event_formWindowActivated

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        ChangeP cp = new ChangeP();
        cp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    userDash ds = new userDash();
     ds.setVisible(true);
     this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(accountD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(accountD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(accountD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(accountD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new accountD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel acc_fn;
    public javax.swing.JLabel acc_ln;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel idd;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField us;
    private javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
