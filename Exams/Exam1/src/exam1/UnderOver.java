/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.io.*;
import java.util.*;
import javax.swing.JComboBox;

/**
 * Program allows users the play the dice game Under Over.
 * @author bmetzelaar16
 */
public class UnderOver extends javax.swing.JFrame {

    List<String> storedUsers = new ArrayList<String>();
    int choice = 1; // combobox choice
    Double userMoney = 0.0;

    /**
     * Reads a local file to the program that stores the names of the users that
     * have played this game before.
     * @param storedUsers List that contains all of the users that have played the game.
     */
    public void readFile(List<String> storedUsers) {
        File f = new File("Z:\\GitHub\\CS372\\Exams\\Exam1\\src\\exam1\\users.txt");
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;
            while ((line = rdr.readLine()) != null) {
                // System.out.println(line);
                storedUsers.add(line);
            }
            rdr.close();

            // do something with the list of users
        } catch (Exception e) {
            System.out.print("ERROR:");
            System.out.println(e.getMessage());
        }

    }

    /**
     * A new user is written to the text file of users.
     * @param username the name of the new user
     */
    public void writeFile(String username) {
        File f = new File("Z:\\GitHub\\CS372\\Exams\\Exam1\\src\\exam1\\users.txt");
        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f, true));
            wrtr.write(username);
            wrtr.newLine();
            wrtr.close();
        } catch (Exception e) {
            System.out.print("ERROR: ");
            System.out.println(e.getMessage());
        }
    }

    /**
     * Creates new form UnderOver
     */
    public UnderOver() {
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
        jLabel2 = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        btnLogin = new javax.swing.JToggleButton();
        lbWelcome = new javax.swing.JLabel();
        lbMoney = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbResults = new javax.swing.JLabel();
        lbDiceRoll1 = new javax.swing.JLabel();
        lbDiceRoll2 = new javax.swing.JLabel();
        lbRollPayout = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        tfBet = new javax.swing.JTextField();
        lbAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Username");

        tfLogin.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnLogin.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lbWelcome.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbWelcome.setText("User: None");
        lbWelcome.setToolTipText("");

        lbMoney.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbMoney.setText("Money: $0.00");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Place Bet");

        jButton1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jButton1.setText("Role Dice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbResults.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbResults.setText("Result");

        lbDiceRoll1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbDiceRoll1.setText("Dice 1: 0");

        lbDiceRoll2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbDiceRoll2.setText("Dice 2: 0");

        lbRollPayout.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lbRollPayout.setText("$0.00");

        jComboBox1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Under 7", "Over 7", "Exactly 7" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        tfBet.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tfBet.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lbAmount.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAmount.setText("Amount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbMoney)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfBet)
                            .addComponent(lbAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbDiceRoll1)
                                    .addComponent(lbDiceRoll2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbResults, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(lbRollPayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbWelcome)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLogin)))
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin))
                .addGap(30, 30, 30)
                .addComponent(lbWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMoney)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfBet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDiceRoll1)
                    .addComponent(lbResults))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRollPayout)
                    .addComponent(lbDiceRoll2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String user = this.tfLogin.getText();   // Get username from login box
        userMoney = 0.0;
        
        readFile(storedUsers);  // get all user's that are currently saved
        if (storedUsers.contains(user) == true){
            // TODO: Get user's current balance
        } else {
            writeFile(user);
            userMoney = 500.00;
        }
        lbWelcome.setText("User: " + user);    // Set welcome message
        String displayMoney = String.format("Money: $%.2f", userMoney);
        lbMoney.setText(displayMoney);
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * Method activates when the button "Roll Dice" is clicked.
     *
     * @param evt the button was clicked
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Double userBet = Double.parseDouble(tfBet.getText());;

            Dice d1 = new Dice(6);
            Dice d2 = new Dice(6);

            int roll1 = d1.roll();
            int roll2 = d2.roll();
            int result = roll1 + roll2; // overall result of the two dice

            boolean winner = false;
            
            if (choice == 1) {
                if (result > 6) { // lost
                    userMoney -= userBet;
                    userBet *= -1;
                } else { // won
                    userMoney += userBet;
                    winner = true;
                }
            }
            if (choice == 2) {
                if (result < 8) { // lost
                    userMoney -= userBet;
                    userBet *= -1;
                } else { // won
                    userMoney += userBet;
                    winner = true;
                }
            }
            if (choice == 3) {
                if (result != 7) { // lost
                    userMoney -= userBet;
                    userBet *= -1;
                } else { // won
                    userMoney += (userBet * 4);
                    userBet *= 4;
                    winner = true;
                }
            }

            String d1Text = String.format("Dice 1: %d", roll1);
            lbDiceRoll1.setText(d1Text);

            String d2Text = String.format("Dice 2: %d", roll2);
            lbDiceRoll2.setText(d2Text);

            String displayMoney = String.format("Money: $%.2f", userMoney);
            lbMoney.setText(displayMoney);

            String disRollPayout = String.format("$%.2f", userBet);
            lbRollPayout.setText(disRollPayout);
            
            String notifyResult = "";
            if (winner){
                notifyResult = "You Won!";
            } else {
                notifyResult = "You Lost..";
            }
            lbResults.setText(notifyResult);
            
        } catch (Exception e) {
            System.out.print("ERROR: ");
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        JComboBox cb = (JComboBox) evt.getSource();
        String comboChoice = (String) cb.getSelectedItem();

        if (comboChoice == "Under 7") {
            choice = 1;
        } else if (comboChoice == "Over 7") {
            choice = 2;
        } else if (comboChoice == "Exactly 7") {
            choice = 3;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(UnderOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnderOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnderOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnderOver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnderOver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbAmount;
    private javax.swing.JLabel lbDiceRoll1;
    private javax.swing.JLabel lbDiceRoll2;
    private javax.swing.JLabel lbMoney;
    private javax.swing.JLabel lbResults;
    private javax.swing.JLabel lbRollPayout;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JTextField tfBet;
    private javax.swing.JTextField tfLogin;
    // End of variables declaration//GEN-END:variables
}
