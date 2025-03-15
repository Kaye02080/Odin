/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;



import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
    
 
       private String userId; // Declare userId at the class level

    public void setUserId(String id) {
        this.userId = id; // Store the user ID for later use
    }
    
   
     
        public static String email,username;
        

   public boolean duplicateCheck(String username, String email) { 
    dbConnector dbc = new dbConnector();
    
    try {
        String query = "SELECT * FROM tbl_users WHERE u_username = '" + username + "' OR u_email = '" + email + "'";
        ResultSet resultSet = dbc.getData(query);
        
        if (resultSet.next()) {
            String existingEmail = resultSet.getString("u_email");
            if (existingEmail.equals(email)) {
                JOptionPane.showMessageDialog(null, "Email is already used!");
                return true;
            }

            String existingUsername = resultSet.getString("u_username");
            if (existingUsername.equals(username)) {
                JOptionPane.showMessageDialog(null, "Username is already used!");
                return true;
            }
        }
    } catch (SQLException ex) {
        System.out.println("" + ex);
    }
    
    return false; // No duplicate found
}

    public boolean UpdateCheck(){
        
    dbConnector dbc = new dbConnector();
        
     try{
            String query = "SELECT * FROM tbl_users  WHERE (u_username = '" +us.getText()+ "' OR u_email = '" +mail.getText()+ "') AND u_id != '"+uid.getText()+"'";
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
        uid = new javax.swing.JTextField();
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
        ln = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));

        uid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uid.setEnabled(false);
        getContentPane().add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 190, 30));

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
        jLabel13.setText("Password");
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
        jLabel5.setText("Username");
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

        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(ln);
        ln.setBounds(220, 0, 190, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(10, 0, 90, 30);

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
        
         dbConnector dbc = new dbConnector();
    String fname = fn.getText().trim();
    String lname = ln.getText().trim();
    String uname = us.getText().trim();
    String pass = pw.getText().trim();  // Using getText() for JTextField
    String email = mail.getText().trim();
    String status = ut.getSelectedItem().toString().trim();
    String type = stat.getSelectedItem().toString();


     
// Input validation
if (fn.getText().trim().isEmpty() || 
    ln.getText().trim().isEmpty() || 
    us.getText().trim().isEmpty() || 
    pw.getText().trim().isEmpty() || 
    mail.getText().trim().isEmpty() || 
    ut.getSelectedItem() == null || ut.getSelectedItem().toString().trim().isEmpty() || 
    stat.getSelectedItem() == null || stat.getSelectedItem().toString().trim().isEmpty()) {
    
    JOptionPane.showMessageDialog(null, "Please Fill All Fields");
    return;
}
 else if (pass.length() < 8) {  // Fixed condition (password must be at least 8 characters)
    JOptionPane.showMessageDialog(null, "Password Must Be At Least 8 Characters");
    return;
} else if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {  // Better email validation
    JOptionPane.showMessageDialog(null, "Enter a Valid Email Address");
    return;
  } else if (duplicateCheck(uname, email)) {  // Pass username and email to check duplicates
    JOptionPane.showMessageDialog(null, "Username or Email Already Exists");
    return;
}

try {
    // Hash the password using passwordHasher
    String hashedPassword = passwordHasher.hashPassword(pass);

    // Use a PreparedStatement to avoid SQL injection
    String insertQuery = "INSERT INTO tbl_users (u_fname, u_lname, u_username, u_status, u_password, u_email, u_type) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";



    try (Connection conn = dbc.getConnection();
         PreparedStatement pst = conn.prepareStatement(insertQuery)) {
        
 pst.setString(1, fname);
pst.setString(2, lname);
pst.setString(3, uname);
pst.setString(4, status);
pst.setString(5, hashedPassword);
pst.setString(6, email);
pst.setString(7, type);  // Fix: Add Account Type (u_type)

       


        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "Registered Successfully!");
            new userLoginF().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Registration Failed!");
        }
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_addActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

    private void rfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rfActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String id = uid.getText().trim();
String email = mail.getText().trim();
String username = us.getText().trim();
String password = pw.getText().trim();
String firstName = fn.getText().trim();  // First name
String lastName = ln.getText().trim();   // Last name
String type = stat.getSelectedItem().toString();  // User type
String statusValue = ut.getSelectedItem().toString(); // User status

// Validation
if (id.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Error: User ID is missing.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

if (firstName.isEmpty() || lastName.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Error: First Name and Last Name are required.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Email validation
String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
if (!email.matches(emailRegex)) {
    JOptionPane.showMessageDialog(this, "Invalid Email! Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

// Username validation
if (!username.matches("[a-zA-Z0-9_]{5,}")) {
    JOptionPane.showMessageDialog(this, "Invalid Username! Must be at least 5 characters and contain only letters, numbers, and underscores.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    // Hash the password using SHA-256 before storing
    String hashedPassword = passwordHasher.hashPassword(password);

    dbConnector dbc = new dbConnector();
    String checkQuery = "SELECT COUNT(*) FROM tbl_users WHERE (u_username = ? OR u_email = ?) AND u_id != ?";

    try (Connection conn = dbc.getConnection();
         PreparedStatement pst = conn.prepareStatement(checkQuery)) {

        pst.setString(1, username);
        pst.setString(2, email);
        pst.setInt(3, Integer.parseInt(id));

        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "Username or Email already exists! Please use different credentials.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // ✅ Corrected the column order in the UPDATE query
        String updateQuery = "UPDATE tbl_users SET u_fname = ?, u_lname = ?, u_username = ?, u_email = ?, u_password = ?, u_status = ?, u_type = ? WHERE u_id = ?";

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/money_remittance", "root", "");
             PreparedStatement updatePst = con.prepareStatement(updateQuery)) {

            updatePst.setString(1, firstName);   // First name
            updatePst.setString(2, lastName);    // Last name
            updatePst.setString(3, username);    // Username
            updatePst.setString(4, email);       // Email
            updatePst.setString(5, hashedPassword);  // Store hashed password
            updatePst.setString(6, statusValue); // Status (Corrected order)
            updatePst.setString(7, type);        // Type (Corrected order)
            updatePst.setInt(8, Integer.parseInt(id));  // User ID

            int updated = updatePst.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "User updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                new userLoginF().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Update failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}        // TODO add your handling code here:
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
    private javax.swing.JButton jButton1;
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
    public javax.swing.JTextField uid;
    public javax.swing.JTextField us;
    public javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
