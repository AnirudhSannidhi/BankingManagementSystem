
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class NewJFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     */
    public NewJFrame2() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        jLabel1.setText("Dashboard");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("Withdraw");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Deposit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setText("Check Balance");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setText("Update Details");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 2, 16)); // NOI18N
        jButton5.setText("Sign Out");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        NewJFrame newFrame = new NewJFrame();
        newFrame.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
jButton1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Ask the user how much they would like to withdraw
        String input = JOptionPane.showInputDialog("How much money would you like to withdraw?");
        int amountToWithdraw = Integer.parseInt(input);

        // Ask the user for their password and expiry date
        String password = JOptionPane.showInputDialog("Enter your password:");
        String expiryDateString = JOptionPane.showInputDialog("Enter your expiry date:");

        // Read the balance details from the file
        Map<String, Integer> balanceDetails = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("BalanceDetails.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 3 && parts[0].equals(expiryDateString) && parts[1].equals(password)) {
                    balanceDetails.put(parts[1], Integer.parseInt(parts[2]));
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Check if the user has sufficient funds
        if (!balanceDetails.containsKey(password)) {
            JOptionPane.showMessageDialog(null, "Expiry Date/Password invalid");
            return;
        } else if (amountToWithdraw > balanceDetails.get(password)) {
            JOptionPane.showMessageDialog(null, "Insufficient amount");
            return;
        }

        // Update the balance and write it back to the file
        balanceDetails.put(password, balanceDetails.get(password) - amountToWithdraw);
        try (PrintWriter writer = new PrintWriter(new FileWriter("BalanceDetails.txt"))) {
            for (Map.Entry<String, Integer> entry : balanceDetails.entrySet()) {
                writer.println(expiryDateString + "\t" + entry.getKey() + "\t" + entry.getValue());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Show final message
        JOptionPane.showMessageDialog(null, "Amount Withdrawn");
    }
});
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
jButton2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Ask the user how much they would like to deposit
        String input = JOptionPane.showInputDialog("How much money would you like to deposit?");
        int amountToDeposit = Integer.parseInt(input);

        // Ask the user for their password and expiry date
        String password = JOptionPane.showInputDialog("Enter your password:");
        String expiryDateString = JOptionPane.showInputDialog("Enter your expiry date:");

        // Read the balance details from the file
        Map<String, Integer> balanceDetails = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("BalanceDetails.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 3 && parts[0].equals(expiryDateString) && parts[1].equals(password)) {
                    balanceDetails.put(parts[1], Integer.parseInt(parts[2]));
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Check if the user has sufficient funds
        if (!balanceDetails.containsKey(password)) {
            JOptionPane.showMessageDialog(null, "Expiry Date/Password invalid");
            return;
        }

        // Update the balance and write it back to the file
        int newBalance = balanceDetails.getOrDefault(password, 0) + amountToDeposit;
        balanceDetails.put(password, newBalance);
        try (PrintWriter writer = new PrintWriter(new FileWriter("BalanceDetails.txt"))) {
            for (Map.Entry<String, Integer> entry : balanceDetails.entrySet()) {
                writer.println(expiryDateString + "\t" + entry.getKey() + "\t" + entry.getValue());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Show final message
        JOptionPane.showMessageDialog(null, "Amount Deposited");
    }
});
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jButton3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Ask the user for their password and expiry date
        String password = JOptionPane.showInputDialog("Enter your password:");
        String expiryDateString = JOptionPane.showInputDialog("Enter your expiry date:");

        // Read the balance details from the file
        int currentBalance = 0;
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("BalanceDetails.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");
                if (parts.length == 3 && parts[0].equals(expiryDateString) && parts[1].equals(password)) {
                    currentBalance = Integer.parseInt(parts[2]);
                    found = true;
                    break;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // Check if the password and expiry date were found
        if (!found) {
            JOptionPane.showMessageDialog(null, "Password/Expiry date is wrong");
            return;
        }

        // Display the current balance
        JOptionPane.showMessageDialog(null, "Current Balance: " + currentBalance);
    }
});
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        NewJFrame3 x=new NewJFrame3();
        x.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}