/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;



import config.dbConnector;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;



/**
 *
 * @author User
 */
public class CreateUsersF extends javax.swing.JFrame {

    /**
     * Creates new form registF
     */
    public CreateUsersF() {
        initComponents();
    }
    
    public static String email,username;
            
    
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE u_username = '" + us.getText() + "' OR u_email = '" + mail.getText() + "'";
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
    
    public boolean UpdateCheck(){
        
       dbConnector dbc = new dbConnector();
        
        try{
            String query = "SELECT * FROM tbl_user  WHERE (u_username = '" +us.getText()+ "' OR u_email = '" +mail.getText()+ "') AND u_id != '"+id.getText()+"'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){ 
                email = resultSet.getString("u_email");
   
                if(email.equals(mail.getText())){
                    JOptionPane.showMessageDialog(null, "Email is already used!");
                    mail.setText("");
                    
                }
                    
                username = resultSet.getString("u_username");
                if(username.equals(us.getText())){
                    JOptionPane.showMessageDialog(null, "Username is already used!");
                    us.setText("");
                    
                }
                return true;
            }else{
                return false;
                
            }
            
        }catch(SQLException ex){
            System.out.println(""+ex);
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

        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        rf = new javax.swing.JButton();
        pw = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cc = new javax.swing.JButton();
        us = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cl = new javax.swing.JButton();
        mail = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        up = new javax.swing.JButton();
        ln = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        del = new javax.swing.JButton();
        fn = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ut = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        stat = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setEnabled(false);
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 190, 30));

        jPanel2.setBackground(new java.awt.Color(51, 255, 153));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User ID");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(140, 0, 44, 30);

        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add.setForeground(new java.awt.Color(255, 0, 0));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add);
        add.setBounds(10, 0, 90, 30);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 420, 30));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("USER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 110, 60));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("USER");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 270, 34));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register/YU.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 90));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(51, 255, 153));
        jPanel7.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("PassWord");
        jPanel7.add(jLabel13);
        jLabel13.setBounds(140, 0, 70, 30);

        rf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rf.setForeground(new java.awt.Color(102, 0, 255));
        rf.setText("REFRESH");
        rf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfActionPerformed(evt);
            }
        });
        jPanel7.add(rf);
        rf.setBounds(10, 0, 90, 30);

        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        jPanel7.add(pw);
        pw.setBounds(220, 0, 190, 30);

        jPanel10.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 420, 30));

        jPanel6.setBackground(new java.awt.Color(51, 255, 153));
        jPanel6.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("UserName");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(140, 0, 59, 30);

        cc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cc.setForeground(new java.awt.Color(153, 0, 153));
        cc.setText("CANCEL");
        cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccActionPerformed(evt);
            }
        });
        jPanel6.add(cc);
        cc.setBounds(10, 0, 90, 30);

        us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel6.add(us);
        us.setBounds(220, 0, 190, 30);

        jPanel10.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 420, 30));

        jPanel5.setBackground(new java.awt.Color(51, 255, 153));
        jPanel5.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(140, 0, 31, 30);

        cl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cl.setForeground(new java.awt.Color(0, 0, 255));
        cl.setText("CLEAR");
        cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clActionPerformed(evt);
            }
        });
        jPanel5.add(cl);
        cl.setBounds(10, 0, 90, 30);

        mail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(mail);
        mail.setBounds(220, 0, 190, 30);

        jPanel10.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 420, 30));

        jPanel4.setBackground(new java.awt.Color(51, 255, 153));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Last Name");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(140, 0, 63, 30);

        up.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        up.setForeground(new java.awt.Color(0, 0, 255));
        up.setText("UPDATE");
        up.setEnabled(false);
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        jPanel4.add(up);
        up.setBounds(10, 0, 90, 30);

        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ln);
        ln.setBounds(220, 0, 190, 30);

        jPanel10.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 420, 30));

        jPanel3.setBackground(new java.awt.Color(51, 255, 153));
        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("First Name");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(140, 0, 63, 30);

        del.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        del.setForeground(new java.awt.Color(255, 51, 51));
        del.setText("DELETE");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        jPanel3.add(del);
        del.setBounds(10, 0, 90, 30);

        fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel3.add(fn);
        fn.setBounds(220, 0, 190, 30);

        jPanel10.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 420, 30));

        jPanel8.setBackground(new java.awt.Color(51, 255, 153));
        jPanel8.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("User Status");
        jPanel8.add(jLabel9);
        jLabel9.setBounds(0, 0, 90, 30);

        ut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin", " " }));
        jPanel8.add(ut);
        ut.setBounds(90, 0, 190, 30);

        jPanel10.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 290, 30));

        jPanel9.setBackground(new java.awt.Color(51, 255, 153));
        jPanel9.setLayout(null);

        stat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        stat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel9.add(stat);
        stat.setBounds(90, 0, 190, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("User Type");
        jPanel9.add(jLabel8);
        jLabel8.setBounds(0, 0, 90, 30);

        jPanel10.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 290, 30));

        check.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        check.setText("show");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel10.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, 30));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 640, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        
        
        
        if(fn.getText().isEmpty()|| ln.getText().isEmpty() || mail.getText().isEmpty()
                || us.getText().isEmpty()|| pw.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(pw.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
            pw.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist!");
            
        }else{
            
             dbConnector dbc = new dbConnector();
             {
            
              
      if (dbc.insertData("INSERT INTO tbl_user(u_fname, u_lname, u_email, u_username, u_password, u_food, u_drink, u_dessert, u_type, u_status)VALUES('"
     + fn.getText() + "','"+ln.getText()+"','"+ mail.getText() + "','" 
     + us.getText() + "','" + pw + "','"+ ut.getSelectedItem() + "','"+stat.getSelectedItem()+"')")){
          
        
          JOptionPane.showMessageDialog(null, "Inserted Successfully!");
          userLoginF ads = new userLoginF();
         ads.setVisible(true);
         this.dispose();
        
      }else{
          JOptionPane.showMessageDialog(null, "Connection Error!");
      }
             }
        }        
        
    }//GEN-LAST:event_addActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void rfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
       
         if(fn.getText().isEmpty()|| ln.getText().isEmpty() || mail.getText().isEmpty()
                || us.getText().isEmpty()|| pw.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(pw.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
            pw.setText("");
        }else if(UpdateCheck()){
            System.out.println("Duplicate Exist!");
            
        }else{
       dbConnector dbc = new dbConnector();
      dbc.updateData("UPDATE tbl_user SET u_fname ='"+fn.getText()+"', u_lname ='"+ln.getText()+"', u_email ='"+mail.getText()+"', u_username ='"+us.getText()+"', u_password ='"+pw.getText()+"', u_type ='"+ut.getSelectedItem()+"', u_status ='"+stat.getSelectedItem()+"' WHERE u_id ='"+id.getText()+"'");
       
       JOptionPane.showMessageDialog(null, "UPDATED SUCCESSFULLY!");
       userLoginF ads = new userLoginF();
         ads.setVisible(true);
         this.dispose();
       
        }
    }//GEN-LAST:event_upActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delActionPerformed

    private void clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clActionPerformed

    private void ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccActionPerformed
       userLoginF usf = new userLoginF();
       usf.setVisible(true);
       this.dispose();
       
    }//GEN-LAST:event_ccActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUsersF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUsersF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUsersF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUsersF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUsersF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    private javax.swing.JButton cc;
    private javax.swing.JCheckBox check;
    private javax.swing.JButton cl;
    private javax.swing.JButton del;
    public javax.swing.JTextField fn;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JTextField ln;
    public javax.swing.JTextField mail;
    public javax.swing.JPasswordField pw;
    private javax.swing.JButton rf;
    public javax.swing.JComboBox<String> stat;
    public javax.swing.JButton up;
    public javax.swing.JTextField us;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
