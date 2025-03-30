/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;



import static admin.CreateUsersF.username;
import admin.Admindashboard;
import config.Session;
import config.dbConnector;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import testappnew.loginF;


/**
 *
 * @author User
 */
public class accountD extends javax.swing.JFrame {

    /**
     * Creates new form Admindashboard
     */
    public accountD() {
        initComponents();
        
    }
    
    //public String destination = "";
   //// File selectedFile;
   //public String oldpath;
   // public String path;
   
       public boolean updateCheck(){
        
     dbConnector dbc = new dbConnector();
    Session sess = Session.getInstance();

    try {
        String query = "SELECT * FROM tbl_users WHERE (u_username = '" + us.getText() 
                     + "' OR u_email = '" + mail.getText() 
                     + "') AND u_id != '" + sess.getUid() + "'";

        ResultSet resultSet = dbc.getData(query);

        if (resultSet.next()) {
            String email = resultSet.getString("u_email"); 
            if (email.equals(mail.getText())) { 
                JOptionPane.showMessageDialog(null, "Email is Already Used!");
                mail.setText(""); 
            }

            String username = resultSet.getString("u_username");
            if (username.equals(us.getText())) { 
                JOptionPane.showMessageDialog(null, "Username is Already Used!");
                us.setText(""); 
            }

            return true;
        } else {
            return false;
        }
    } catch (SQLException ex) {
        System.out.println("" + ex);
        return false;
    }
        
    }
     
       
       
       
     //   public void imageUpdater(String existingFilePath, String newFilePath){
     //   File existingFile = new File(existingFilePath);
     //   if (existingFile.exists()) {
      //      String parentDirectory = existingFile.getParent();
       //     File newFile = new File(newFilePath);
        //    String newFileName = newFile.getName();
        //    File updatedFile = new File(parentDirectory, newFileName);
        //    existingFile.delete();
        //    try {
        //        Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
          //      System.out.println("Image updated successfully.");
      //      } catch (IOException e) {
      //          System.out.println("Error occurred while updating the image: "+e);
       //     }
    //    } else {
   //         try{
       //         Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
        //    }catch(IOException e){
         //       System.out.println("Error on update!");
   //         }
   //     }
 //  }
        //public static int getHeightFromWidth(String imagePath, int desiredWidth) {
      //  try {
      //      // Read the image file
    //        File imageFile = new File(imagePath);
   //         BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
     //       int originalWidth = image.getWidth();
   //         int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
   //         int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
     //       return newHeight;
    //    } catch (IOException ex) {
     //       System.out.println("No image found!");
     //   }
        
   //     return -1;
  //  }
   //    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
   // ImageIcon MyImage = null;
  //      if(ImagePath !=null){
  //          MyImage = new ImageIcon(ImagePath);
  //      }else{
  //          MyImage = new ImageIcon(pic);
   //     }
        
   // int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

   // Image img = MyImage.getImage();
   // Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
   // ImageIcon image = new ImageIcon(newImg);
   // return image;
//}

      // public int FileExistenceChecker(String path){
     //   File file = new File(path);
    //    String fileName = file.getName();
        
      //  Path filePath = Paths.get("src/images", fileName);
     //   boolean fileExists = Files.exists(filePath);
        
     //   if (fileExists) {
      //      return 1;
     ///   } else {
   //         return 0;
    //    }
    
  //  }
    
    
        //    public String action;
     
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        acc_uname = new javax.swing.JLabel();
        acc_type = new javax.swing.JLabel();
        acc_id = new javax.swing.JLabel();
        u_image = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        idd = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        fn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ln = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        us = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        Select = new javax.swing.JLabel();
        Browse = new javax.swing.JLabel();

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

