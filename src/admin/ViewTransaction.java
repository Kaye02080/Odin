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
    try {
        dbConnector connector = new dbConnector(); // Create connector instance
        Connection conn = connector.getConnection(); // Establish DB connection
        Statement stmt = conn.createStatement();

        // Query for SendMoney transactions
        String sendMoneySql = "SELECT transaction_id AS transaction_id, sender_username, receiver_username, amount, transaction_description AS transaction_description, status, transaction_date AS transaction_date " +
                              "FROM tbl_sendmoney ORDER BY transaction_date DESC";
        ResultSet sendMoneyRs = stmt.executeQuery(sendMoneySql);

        // DefaultTableModel to display data
        DefaultTableModel model = (DefaultTableModel) tbltransaction.getModel();
        model.setRowCount(0); // Clear existing rows

        // Add SendMoney transactions to the table
        while (sendMoneyRs.next()) {
            Object[] row = {
                "Send Money",  // Transaction type
                sendMoneyRs.getInt("transaction_id"),
                sendMoneyRs.getString("sender_username"),
                sendMoneyRs.getString("receiver_username"),
                sendMoneyRs.getDouble("amount"),
                sendMoneyRs.getString("transaction_description"),
                sendMoneyRs.getString("status"),
                sendMoneyRs.getTimestamp("transaction_date")
            };
            model.addRow(row);
        }

        // Query for Deposit transactions
        String depositSql = "SELECT transaction_id AS transaction_id, u_username AS sender_username, NULL AS receiver_username, amount AS amount, transaction_description AS transaction_description, status AS status, transaction_date AS transaction_date " +
                            "FROM tbl_deposits ORDER BY transaction_date DESC";
        ResultSet depositRs = stmt.executeQuery(depositSql);

        // Add Deposit transactions to the table
        while (depositRs.next()) {
            Object[] row = {
                "Deposit",  // Transaction type
                depositRs.getInt("transaction_id"),
                depositRs.getString("sender_username"),
                depositRs.getString("receiver_username"),  // NULL for Deposit transactions
                depositRs.getDouble("amount"),
                depositRs.getString("transaction_description"),
                depositRs.getString("status"),
                depositRs.getTimestamp("transaction_date")
            };
            model.addRow(row);
        }

        conn.close(); // Close the connection

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error loading transactions: " + e.getMessage());
    }
}




private void loadTransactionData() {
    DefaultTableModel model = (DefaultTableModel) tbltransaction.getModel();
    model.setRowCount(0); // Clear table

    String sendMoneySql = "SELECT transaction_id, sender_username, receiver_username, amount, transaction_description, status, transaction_date FROM tbl_sendmoney";
    String depositSql = "SELECT transaction_id, u_username AS sender_username, NULL AS receiver_username, amount, transaction_description, status, transaction_date FROM tbl_deposits";

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/money_remittance", "root", "")) {

        // Send Money
        try (PreparedStatement pst = con.prepareStatement(sendMoneySql); ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                model.addRow(new Object[] {
                    "Send Money",
                    rs.getInt("transaction_id"),
                    rs.getString("sender_username"),
                    rs.getString("receiver_username"),
                    rs.getDouble("amount"),
                    rs.getString("transaction_description"),
                    rs.getString("status"),
                    rs.getTimestamp("transaction_date")
                });
            }
        }

        // Deposit
        try (PreparedStatement pst = con.prepareStatement(depositSql); ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                model.addRow(new Object[] {
                    "Deposit",
                    rs.getInt("transaction_id"),
                    rs.getString("sender_username"),
                    rs.getString("receiver_username"), // will show as "null"
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbltransaction = new javax.swing.JTable();
        cancel1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel1.setText("VIEW TRANSACTION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 880, 100));

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
                "Transaction Type", "Transaction ID", "Sender Username", "Receiver Usernamet", "Amount", "Date", "Status", "Transaction Description"
            }
        ));
        jScrollPane6.setViewportView(tbltransaction);

        jPanel4.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, 850, 400));

        cancel1.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel4.add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 130, 40));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 130, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 870, 500));

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable tbltransaction;
    // End of variables declaration//GEN-END:variables
}
