    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author milan
 */
public class ViewTransaction extends javax.swing.JFrame {

    /**
     * Creates new form ViewTransaction
     */
    public ViewTransaction() {
        initComponents();
       
         
         loadTransactionData();
    }         
   
public void displayTransactions() {
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/money_remittance", "root", "");
         Statement stmt = conn.createStatement()) {

        DefaultTableModel model = (DefaultTableModel) tbltransaction.getModel();
        model.setRowCount(0); // Clear table

        // 🔵 Send Money Transactions
        String sendMoneySql = 
            "SELECT " +
            "transaction_id, " +
            "CONCAT(sender_fname, ' ', sender_lname) AS sender_fullname, " +
            "CONCAT(receiver_fname, ' ', receiver_lname) AS receiver_fullname, " +
            "amount, " +
            "transaction_description, " +
            "status, " +
            "transaction_date " +
            "FROM tbl_sendmoney " +
            "ORDER BY transaction_date DESC";

        ResultSet sendMoneyRs = stmt.executeQuery(sendMoneySql);
        while (sendMoneyRs.next()) {
            model.addRow(new Object[] {
                "Send Money",
                sendMoneyRs.getInt("transaction_id"),
                sendMoneyRs.getString("sender_fullname"),
                sendMoneyRs.getString("receiver_fullname"),
                sendMoneyRs.getDouble("amount"),
                sendMoneyRs.getString("transaction_description"),
                sendMoneyRs.getString("status"),
                sendMoneyRs.getTimestamp("transaction_date")
            });
        }

        // 🔵 Deposit Transactions
        String depositSql = 
            "SELECT " +
            "deposit_id AS transaction_id, " +
            "CONCAT(u_fname, ' ', u_lname) AS sender_fullname, " +
            "NULL AS receiver_fullname, " +
            "amount, " +
            "transaction_description, " +
            "status, " +
            "transaction_date " +
            "FROM tbl_deposits " +
            "ORDER BY transaction_date DESC";

        ResultSet depositRs = stmt.executeQuery(depositSql);
        while (depositRs.next()) {
            model.addRow(new Object[] {
                "Deposit",
                depositRs.getInt("transaction_id"),
                depositRs.getString("sender_fullname"),
                "N/A", // No receiver for deposits
                depositRs.getDouble("amount"),
                depositRs.getString("transaction_description"),
                depositRs.getString("status"),
                depositRs.getTimestamp("transaction_date")
            });
        }

        tbltransaction.revalidate();
        tbltransaction.repaint();

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error loading transactions: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}




private void loadTransactionData() {
    DefaultTableModel model = (DefaultTableModel) tbltransaction.getModel();
    model.setRowCount(0); // Clear the table

    String sendMoneySql = "SELECT id, " +
                          "CONCAT(sender_fname, ' ', sender_lname) AS sender_name, " +
                          "CONCAT(receiver_fname, ' ', receiver_lname) AS receiver_name, " +
                          "amount, transaction_description, status, transaction_date " +
                          "FROM tbl_sendmoney";

    String depositSql = "SELECT deposit_id, " +
                        "CONCAT(u_fname, ' ', u_lname) AS sender_name, " +
                        "NULL AS receiver_name, " +
                        "amount, transaction_description, status, transaction_date " +
                        "FROM tbl_deposits";

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/money_remittance", "root", "")) {

        // 🔹 Send Money Transactions
        try (PreparedStatement pst = con.prepareStatement(sendMoneySql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                model.addRow(new Object[]{
                    "Send Money",
                    rs.getInt("id"),
                    rs.getString("sender_name"),
                    rs.getString("receiver_name"),
                    rs.getDouble("amount"),
                    rs.getString("transaction_description"),
                    rs.getString("status"),
                    rs.getTimestamp("transaction_date")
                });
            }
        }

        // 🔹 Deposit Transactions
        try (PreparedStatement pst = con.prepareStatement(depositSql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                model.addRow(new Object[]{
                    "Deposit",
                    rs.getInt("deposit_id"),
                    rs.getString("sender_name"),
                    "N/A",  // No receiver for deposits
                    rs.getDouble("amount"),
                    rs.getString("transaction_description"),
                    rs.getString("status"),
                    rs.getTimestamp("transaction_date")
                });
            }
        }

        tbltransaction.revalidate();
        tbltransaction.repaint();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error loading transaction data: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
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
        jScrollPane6 = new javax.swing.JScrollPane();
        tbltransaction = new javax.swing.JTable();
        cancel1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbltransaction.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Transaction Type", "Transaction ID", "Sender", "Receiver", "Amount", "Description", "Status", "Date"
            }
        ));
        jScrollPane6.setViewportView(tbltransaction);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 850, 400));

        cancel1.setBackground(new java.awt.Color(255, 0, 0));
        cancel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        cancel1.setForeground(new java.awt.Color(27, 57, 77));
        cancel1.setText("Cancel");
        cancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel1MouseClicked(evt);
            }
        });
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        jPanel4.add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 130, 40));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 40));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 1, 48)); // NOI18N
        jLabel1.setText("VIEW TRANSACTION");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel1MouseClicked

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed

        Admindashboard ru = new Admindashboard();
        ru.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancel1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadTransactionData(); // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(ViewTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cancel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tbltransaction;
    // End of variables declaration//GEN-END:variables
}
