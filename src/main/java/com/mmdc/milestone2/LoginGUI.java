package com.mmdc.milestone2;

import java.io.File;
import javax.swing.JOptionPane;

public class LoginGUI extends javax.swing.JFrame {
    public LoginGUI() {
        initComponents();
        setLocationRelativeTo(null);
        tbPassword.setEchoChar('•');
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
        tbEmployeeID = new javax.swing.JTextField();
        btnEmployeeID = new javax.swing.JButton();
        btnPassword = new javax.swing.JButton();
        tglShowPassword = new javax.swing.JToggleButton();
        tbPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Login");

        tbEmployeeID.setToolTipText("Enter your Employee ID");
        tbEmployeeID.setName("tbEmployeeID"); // NOI18N

        btnEmployeeID.setText("Login");
        btnEmployeeID.setName("btnLogin"); // NOI18N
        btnEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeIDActionPerformed(evt);
            }
        });

        btnPassword.setText("Clear");
        btnPassword.setName("btnClear"); // NOI18N

        tglShowPassword.setText("Show Password");
        tglShowPassword.setName("tglShowPassword"); // NOI18N
        tglShowPassword.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tglShowPasswordStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tbEmployeeID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(tbPassword, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tglShowPassword)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tbEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tglShowPassword)
                    .addComponent(tbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmployeeID)
                    .addComponent(btnPassword))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeIDActionPerformed
        String employeeID;
        String inputEmployeeID = tbEmployeeID.getText();
        String inputPassword = String.valueOf(tbPassword.getPassword());
        
        EmployeeDatabase database = new EmployeeDatabase();
        employeeID = database.validateCredentials(inputEmployeeID, inputPassword); //validateCredentials returns an employeeID if login is valid, null if not
        
        if(employeeID != null){
            DetailDisplayGUI employeeInfo = new DetailDisplayGUI(employeeID);
            employeeInfo.setVisible(true);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "ID or Password are incorrect");
            tbPassword.setText("");
        }
    }//GEN-LAST:event_btnEmployeeIDActionPerformed

    private void tglShowPasswordStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tglShowPasswordStateChanged
        if (tglShowPassword.isSelected()){
            tbPassword.setEchoChar((char)0);
        }
        else tbPassword.setEchoChar('•');
    }//GEN-LAST:event_tglShowPasswordStateChanged

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
            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).
                    log(java.util.logging.Level.SEVERE,
                            null,
                            ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new LoginGUI().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmployeeID;
    private javax.swing.JButton btnPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tbEmployeeID;
    private javax.swing.JPasswordField tbPassword;
    private javax.swing.JToggleButton tglShowPassword;
    // End of variables declaration//GEN-END:variables
}