        acc_uname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_uname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_uname.setText("Username");
        jPanel1.add(acc_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 180, 20));

        acc_type.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_type.setText("Type");
        jPanel1.add(acc_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 180, 30));

        acc_id.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        acc_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acc_id.setText("ID");
        jPanel1.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 30));

        u_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        u_image.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(u_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 130));

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setText("Change Pass");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 180, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 520));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ACCOUNT INFROMATION");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 330, 34));

        idd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idd.setText("(UID)");
        jPanel2.add(idd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 90, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 580, 80));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("First Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel7.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 270, 30));

        jPanel4.setBackground(new java.awt.Color(51, 255, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 190, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 270, -1));

        jPanel6.setBackground(new java.awt.Color(51, 255, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 190, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Username");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel7.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 270, -1));

        jPanel5.setBackground(new java.awt.Color(51, 255, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Email");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));
        jPanel5.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 190, 30));

        jPanel7.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 270, -1));

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        cancel.setForeground(new java.awt.Color(27, 57, 77));
        cancel.setText("Cancel");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel7.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 100, 30));

        update.setBackground(new java.awt.Color(27, 55, 77));
        update.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Save ");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel7.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 90, 30));

        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMouseClicked(evt);
            }
        });
        jPanel9.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 140));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 210, 160));

        Select.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        Select.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Select.setText("SELECT");
        jPanel7.add(Select, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 70, 20));

        Browse.setText("BROWSE");
        Browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseMouseClicked(evt);
            }
        });
        jPanel7.add(Browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 540, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        if (sess.getUid() == 0) {

            loginF l = new loginF();
            l.setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "No Account, Login FIrst");
        } else {
        
            acc_uname.setText("Username: " + sess.getUsername());
            acc_type.setText("Usertype: " + sess.getType());
            acc_id.setText("User ID: " + sess.getUid());
         

       
    }//GEN-LAST:event_formWindowActivated
    }
    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

        UserDashboard ru = new UserDashboard();
        ru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed
    
    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
     //        if(action.equals("Add")){
     //      dbConnector dbc = new dbConnector();
     //      int result=0;
      //     try{
            
       //     String sql = "INSERT INTO tbl_users (u_fname, u_lname, u_username, u_email, u_image) VALUES (?,?,?,?,?)";
       //     PreparedStatement pst = dbc.connect.prepareStatement(sql);
       //     pst.setString(1, fn.getText());
        //    pst.setString(2, ln.getText());
      //     pst.setString(3, us.getText());
        //    pst.setString(4, mail.getText());
            
     //       pst.execute();
     //       result = 1;
    //        Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);        
     //   }catch(Exception e){
       //        System.out.println("Insert Image Error");
     //   }

     //      if(result == 1){
     //          JOptionPane.showMessageDialog(null, "Successfully Save!");
               
     //      }else{
      //          System.out.println("Saving Data Failed!");
     //      }
     //  }else if(action.equals("Update")){
       //    dbConnector dbc = new dbConnector();
       //    try{
      //     String sql = "UPDATE tbl_student SET u_fname = ?, u_lname = ?, u_email = ?, u_image = ?  WHERE u_id = '"+fn.getText()+"'";
       //      PreparedStatement pst = dbc.connect.prepareStatement(sql);
      //      pst.setString(1, fn.getText());
       //     pst.setString(2, ln.getText());
      //      pst.setString(3, us.getText());
      //      pst.setString(4, mail.getText());
     //       pst.setString(8, destination);
            
          
           
    //        if (destination.isEmpty()) {
      //          File existingFile = new File(oldpath);
      //          if(existingFile.exists()){
      //              existingFile.delete();
      //          }
      //      }else{
      //              if(!(oldpath.equals(path))){
         //               imageUpdater(oldpath, path);
      //              }
      //      }
         
    //        pst.execute();
     //      
           
      //     JOptionPane.showMessageDialog(null, "Successfully Updated!");
       //    }catch(SQLException e){
        //       System.out.println("Database Connection Error!");
       //    }
    //   }else{
      //     JOptionPane.showMessageDialog(null, "No action selected!");
           
   //    }
        
       
    }//GEN-LAST:event_updateMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed


    }//GEN-LAST:event_updateActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
         ChangeP cp = new ChangeP();
        cp.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void BrowseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseMouseClicked
    //    Browse.setVisible(false);
      //  Select.setVisible(true);
     //   image.setIcon(null);
     //   destination = "";
    //    path="";        // TODO add your handling code here:
    }//GEN-LAST:event_BrowseMouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
       //     JFileChooser fileChooser = new JFileChooser();
       //         int returnValue = fileChooser.showOpenDialog(null);
        //        if (returnValue == JFileChooser.APPROVE_OPTION) {
        //            try {
        //                selectedFile = fileChooser.getSelectedFile();
        ///                destination = "src/images/" + selectedFile.getName();
          //              path  = selectedFile.getAbsolutePath();
                        
                        
                   //     if(FileExistenceChecker(path) == 1){
                   //       JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                    //        destination = "";
                    //        path="";
                    //    }else{
           // //                image.setIcon(ResizeImage(path, null, image));
                     //       Browse.setVisible(true);
       //                     Browse.setText("REMOVE");
           ///             }
       ///             } catch (Exception ex) {
    //                    System.out.println("File Error!");
     //               }
     //           }        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel9MouseClicked

    private void imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseClicked
   //  JFileChooser fileChooser = new JFileChooser();
   //             int returnValue = fileChooser.showOpenDialog(null);
     //           if (returnValue == JFileChooser.APPROVE_OPTION) {
       //             try {
      //                  selectedFile = fileChooser.getSelectedFile();
          //              destination = "src/images/" + selectedFile.getName();
        //                path  = selectedFile.getAbsolutePath();
                        
          //              
            //            if(FileExistenceChecker(path) == 1){
            //              JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
               //             destination = "";
              //              path="";
                       // }else{
                        //    image.setIcon(ResizeImage(path, null, image));
                        //    Browse.setVisible(true);
                       //     Browse.setText("REMOVE");
                     //   }
                  //  } catch (Exception ex) {
                    //    System.out.println("File Error!");
                   // }
           //     }        // TODO add your handling code here:
    }//GEN-LAST:event_imageMouseClicked

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
    private javax.swing.JLabel Browse;
    private javax.swing.JLabel Select;
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_type;
    private javax.swing.JLabel acc_uname;
    public javax.swing.JButton cancel;
    private javax.swing.JTextField fn;
    private javax.swing.JLabel idd;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField ln;
    private javax.swing.JTextField mail;
    private javax.swing.JPanel u_image;
    public javax.swing.JButton update;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables
}
